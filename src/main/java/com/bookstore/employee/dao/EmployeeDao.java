package com.bookstore.employee.dao;

import com.bookstore.base.BaseDao;
import com.bookstore.employee.entity.EmployeeEntity;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDao extends BaseDao<EmployeeEntity> {

    public EmployeeEntity findEmployeeByUserName(String userName) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<EmployeeEntity> criteriaQuery = criteriaBuilder.createQuery(getPersistentClass());
        Root<EmployeeEntity> root = criteriaQuery.from(getPersistentClass());
        criteriaQuery.select(root).distinct(true).where(criteriaBuilder.equal(root.get("userName"), userName));

        return getEntityManager().createQuery(criteriaQuery).getResultList().get(0);
    }
}
