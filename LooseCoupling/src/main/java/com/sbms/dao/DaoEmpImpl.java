package com.sbms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbms.dto.Employee;
@Repository
public class DaoEmpImpl implements IEmpDao {
	@Autowired
	private Employee emp;
	@Override
	public void save() {
		emp.setId(101);
		emp.setName("Dhuan dhuan");
		emp.setEmail("moode@gmail");
		
		System.out.println(emp);
	}

}
