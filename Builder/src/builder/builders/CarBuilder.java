package builder.builders;

import builder.cars.Car;
import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class CarBuilder implements IBuilder {

	private CarType type;
	private int seats;
	private Transmission transmission;
	private Engine engine;
	private Color color;
	
	@Override
	public void setCarType(CarType type) {
		this.type = type;		
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;		
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;		
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;		
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, color);
	}

	@Override
	public void setColor(Color color) {
		this.color = color;		
	}
	
}
