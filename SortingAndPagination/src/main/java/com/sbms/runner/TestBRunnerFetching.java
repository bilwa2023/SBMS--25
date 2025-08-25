package com.sbms.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.sbms.entity.Employee;
import com.sbms.repository.EmployeeFetchingRepository;

@Component
public class TestBRunnerFetching implements CommandLineRunner{
	
	@Autowired
	private EmployeeFetchingRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		Iterable<Employee> itr= repo.findAll(Sort.by(Direction.ASC,"empid"));
//		itr.forEach(System.out::println);
		
//		repo.findAll(Sort.by(Direction.DESC,"empname"))
//		.forEach(System.out::println);
		
//		repo.findAll(Sort.by(Direction.DESC,"empid","empsalary"))
//		.forEach(System.out::println);
		
//		repo.findAll(Sort.by(Order.asc("empsalary"),Order.desc("empid")))
//		.forEach(System.out::println);
		
		//Input
		Pageable p= PageRequest.of(2, 5);
		//Output
		Page<Employee> page=repo.findAll(p);
		page.getContent().forEach(System.out::println);
		System.out.println("hii");
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		System.out.println(page.getTotalPages());
		System.out.println(page.getTotalElements());
		System.out.println(page.getSize());
		System.out.println(page.hasContent());

	}

}
