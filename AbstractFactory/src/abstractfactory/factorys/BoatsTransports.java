package abstractfactory.factorys;

import abstractfactory.aircrafts.Drone;
import abstractfactory.aircrafts.IAircafts;
import abstractfactory.boats.Boat;
import abstractfactory.boats.IBoats;
import abstractfactory.landvehicles.Bike;
import abstractfactory.landvehicles.ILandVehicles;

public class BoatsTransports implements ITransporteFactory {

	@Override
	public ILandVehicles createTransportVehicles() {
		return new Bike();
	}

	@Override
	public IAircafts createTransportAircafts() {
		return new Drone();
	}

	@Override
	public IBoats creatTransportBoats() {
		return new Boat();
	}

}
