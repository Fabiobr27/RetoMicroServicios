package com.example.microServicios.service;
import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microServicios.model.status;

@Service
public class MetricaService {

	
	RestTemplate restTemplate = new RestTemplate();
	String urlBase = "http://localhost:8080/actuator/status";
	String EndPointAbierto = "Abierto";
	String EndPointCerrado = "Cerrado";
	String MedioAbierto = "Medio-abierto";
	URI url = URI.create(urlBase);
	status sys = new status();
	
	public void setToAbierto() {
		sys.setStatus(EndPointAbierto);
		ResponseEntity<String> response
		  = restTemplate.postForEntity(URI.create(urlBase+"/"+ EndPointAbierto), sys, String.class);
	}
	
	public void setToCerrado() {
		sys.setStatus(EndPointAbierto);
		ResponseEntity<String> response
		  = restTemplate.postForEntity(URI.create(urlBase+"/"+EndPointCerrado), sys, String.class);
	}
	
	public void setToMedioAbierto() {
		sys.setStatus(EndPointAbierto);
		ResponseEntity<String> response
		  = restTemplate.postForEntity(URI.create(urlBase+"/"+MedioAbierto), sys, String.class);
	}
	
	public String getStatus() {
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, null);
		return response.getBody();
	}

}
