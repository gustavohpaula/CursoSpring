package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projeto.repository.UsersRepository;

@Controller
public class UserController {

	private UsersRepository usersRepository;

	public UserController(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@RequestMapping("/users")
	public String getUsers(Model model) {
		model.addAttribute("usersList",this.usersRepository.findAll());
		
		return "users";
	}
}
