package com.javatechie.config;

import com.javatechie.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerDataProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getGender().equals("Male")) {
            return customer;
        }
        return null;
    }
}
