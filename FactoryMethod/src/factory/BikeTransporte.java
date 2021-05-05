package factory;

import factory.vehicles.Bike;
import factory.vehicles.IVehicle;

public class BikeTransporte extends Transporte {

	@Override
	protected IVehicle createTransporte() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}
