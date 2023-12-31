package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	static class HelloController {
		@GetMapping("/")
		public String hello() {
			return "Hello from Spring Boot!";
		}
	}

	@RestController
	static class UserController {
		@GetMapping("/users")
		public String getUsers() {
			return "high";
		}
	}
}
