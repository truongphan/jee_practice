package com.bookstore.testapp;

		import com.bookstore.customer.entity.CustomerEntity;
		import com.bookstore.customer.model.CustomerModel;

		import javax.persistence.EntityManager;
		import javax.persistence.EntityManagerFactory;
		import javax.persistence.Persistence;

public class TestApp {


	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jee_practice");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		CustomerEntity customerEntity = em.find(CustomerEntity.class, 1L);
		CustomerModel cust = CustomerModel.builder().id(customerEntity.getId()).firstName(customerEntity.getFirstName())
				.lastName(customerEntity.getLastName()).email(customerEntity.getEmail()).uuid(customerEntity.getUuid()).build();
		System.out.println(cust.getId());
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
