package com.libmanagement.model;
// Generated May 26, 2014 12:53:03 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BookLoans generated by hbm2java
 */
@Entity
@Table(name = "book_loans")
public class BookLoans  implements java.io.Serializable {

    @Id
    @Column
     private int loanId;
     private LibraryBranch libraryBranch;
     @Column
     private Borrower borrower;
     @Column
     private Book book;
     @Column
     private Date dateOut;
     @Column
     private Date dueDate;
     @Column
     private Date dateIn;

    public BookLoans() {
    }

	
    public BookLoans(int loanId, LibraryBranch libraryBranch, Borrower borrower, Book book, Date dateOut, Date dueDate) {
        this.loanId = loanId;
        this.libraryBranch = libraryBranch;
        this.borrower = borrower;
        this.book = book;
        this.dateOut = dateOut;
        this.dueDate = dueDate;
    }
    public BookLoans(int loanId, LibraryBranch libraryBranch, Borrower borrower, Book book, Date dateOut, Date dueDate, Date dateIn) {
       this.loanId = loanId;
       this.libraryBranch = libraryBranch;
       this.borrower = borrower;
       this.book = book;
       this.dateOut = dateOut;
       this.dueDate = dueDate;
       this.dateIn = dateIn;
    }
   
    public int getLoanId() {
        return this.loanId;
    }
    
    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    public LibraryBranch getLibraryBranch() {
        return this.libraryBranch;
    }
    
    public void setLibraryBranch(LibraryBranch libraryBranch) {
        this.libraryBranch = libraryBranch;
    }
    public Borrower getBorrower() {
        return this.borrower;
    }
    
    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    public Date getDateOut() {
        return this.dateOut;
    }
    
    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
    public Date getDueDate() {
        return this.dueDate;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Date getDateIn() {
        return this.dateIn;
    }
    
    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }




}


