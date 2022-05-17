package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Developer;
import model.Emp;
import model.Manager;

public class TestInheritance2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Emp e1=new Emp();
		
		e1.setName("xyz");
		e1.setEmpSalary(5000.00);
		em.persist(e1);
		Developer d1=new Developer();
		d1.setName("ABC");
		d1.setEmpSalary(7000.00);
		d1.setProjectLocation("Bangalore");
		d1.setProjectName("web project");
		em.persist(d1);
		
		Manager m1=new Manager();
		m1.setName("Ravi");
		m1.setEmpSalary(15000.00);
		m1.setTemName("add");
		em.persist(m1);
		em.getTransaction().commit();

	}

}
