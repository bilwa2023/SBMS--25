package com.sbms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Candidate;
import com.sbms.repository.ICandidateRepo;
@Service
public class CandidateServiceImpl implements ICandidateService{
	
	@Autowired
	private ICandidateRepo repo;
	@Override
	public Candidate registerCandidate(Candidate c) {
		return repo.save(c);
	}
	
	
	public List<Candidate> getAllUser(){
		return (List<Candidate>) repo.findAll();
	}
	
}
