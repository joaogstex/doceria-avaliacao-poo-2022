package br.com.bes.poo20222.exception;

public class QtdMinPedidoInvalidaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public QtdMinPedidoInvalidaException(String message) {
		super(message);
	}

	public QtdMinPedidoInvalidaException(String message, Exception e) {
		super(message, e);
	}
}
