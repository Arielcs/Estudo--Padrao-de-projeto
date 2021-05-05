package abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicles {

	@Override
	public void stardRoute() {
		getCargo();
		System.out.println("Iniciando a entrega");
	}

	@Override
	public void getCargo() {

		System.out.println("Já pegamos a encomenda");
		
	}

}
