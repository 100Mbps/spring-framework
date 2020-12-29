package com.dgyt.debug;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 测是spring接口类
 * @see org.springframework.context.ApplicationContextAware
 */
public class A implements ApplicationContextAware{

	@NotNull
	private String name;

	private int age;

	private List<A> subs;

	private A son;


	public A(List<A> subs,String name,int age){
		this.subs = subs;
		this.name = name;
		this.age = age;
	}

	public A(){

	}

	public A getSon() {
		return son;
	}

	public void setSon(A son) {
		this.son = son;
	}

	public List<A> getSubs() {
		return subs;
	}

	public void setSubs(List<A> subs) {
		this.subs = subs;
	}

	private ApplicationContext applicationContext;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
