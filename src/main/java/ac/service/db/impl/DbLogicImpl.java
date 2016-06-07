/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.service.db.impl;

import ac.service.db.DbLogic;
import ac.service.extractor.LoginExtractor;
import ac.service.extractor.UserExtractor;
import ac.service.pojo.Login;
import ac.service.pojo.UserDetail;
import ac.service.validator.Validation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 *
 * @author Aviral
 */
@Component
public class DbLogicImpl implements DbLogic {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Validation validation;

    private ResultSet rs;
    private Connection con;
    private PreparedStatement ps;

    @Override
    public boolean loginCheck(Login login) {
        boolean loginSuccess = false;
        String sql = "SELECT * FROM LOGIN WHERE username = ? AND password = ? AND role = ?";

        List<String> args = new ArrayList<>();
        args.add(login.getUsername());
        args.add(login.getPassword());
        args.add(login.getRole());
        Login loginDetail = jdbcTemplate.query(sql, new LoginExtractor(), args.toArray());
        if (!StringUtils.isEmpty(loginDetail)) {
            loginSuccess = true;
        }
        return loginSuccess;
    }

    @Override
    public String addUser(UserDetail userDetail, Login login) {

        String loginValidate = validation.validateLogin(login);
        String response = null;
        if (loginValidate == null) {
            String userValidate = null;
            userValidate = validation.validateUser(userDetail);
            if (userValidate == null) {
                String insertLogin = " INSERT INTO login VALUES (?,?,?)";
                String sql = "INSERT INTO userdetail (userId,name,email,mobile,username) values (0,?,?,?,?)";
                if (!isExist(userDetail)) {
                    List<String> args = null;
                    args = new ArrayList<>();
                    args.add(login.getUsername());
                    args.add(login.getPassword());
                    args.add(login.getRole());
                    int success = jdbcTemplate.update(insertLogin, args.toArray());
                    if (success > 0) {
                        args = new ArrayList<>();
                        args.add(userDetail.getName());
                        args.add(userDetail.getEmail());
                        args.add(userDetail.getMobile());
                        args.add(userDetail.getUsername());
                        int temp = jdbcTemplate.update(sql, args.toArray());
                        if (temp > 0) {
                            response = "Successfully added.";
                        } else {
                            response = "Unable to insert User";
                        }
                    } else {
                        response = "Unable to insert in Login";
                    }
                } else {
                    response = "User already Exist";
                }
            } else {
                response = userValidate;
            }
        } else {
            response = loginValidate;
        }
        return response;
    }

    @Override
    public boolean isExist(UserDetail detail) {

        boolean isExist = false, isUsername = false, isEmail = false;
        List<String> args = new ArrayList<>();
        StringBuilder query = new StringBuilder(" SELECT * FROM userdetail ");

        if (!StringUtils.isEmpty(detail.getUsername())) {
            query.append(" WHERE username = ? ");
            args.add(detail.getUsername());
            isUsername = true;
        }
        if (isUsername) {
            if (!StringUtils.isEmpty(detail.getEmail())) {
                query.append(" AND email = ? ");
                args.add(detail.getEmail());
            }
        } else if (!StringUtils.isEmpty(detail.getEmail())) {
            query.append(" WHERE email = ? ");
            args.add(detail.getEmail());
            isEmail = true;
        }
        if (isUsername || isEmail) {
            if (!StringUtils.isEmpty(detail.getMobile())) {
                query.append(" AND mobile = ? ");
                args.add(detail.getMobile());
            }
        } else if (!StringUtils.isEmpty(detail.getMobile())) {
            query.append(" WHERE mobile = ? ");
            args.add(detail.getMobile());
        }
        Login login = jdbcTemplate.query(query.toString(), new LoginExtractor(), args.toArray());
        if (!StringUtils.isEmpty(login.getUsername())) {
            isExist = true;
        }
        return isExist;
    }

    @Override
    public List<UserDetail> userDetailList(UserDetail detail) {

//        List<UserDetail> userDetails = new ArrayList<>();
        boolean isUsername = false, isEmail = false;
        StringBuilder query = new StringBuilder("SELECT * FROM userdetail ");
        List<String> args = new ArrayList<>();
        if (!StringUtils.isEmpty(detail)) {
            if (!StringUtils.isEmpty(detail.getUsername())) {
                query.append(" WHERE username = ? ");
                args.add(detail.getUsername());
                isUsername = true;
            }
            if (isUsername) {
                if (!StringUtils.isEmpty(detail.getEmail())) {
                    query.append(" AND email = ? ");
                    args.add(detail.getEmail());
                }
            } else if (!StringUtils.isEmpty(detail.getEmail())) {
                query.append(" WHERE email = ? ");
                args.add(detail.getEmail());
                isEmail = true;
            }
            if (isEmail) {
                if (!StringUtils.isEmpty(detail.getMobile())) {
                    query.append(" AND mobile = ? ");
                    args.add(detail.getMobile());
                }
            } else if (!StringUtils.isEmpty(detail.getMobile())) {
                query.append(" WHERE mobile = ? ");
                args.add(detail.getMobile());
            }

        }
        List<UserDetail> userDetailList = jdbcTemplate.query(query.toString(), new UserExtractor(), args.toArray());
//        if (con == null) {
//            con = connection();
//        }
//        UserDetail userDetail = null;
//
//        try {
//            if (detail != null && (!detail.getUsername().equals("") || !detail.getEmail().equals("") || !detail.getMobile().equals(""))) {
//                String sql = "SELECT * FROM userdetail WHERE username = ? OR email = ? OR mobile = ? ";
//                ps = con.prepareStatement(sql);
//                ps.setString(1, detail.getUsername());
//                ps.setString(2, detail.getEmail());
//                ps.setString(3, detail.getMobile());
//                rs = ps.executeQuery();
//                if (rs.next()) {
//                    userDetail = new UserDetail();
//                    userDetail.setUserId(rs.getInt("userId"));
//                    userDetail.setName(rs.getString("name"));
//                    userDetail.setEmail(rs.getString("email"));
//                    userDetail.setUsername(rs.getString("username"));
//                    userDetail.setMobile(rs.getString("mobile"));
//                    userDetails.add(userDetail);
//                }
//
//            } else {
//                String sql = "SELECT * FROM userdetail";
//                ps = con.prepareStatement(sql);
//                rs = ps.executeQuery();
//                while (rs.next()) {
//                    userDetail = new UserDetail();
//                    userDetail.setUserId(rs.getInt("userId"));
//                    userDetail.setName(rs.getString("name"));
//                    userDetail.setEmail(rs.getString("email"));
//                    userDetail.setUsername(rs.getString("username"));
//                    userDetail.setMobile(rs.getString("mobile"));
//                    userDetails.add(userDetail);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                con.close();
//                ps.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        return userDetailList;
    }

    private Connection connection() {

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://10.1.249.41:3306/ac_service", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
