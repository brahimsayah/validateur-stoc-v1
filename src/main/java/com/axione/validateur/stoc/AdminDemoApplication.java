package com.axione.validateur.stoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.axione.validateur.stoc")
public class AdminDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDemoApplication.class, args);
	}
}
