package com.lsp.hrp.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("spring/*-spring.xml");
			com.lsp.hrp.mybatis.EntityCreater entityCreater = context.getBean(com.lsp.hrp.mybatis.EntityCreater.class);
			entityCreater.create();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
