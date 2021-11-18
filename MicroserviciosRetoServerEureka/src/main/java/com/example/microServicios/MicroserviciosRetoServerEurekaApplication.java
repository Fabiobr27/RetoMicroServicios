package com.example.microServicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviciosRetoServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRetoServerEurekaApplication.class, args);
	}

}
