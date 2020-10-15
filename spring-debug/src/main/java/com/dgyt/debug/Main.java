package com.dgyt.debug;

import org.springframework.context.ApplicationContext;
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
		ApplicationContext app  = new ClassPathXmlApplicationContext("app.xml");
		A a = app.getBean(A.class);
		System.out.println(app.getParent());
		System.out.println(app);
		System.out.println(a);
        DataSource dataSource = app.getBean("dataSource", DataSource.class);
        Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}
}
