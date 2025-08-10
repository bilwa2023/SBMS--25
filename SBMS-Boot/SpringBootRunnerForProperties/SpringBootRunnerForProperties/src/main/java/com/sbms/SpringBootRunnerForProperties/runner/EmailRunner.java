package com.sbms.SpringBootRunnerForProperties.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbms.SpringBootRunnerForProperties.email.EmailConfig;
@Component
public class EmailRunner implements CommandLineRunner{
	@Autowired
	private EmailConfig eco;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(eco);
	}

}
