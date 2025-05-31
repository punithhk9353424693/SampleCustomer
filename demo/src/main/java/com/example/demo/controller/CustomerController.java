package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService ser;
	
	@PostMapping("/savecustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
	     Customer customer2=  ser.saveCustomer(customer);
	     return ResponseEntity.ok("saved Succesfully"+customer2);
	
	}
	 
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers=ser.getAllCustomers();
		return ResponseEntity.ok(customers);
		
	}
	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<String> deleteCustomer(@RequestParam Long id){
		String s=ser.deleteCustomer(id);
		return ResponseEntity.ok(s);
		
	}
	@PutMapping("/updateCustomer")
	public ResponseEntity<String> updateCustomer(@RequestParam Long id,@RequestBody Customer customer){
		
		String s=ser.updateCustomer(id, customer);
		return ResponseEntity.ok(s);
	}
}
