package com.example.hajibootdi;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 2 numbers like 'a b' :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Calculator calculator = context.getBean(Calculator.class);
		int result = calculator.calc(a, b);
		System.out.println("result = " + result);
		scanner.close();
	}
}
