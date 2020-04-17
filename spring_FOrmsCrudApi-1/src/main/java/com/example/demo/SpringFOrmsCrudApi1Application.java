package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringFOrmsCrudApi1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
	return application.sources(SpringFOrmsCrudApi1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringFOrmsCrudApi1Application.class, args);
	}

}
