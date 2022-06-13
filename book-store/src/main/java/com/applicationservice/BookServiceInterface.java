package com.applicationservice;

import com.applicationentities.Book;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface BookServiceInterface {

    @WebMethod
    public List<Book> getAllBooks();

    @WebMethod
    public Book getBookById (@WebParam(name = "book_id") String book_id);

    @WebMethod
    public String addBook (Book book);

    @WebMethod
    public String removeBook(String book_id);

    @WebMethod
    public String updateBook(Book book);


}
