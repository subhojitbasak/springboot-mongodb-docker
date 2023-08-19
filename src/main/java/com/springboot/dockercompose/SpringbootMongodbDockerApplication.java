package com.springboot.dockercompose;

import com.springboot.dockercompose.dao.bookRepository;
import com.springboot.dockercompose.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootMongodbDockerApplication {

	@Autowired
	private bookRepository bookRepo;

	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return bookRepo.save(book);
	}
	@GetMapping
	public List<Book> findBook(){
		return bookRepo.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbDockerApplication.class, args);
	}

}
