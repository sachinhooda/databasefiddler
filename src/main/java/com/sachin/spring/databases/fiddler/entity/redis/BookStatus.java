package com.sachin.spring.databases.fiddler.entity.redis;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("BooksStatus")
public class BookStatus {

	@Id
	private String id;

	private String status;

	/**
	 * 
	 */
	public BookStatus() {

	}

	/**
	 * @param status
	 */
	public BookStatus(String status) {

		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
