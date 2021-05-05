package factory;

import factory.vehicles.Car;
import factory.vehicles.IVehicle;

public class CarTransporte extends Transporte {

	@Override
	protected IVehicle createTransporte() {
		return new Car();
	}

}
