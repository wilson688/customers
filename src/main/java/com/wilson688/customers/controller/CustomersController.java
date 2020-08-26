package com.wilson688.customers.controller;


import com.wilson688.customers.model.Customers;
import com.wilson688.customers.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CustomersController {


    @Autowired
    private CustomersService customersService;


   // @GetMapping(path = CustomerLinks.LIST_CUSTOMERS)
    public ResponseEntity<?> listCustomers() {
        List<Customers> resource = customersService.getCutomers();
        return ResponseEntity.ok(resource);
    }


}
