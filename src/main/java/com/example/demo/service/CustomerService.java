package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}

	
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}

}
