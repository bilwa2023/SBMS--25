package com.sbms.Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sbms.Space;
import com.sbms.config.ConfigClass;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Container Created");
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		
		System.out.println("Container fetching bean");
		Space sp=(Space)context.getBean("sp1");
		System.out.println(sp);
		
		System.out.println("Container fetching bean");
		Space sp1=(Space)context.getBean("sp2");
		System.out.println(sp1);
		
		System.out.println("Container fetching bean");
		Space sp2=(Space)context.getBean("sp3");
		System.out.println(sp2);
		
		
		/*The Singleton scope leads to eager loading: instantly after Container creation
		--The Prototype scope leads to lazy loading : Only when getBean() is executed
		--We can force singleton bean to act lazy by annotating with @Lazy annotation
		
		*/
		
	}

}
