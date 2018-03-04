package com.example.hajibootjdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hajibootjdbc.domain.Customer;
import com.example.hajibootjdbc.repository.CustomerRepository;

@SpringBootApplication
public class HajibootJdbcApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public void run(String... strings) throws Exception {
		Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
		
		System.out.println(created + " is created!");
		customerRepository.findAll()
			.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HajibootJdbcApplication.class, args);
	}
}
