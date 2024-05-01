package com.example.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCiCdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to virajpatil";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCiCdActionsApplication.class, args);
	}

}
