package com.javaLive.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String bookName;

	@PostConstruct
	public void init() {
		System.out.println("inside @PostConstruct");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("---Inside setBookName---");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("inside @PreDestroy");
	}
}