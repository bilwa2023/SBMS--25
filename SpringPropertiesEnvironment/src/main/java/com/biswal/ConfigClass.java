package com.biswal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.biswal")
@PropertySource("classpath:MyApp.properties")
public class ConfigClass {
	
}
