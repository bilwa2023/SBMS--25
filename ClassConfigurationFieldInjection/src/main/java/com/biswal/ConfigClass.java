package com.biswal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:MyApp.properties")
public class ConfigClass {
	
	@Autowired
	private Environment environment;//Pre defined Interface ref which stores application properties
	
	@Bean("dbcon")
	public DBConnection getCon(){
		DBConnection con=new DBConnection();
		con.setDriver(environment.getProperty("my.db.driver"));
		con.setUrl(environment.getProperty("my.db.url"));
		con.setUsername(environment.getProperty("my.db.username"));
		con.setPassword(environment.getProperty("my.db.password"));
		
		return con;
	}
	
}
