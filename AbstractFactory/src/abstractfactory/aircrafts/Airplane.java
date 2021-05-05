package abstractfactory.aircrafts;

public class Airplane implements IAircafts {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando a decolagem");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros a bordo. Voo altorizado");
	}

	@Override
	public void wing() {
		System.out.println("Ventos a 25km, ventos OK!");
	}

}
