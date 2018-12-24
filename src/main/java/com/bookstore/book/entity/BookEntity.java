package com.bookstore.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.bookstore.base.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="book", schema="store_1")
public class BookEntity extends BaseEntity {

	private static final long serialVersionUID = -852570522431222746L;
	
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
