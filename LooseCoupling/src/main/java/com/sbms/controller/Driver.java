package com.sbms.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sbms.config.ConfigClass;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		EmpController controller=context.getBean(EmpController.class);
		controller.getInfo();
	}

}
