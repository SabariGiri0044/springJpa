package com.sabaris.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sabaris.demo.entity.Customer;
import com.sabaris.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custservice;
	
	//post method
	@PostMapping("/customerpost/")
	public Customer savecust(@RequestBody Customer cust) {
	return custservice.savecust(cust);
	}

	//get method by all
	@GetMapping("/getcustomer/")
	public List<Customer> fetchCustomer(){
		return custservice.fetchCustomer();
	}
	
	//get  by id
		@GetMapping("/getcustomer/{id}")
		public Customer fetchCustomerById(@PathVariable("id") int custid) {
			return custservice.fetchCustomerById(custid);
		}
		
		// update
		@PutMapping("/customerupdate/{id}")
		public Customer updateCustomer(@PathVariable("id")int custid,@RequestBody Customer customer) {
			return custservice.updateCustomer(custid, customer);
		}
		
		
	// delete  by id
		@DeleteMapping("/customerdelete/{id}")
		public String deleteCustomerById(@PathVariable("id") int custid) {
			 custservice.deleteCustomerById(custid);
			 return "particular customer's detail deleted successfully";
		}
		
}
