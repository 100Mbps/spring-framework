package com.dgyt.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author hanrongjie
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		System.out.println("Hello world");
		System.setProperty("name","abc");
		System.setProperty("spring.profiles.active","dev");
		ApplicationContext app  = new ClassPathXmlApplicationContext("app.xml");
		A a = app.getBean("a",A.class);
		System.out.println(app.getParent());
		System.out.println(app);
		System.out.println(a);
		System.out.println("123123");
		System.out.println(System.getProperty("file.encoding"));
//        DataSource dataSource = app.getBean("dataSource", DataSource.class);
//        Connection conn = dataSource.getConnection();
//		System.out.println(conn);
	}
}
