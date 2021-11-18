package com.example.microServicios.Patron;

public class coche {


	private String status;
	private String marca;
	

	public coche() {
		super();
	}

	public coche(String status, String marca) {
		super();
		this.status = status;
		this.marca = marca;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	
	

}
