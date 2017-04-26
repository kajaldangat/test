package com.Ovalley.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ovalley.pojo.Customer;
import com.Ovalley.service.service;

@RestController
public class CustomerController 
{
	@Autowired
	service s;
	@RequestMapping(value="/Customer", method=RequestMethod.GET)

	public @ResponseBody Map<String ,Object> getAllCustomer()
	{
		
		Map<String ,Object> map=new HashMap<String,Object>();
		System.out.println("getAll record ");
		 
		List<Customer> l=s.getAllCustomers(); 
		System.out.println(l.toString());
		map.put("ulist", l);
		return map;
	}
	@RequestMapping(value = "/insertcustomer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getUser(@RequestBody Map<String, String> data) {
		System.out.println("in test ");
		System.out.println(data	);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("in test service   "+data);
		//users.setId(1);
		Customer cust=new Customer();
		
		for ( Map.Entry<String, String> entry : data.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key=="+key+" value=="+value);
		    
		    
		    
		    if(key.equalsIgnoreCase("fName"))
		    {
		    	cust.setfName(value);
		    }
		    if(key.equalsIgnoreCase("lName"))
		    {
		    cust.setlName(value);
		    }
		    if(key.equalsIgnoreCase("street"))
		    {
		    	cust.setStreet(value);
		    }
		    if(key.equalsIgnoreCase("zone"))
		    {
		    cust.setZone(Integer.parseInt(value));
		    }
		    if(key.equalsIgnoreCase("active"))
		    {
		    cust.setActive(value);
		    }
		    if(key.equalsIgnoreCase("custType"))
		    {
		    	cust.setCustType(value);
		    }
		    if(key.equalsIgnoreCase("email"))
		    {
		    	cust.setEmail(value);
		    }
		    if(key.equalsIgnoreCase("state"))
		    {
		    	cust.setState(value);
		    }
		    if(key.equalsIgnoreCase("shopType"))
		    {
		    	cust.setShopType(value);
		    }
		    if(key.equalsIgnoreCase("city"))
		    {
		    	cust.setCity(value);
		    }
		    if(key.equalsIgnoreCase("deliveyBoy"))
		    {
		    	cust.setDeliveyBoy(value);
		    }
		    if(key.equalsIgnoreCase("contact"))
		    {
		    	cust.setContact(Integer.parseInt(value));
		    }
		    if(key.equalsIgnoreCase("address"))
		    {
		    	cust.setCust_address(value);
		    }
		    
		   /* else
		    {
		    	System.out.println("nothing");
		    }*/
		    	
		    	System.out.println(1);
		    // do something with key and/or tab
		}
		s.addCustomers(cust);
		return map;
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> deleteUser(@RequestBody String id) {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("in delete=="+id);
		//System.out.println(data);
		//users.setId(1);
		s.deleteCustomers(Integer.parseInt(id));
		return map;
	}
	
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> updateUser(@RequestBody Map<String, String> data) {
		System.out.println("in update ");
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("in test update   "+data);
		//users.setId(1);
		Customer cust=new Customer();
		
		for ( Map.Entry<String, String> entry : data.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key=="+key+" value=="+value);
		    
		    
		    if(key.equalsIgnoreCase("id"))
		    {
		    	cust.setCust_id(Integer.parseInt(value));
		    	//System.out.println(user.getName());
		    }
		   
		    
		    if(key.equalsIgnoreCase("fName"))
		    {
		    	cust.setfName(value);
		    }
		    if(key.equalsIgnoreCase("lName"))
		    {
		    cust.setlName(value);
		    }
		    if(key.equalsIgnoreCase("cust_address"))
		    {
		    	cust.setCust_address(value);
		    }
		    if(key.equalsIgnoreCase("zone"))
		    {
		    cust.setZone(Integer.parseInt(value));
		    }
		    if(key.equalsIgnoreCase("active"))
		    {
		    cust.setActive(value);
		    }
		    if(key.equalsIgnoreCase("custType"))
		    {
		    	cust.setCustType(value);
		    }
		    if(key.equalsIgnoreCase("email"))
		    {
		    	cust.setEmail(value);
		    }
		    if(key.equalsIgnoreCase("state"))
		    {
		    	cust.setState(value);
		    }
		    if(key.equalsIgnoreCase("shopType"))
		    {
		    	cust.setShopType(value);
		    }
		    if(key.equalsIgnoreCase("city"))
		    {
		    	cust.setCity(value);
		    }
		    if(key.equalsIgnoreCase("deliveyBoy"))
		    {
		    	cust.setDeliveyBoy(value);
		    }
		    if(key.equalsIgnoreCase("contact"))
		    {
		    	cust.setContact(Integer.parseInt(value));
		    }
		    if(key.equalsIgnoreCase("street"))
		    {
		    	cust.setStreet(value);
		    }


		   /* else
		    {
		    	System.out.println("nothing");
		    }*/
		    	
		    	System.out.println(1);
		    // do something with key and/or tab
		}
		s.updateCustomers(cust);
		return map;
	}
}
