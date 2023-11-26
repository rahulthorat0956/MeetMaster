package com.symbosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.symbosis", "com.repositry","com.model","com.controller","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.repositry")
public class MeetMastersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetMastersApplication.class, args);
	}

}
