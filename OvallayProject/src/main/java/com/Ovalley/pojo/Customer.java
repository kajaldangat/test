package com.Ovalley.pojo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_id;

	@Column
	private int contact;

	@Column
	private String cust_address;

	@Column
	private int zone;

	@Column
	private String active;

	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String custType;

	@Column
	private String email;

	@Column
	private String street;

	@Column
	private String state;

	@Column
	private String shopType;

	@Column
	private String city;

	@Column
	private String deliveyBoy; 
	/*
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)*/
	//private List<Address> custAddress;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int contact, String cust_address, int zone, String active, String fName, String lName,
			String custType, String email, String street, String state, String shopType, String city,
			String deliveyBoy) {
		super();
		this.contact = contact;
		this.cust_address = cust_address;
		this.zone = zone;
		this.active = active;
		this.fName = fName;
		this.lName = lName;
		this.custType = custType;
		this.email = email;
		this.street = street;
		this.state = state;
		this.shopType = shopType;
		this.city = city;
		this.deliveyBoy = deliveyBoy;
	}

	public Customer(int cust_id, int contact, String cust_address, int zone, String active, String fName, String lName,
			String custType, String email, String street, String state, String shopType, String city,
			String deliveyBoy) {
		super();
		this.cust_id = cust_id;
		this.contact = contact;
		this.cust_address = cust_address;
		this.zone = zone;
		this.active = active;
		this.fName = fName;
		this.lName = lName;
		this.custType = custType;
		this.email = email;
		this.street = street;
		this.state = state;
		this.shopType = shopType;
		this.city = city;
		this.deliveyBoy = deliveyBoy;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDeliveyBoy() {
		return deliveyBoy;
	}

	public void setDeliveyBoy(String deliveyBoy) {
		this.deliveyBoy = deliveyBoy;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", contact=" + contact + ", cust_address=" + cust_address + ", zone="
				+ zone + ", active=" + active + ", fName=" + fName + ", lName=" + lName + ", custType=" + custType
				+ ", email=" + email + ", street=" + street + ", state=" + state + ", shopType=" + shopType + ", city="
				+ city + ", deliveyBoy=" + deliveyBoy + "]";
	}

}
