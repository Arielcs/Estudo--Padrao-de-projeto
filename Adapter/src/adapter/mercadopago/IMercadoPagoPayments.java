package adapter.mercadopago;

import adapter.utils.Token;

public interface IMercadoPagoPayments {
	Token autToken();
	void mercadoReceivePayments();
	void mercadoSendPayments();
}
