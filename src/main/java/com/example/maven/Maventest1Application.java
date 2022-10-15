package com.example.maven;

import javax.annotation.PostConstruct;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Maventest1Application {
	
	public static Logger logger = LoggerFactory.getLogger(Maventest1Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Initiated......");
		logger.info("Application stated..");
		logger.info("New Commit to trigger jenkins job..");
	}

	public static void main(String[] args) {
		SpringApplication.run(Maventest1Application.class, args);
	}

}
