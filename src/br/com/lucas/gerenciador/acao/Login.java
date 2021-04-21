package br.com.lucas.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lucas.gerenciador.modelo.Banco;
import br.com.lucas.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Usuário " + login + " logado com sucesso!");
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			System.out.println("Usuário existe");
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			return "redirect:entrada?acao=LoginForm";
		}			
	}

}