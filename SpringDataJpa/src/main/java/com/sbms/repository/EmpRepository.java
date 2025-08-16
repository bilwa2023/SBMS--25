package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.pojo.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
}
