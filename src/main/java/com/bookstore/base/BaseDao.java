package com.bookstore.base;

import com.bookstore.employee.model.EmployeeModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public abstract class BaseDao<T extends BaseEntity> {

	@PersistenceContext(unitName = "jee_practice")
	private EntityManager em;

	private Class<T> persistentClass;

	public Class<T> getPersistentClass() {
		if (persistentClass == null) {
			persistentClass = (Class<T>) ((ParameterizedType) getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return persistentClass;
	}

	protected EntityManager getEntityManager() {
		return em;
	}

	public T persist(T entity) {
		em.persist(entity);
		return entity;
	}

	public T find(Long id) {
		T persistent = em.find(getPersistentClass(), id);
		if (persistent == null) {
			return  null;
		}
		return persistent;
	}

	public void remove(Long id) {
		em.remove(find(id));
	}

	public void remove(T entity) {
		em.remove(em.merge(entity));
	}

	public void merge(T entity) {
		em.merge(entity);
	}
}
