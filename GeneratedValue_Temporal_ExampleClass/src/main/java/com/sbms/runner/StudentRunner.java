package com.sbms.runner;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import com.sbms.entity.Student;
import com.sbms.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Student s1=new Student();
		s1.setName("Gobu");
		s1.setCourse("MCA");
		s1.setDoj(new Date());
		
		Student s2=new Student();
		s2.setName("Bilwa");
		s2.setCourse("MCA");
		s2.setDoj(new Date());
		
		repo.saveAll(Arrays.asList(s1,s2));
		
		Student s=new Student();
		s.setCourse("MCA");
//		s.setDoj(new Date());
		Example<Student> stu=Example.of(s);
		repo.findAll(stu).forEach(System.out::println);
		
	}

}
