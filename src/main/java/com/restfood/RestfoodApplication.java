package com.restfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"repository"})
@ComponentScan(basePackages = {"com.restfood","controller"})
public class RestfoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfoodApplication.class, args);
	}

}
