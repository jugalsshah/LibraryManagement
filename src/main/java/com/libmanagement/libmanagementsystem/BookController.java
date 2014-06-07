/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libmanagement.libmanagementsystem;

import com.libmanagement.core.Booksearch_Core;
import com.libmanagement.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jugalshah
 */
@Controller
public class BookController {
    
    @Autowired
    Booksearch_Core booksearch_Core;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model){
    
    List<Book> book= booksearch_Core.findBooks();
    model.addAttribute("book", book);
    return "book";      
           
    }
            
}
