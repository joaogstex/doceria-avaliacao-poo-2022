package br.com.bes.poo20222.interfaces;

import java.util.Scanner;

import br.com.bes.poo2022.persistence.DoceriaDAO;
import br.com.bes.poo20222.exception.QtdMinPedidoInvalidaException;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

	      try {
			MenuDeCadastroProdutos();
		} catch (QtdMinPedidoInvalidaException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void MenuDeCadastroProdutos() throws QtdMinPedidoInvalidaException {
		
		int i = 0;
		
		do {
			System.out.println("\n*********************************************\n");
			System.out.println(" (1) Cadastrar Bolo");
			System.out.println(" (2) Cadastrar Doce");
			System.out.println(" (3) Listar Produtos por Valor e Descricao" );
			System.out.println(" (4) Listar Temas");
			System.out.println(" (5) Sair");
			System.out.println("\nEscolha uma opção a seguir: ");
			int escolha = sc.nextInt();
			
		    switch(escolha) {
		    case 1:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("CADASTRO DE BOLO");
		    	System.out.println("\n*********************************************\n");
		    	DoceriaTUI.cadastrarBolo();
		    	break;
		     case 2:
		    	System.out.println("\n*********************************************\n");
		        System.out.println("CADASTRO DE DOCE");
		        System.out.println("\n*********************************************\n");
		    	DoceriaTUI.cadastrarDoce();
		        break;
		    case 3:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("LISTAR PRODUTOS POR VALOR E DESCRICAO");
		    	System.out.println("\n*********************************************\n");
		        DoceriaTUI.listarProdutosPorValorEDescricao(DoceriaDAO.produto);
		    	break;
		    case 4:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("LISTAR BOLOS POR TEMAS");
		    	System.out.println("\n*********************************************\n");
		    	 DoceriaTUI.listarTemas(DoceriaDAO.bolos);
		    	 break;
		    case 5:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("\nSAINDO!\n");
		    	System.out.println("\n*********************************************\n");
		    	System.exit(0);
		    default:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("\n\nValor incorreto. Tente mais uma vez!\n\n");
		    	System.out.println("\n*********************************************\n");
		    }
		} while (i == 0);
		
		
		
		
		
		
		

	}

}
