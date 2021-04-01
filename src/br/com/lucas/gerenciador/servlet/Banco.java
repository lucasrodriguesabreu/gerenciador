package br.com.lucas.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		System.out.println("Empresa " + empresa + " adicionada com sucesso!");
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
