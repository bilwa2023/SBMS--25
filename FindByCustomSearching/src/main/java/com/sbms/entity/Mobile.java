package com.sbms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imeiNumber;
	private String model;
	private String brand;
	private double price;
	private int ram;
}
