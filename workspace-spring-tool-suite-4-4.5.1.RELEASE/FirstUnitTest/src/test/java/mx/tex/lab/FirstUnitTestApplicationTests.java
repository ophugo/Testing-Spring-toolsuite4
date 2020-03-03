package mx.tex.lab;

import org.apache.commons.logging.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;

@SpringBootTest
class FirstUnitTestApplicationTests {
	private static final Log LOG = LogFactory.getLog(FirstUnitTestApplicationTests.class);
	
	@BeforeEach
	public void init() {
		LOG.info("@BeforeEach - executes before each test method in this class");
	}    
	
	@BeforeAll
	public static void setup() {
		LOG.info("@BeforeAll - executes once before all test methods in this class");
	}
	
	@Test
	public void SimpleTest() {
		LOG.info("Simple Test");
	}
	
	@Test
	public void otherSimpleTest() {
		LOG.info("Other Simple Test");
	}
	
	@Test
	@Disabled("Test is ignored as a demonstration")
	public void notImplementedTest() {
		LOG.info("Not implemented yet");
	}
	
	@AfterEach
	public void tearDown() {
		LOG.info("@AfterEach - executed after each test method.");
	}
	 
	@AfterAll
	public static void done() {
	    LOG.info("@AfterAll - executed after all test methods.");
	}
 

}
