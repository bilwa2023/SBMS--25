package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
