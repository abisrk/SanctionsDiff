package com.aml.sanctions.SanctionsDiff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.aml.sanctions.SanctionsDiff.dao")
public class SanctionsDiffApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanctionsDiffApplication.class, args);
	}
}
