package com.sbms.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbms.pojo.Employee;
import com.sbms.repository.EmpRepository;
@Component
public class EmpRunner implements CommandLineRunner {

    private final Employee employee;
	@Autowired
	private EmpRepository repo;

    EmpRunner(Employee employee) {
        this.employee = employee;
    }
	@Override
	public void run(String... args) throws Exception {
//		Employee emp=new Employee();
//		emp.setId(201);
//		emp.setEmail("biswal@gmail.com");
//		emp.setAddress("World");
//		
//		Employee emp2=new Employee();
//		emp2.setId(205);
//		emp2.setEmail("mangal@gmail.com");
//		emp2.setAddress("YourWorld");
//		
//		Employee emp3=new Employee();
//		emp3.setId(210);
//		emp3.setEmail("bilwa@gmail.com");
//		emp3.setAddress("Universe");
//		
//		repo.saveAll(Arrays.asList(emp,emp2,emp3));
//		
//		Iterable<Employee> emps=repo.findAll();
		//JDK 1.5 print collection
//		for(Employee e:emps) {
//			System.out.println(e);
//		}
		
		//JDK 1.8 print collection
//		emps.forEach(System.out::println);
//		repo.deleteById(null);
		
		//Delete 
		repo.delete(repo.findById(255)
				.orElseThrow(()->new IllegalStateException("Employee Doesnot Exist")));
	}

}
