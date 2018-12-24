package com.bookstore.customer.model;

import java.io.Serializable;

import com.bookstore.common.Mapped;

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
	
	@Mapped
	private Long id;

	@Mapped
	private String name;
	
	@Mapped
	private String address;
}
