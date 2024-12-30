package com.example.crudmysql.crudmysql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crudmysql.crudmysql.library.Book;
import com.example.crudmysql.crudmysql.repository.BookRepository;
import com.example.crudmysql.crudmysql.repository.MemberRepository;
import com.example.crudmysql.crudmysql.repository.TransactionRepository;

@Service
public class BookService {
	private BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
		
	}
	
	public List<Book> getAllBooks()
	{
		return  bookRepository.findAll();
	}
	
	public void addbook(Book book)
	{
		bookRepository.save(book);
	}
	public Book getBookByIsbn(String isbn)
	{
		return bookRepository.findByIsbn(isbn);
	}
	
	
	
}
