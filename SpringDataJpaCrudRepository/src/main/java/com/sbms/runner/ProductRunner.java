package com.sbms.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbms.entity.Product;
import com.sbms.exception.ProductNotFoundException;
import com.sbms.repository.ProdRepository;
@Component
public class ProductRunner implements CommandLineRunner {
	
	@Autowired	
	private ProdRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p1=new Product(121,"Mobile Screen guard",300);
		Product p2=new Product(143,"Mobile Back Cover",200);
		Product p3=new Product(154,"3.55 Jack to C port Connector",150);
		
		//Save individually
		/*
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);
		*/
		
		//Save Multiple at once
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		//JDK 1.5 forEach loop
		Iterable<Product> products=repo.findAll();
		for(Product p: products) {
			System.out.println(p);
			
		}
		
		// JDK 1.8 Default method + Method References
		products.forEach(System.out::println);
		
		//JDK 1.8 lambda Expressions
		products.forEach(p->System.out.println(p));
		
		System.out.println(repo.existsById(121));// true
		System.out.println(repo.existsById(155));// false
		
		System.out.println(repo.count());// long -- no.of rows

		Optional<Product> opt=repo.findById(145);
		if(opt.isPresent()) {
			Product p=opt.get();
			System.out.println(p);
		}
		else {
			System.out.println("DATA NOT FOUND");
		}
		
		Product p = repo.findById(11)
				.orElseThrow(() -> new ProductNotFoundException("PRODUCT DOESNOT EXIST"));
		System.out.println(p);
		
		//-----------------------------------------------
				Iterable<Product> list = repo.findAllById(Arrays.asList(11,22,45,56,85,65));
				list.forEach(System.out::println);

				//---------------------------------------------------------
				//repo.deleteById(85);
				//repo.deleteById(99);
				repo.delete(
						repo.findById(77).orElseThrow(
								()->new ProductNotFoundException(
										String.format(" -- %s NOT HAVING %d --", Product.class.getName(),77 )
										)
								)
						);
				//--------------------------------------
				repo.deleteAllById(Arrays.asList(10,11));
				repo.deleteAll();
			}
	}


