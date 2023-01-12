package com.satishlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.satishlabs.query","com.satishlabs.service"})
@EntityScan("com.satishlabs.entity")
@EnableJpaRepositories("com.satishlabs.repository")
public class GraphQlSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlSpringBootApplication.class, args);
	}

}
