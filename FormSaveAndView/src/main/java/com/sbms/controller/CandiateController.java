package com.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.entity.Candidate;
import com.sbms.service.CandidateServiceImpl;

@RestController
public class CandiateController {
	
	@Autowired
	private CandidateServiceImpl service;
	
	@PostMapping("/save")
	public Candidate saveCandidate(@RequestBody Candidate c) {
		return service.registerCandidate(c);
	}
	
	@GetMapping("/all") 
	public Iterable<Candidate> getAllUser(){
		return service.getAllUser();
	}
	
	
}
