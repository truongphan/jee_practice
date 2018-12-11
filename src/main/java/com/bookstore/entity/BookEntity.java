package com.bookstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="book", schema="store_1")
public class BookEntity implements Serializable {

	private static final long serialVersionUID = -852570522431222746L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private Float price;
	
	@Size(min=10, max=2000)
	@Column(name = "description")
	private String description;
	
	@Column(name = "isbn")
	private String isbn;
	
	@Column(name = "nbOfPage")
	private Integer nbOfPage;
	
	@Column(name = "illustrations")
	private Boolean illustrations;
}
