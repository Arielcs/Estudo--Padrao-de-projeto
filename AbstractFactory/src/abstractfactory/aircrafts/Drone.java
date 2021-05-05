package abstractfactory.aircrafts;

public class Drone implements IAircafts{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando decolagem do drone");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Pacote devidamente encaixado");
		wing();
	}

	@Override
	public void wing() {
		System.out.println("Ventos leves. Tudo OK!");
		
	}

}
