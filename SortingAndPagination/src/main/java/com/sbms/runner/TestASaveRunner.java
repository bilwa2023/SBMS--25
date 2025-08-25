package com.sbms.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbms.entity.Employee;
import com.sbms.repository.EmployeeRepository;

@Component
public class TestASaveRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(new Employee(101,"Bibhuti",50000),
				new Employee(102,"Shakti",35000),
				new Employee(103,"Bhakti",50000),
				new Employee(104,"Sikruti",45000),
				new Employee(105,"Trupti",35000),
				new Employee(106,"Dipti",45000),
				new Employee(107,"Bharti",35000),
				new Employee(108,"Shruti",50000)));
		
	}

}
