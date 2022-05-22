package org.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//In this demo we'll explore @Autowired annotation and @Qualifier
//@Autowired is used above setters, variables, and constructors
public class Library {
	@Autowired
	@Qualifier("book")
	private Book book;
	
	public Library() {
		super();
	}

	public Library(Book book) {
		super();
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}

}
