package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);   

	}
	
	public void m1() {
	System.out.println("Karthik's-code");	
		
	}

	public void m2() {
	System.out.println("Priyam's-code");	
		
	}
	
	public String m3() {
		return "HEllo World";
	}
	
	public void m4() {
		System.out.println("ALL THE BEST!!!");
	}
	
	public int show() {
		System.out.println("show method chnages done by priyam ");
		return 0;
	}
	
	
	
}
