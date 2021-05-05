package bridge.transmissions;

import bridge.platforms.IPlatform;

public class Live implements ITransmission{
	protected IPlatform platform;
	
	public Live() {
		
	}
	
	public Live(IPlatform platform ) {
		this.platform = platform;
	}
	
	@Override
	public void broadcasting() {
		System.out.println("Iniciando transmissão");		
	}

	@Override
	public void result() {
		System.out.println("*** On Air ***");
	}

}
