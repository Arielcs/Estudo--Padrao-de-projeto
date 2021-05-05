package factory;

import factory.vehicles.IVehicle;

public abstract class Transporte {
	void startTransporte() {
		IVehicle vehicle = createTransporte();
		vehicle.startRoute();
	}
	
	protected abstract IVehicle createTransporte();
}
