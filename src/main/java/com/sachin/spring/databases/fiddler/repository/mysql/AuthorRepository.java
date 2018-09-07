package com.sachin.spring.databases.fiddler.repository.mysql;

import org.springframework.data.repository.CrudRepository;

import com.sachin.spring.databases.fiddler.entity.mysql.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	Author findByEmail(String email);

	Author findOneById(Long id);

	Author save(Author author);
}
