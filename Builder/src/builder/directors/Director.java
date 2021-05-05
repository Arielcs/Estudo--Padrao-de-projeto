package builder.directors;

import builder.builders.IBuilder;
import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class Director {

	public void constructSedanCar(IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATICO);
		builder.setEngine(new Engine(1600));
	}
	
	public void constructTruck(IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(3);
		builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
		builder.setEngine(new Engine(13000));
	}

	public void constructSportCar(IBuilder builder) {
		builder.setCarType(CarType.SPORTCAR);
		builder.setSeats(2);
		builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
		builder.setEngine(new Engine(4000));
		builder.setColor(Color.YELLOW);
	}
}
