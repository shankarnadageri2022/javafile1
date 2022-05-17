package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addreesId;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	

}
