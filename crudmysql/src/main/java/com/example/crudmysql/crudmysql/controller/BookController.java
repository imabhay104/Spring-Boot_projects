package com.example.crudmysql.crudmysql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudmysql.crudmysql.library.Book;
import com.example.crudmysql.crudmysql.service.BookService;

@RestController
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping(path = "/api/books")
	public List<Book> ListBooks()
	{
		return bookService.getAllBooks();
		
	}
	@GetMapping(path = "/api/books/{id}")
	public Book BookByIsbn(@RequestParam String isbn)
	{
		return bookService.getBookByIsbn(isbn);
		
	}
}
