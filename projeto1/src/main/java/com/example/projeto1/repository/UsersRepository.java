package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projeto1.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	@Query("select u from Users u where u.name like %?1%")
	Users findByNameQualquerCoisa(String name);
	
	Users findByEmail(String email);
	
	Users findByNameIgnoreCase(String name);

}
