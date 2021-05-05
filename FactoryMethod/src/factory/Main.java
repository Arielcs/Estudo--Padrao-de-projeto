package factory;

/*
/ Factory method - programa não engessado onde se pode modificar
/ sem dificuldade 
*/

public class Main {
	private static Transporte transport;
	public static void main(String[] args) {
		configure("eats");
		
		if( transport != null ) {
			runTransport();
		}
	}

	private static void runTransport() {
		transport.startTransporte();
	}

	private static void configure(String string) {

		switch( string ) {
			case "uber":
				transport = new CarTransporte(); 
				break;
			case "log": 
				transport = new MotorcycleTransporte();
				break;
			case "eats": 
				transport = new BikeTransporte();
				break;
			default:
				System.out.println("Selecione um meio de transporte");
		}
	}
}
