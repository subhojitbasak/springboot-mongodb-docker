package com.springboot.dockercompose.dao;

import com.springboot.dockercompose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepository extends MongoRepository<Book, Integer> {

}
