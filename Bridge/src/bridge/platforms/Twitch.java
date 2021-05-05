package bridge.platforms;

public class Twitch  implements IPlatform {

	public Twitch() {
		configureRMTP();
		System.out.println("Twitch: Transmissão Iniciada");
	}
	@Override
	public void configureRMTP() {
		authToken();	
		System.out.println("Twich: Conta autorizada");
	}

	@Override
	public void authToken() {
		System.out.println("Twitch: Autorizando aplicação");
	}
}
