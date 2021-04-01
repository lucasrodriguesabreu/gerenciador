package br.com.lucas.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	/*Simula os dados salvos no banco de dados
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Facebook");
		lista.add(empresa);
		lista.add(empresa2);
	}*/
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		System.out.println("Empresa " + empresa + " adicionada com sucesso!");
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
