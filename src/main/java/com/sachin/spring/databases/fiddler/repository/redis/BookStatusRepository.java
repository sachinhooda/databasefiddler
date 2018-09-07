package com.sachin.spring.databases.fiddler.repository.redis;

import org.springframework.data.repository.CrudRepository;

import com.sachin.spring.databases.fiddler.entity.redis.BookStatus;

public interface BookStatusRepository extends CrudRepository<BookStatus, String> {

	BookStatus findOneById(String id);

	@SuppressWarnings("unchecked")
	BookStatus save(BookStatus bookStatus);
}
