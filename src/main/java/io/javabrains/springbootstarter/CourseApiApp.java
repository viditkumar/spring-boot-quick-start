package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// sets up default configuration
		// starts spring application context
		// performs class path scan
		// starts Tomcat server
		
		// In pom.xml
		// Dependency says what jars to download
		// parent says which version
		
		// List of possible set of jars and their version
		// that works well. This is called Bill of Materials
		SpringApplication.run(CourseApiApp.class, args);

	}
}
