/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.service.validator;

import ac.service.pojo.Login;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 *
 * @author amittal
 */
@Component
public class Validation {

    public String validateLogin(Login login) {

        String response = null;
        if ((StringUtils.isEmpty(login.getPassword())) || (StringUtils.isEmpty(login.getUsername()))) {
            response = "Username or Password field is empty";
        }
        if (login.getRole().equals("select")) {
            response = "Please select role";
        }
        return response;
    }

    public String textFieldValidation(String textField) {

        String validate = null;
        if (StringUtils.isEmpty(textField) || StringUtils.containsWhitespace(textField)) {
            validate = " field is empty or it contains white Spaces";
        }
        return validate;
    }
}
