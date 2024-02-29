package com.petproject1.petproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.petproject1.petproject1.model.Customer;
import com.petproject1.petproject1.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    
   public Customer addcustomer(Customer customer)
   {
    return customerRepo.save(customer);
   }
   public List<Customer> getcustomer()
   {
    return customerRepo.findAll();
   }
   public List<Customer> page(int offset,int pagesize)
   {
    return customerRepo.findAll(PageRequest.of(offset,pagesize)).getContent();
   }
   public List<Customer> sort(String field)
   {
    return customerRepo.findAll(Sort.by(Sort.Direction.ASC,field));
   }



    
}
