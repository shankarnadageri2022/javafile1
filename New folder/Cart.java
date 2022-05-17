package com.capgemini.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Item> itms=new HashSet();
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Set<Item> getItms() {
		return itms;
	}
	public void setItms(Set<Item> itms) {
		this.itms = itms;
	}
	public void addItem(Item item)
	{
		this.getItms().add(item);
	}
	

}
