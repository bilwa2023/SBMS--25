package com.sbms.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbms.entity.Mobile;
import com.sbms.repository.MobileRepository;
@Component
public class MobileRunner implements CommandLineRunner {
	@Autowired	
	private MobileRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		Mobile m1=new Mobile();
//		m1.setModel("V30");
//		m1.setBrand("Vivo");
//		m1.setPrice(25000);
//		m1.setRam(8);
//		
//		Mobile m2=new Mobile();
//		m2.setModel("Narzo 70 pro");
//		m2.setBrand("Realme");
//		m2.setPrice(30000);
//		m1.setRam(8);
//		
//		Mobile m3=new Mobile();
//		m3.setModel("Flip 3");
//		m3.setBrand("Samsung");
//		m3.setPrice(180000);
//		m3.setRam(12);
//		
//		repo.saveAll(Arrays.asList(m1,m2,m3));
		
//		List<Mobile> list=repo.findByBrand("Samsung");
//		list.forEach(System.out::println);
//		
//		List<Mobile> list1=repo.findByRamGreaterThan(8);
//		list1.forEach(System.out::println);
		
		List<Mobile> list2=repo.findByBrandLikeOrderByPriceAsc("%a%");
		list2.forEach(System.out::println);
		
	}

}
