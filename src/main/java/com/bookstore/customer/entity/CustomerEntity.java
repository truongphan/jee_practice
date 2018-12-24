package com.bookstore.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bookstore.base.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer", schema = "store_1")
public class CustomerEntity extends BaseEntity {
	private static final long serialVersionUID = -2406484907732305157L;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;

}
