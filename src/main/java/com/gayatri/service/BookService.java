package com.gayatri.service;

import java.util.List;

import com.gayatri.model.Book;

public interface BookService {
	
	void saveBook(Book book);
	
	List<Book> findAllBooks();
	
	Book findByBookName(String bookName);
	
	void deleteBookByBookId(int bookId);
	
	void updateBook(Book book);
}
