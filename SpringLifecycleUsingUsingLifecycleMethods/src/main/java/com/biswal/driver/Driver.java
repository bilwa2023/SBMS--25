package com.biswal.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswal.config.ConfigClass;
import com.biswal.mailer.MailSender;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Before Container created");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		System.out.println("After Container created");
		
		MailSender obj=context.getBean(MailSender.class);
		System.out.println(obj);
		context.close();
		
	}

}
