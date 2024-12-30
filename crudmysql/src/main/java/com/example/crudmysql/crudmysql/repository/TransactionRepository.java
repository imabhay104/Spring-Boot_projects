package com.example.crudmysql.crudmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudmysql.crudmysql.library.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	 
}
	