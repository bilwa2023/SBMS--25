package com.sbms.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CourseService {
	private int data;
	@Autowired
	private CourseRepository repo;
	
	CourseService(){
		this.data=5;
	}
	
	@Lookup
	public CourseRepository repo() {
		return null;
	}
	
	@Override
	public String toString() {
		return "CourseService [data=" + data + ", repo=" +repo() + "]";
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public CourseRepository getRepo() {
		return repo;
	}

	public void setRepo(CourseRepository repo) {
		this.repo = repo;
	}
}
