package com.libmanagement.model;
// Generated May 26, 2014 12:53:03 AM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Book generated by hbm2java
 */
@Entity
@Table(name="book")
public class Book implements Serializable {

     @Id
     @GeneratedValue
     @Column(name = "Book_id")
     private String bookId;
     @Column(name = "Title")
     private String title;
//     private Set bookAuthorses = new HashSet(0);
//     private Set bookLoanses = new HashSet(0);
//     private Set bookCopieses = new HashSet(0);

    public Book() {
    }

	
    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }
//    public Book(String bookId, String title, Set bookAuthorses, Set bookLoanses, Set bookCopieses) {
//       this.bookId = bookId;
//       this.title = title;
//       this.bookAuthorses = bookAuthorses;
//       this.bookLoanses = bookLoanses;
//       this.bookCopieses = bookCopieses;
//    }
//   
    public String getBookId() {
        return this.bookId;
    }
    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
//    public Set getBookAuthorses() {
//        return this.bookAuthorses;
//    }
//    
//    public void setBookAuthorses(Set bookAuthorses) {
//        this.bookAuthorses = bookAuthorses;
//    }
//    public Set getBookLoanses() {
//        return this.bookLoanses;
//    }
//    
//    public void setBookLoanses(Set bookLoanses) {
//        this.bookLoanses = bookLoanses;
//    }
//    public Set getBookCopieses() {
//        return this.bookCopieses;
//    }
//    
//    public void setBookCopieses(Set bookCopieses) {
//        this.bookCopieses = bookCopieses;
//    }




}

