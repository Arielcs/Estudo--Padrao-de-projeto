package abstractfactory.landvehicles;

public class Car implements ILandVehicles{

	@Override
	public void stardRoute() {
		getCargo();
		System.out.println("Iniciando o Trajeto");
	}

	@Override
	public void getCargo() {
		
		System.out.println("Pegamos os passageiros, estamos prontos");
		
	}

}
