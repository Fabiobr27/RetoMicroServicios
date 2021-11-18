package com.example.microServicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.microServicios.model.status;
import com.example.microServicios.service.MetricaService;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviciosRetoClientApplication implements CommandLineRunner {

	@Autowired
	MetricaService servicio;

	Logger logger = LoggerFactory.getLogger(MicroserviciosRetoClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRetoClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String abierto = "abierto";
		String cerrado = "cerrado";
		String medioAbierto = "Medio Abierto";

		status sys = new status("abierto");

		for (int i = 0; i < 5; i++) {
			sys.setStatus(medioAbierto);
			servicio.setToMedioAbierto();
			logger.info(medioAbierto);
			Thread.sleep(1000);
			if (i <= 3) {
				sys.setStatus(abierto);
				servicio.setToAbierto();
				logger.info(abierto);
				Thread.sleep(1000);

			} else {
				sys.setStatus(cerrado);
				servicio.setToCerrado();
				logger.info(cerrado);

			}
		}
	}
}
