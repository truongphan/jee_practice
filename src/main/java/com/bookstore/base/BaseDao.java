package com.bookstore.base;

import javax.persistence.EntityManager;

public abstract class BaseDao<T extends BaseEntity> {

	private Class<T> persistentClass;
	
	protected abstract EntityManager getEntityManager();
	
	public T persist(T entity) {
		getEntityManager().persist(entity);
		return entity;
	}
}
