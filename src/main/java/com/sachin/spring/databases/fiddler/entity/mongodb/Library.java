package com.sachin.spring.databases.fiddler.entity.mongodb;

import java.util.Collection;

import javax.persistence.Id;

public class Library {

	@Id
	private String id;
	private String name;
	private Collection<Shelf> shelves;

	public Library() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param shelves
	 */
	public Library(Collection<Shelf> shelves) {
		this.shelves = shelves;
	}

	/**
	 * @param shelves
	 */
	public Library(String name) {
		this.name = name;
	}

	/**
	 * @param shelves
	 */
	public Library(String name, Collection<Shelf> shelves) {
		this.name = name;
		this.shelves = shelves;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<Shelf> getShelves() {
		return shelves;
	}

	public void setShelves(Collection<Shelf> shelves) {
		this.shelves = shelves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
