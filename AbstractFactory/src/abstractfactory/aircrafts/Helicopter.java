package abstractfactory.aircrafts;

public class Helicopter implements IAircafts{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando decolagem");
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros ok, ligando hélices");
	}

	@Override
	public void wing() {
		System.out.println("Ventos 25km. Ventos OK!");
	}

}
