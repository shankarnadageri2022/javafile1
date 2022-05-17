package com.capgemini.Main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.model.Customer;
import com.capgemini.model.Order;

public class TestForCustomerApp {

	public static void main(String[] args) {

EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
Customer customer=new Customer();
customer.setCustomerName("XYZ");
customer.setEmail("xyz@gmail.com");
customer.setPhone(687823);
customer.setCustomerAddress("Chennai");

Order order=new Order();
order.setOrderId(10);
order.setOrderName("chiken biriyani");
order.setOrderType("veg");
order.setOrderDate(LocalDate.now());
customer.setOrder(order);









  EntityManager em= factory.createEntityManager();
  //start transaction
  //EntityManagerTrasaction
  em.getTransaction().begin();
   em.persist(customer);
   em.getTransaction().commit();
  
  











		
		
		

	}

}
