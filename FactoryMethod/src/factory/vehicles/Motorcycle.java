package factory.vehicles;

public class Motorcycle implements IVehicle{
	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando Transporte");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos a encomenda, estamos prontos");		
	}
}
