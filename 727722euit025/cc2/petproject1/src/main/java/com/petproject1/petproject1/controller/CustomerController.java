package com.petproject1.petproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.petproject1.petproject1.model.Customer;
import com.petproject1.petproject1.service.CustomerService;
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/api/customer")
    public Customer addcustomer(@RequestBody Customer customer)
    {
        return customerService.addcustomer(customer);
    }
    
    @GetMapping("/get/customer")
    public List<Customer> getcustomer()
    {
        return customerService.getcustomer();
    }
    @GetMapping("/api/page/{offset}/{pageSize}")
    public List<Customer> getpage(@PathVariable int offset,@PathVariable int pageSize) {
        return customerService.page(offset,pageSize) ;
    }
    @GetMapping("/api/sort/{field}")
    public List<Customer> getMethodName(@PathVariable String field) {
        return customerService.sort(field);
    }
    
    
}
