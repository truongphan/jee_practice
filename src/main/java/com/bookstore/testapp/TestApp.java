package com.bookstore.testapp;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.customer.entity.CustomerEntity;

public class TestApp {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jee_practice");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<CustomerEntity> customers = em.createQuery("SELECT a FROM CustomerEntity a").getResultList();
		for (Iterator<CustomerEntity> iterator = customers.iterator(); iterator.hasNext();) {
			CustomerEntity custEntity = (CustomerEntity) iterator.next();
			//CustomerModel custModel = BeanCopier.in(custEntity, CustomerModel.class);
	      }
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
