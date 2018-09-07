package com.sachin.spring.databases.fiddler.service;

import com.sachin.spring.databases.fiddler.entity.mongodb.Library;
import com.sachin.spring.databases.fiddler.entity.mysql.Author;
import com.sachin.spring.databases.fiddler.entity.postgresql.Book;
import com.sachin.spring.databases.fiddler.entity.redis.BookStatus;

public interface FiddlerService {

	public Author getAuthorByEmail(String email);

	public Book getBookById(Long id);

	public BookStatus getBookStatusById(String id);

	public Book saveBook(Book book);

	public Author saveAuthor(Author author);

	public BookStatus saveBookStatus(BookStatus bookStatus);

	public Library getLibraryById(String Id);

	public Library saveLibrary(Library library);

	
}
