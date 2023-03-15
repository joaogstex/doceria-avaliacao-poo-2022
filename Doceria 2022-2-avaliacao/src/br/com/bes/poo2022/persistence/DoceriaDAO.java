package br.com.bes.poo2022.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.bes.poo20222.domain.Bolos;
import br.com.bes.poo20222.domain.Doces;
import br.com.bes.poo20222.domain.Produtos;

public class DoceriaDAO {
	
	public static List<Bolos> bolos = new ArrayList<>();

	public static void incluir(Bolos bolo) {
		bolos.add(bolo);
		produto.add(bolo);
	}
	
	public static List<Doces> doces = new ArrayList<>();

	public static void incluir(Doces doce) {
		doces.add(doce);
		produto.add(doce);
	}

	
	public static ArrayList<Produtos> produto = new ArrayList<>();
	

}
