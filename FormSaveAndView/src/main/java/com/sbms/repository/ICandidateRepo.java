package com.sbms.repository;

import org.springframework.data.repository.CrudRepository;

import com.sbms.entity.Candidate;

public interface ICandidateRepo extends CrudRepository<Candidate, Integer> {

}
