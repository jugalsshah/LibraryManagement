/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libmanagement.dao;

import com.libmanagement.model.Book;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface Booksearch_dao {
  
    public List<Book> findBooks();
//    Long bookCount();
//    void addBook(Book book);
    public void addBook(Book book);
    
}
