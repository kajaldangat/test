package com.Ovalley.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ovalley.Dao.Dao;
import com.Ovalley.pojo.Customer;
import com.Ovalley.service.service;

@Service
public class serviceImp implements service {
	@Autowired
	private Dao d;

	public void addCustomers(Customer cust) {
		d.addCustomers(cust);
		// TODO Auto-generated method stub

	}

	public void updateCustomers(Customer cust) {
		d.updateCustomers(cust);
		// TODO Auto-generated method stub

	}

	public void deleteCustomers(int id) {
		d.deleteCustomers(id);
		// TODO Auto-generated method stub

	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		System.out.println("in service impl");
		return d.getAllCustomers();
	}

	public Customer getCustomerById(int cust_id) {
		// TODO Auto-generated method stub
		return d.getCustomerById(cust_id);
	}

}
