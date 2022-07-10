package com.example.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);
	}

}
