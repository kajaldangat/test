package com.Ovalley.DaoImp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Ovalley.Dao.Dao;
import com.Ovalley.pojo.Customer;


@Repository
@Transactional
public class DaoImp implements Dao

{
@Autowired
private SessionFactory session;


public void addCustomers(Customer cust) {
	session.getCurrentSession().save(cust);
// TODO Auto-generated method stub
	
}

public void updateCustomers(Customer cust) {
	session.getCurrentSession().saveOrUpdate(cust);

	// TODO Auto-generated method stub
	
}

public void deleteCustomers(int id) {
	Customer c=(Customer) session.getCurrentSession().get(Customer.class, id);
	c.setActive("false");
	session.getCurrentSession().saveOrUpdate(c);
	// TODO Auto-generated method stub
	
}

public List<Customer> getAllCustomers() {
	// TODO Auto-generated method stub
	System.out.println("in dao impl");
	Query q=session.getCurrentSession().createQuery("from Customer where active ='true'");
	System.out.println("hiiiiiii");
	List<Customer> l=q.list();
	//return session.getCurrentSession().createQuery("from Customer").list();
	/*where is Active='true'*/
	return l;
}

public Customer getCustomerById(int cust_id) {
	// TODO Auto-generated method stub
	return (Customer) session.getCurrentSession().get(Customer.class,cust_id);
}
}
