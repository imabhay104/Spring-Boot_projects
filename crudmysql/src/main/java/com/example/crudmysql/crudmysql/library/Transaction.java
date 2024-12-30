package com.example.crudmysql.crudmysql.library;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transactionId;

	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "book_id")
	private Book book;
	@ManyToOne
	@JoinColumn(name = "member_id", referencedColumnName = "member_id")
	private Member member;

	private Date borrowDate;
	private Date due_date;
	private Date returnDate;

	@Column(name = "status")
	private String status;

	public int getTransactionId() {
		return transactionId;
	}

	public Book getBook() {
		return book;
	}

	public Member getMember() {
		return member;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public Date getDue_date() {
		return due_date;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public String getStatus() {
		return status;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
