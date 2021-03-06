package br.com.lucas.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lucas.gerenciador.acao.Acao;

//@WebFilter("/entrada")
public class ControladorFilter implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("ControladoroFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		String nomeDaClasse = "br.com.lucas.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse); //carregar a classe com o nome
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEEndereço = nome.split(":");
		if(tipoEEndereço[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereço[1]);
		rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereço[1]);
		}
	}
}