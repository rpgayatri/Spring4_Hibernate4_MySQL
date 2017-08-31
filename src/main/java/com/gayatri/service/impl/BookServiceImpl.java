package com.gayatri.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gayatri.dao.BookDao;
import com.gayatri.model.Book;
import com.gayatri.service.BookService;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao dao;

	public void saveBook(Book book) {
		dao.saveBook(book);
	}

	public List<Book> findAllBooks() {
		return dao.findAllBooks();
	}

	public Book findByBookName(String bookName) {
		return dao.findByBookName(bookName);
	}

	public void deleteBookByBookId(int bookId) {
		dao.deleteBookByBookId(bookId);
	}

	public void updateBook(Book book) {
		dao.updateBook(book);
	}
	
}
