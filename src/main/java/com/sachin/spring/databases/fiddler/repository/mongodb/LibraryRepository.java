package com.sachin.spring.databases.fiddler.repository.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sachin.spring.databases.fiddler.entity.mongodb.Library;

@Repository
public interface LibraryRepository extends MongoRepository<Library, String> {

	Library findOneById(String id);
}
