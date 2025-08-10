package com.sbms.ConfigurationProperties.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class EmailRunner implements CommandLineRunner{
	@Autowired
	private EmailConfig config;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(config);
	}
	
}
