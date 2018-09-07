package com.sachin.spring.databases.fiddler.repository.postgresql;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.spring.databases.fiddler.entity.postgresql.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	Book findOneById(Long id);

	List<Book> findByPrintType(String printType);

	Book save(Book book);
}
