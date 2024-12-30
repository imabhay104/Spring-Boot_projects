package com.example.crudmysql.crudmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudmysql.crudmysql.library.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByIsbn(String isbn);
}
	