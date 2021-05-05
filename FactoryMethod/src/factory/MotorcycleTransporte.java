package factory;

import factory.vehicles.IVehicle;
import factory.vehicles.Motorcycle;

public class MotorcycleTransporte extends Transporte {

	@Override
	protected IVehicle createTransporte() {
		// TODO Auto-generated method stub
		return new Motorcycle();
	}
	
}
