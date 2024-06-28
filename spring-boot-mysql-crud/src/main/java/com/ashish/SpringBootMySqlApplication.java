package com.ashish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootMySqlApplication.class, args);
		
		//post - http://localhost:8080/departments
		//get - http://localhost:8080/departments
		//get by id - http://localhost:8080/departments/1
		//put - http://localhost:8080/departments/1
	}
}