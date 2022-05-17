package com.capgemini.Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.capgemini.model.Address;
import com.capgemini.model.Cart;
import com.capgemini.model.Customer;

import com.capgemini.model.Item;
import com.capgemini.model.Order;

public class TestForCustomerApp {

	public static void main(String[] args) {

EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");

Cart cart =new Cart();
Item item1=new Item();
item1.setItemId(2);
item1.setItemName("Watch");
item1.setItemPrice(34000.00);
item1.setCart(cart);
cart.addItem(item1);
Item item2=new Item();
item2.setItemId(3);
item2.setItemName("Laptop");
item2.setItemPrice(64000.00);
item2.setCart(cart);
cart.addItem(item2);


Customer customer=new Customer();
customer.setCustomerName("Amit");
customer.setEmail("amit@gmail.com");
customer.setPhone(684420063);


Order order=new Order();
order.setOrderId(16);
order.setOrderName("veg biriyani");
order.setOrderType("veg");
order.setCart(cart);
Scanner scanner=new Scanner(System.in);
System.out.println("Enter date in yyyy-MM-dd format");
//2022-05-12
//gopal

String dateofOrder=scanner.next();
//parse(String dateinput)
//parse(String dateInput, dateformat)

//LocalDate localDate1=LocalDate.parse(dateofOrder, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
LocalDate localDate1=LocalDate.parse(dateofOrder);

order.setOrderDate(localDate1);
customer.setOrder(order);
Address address=new Address();
address.setCity("Pune");
address.setCountry("INDIA");
address.setPinCode("677882");
address.setState("MH");
address.setCustomer(customer);

customer.setAddress(address);




















  EntityManager em= factory.createEntityManager();
  //start transaction
  //EntityManagerTrasaction
  em.getTransaction().begin();
   em.persist(customer);
   em.persist(cart);
   em.getTransaction().commit();
  
  











		
		
		

	}

}
