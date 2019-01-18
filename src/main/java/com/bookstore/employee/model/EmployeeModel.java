package com.bookstore.employee.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel implements Serializable{
	private static final long serialVersionUID = 8740206300292196731L;
	private Long id;
	private String userName;
	private String pass;
}
