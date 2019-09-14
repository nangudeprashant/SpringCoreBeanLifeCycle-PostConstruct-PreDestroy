package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.Book;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Book book = (Book) context.getBean("book");
		System.out.println("Book Name:" + book.getBookName());
		context.registerShutdownHook();
    }
}
