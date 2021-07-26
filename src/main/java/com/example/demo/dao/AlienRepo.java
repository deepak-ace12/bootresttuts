package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreatherThan(int aid);
	
	//Writing complex queries
	
	@Query("from Alien where tech=?1 order by aname") //JPQL query
	List<Alien> findByTechSorted(String tech);
	
	
}
