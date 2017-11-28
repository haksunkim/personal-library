package com.haksunkim.personallibrary;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonalLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalLibraryApplication.class, args);
	}
}