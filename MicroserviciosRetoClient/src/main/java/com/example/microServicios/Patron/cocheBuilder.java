package com.example.microServicios.Patron;

public class cocheBuilder {

	
	private String status;
	private String marca;

	
	public cocheBuilder status(String status) {
		this.status = status;
		return this;
	}
	
	public cocheBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}
	

	
	public coche build() {
		return new coche(status,marca);
	}

}
