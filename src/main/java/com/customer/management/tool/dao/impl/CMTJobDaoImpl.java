package com.customer.management.tool.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.customer.management.tool.constants.CMTOrderStatusCode;
import com.customer.management.tool.dao.CMTJobDao;
import com.customer.management.tool.extractor.CMTCategoryExtractor;
import com.customer.management.tool.extractor.CustomerJobDetailExtractor;
import com.customer.management.tool.extractor.GetLastInsertedIDExtractor;
import com.customer.management.tool.pojo.CMTCategory;
import com.customer.management.tool.pojo.CustomerJobDetail;

@Component
public class CMTJobDaoImpl implements CMTJobDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String addCategory(CMTCategory category) {

		String response = null;
		String query = "INSERT INTO CATEGORY (category_name) values (?)";
		if (!StringUtils.isEmpty(category) && !StringUtils.isEmpty(category.getCategory_name())) {
			Object[] args = { category.getCategory_name() };
			int executed = jdbcTemplate.update(query, args);
			if (executed > 0) {
				response = "Category Successfully inserted";
			}
		}
		return response;
	}

	@Override
	public List<CMTCategory> getCategories() {

		String query = "SELECT * FROM CATEGORY ";
		List<CMTCategory> categories = jdbcTemplate.query(query, new CMTCategoryExtractor());
		return categories;
	}

	@Override
	public String addCustomerJob(CustomerJobDetail customerJobDetail) {

		String response = null;
		String queryForOrderMgmt = "INSERT INTO customer_mgmt_tool.order_mgmt (customer_id, order_description, order_status, order_completion,"
				+ "order_date) VALUES (?,?,?,?,now()) ";
		String queryForCustomerJobDetail = "INSERT INTO customer_mgmt_tool.customer_job_detail(customer_id,category_id,order_id,unique_id,actual_amount,"
				+ "paid_amount,description,due_date,warranty,reason) VALUES (?,?,?,?,?,?,?,?,?,?) ";

		List<Object> args = new ArrayList<Object>();
		args.add(customerJobDetail.getCustomerId());
		args.add(customerJobDetail.getDescription());
		if (StringUtils.isEmpty(customerJobDetail.getDueDate())) {
			customerJobDetail.setDueDate(new Date().toString());
			args.add(CMTOrderStatusCode.COMPLETED.getPrperty());
			args.add(customerJobDetail.getDueDate());
		} else {
			args.add(CMTOrderStatusCode.PENDING.getPrperty());
			args.add(customerJobDetail.getDueDate());
		}

		int execute = jdbcTemplate.update(queryForOrderMgmt, args.toArray());
		if (execute > 0) {
			int orderid = getLastInsertedOrderID();
			args = new ArrayList<Object>();
			args.add(customerJobDetail.getCustomerId());
			args.add(customerJobDetail.getCategory_id());
			args.add(orderid);
			args.add(customerJobDetail.getUnique_Id());
			args.add(customerJobDetail.getActualAmount());
			args.add(customerJobDetail.getPaidAmount());
			args.add(customerJobDetail.getDescription());
			args.add(customerJobDetail.getDueDate());
			args.add(customerJobDetail.getWarranty());
			if (StringUtils.isEmpty(customerJobDetail.getReason())) {
				args.add(null);
			} else {
				args.add(customerJobDetail.getReason());
			}
			int executed = jdbcTemplate.update(queryForCustomerJobDetail, args.toArray());
			if (executed > 0) {
				response = "Customer Job details Successfully Added, orderID is " + orderid;
			}
		}
		return response;
	}

	@Override
	public int getLastInsertedOrderID() {

		String query = "SELECT max(orderId) as orderId FROM customer_mgmt_tool.order_mgmt";
		int id = jdbcTemplate.query(query, new GetLastInsertedIDExtractor());
		return id;
	}

	@Override
	public List<CustomerJobDetail> searchJobOfCustomer(CustomerJobDetail customerJobDetail) {

		String sql = "select * from customer_mgmt_tool.customer_job_detail AS CJD INNER JOIN customer_mgmt_tool.customer AS CUST ON CJD.customer_id=CUST.customerId "
				+ " INNER JOIN customer_mgmt_tool.category AS CAT ON CAT.categoryId = CJD.category_id INNER JOIN customer_mgmt_tool.order_mgmt AS OMGMT "
				+ "ON OMGMT.orderId = CJD.order_id INNER JOIN customer_mgmt_tool.customer_order_status AS OS ON OS.order_status =  OMGMT.order_status"
				+ " WHERE CUST.customerStatus = 'A' AND CAT.category_status = 'A' ";
		StringBuilder query = new StringBuilder(sql);
		List<Object> args = new ArrayList<>();
		if (customerJobDetail.getJobId() > 0) {
			query.append(" AND CJD.job_id = ?");
			args.add(customerJobDetail.getJobId());
		} else if (!StringUtils.isEmpty(customerJobDetail.getCmtOrderManagement())
				&& customerJobDetail.getCmtOrderManagement().getOrderId() > 0) {
			query.append(" AND CJD.order_id = ?");
			args.add(customerJobDetail.getCmtOrderManagement().getOrderId());
		} else if (!StringUtils.isEmpty(customerJobDetail.getUnique_Id())) {
			query.append(" AND CJD.unique_id LIKE ?");
			args.add("%" + customerJobDetail.getUnique_Id() + "%");
		} else if (customerJobDetail.getCustomerId() > 0) {
			query.append(" AND CJD.customer_id = ?");
			args.add(customerJobDetail.getCustomerId());
		} else if (!StringUtils.isEmpty(customerJobDetail.getEmail())) {
			query.append(" AND CUST.email = ?");
			args.add(customerJobDetail.getEmail());
		} else if (!StringUtils.isEmpty(customerJobDetail.getMobile())) {
			query.append(" AND CUST.mobile = ?");
			args.add(customerJobDetail.getMobile());
		}
		List<CustomerJobDetail> jobDetails = jdbcTemplate.query(query.toString(), new CustomerJobDetailExtractor(),
				args.toArray());

		return jobDetails;
	}
}
