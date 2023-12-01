package com.example.viajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EnableJpaRepositories("com.example.viajes.repository")
// @ComponentScan("com.example.viajes.entity")
// @ComponentScan("com.example.viajes.controller")
// @ComponentScan("com.example.viajes.service")

public class ViajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViajesApplication.class, args);
		// System.out.println("Hola mundo");
	}

}
