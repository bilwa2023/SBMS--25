package com.sbms.repository;

import org.springframework.data.repository.CrudRepository;

import com.sbms.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
