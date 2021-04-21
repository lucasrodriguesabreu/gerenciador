<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.lucas.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de empresas cadastradas</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	Usuário ${usuarioLogado.login } logado!
	
	<br>
	<br>
	<br>
	
	<c:if test="${not empty empresa}"> 
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	Lista de empresas: 
	<br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Editar empresa</a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remover empresa</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>