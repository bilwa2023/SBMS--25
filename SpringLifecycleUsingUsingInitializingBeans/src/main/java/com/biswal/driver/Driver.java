package com.biswal.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biswal.mailer.MailSender;

public class Driver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("projbeans.xml");
		MailSender obj=context.getBean(MailSender.class);
		
		System.out.println(obj);
		context.close();
		
	}

}
