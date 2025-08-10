package com.sbms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sbms.Space;
@Configuration
public class ConfigClass {
	
	@Bean("sp1")
	@Scope("prototype")//Lazy Loading
	public Space getSpace() {
		Space sp=new Space();
		sp.setUnit(5);
		return sp;
	}
	@Bean("sp2")//Eager Loading
	public Space getSpace1() {
		Space sp=new Space();
		sp.setUnit(6);
		return sp;
	}
	@Bean("sp3")
	@Scope("prototype")
	public Space getSpace2() {
		Space sp=new Space();
		sp.setUnit(7);
		return sp;
	}
	

}
