package com.applicationservice;

import com.applicationentities.Book;
import com.applicationdao.BookDAO;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.applicationservice.BookServiceInterface")
public class BookServiceImplementation implements BookServiceInterface{


    public List<Book> getAllBooks() {
        return BookDAO.getAllBooks();
    }

    public Book getBookById(String book_id) {
        return BookDAO.getBookById(book_id);
    }

    public String addBook(Book book) {
        return BookDAO.addBook(book);
    }

    public String removeBook(String book_id) {
        return BookDAO.removeBook(book_id);
    }

    public String updateBook(Book book) {
        return BookDAO.updateBook(book);
    }

}
