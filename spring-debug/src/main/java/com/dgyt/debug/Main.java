package com.dgyt.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanrongjie
 * @date 2020/9/23 上午8:16
 */
public class Main {
	public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
       AwareImpl ai = applicationContext.getBean(AwareImpl.class);
       System.out.println(ai.getApplicationContext());
	}
}
