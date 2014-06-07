    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libmanagement.daoImpl;

import com.libmanagement.dao.Booksearch_dao;
import com.libmanagement.model.Book;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jugalshah
 */
@Repository
public class Booksearch_daoImpl implements Booksearch_dao{

    @Autowired
  private SessionFactory sessionFactory;
    
    
 public SessionFactory getSessionFactory() {
  return sessionFactory;
 }

 public void setSessionFactory(SessionFactory sessionFactory) {
  this.sessionFactory = sessionFactory;
 }

  
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Book> findBooks() {
      return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }
//
//    @Override
//    public Long bookCount() {
//        
//        return (Number) session.createCriteria("Book").setProjection(Projections.rowCount()).uniqueResult();
//    }

//    @Override
//    public void addBook(Book bookq) {
//        getHibernateTemplate().save(bookq);
//       
//    }

    @Override
    public void addBook(Book book) {
//        book.setBookId("1212121212");
//        book.setTitle("dsdsdsds");
//        System.out.println("ds");
//        getHibernateTemplate().save(book);
//        getSession().flush();
//        getSession().close();
    }
    
}
