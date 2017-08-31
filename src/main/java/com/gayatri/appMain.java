package com.gayatri;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.gayatri.configuration.AppConfig;
import com.gayatri.model.Book;
import com.gayatri.service.BookService;


public class appMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BookService service = (BookService) context.getBean("bookService");
		
		Book book1 = new Book();
		book1.setBookId(12);
		book1.setBookAuthor("Daniel silva");
		book1.setBookGenre("Thriller");
		book1.setBookISBN(1234);
		book1.setBookName("The Heist");
		
		Book book2 = new Book();
		book2.setBookId(13);
		book2.setBookAuthor("J.K.Rowling");
		book2.setBookGenre("Fiction");
		book2.setBookISBN(1221);
		book2.setBookName("Harry Potter");
		
		service.saveBook(book1);
		service.saveBook(book2);
		
		List<Book> booklist = service.findAllBooks();
		for(Book book : booklist){
			System.out.println(book);
		}
		
		context.close();
	}

}
