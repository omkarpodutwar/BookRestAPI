package com.example.BookAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookAPI.Entity.BookEntity;
import com.example.BookAPI.Service.BookService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/bookdetails")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to the BOOK REST API";
	}

	@GetMapping("/books")
	public List<BookEntity> findAllBook(){
		return service.findAllBook();
	}
	
	@GetMapping("books/{id}")
	public BookEntity findBookById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/books")
	public BookEntity saveBook(@RequestBody BookEntity bookEntity) {
		return service.saveBook(bookEntity);
	}
	
	@PutMapping("books/{id}")
	public BookEntity updateBook(@RequestBody BookEntity bookEntity) {
		return service.updateBook(bookEntity);
	}
	
	@DeleteMapping("books/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		service.deleteBook(id);
	}
	
}
