package builder.builders;

import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public interface IBuilder {

	void setCarType(CarType type);
	void setSeats(int seats);
	void setTransmission( Transmission transmission );
	void setEngine( Engine engine );
	void setColor( Color color );
}
