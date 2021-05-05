package abstractfactory.landvehicles;

public class Bike implements ILandVehicles{

	@Override
	public void stardRoute() {
		getCargo();
		System.out.println("Iniciando entrega");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Pedido pego! Tudo pronto.");
		
	}

}
