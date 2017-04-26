package com.Ovalley.Dao;

import java.util.List;

import com.Ovalley.pojo.Customer;

public interface Dao 
{
public void addCustomers(Customer cust);
public void updateCustomers(Customer cust);
public void deleteCustomers(int id);
public List<Customer> getAllCustomers();
public Customer getCustomerById(int cust_id);


}
