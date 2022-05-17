package controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Person;
import model.TemporaryEmployee;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		TemporaryEmployee emp1=new TemporaryEmployee(11,"Ravi", "sales");
		
		em.persist(emp1);
		TemporaryEmployee emp2=new TemporaryEmployee(12,"Gopal", "xyz");
		
		em.persist(emp2);
		em.getTransaction().commit();
		
	
		em.close();
		factory.close();
	}
}