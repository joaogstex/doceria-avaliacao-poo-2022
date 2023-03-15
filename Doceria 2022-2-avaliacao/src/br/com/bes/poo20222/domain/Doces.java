package br.com.bes.poo20222.domain;


import br.com.bes.poo20222.exception.QtdMinPedidoInvalidaException;


public class Doces extends Produtos {

	private Integer qtdMinPedido;

	public Doces(Integer codigo, String descricao, Double valorUnitario, Integer qtdMinPedido) {
		super(codigo, descricao, valorUnitario);
		setQtdMinPedido(qtdMinPedido);
	}

	public Doces() {
		
	}

	public Integer getQtdMinPedido() {
		return qtdMinPedido;
	}

	public void setQtdMinPedido(Integer qtdMinPedido) {
		try {
			validarQtdMinPedido(qtdMinPedido);
		} catch (QtdMinPedidoInvalidaException e) {
			e.printStackTrace();
		}
		this.qtdMinPedido = qtdMinPedido;
	}
	
	public void validarQtdMinPedido(Integer qtdMinPedido) throws QtdMinPedidoInvalidaException {
		if(qtdMinPedido < 50) {
			throw new QtdMinPedidoInvalidaException("O valor não pode ser inferior a 50.");
		}
	}

	@Override
	public String toString() {
		return "Doces [ Quantidade Minima de Pedido = " + qtdMinPedido + ", Codigo = " + getCodigo() + ", Descricao = " + getDescricao() + ", Valor Unitario = " + getValorUnitario() +  " ]";
	}
	
	
	
}
