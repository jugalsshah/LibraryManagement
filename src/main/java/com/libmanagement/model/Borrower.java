package com.libmanagement.model;
// Generated May 26, 2014 12:53:03 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Borrower generated by hbm2java
 */
@Entity
@Table(name="borrower")
public class Borrower  implements java.io.Serializable {

        @Id
        @Column
     private int cardNo;
     @Column
        private String fname;
     @Column
     private String lname;
     @Column
     private String address;
     @Column
     private String city;
     @Column
     private String state;
     private Set bookLoanses = new HashSet(0);

    public Borrower() {
    }

	
    public Borrower(int cardNo, String fname, String lname, String address, String city, String state) {
        this.cardNo = cardNo;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
    }
    public Borrower(int cardNo, String fname, String lname, String address, String city, String state, Set bookLoanses) {
       this.cardNo = cardNo;
       this.fname = fname;
       this.lname = lname;
       this.address = address;
       this.city = city;
       this.state = state;
       this.bookLoanses = bookLoanses;
    }
   
    public int getCardNo() {
        return this.cardNo;
    }
    
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Set getBookLoanses() {
        return this.bookLoanses;
    }
    
    public void setBookLoanses(Set bookLoanses) {
        this.bookLoanses = bookLoanses;
    }




}

