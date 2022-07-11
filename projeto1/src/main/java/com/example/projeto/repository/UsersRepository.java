package com.example.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Users findByEmail(String email);
	
	Users findByNameIgnoreCase(String name);

}
