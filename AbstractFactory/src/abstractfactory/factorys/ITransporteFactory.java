package abstractfactory.factorys;

import abstractfactory.aircrafts.IAircafts;
import abstractfactory.boats.IBoats;
import abstractfactory.landvehicles.ILandVehicles;

public interface ITransporteFactory {
	ILandVehicles createTransportVehicles();
	IAircafts createTransportAircafts();
	IBoats creatTransportBoats();
}
