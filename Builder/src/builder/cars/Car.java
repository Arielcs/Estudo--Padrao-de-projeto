package builder.cars;

import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class Car {
	
	private final CarType cartype;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final Color color;
	
	
	public Car(CarType cartype, int seats, Engine engine, Transmission transmission, Color color) {
		this.cartype = cartype;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.color = color;
	}
	
	public CarType getCarType() {
		return cartype;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}
	
	public Color getColor() {
		return color;
	}
}
