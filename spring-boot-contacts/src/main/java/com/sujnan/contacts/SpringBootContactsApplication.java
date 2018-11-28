package com.sujnan.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootContactsApplication extends SpringBootServletInitializer {

	@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringBootContactsApplication.class);
  }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootContactsApplication.class, args);
	}
}
