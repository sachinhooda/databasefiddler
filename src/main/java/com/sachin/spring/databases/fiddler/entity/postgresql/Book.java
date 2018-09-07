package com.sachin.spring.databases.fiddler.entity.postgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private int authorId;

	@Column
	private String title;

	@Column
	private String rating;

	@Column
	private String theme;

	@Column
	private String printType;

	public Book() {

	}

	/**
	 * @param id
	 * @param authorId
	 * @param title
	 * @param rating
	 * @param theme
	 * @param printType
	 */
	public Book(int authorId, String title, String rating, String theme, String printType) {
	
		this.authorId = authorId;
		this.title = title;
		this.rating = rating;
		this.theme = theme;
		this.printType = printType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

}
