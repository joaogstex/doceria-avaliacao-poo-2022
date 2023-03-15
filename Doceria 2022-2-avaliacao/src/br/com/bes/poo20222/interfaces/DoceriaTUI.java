package br.com.bes.poo20222.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.com.bes.poo2022.persistence.DoceriaDAO;
import br.com.bes.poo20222.domain.Bolos;
import br.com.bes.poo20222.domain.Doces;
import br.com.bes.poo20222.domain.Produtos;
import br.com.bes.poo20222.exception.QtdMinPedidoInvalidaException;

public class DoceriaTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastrarBolo() throws QtdMinPedidoInvalidaException {
		
			System.out.println("**************************************************");
	        System.out.println("Informe a quantidade de bolos que serao cadastrados: ");
	        
	       
	        int numBolo = Integer.parseInt(sc.nextLine());
	        int j = 1;   

	        for (int i = 0; i < numBolo; i++) {
	        	
	        	Bolos b = new Bolos();
	        	
	        	System.out.println("\n**************************************************\n");
	        	System.out.println("Informe o codigo do bolo de numero: " + j);
	        	b.setCodigo(Integer.parseInt(sc.nextLine()));
	        	
	        	System.out.println("\n**************************************************\n");
	        	System.out.println("Informe a descricao do bolo de numero: " + j);
	            b.setDescricao(sc.nextLine());
	            
	            System.out.println("\n**************************************************\n");
	            System.out.println("Informe a quantidade de fatias do bolo de numero: " + j);
	            b.setQuantidadeFatias(Integer.parseInt(sc.nextLine()));
	            
	            System.out.println("\n**************************************************\n");
	            System.out.println("Informe o tema do bolo de numero: " + j);
	            b.setTema(sc.nextLine());
	            
	            System.out.println("\n**************************************************\n");
	            System.out.println("Informe o valor unitario do bolo de numero: " + j);  
	            b.setValorUnitario(Double.parseDouble(sc.nextLine()));
	            System.out.println("\n**************************************************\n");
	            
	            DoceriaDAO.incluir(b);

	           
	            j++;
	        }
	    }
	

	    public static void cadastrarDoce() throws QtdMinPedidoInvalidaException {
	    	    
	    		System.out.println("**************************************************");
	            System.out.println("Informe a quantidade de doces que serao cadastrados: ");
	            
	           
	            int numDoce = Integer.parseInt(sc.nextLine());
	            int j = 1;   

	            for (int i = 0; i < numDoce; i++) {
	            	
	            	Doces d = new Doces();
	            	
	            	System.out.println("\n**************************************************\n");
	            	System.out.println("Informe o codigo do doce de numero: " + j);
	            	d.setCodigo(Integer.parseInt(sc.nextLine()));
	            	
	            	System.out.println("\n**************************************************\n");
	            	System.out.println("Informe a descricao do doce de numero: " + j);
	                d.setDescricao(sc.nextLine());
	                
	                System.out.println("\n**************************************************\n");
	                System.out.println("Informe a quantidade minima de pedido do doce de numero: " + j);
	                d.setQtdMinPedido(Integer.parseInt(sc.nextLine()));
	                
	                System.out.println("\n**************************************************\n");
	                System.out.println("Informe o valor unitario do doce de numero: " + j);  
	                d.setValorUnitario(Double.parseDouble(sc.nextLine()));
	                System.out.println("\n**************************************************\n");
	                
	                DoceriaDAO.incluir(d);

	               
	                j++;
	            }
	        }
	
	        public static void listarProdutosPorValorEDescricao(ArrayList<Produtos> listaProdutos) {
	            Collections.sort(listaProdutos, new Comparator<Produtos>() {

	                public int compare(Produtos p1, Produtos p2) {
	                    
	                    if(p1.getValorUnitario().equals(p2.getValorUnitario())) {
	                        return p1.getDescricao().toLowerCase().compareTo(p2.getDescricao().toLowerCase());
	                    }else {
	                        return p1.getValorUnitario().compareTo(p2.getValorUnitario());
	                    }
	                
	            }
	                
	            });
	            
	            for(Produtos p : listaProdutos) {
	            	System.out.println(p);
	            }
	        	
	        }
	        
	        public static void listarTemas(List<Bolos> bolo) {
	        	
	        	Set<String>mostrarTema = new HashSet<>();
	        	
	        	for(Bolos b : bolo) {
	        		mostrarTema.add(b.getTema());
	        	}
	        	
	        	Iterator<String> tema = mostrarTema.iterator();
	        	while(tema.hasNext()) {
	        		String lt = tema.next();
	        		System.out.println("\nTema: " + lt);

	        	}
	        
	        }

}
