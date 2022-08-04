package com.portfolio.portfoliopedro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.portfolio.portfoliopedro.controller",
                               "com.portfolio.portfoliopedro.repository",
                               "com.portfolio.portfoliopedro.service",
                               "com.portfolio.portfoliopedro.model"})

public class PortfoliopedroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfoliopedroApplication.class, args);
	}

}
