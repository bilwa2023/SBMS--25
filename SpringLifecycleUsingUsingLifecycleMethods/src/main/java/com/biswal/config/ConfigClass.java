package com.biswal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.biswal.mailer.MailSender;

@ComponentScan(basePackages="com.biswal.mailer" )
//@Configuration
public class ConfigClass {
	
	@Bean
	public MailSender sender() {
		
		MailSender sender=new MailSender();
		sender.setEmail("mail");
		sender.setSize(545);
		System.out.println("Bean Creation");
		return sender;
	}
}
