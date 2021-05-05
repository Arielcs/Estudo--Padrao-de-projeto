package factory.vehicles;

public class Car implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando Transporte");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os passageiros, estamos prontos");		
	}

}
