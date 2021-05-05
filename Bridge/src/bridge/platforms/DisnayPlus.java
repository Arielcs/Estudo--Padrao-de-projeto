package bridge.platforms;

public class DisnayPlus implements IPlatform {

	public DisnayPlus() {
		configureRMTP();
		System.out.println("DisnayPlus: Transmissão Iniciada");
	}

	@Override
	public void configureRMTP() {
		authToken();	
		System.out.println("DisnayPlus: Conta autorizada");
	}
	
	@Override
	public void authToken() {
		System.out.println("DisnayPlus: Autorizando aplicação");
	}
}
