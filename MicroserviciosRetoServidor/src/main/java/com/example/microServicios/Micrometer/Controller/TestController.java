package com.example.microServicios.Micrometer.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {

	private Counter counterClose;
	private Counter counterOpen;

	public TestController(MeterRegistry registry) {
		this.counterClose = Counter.builder("invocaciones.Close").description("Invocaciones Totales").register(registry);
		this.counterOpen= Counter.builder("invocaciones.Open").description("Invocaciones Totales").register(registry);
	}




	String status;
	String close = "close";
	String open = "open";

	@GetMapping("/close")
	public ResponseEntity<String> setToClose() {
		counterClose.increment();
		status = "close Contador :" + counterClose.count();
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

	@GetMapping("/open")
	public ResponseEntity<String> setToOpen() {
		counterOpen.increment();
		status = "OPEN Contador :" + counterOpen.count();
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	

}
