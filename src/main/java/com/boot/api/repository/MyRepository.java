package com.boot.api.repository;



import org.springframework.data.repository.CrudRepository;

import com.boot.api.model.Agent;


public interface MyRepository extends CrudRepository<Agent, Integer>{

	public Agent findById(int id); 
	//public List<Agent> findByAgent_email(String agent_email); 
}
