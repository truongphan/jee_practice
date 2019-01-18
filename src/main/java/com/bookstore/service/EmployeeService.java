package com.bookstore.service;

import com.bookstore.customer.dao.CustomerDao;
import com.bookstore.customer.entity.CustomerEntity;
import com.bookstore.customer.model.CustomerModel;
import com.bookstore.employee.dao.EmployeeDao;
import com.bookstore.employee.entity.EmployeeEntity;
import com.bookstore.employee.model.EmployeeModel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.ValidationException;

@Stateless
public class EmployeeService {

    @Inject
    private EmployeeDao employeeDao;

    public EmployeeModel findEmployeeByUserName(String userName, String pass) throws ValidationException {
        EmployeeEntity emp = employeeDao.findEmployeeByUserName(userName);
        if (emp == null) {
            return  null;
        }
        if (pass.equalsIgnoreCase(emp.getPass())) {
            return EmployeeModel.builder().id(emp.getId())
                    .userName(emp.getUserName())
                    .pass(emp.getPass()).build();
        } else {
            throw  new ValidationException("Password is wrong");
        }
    }
}
