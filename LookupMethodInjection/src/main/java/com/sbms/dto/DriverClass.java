package com.sbms.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		
		CourseService service=(CourseService) context.getBean(CourseService.class);
		System.out.println(service);
		
		CourseService service1=(CourseService) context.getBean(CourseService.class);
		System.out.println(service1);
		
		CourseService service2=(CourseService) context.getBean(CourseService.class);
		System.out.println(service2);
		
		CourseService service3=(CourseService) context.getBean(CourseService.class);
		System.out.println(service3);
	}

}
