package com.sbms.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer id;
	@Column(name = "sname")
	private String name;
	@Column(name = "scourse")
	private String course;
	@Column(name = "sdoj")
	@Temporal(TemporalType.DATE)
	private Date doj;
}
