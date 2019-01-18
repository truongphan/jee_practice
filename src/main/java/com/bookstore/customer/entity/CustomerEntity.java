package com.bookstore.customer.entity;

import javax.persistence.*;

import com.bookstore.base.BaseEntity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "customer", schema = "store1")
public class CustomerEntity extends BaseEntity {
	private static final long serialVersionUID = -2406484907732305157L;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "uuid")
	private String uuid;

}
