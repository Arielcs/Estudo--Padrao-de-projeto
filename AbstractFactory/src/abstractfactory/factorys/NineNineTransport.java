package abstractfactory.factorys;

import abstractfactory.aircrafts.Helicopter;
import abstractfactory.aircrafts.IAircafts;
import abstractfactory.boats.Boat;
import abstractfactory.boats.IBoats;
import abstractfactory.landvehicles.ILandVehicles;
import abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransporteFactory {

	@Override
	public ILandVehicles createTransportVehicles() {
		return new Motorcycle();
	}

	@Override
	public IAircafts createTransportAircafts() {
		return new Helicopter();
	}

	@Override
	public IBoats creatTransportBoats() {
		return new Boat();
	}

}
