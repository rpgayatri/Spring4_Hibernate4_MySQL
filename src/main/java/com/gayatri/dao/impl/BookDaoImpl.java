package com.gayatri.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gayatri.dao.AbstractDao;
import com.gayatri.dao.BookDao;
import com.gayatri.model.Book;

@Repository("bookDao")
public class BookDaoImpl extends AbstractDao implements BookDao {

	public void saveBook(Book book) {
		persist(book);

	}

	@SuppressWarnings({"unchecked" })
	public List<Book> findAllBooks() {
		Criteria criteria = getSession().createCriteria(Book.class);
        return (List<Book>) criteria.list();
	}

	public Book findByBookName(String bookName) {
		/*
		 * CriteriaBuilder builder = getSession().getCriteriaBuilder();
		 * Entity<Book> book_ =
		 * 
		 * CriteriaQuery<Book> criteria = builder.createQuery(Book.class);
		 * Root<Book> bookRoot = criteria.from(Book.class);
		 * criteria.where(bookRoot.get())
		 */

		/*
		 * Query query =
		 * getSession().createQuery("from Book where bookName = :bookName ");
		 * query.setParameter("bookName", "HarryPotter");
		 * 
		 * List<Book> book = query.list();
		 */

		Criteria criteria = getSession().createCriteria(Book.class);
		criteria.add(Restrictions.eq("bookName", bookName));
		return (Book) criteria.uniqueResult();
	}

	public void deleteBookByBookId(int bookId) {
		String hql = "delete from Book where bookId = :bookId";
		getSession().createQuery(hql).setLong("bookId", bookId).executeUpdate();
	}

	public void updateBook(Book book) {
		getSession().update(book);
	}

}
