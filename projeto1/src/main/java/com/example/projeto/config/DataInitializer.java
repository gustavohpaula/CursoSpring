package com.example.projeto.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.projeto.entity.Users;
import com.example.projeto.repository.UsersRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UsersRepository usersRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<Users> users = usersRepository.findAll();
		

		if (users.isEmpty()) {
			createUser("Gustavo Henrique", "gustavo@gmail.com");
			createUser("João", "joao@gmail.com");
			createUser("Maria", "maria@hotmail.com");
		}
		Users user = usersRepository.findByNameIgnoreCase("maria");
		user.setName("Maria Clara");
		System.out.println(user.getEmail());
		usersRepository.save(user);
	}

	public void createUser(String name, String email) {
		Users user = new Users(name, email);
		usersRepository.save(user);
	}

}
