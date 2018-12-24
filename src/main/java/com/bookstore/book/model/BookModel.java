package com.bookstore.book.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookModel implements Serializable{
	private static final long serialVersionUID = 3930321568163457484L;

	private Long id;

	private String title;
	
	private Float price;
	
	private String description;
	
	private String isbn;
	
	private Integer nbOfPage;
	
	private Boolean illustrations;
}
