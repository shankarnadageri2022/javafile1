package controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Order;
import model.Product;

public class AppForProduct {

	public static void main(String[] args) {


		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Product p1=new Product();
		p1.setId(1);
		p1.setName("A");
		p1.setPrice(30);
		Product p2=new Product();
		p2.setId(2);
		p2.setName("B");
		p2.setPrice(300);
		Product p3=new Product();
		p3.setId(3);
		p3.setName("C");
		p3.setPrice(50);
		
		
		Order order1=new Order();
		order1.setId(11);
		order1.addProduct(p1);
		order1.addProduct(p3);
		order1.setPurchaseDate(new Date());
		Order order2=new Order();
		order2.setId(12);
		order2.setPurchaseDate(new Date());
		order2.addProduct(p1);
		order2.addProduct(p2);
		order2.addProduct(p3);
		em.persist(order1);
		em.persist(order2);
		em.getTransaction().commit();
		em.close();
		factory.close();
		

	}

}
