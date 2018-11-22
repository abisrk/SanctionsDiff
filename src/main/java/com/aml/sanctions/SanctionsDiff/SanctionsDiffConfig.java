package com.aml.sanctions.SanctionsDiff;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@ComponentScan(basePackages = {"com.aml.sanctions.CSL","com.aml.sanctions.SanctionsDiff"})
public class SanctionsDiffConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public ObjectMapper objectMapper() {

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd-MM-yy hh:mm:ss");
		ObjectMapper obj = new ObjectMapper();
		obj.writerWithDefaultPrettyPrinter();
		obj.setDateFormat(sdf);

		return obj;
	}
}
