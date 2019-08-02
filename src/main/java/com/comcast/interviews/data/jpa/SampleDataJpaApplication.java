package com.comcast.interviews.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SampleDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDataJpaApplication.class, args);
	}

	// TODO: Get application and integration test to work!
}
