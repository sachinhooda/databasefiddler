package com.sachin.spring.databases.fiddler.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.spring.databases.fiddler.entity.mongodb.Library;
import com.sachin.spring.databases.fiddler.entity.mysql.Author;
import com.sachin.spring.databases.fiddler.entity.postgresql.Book;
import com.sachin.spring.databases.fiddler.entity.redis.BookStatus;
import com.sachin.spring.databases.fiddler.repository.mongodb.LibraryRepository;
import com.sachin.spring.databases.fiddler.repository.mysql.AuthorRepository;
import com.sachin.spring.databases.fiddler.repository.postgresql.BookRepository;
import com.sachin.spring.databases.fiddler.repository.redis.BookStatusRepository;
import com.sachin.spring.databases.fiddler.service.FiddlerService;

@Service
@Transactional
public class FiddlerServiceImpl implements FiddlerService {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookStatusRepository bookStatusRepository;

	@Autowired
	private LibraryRepository libraryRepository;
	
	
	public Author getAuthorByEmail(String email) {
		return authorRepository.findByEmail(email);
	}

	public Book getBookById(Long id) {
		return bookRepository.findOneById(id);
	}

	@Override
	public Book saveBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Author saveAuthor(Author author) {

		return authorRepository.save(author);
	}

	@Override
	public BookStatus getBookStatusById(String id) {
		return bookStatusRepository.findOneById(id);
	}

	@Override
	public BookStatus saveBookStatus(BookStatus bookStatus) {
		return bookStatusRepository.save(bookStatus);
	}

	@Override
	public Library getLibraryById(String id) {
		return libraryRepository.findOneById(id);
	}

	@Override
	public Library saveLibrary(Library library) {
		return libraryRepository.save(library);
	}
}
