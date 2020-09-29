package com.dgyt.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanrongjie
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext app  = new ClassPathXmlApplicationContext("app.xml");
		A a = app.getBean(A.class);
		System.out.println(app.getParent());
		System.out.println(app);
		System.out.println(a);
	}
}
