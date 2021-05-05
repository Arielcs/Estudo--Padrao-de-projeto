package builder.cars;

import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class Truck {
	private final CarType cartype;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final Color color;
	
	
	public Truck(CarType cartype, int seats, Engine engine, Transmission transmission, Color color) {
		this.cartype = cartype;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.color = color;
	}
	
	public String result() {
		String truck = "Truck with power " + engine.getPower() + "\n";
		truck += " Transmission: " + transmission;
		
		return truck;
	}
}
