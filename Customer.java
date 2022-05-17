package com.capgemini.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Customer customer =new Customer();
//customer--{
//I have to give some instruction to hibernate framework to map this class as entity in persistence context and table in database
//either we can use annotation 
//we use xml file
// Customer {customerId, customerName, phone, email}

//Product--pId,pName,pPrice,pMfdDate
//Student -studId, studName, 
//search pid
// annoation

//method{

@Entity
@Table(name = "Customer_Table25")
public class Customer {
	//primary key col
	//I want to generate this value of customerId from Db server
	//100
	//1
	
	@Id
	//@SequenceGenerator(name = "abc",initialValue = 100,allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(name="cust_name")
	private String customerName;
	@Column(name ="cust_phone",unique =true, nullable = false)
	private long phone;
    @Column(name ="cust_email",unique =true, nullable = true)
	private String email;
   /* @Column(name="cust_addr")
    private String customerAddress;*/
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="order_id")
    private Order order;
    
    
    private Address address;
    
    
    
    
    
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
