package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);   

	}
	
	
	public int show() {
		System.out.println("show method chnages done by priyam ");
		return 0;
	}
	
	
	
}
