package com.example.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class Maventest1ApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(Maventest1ApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Test case started...");
		assertEquals(true, true);
	}
	

}
