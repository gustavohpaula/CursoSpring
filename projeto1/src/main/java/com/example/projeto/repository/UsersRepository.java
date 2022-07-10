package com.example.projeto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.projeto.entity.Users;

public interface UsersRepository extends MongoRepository<Users, Long>{
	
	
	Users findByEmail(String email);
	
	Users findByNameIgnoreCase(String name);

}
