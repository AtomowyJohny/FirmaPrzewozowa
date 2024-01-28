package com.firmaPrzewozowa.firmaPrzewozowa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirmaPrzewozowaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirmaPrzewozowaApplication.class, args);
	}

//	@Bean
//	public ObjectMapper objectMapper() {
//		ObjectMapper mapper = new ObjectMapper();
//		// Register the Hibernate5Module to handle Hibernate lazy-loaded objects
//		mapper.registerModule(new Hibernate5Module());
//		return mapper;
//	}

}
