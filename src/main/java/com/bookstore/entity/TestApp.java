package com.bookstore.entity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestApp {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jee_practice");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<BookEntity> Students = em.createQuery("from BookEntity").getResultList();
		for (Iterator<BookEntity> iterator = Students.iterator(); iterator.hasNext();) {
			BookEntity bookEntity = (BookEntity) iterator.next();
	        System.out.println(bookEntity);
	      }
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
