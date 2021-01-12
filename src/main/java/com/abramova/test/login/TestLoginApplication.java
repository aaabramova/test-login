package com.abramova.test.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class TestLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLoginApplication.class, args);
	}

}
