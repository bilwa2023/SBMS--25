package com.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sbms.service.IEmpService;
@Controller
public class EmpController {
	@Autowired
	private IEmpService service;
	
	void getInfo() {
		service.checkLogic();
	}
}
