package com.wilson688.customers.controller;

import com.wilson688.customers.model.Customers;
import com.wilson688.customers.service.CustomersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
public class CustomersController {


    @Autowired
    private CustomersService customersService;


   @GetMapping(path = "/customers")
    public ResponseEntity<?> listCustomers() {
        List<Customers> resource = customersService.getCutomers();
        return ResponseEntity.ok(resource);
    }


    @PostMapping(path = "/customers")
    public ResponseEntity<?> saveCustomer(@RequestBody Customers customer) {
       Customers resource = customersService.saveCustomer(customer);
       return ResponseEntity.ok(resource);
    }


}
