package br.com.bes.poo20222.domain;

import br.com.bes.poo20222.exception.QtdMinPedidoInvalidaException;

public class Bolos extends Produtos {
	
	private Integer quantidadeFatias;
	private String tema;
	
	public Bolos(Integer codigo, String descricao, Double valorUnitario, Integer quantidadeFatias, String tema) throws QtdMinPedidoInvalidaException{
		super(codigo, descricao, valorUnitario);
		this.quantidadeFatias = quantidadeFatias;
		this.tema = tema;
	}
	
	public Bolos() {
		
	}
	
	public Integer getQuantidadeFatias() {
		return quantidadeFatias;
	}

	public void setQuantidadeFatias(Integer quantidadeFatias) {
		this.quantidadeFatias = quantidadeFatias;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Bolos [ Quantidade De Fatias = " + quantidadeFatias + ", Tema = " + tema + ", Codigo = " + getCodigo() + ", Descricao = " + getDescricao() + ", Valor Unitario = " + getValorUnitario() + " ]";
	} 
	
	
	
	

}
