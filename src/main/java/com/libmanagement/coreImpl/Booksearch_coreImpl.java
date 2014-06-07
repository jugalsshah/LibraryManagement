/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libmanagement.coreImpl;

import com.libmanagement.core.Booksearch_Core;
import com.libmanagement.dao.Booksearch_dao;
import com.libmanagement.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jugalshah
 */
@Service
//@Transactional
public class Booksearch_coreImpl implements Booksearch_Core{
    
    @Autowired
    Booksearch_dao booksearch_dao;

    public Booksearch_dao getBooksearch_dao() {
        return booksearch_dao;
    }

    public void setBooksearch_dao(Booksearch_dao booksearch_dao) {
        this.booksearch_dao = booksearch_dao;
    }
    
    @Override
    @Transactional
        public List<Book> findBooks() {
        return booksearch_dao.findBooks();
    }
    
}
