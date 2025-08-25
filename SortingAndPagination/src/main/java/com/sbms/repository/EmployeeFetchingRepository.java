package com.sbms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sbms.entity.Employee;

public interface EmployeeFetchingRepository extends PagingAndSortingRepository<Employee, Integer> {

}
