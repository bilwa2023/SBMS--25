package com.kite.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kite.ConfigClass;
import com.kite.MyService;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass.class);
		MyService service=context.getBean(MyService.class);
		System.out.println(service);
	}
}
