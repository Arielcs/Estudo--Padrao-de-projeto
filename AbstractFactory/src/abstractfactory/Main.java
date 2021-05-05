package abstractfactory;

import abstractfactory.app.Application;
import abstractfactory.factorys.BoatsTransports;
import abstractfactory.factorys.ITransporteFactory;
import abstractfactory.factorys.NineNineTransport;
import abstractfactory.factorys.UberTransport;

public class Main {
	
	public static Application configureApplication() {
		Application app;
		ITransporteFactory factory;
		
		String company = "boat";
		
		switch( company ) {
		case "99":
			factory = new NineNineTransport();
			break;
		case "uber":
			factory = new UberTransport();
			break;
		default:
			factory = new BoatsTransports();
		}
		
		app = new Application(factory);
		
		return app;
	}
	
	public static void main(String[] args) {
		Application app = configureApplication();
		app.startRoute();
	}
}
