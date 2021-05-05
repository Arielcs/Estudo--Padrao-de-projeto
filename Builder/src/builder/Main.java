package builder;

import builder.builders.CarBuilder;
import builder.builders.SportCarBuilder;
import builder.builders.TruckBuilder;
import builder.cars.Car;
import builder.cars.SportCar;
import builder.cars.Truck;
import builder.directors.Director;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);
		
		Car car = builder.getResult();
		
		System.out.println(car.getCarType() + " Produzido com sucesso! \n");
		
		TruckBuilder truckbuilder = new TruckBuilder();
		director.constructTruck(truckbuilder);
		
		Truck truck = truckbuilder.getResult();
		
		System.out.println(truck.result() +  " Caminhão \n");
		
		SportCarBuilder builderSport = new SportCarBuilder();
		director.constructSportCar(builderSport);
		
		SportCar sport = builderSport.getResult();
		
		System.out.println( sport.result() +  " SportCar \n");
		
	}
}
