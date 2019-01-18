package com.bookstore.employee.entity;

import com.bookstore.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "employee", schema = "store1")
public class EmployeeEntity extends BaseEntity {

	@Column(name = "user_name")
	private String userName;

	@Column(name = "pass")
	private String pass;
}
