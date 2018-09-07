package com.sachin.spring.databases.fiddler.entity.mongodb;

import java.util.Collection;

import javax.persistence.Id;

import com.sachin.spring.databases.fiddler.entity.postgresql.Book;

public class Shelf {

	@Id
	private String id;
	private Collection<Book> books;

	public Shelf() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param books
	 */
	public Shelf(Collection<Book> books) {
		super();
		this.books = books;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

}
