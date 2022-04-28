package com.sabaris.demo.service;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabaris.demo.entity.Customer;
import com.sabaris.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerrepo;

	@Override
	public Customer savecust(Customer cust) {
		return customerrepo.save(cust);
	}

	@Override
	public List<Customer> fetchCustomer() {
		return customerrepo.findAll();
	}

	//get by id
	@Override
	public Customer fetchCustomerById(int custid) {
		return customerrepo.findById(custid).get();
	}

	//put method
	@Override
	public Customer updateCustomer(int custid, Customer customer) {
		Customer updatecustomerdb = customerrepo.findById(custid).get();
		if(Objects.nonNull(customer.getPolicyid())) {
			//updatecustomerdb.setPolicyid(custid);
			updatecustomerdb.setPolicyid(customer.getPolicyid());
			//System.out.println(customer.getPolicyid());
		}
		return customerrepo.save(updatecustomerdb);
	}
	
	@Override
	public void deleteCustomerById(int custid) {
			customerrepo.deleteById(custid);
	}


}
