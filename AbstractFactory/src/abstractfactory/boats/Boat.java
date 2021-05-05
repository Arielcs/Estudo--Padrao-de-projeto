package abstractfactory.boats;

public class Boat implements IBoats {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Tudo pronto. Iniciando travessia");
	}

	@Override
	public void getCargo() {
		stream();
		System.out.println("Carros devidamente alocados.");		
	}

	@Override
	public void stream() {
		System.out.println("Sem grandes correnteza.");
	}

}
