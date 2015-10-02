package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




@EnableAutoConfiguration 
@ComponentScan(basePackages = "com")
public class Application  {

    private static final Class<Application> applicationClass = Application.class;
  

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

   

}
