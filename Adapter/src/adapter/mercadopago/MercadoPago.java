package adapter.mercadopago;

import adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {
	
	@Override
	public Token autToken() {
		return new Token();
	}

	@Override
	public void mercadoReceivePayments() {
		System.out.println("Pagamento recebido via Mercado pago");
	}

	@Override
	public void mercadoSendPayments() {
		System.out.println("Pagamento realizado via Mercado pago");
	}

}
