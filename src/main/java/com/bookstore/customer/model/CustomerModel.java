package com.bookstore.customer.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel implements Serializable{
	private static final long serialVersionUID = 8740206300292196731L;
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String uuid;
}
