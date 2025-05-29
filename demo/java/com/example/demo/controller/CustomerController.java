package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService ser;
	
	@RequestMapping("/savecustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
	     Customer customer2=  ser.saveCustomer(customer);
	     return ResponseEntity.ok("saved Succesfully"+customer2);
	
	}
	 
	@RequestMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers=ser.getAllCustomers();
		return ResponseEntity.ok(customers);
		
	}
}
