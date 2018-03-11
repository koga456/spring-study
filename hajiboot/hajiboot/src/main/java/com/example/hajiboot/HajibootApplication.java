package com.example.hajiboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootApplication {

	@GetMapping("/")
	String home() {
		return "Hello World!"/* + " (" + System.getenv("CF_INSTANCE_INDEX") + ") Ver.2"*/;
	}
	
	@GetMapping("kill")
	void kill() {
		System.exit(1);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
//		System.out.println(new Pbkdf2PasswordEncoder().encode("demo"));
	}
}
