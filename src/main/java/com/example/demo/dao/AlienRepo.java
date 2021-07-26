package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
//	List<Alien> findByTech(String tech);
//	
//	List<Alien> findByAidGreatherThan(int aid);
//	
//	//Writing complex queries
//	
//	@Query("from Alien where tech=?1 order by aname") //JPQL query
//	List<Alien> findByTechSorted(String tech);
	
	
}
