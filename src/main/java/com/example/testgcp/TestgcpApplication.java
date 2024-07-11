package com.example.testgcp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestgcpApplication {


	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello " + "Batrick " + "!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TestgcpApplication.class, args);
	}

}
