package com.kite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration	
@ComponentScan(basePackages ="com.kite" )
public class ConfigClass {
	
	@Bean
	public MyRepository	r1() {
		MyRepository r1=new MyRepository();
		r1.setCode("Ghar");
		return r1;
		
	}
	@Bean
	public MyRepository	r2() {
		MyRepository r2=new MyRepository();
		r2.setCode("Gaon");
		return r2;
	}
	
	@Bean
	@Primary
	public MyRepository	r3() {
		MyRepository r3=new MyRepository();
		r3.setCode("Baag");
		return r3;
	}
	
	
}
