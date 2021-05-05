package abstractfactory.factorys;

import abstractfactory.aircrafts.Airplane;
import abstractfactory.aircrafts.IAircafts;
import abstractfactory.boats.Boat;
import abstractfactory.boats.IBoats;
import abstractfactory.landvehicles.Car;
import abstractfactory.landvehicles.ILandVehicles;

public class UberTransport implements ITransporteFactory {

	@Override
	public ILandVehicles createTransportVehicles() {
		return new Car();
	}

	@Override
	public IAircafts createTransportAircafts() {
		return new Airplane();
	}

	@Override
	public IBoats creatTransportBoats() {
		return new Boat();
	}

}
