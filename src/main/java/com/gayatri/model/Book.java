package com.gayatri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	
	@Id
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_name", nullable=false)
	private String bookName;
	
	@Column(name="book_isbn", nullable=false, unique=true)
	private int bookISBN;
	
	@Column(name="book_author", nullable=false)
	private String bookAuthor;
	
	@Column(name="book_genre", nullable=false)
	private String bookGenre;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(int bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookISBN=" + bookISBN + ", bookAuthor="
				+ bookAuthor + ", bookGenre=" + bookGenre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookISBN;
		result = prime * result + bookId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookISBN != other.bookISBN)
			return false;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	
	
	

}
