package com.sbms.dto;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CourseRepository {
	int data;
	
	public CourseRepository() {
	
		Random random=new Random();
		this.data = random.nextInt(1, 100);
	}
	@Override
	public String toString() {
		return "CourseRepository [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data=data;
	}
}
