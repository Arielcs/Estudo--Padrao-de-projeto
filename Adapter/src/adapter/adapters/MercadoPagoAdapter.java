package adapter.adapters;

import adapter.mercadopago.MercadoPago;
import adapter.paypal.IPaypalPayments;
import adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
	private Token token;
	private MercadoPago mPago; 
	
	public MercadoPagoAdapter( MercadoPago mPago ) {
		this.mPago = mPago;
		System.out.println("Adaptando MercadoPago");
	}
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayments() {
		this.mPago.mercadoSendPayments();
	}

	@Override
	public void paypalReceive() {
		this.mPago.mercadoReceivePayments();
	}

}
