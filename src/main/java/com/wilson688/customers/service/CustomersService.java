package com.wilson688.customers.service;

import com.wilson688.customers.model.Customers;
import com.wilson688.customers.repository.CustomersRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomersService {

    private CustomersRepository customerRepository;


    public CustomersService(CustomersRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customers> getCutomers() {
        return customerRepository.findAll();
    }

    public Customers getCustomer(int id) {
        return customerRepository.getOne(id);
    }


    public Customers saveCustomer(Customers customers) {
        return customerRepository.save(customers);
    }

    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }


}
