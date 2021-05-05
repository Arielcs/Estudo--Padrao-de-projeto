package abstractfactory.app;

import abstractfactory.aircrafts.IAircafts;
import abstractfactory.boats.IBoats;
import abstractfactory.factorys.ITransporteFactory;
import abstractfactory.landvehicles.ILandVehicles;

public class Application {
	private ILandVehicles vehicle;
	private IAircafts aircrafts;
	private IBoats boat;
	
	public Application(ITransporteFactory factory ) {
		vehicle = factory.createTransportVehicles();
		aircrafts = factory.createTransportAircafts();
		boat = factory.creatTransportBoats();
	}
	
	public void startRoute() {
		vehicle.stardRoute();
		aircrafts.startRoute();
		boat.startRoute();
	}
}
