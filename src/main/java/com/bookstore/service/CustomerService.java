package com.bookstore.service;

import com.bookstore.customer.entity.CustomerEntity;
import com.bookstore.customer.model.CustomerModel;
import com.bookstore.customer.dao.CustomerDao;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CustomerService {

    @Inject
    private CustomerDao customerDao;

    public CustomerModel getCustomerById(Long id){
        CustomerEntity customerEntity = customerDao.find(id);
        if (customerEntity == null) {
            return null;
        }
        return CustomerModel.builder().id(customerEntity.getId()).firstName(customerEntity.getFirstName())
                .lastName(customerEntity.getLastName()).email(customerEntity.getEmail()).uuid(customerEntity.getUuid()).build();
    }
}
