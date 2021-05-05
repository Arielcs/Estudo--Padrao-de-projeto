package bridge.platforms;

public class Youtube implements IPlatform {

	public Youtube() {
		configureRMTP();
		System.out.println("Youtube: Transmiss�o Iniciada");
	}
	@Override
	public void configureRMTP() {
		authToken();	
		System.out.println("Youtube: Conta autorizada");
	}

	@Override
	public void authToken() {
		System.out.println("Youtube: Autorizando aplica��o");
	}
}
