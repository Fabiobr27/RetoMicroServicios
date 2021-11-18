package com.example.microServicios.Patron;

public class Singleton {

	private static Singleton instance;
	private coche Coche;
		
	
	public Singleton(coche Coche) {
		super();
		this.Coche = Coche;
	}


	public Singleton() {
		super();
	}


	public static Singleton getInstance(coche Coche) {
        if (instance == null) {
            instance = new Singleton(Coche);
        }
        return instance;
    }


	public coche getCoche() {
		return Coche;
	}


	public void setCoche(coche Coche) {
		this.Coche = Coche;
	}
	

}
