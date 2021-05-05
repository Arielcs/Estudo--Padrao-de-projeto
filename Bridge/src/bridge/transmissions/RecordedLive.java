package bridge.transmissions;

import bridge.platforms.IPlatform;

public class RecordedLive extends Live {
	protected IPlatform platform;
	
	public RecordedLive( IPlatform platform) {
		super.platform = platform;
	}
	
	public void endLive() {
		System.out.println("Encerrando " + super.platform + " live");
	}
	
	public void records() {
		System.out.println("Iniciando gravação");
	}
	
}
