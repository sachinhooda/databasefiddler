package com.sachin.spring.databases.fiddler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.spring.databases.fiddler.entity.mongodb.Library;
import com.sachin.spring.databases.fiddler.entity.mysql.Author;
import com.sachin.spring.databases.fiddler.entity.postgresql.Book;
import com.sachin.spring.databases.fiddler.entity.redis.BookStatus;
import com.sachin.spring.databases.fiddler.service.FiddlerService;

@RestController
@RequestMapping("/rest")
public class FiddlerController {

	@Autowired
	private FiddlerService fiddlerService;

	@RequestMapping(value = "/author", method = RequestMethod.GET)
	public Author getAuthor(@RequestParam("email") String email) {

		return fiddlerService.getAuthorByEmail(email);
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public Book getBook(@PathVariable Long id) {

		return fiddlerService.getBookById(id);
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public Book addBook() {

		Book book = new Book(1, "Fire in the hole", "9", "Sniper", "Hardcover");
		fiddlerService.saveBookStatus(new BookStatus("Available"));
		return fiddlerService.saveBook(book);
	}

	@RequestMapping(value = "/author", method = RequestMethod.POST)
	public Author addAuthor() {
		Author author = new Author("Sachin", "Hooda", "9", "sachin.hooda@metadesignsolutions.com.au");
		return fiddlerService.saveAuthor(author);
	}

	@RequestMapping(value = "/book/status/{id}", method = RequestMethod.GET)
	public BookStatus getBookStatus(@PathVariable String id) {

		return fiddlerService.getBookStatusById(id);
	}

	@RequestMapping(value = "/library", method = RequestMethod.POST)
	public Library addLibrary() {

		Library library = new Library("Wales-Library");

		return fiddlerService.saveLibrary(library);
	}

	@PostMapping(value = "/bookstatus")
	public BookStatus addBookStatus() {

		BookStatus bookStatus = new BookStatus("Available");

		return fiddlerService.saveBookStatus(bookStatus);
	}
}
