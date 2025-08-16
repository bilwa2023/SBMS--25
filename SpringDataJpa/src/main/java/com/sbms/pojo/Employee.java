package com.sbms.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter	
@Component
public class Employee {
	@Id
	private int id;
	private String email;
	private String address;
	
}
