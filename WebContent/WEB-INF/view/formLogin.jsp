<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Empresa</title>
</head>
<body>

	<form action="${linkEntradaServlet}" method="post">
		Login: <input type="text" name="login"/>
		Senha: <input type="password" name="senha"/>
		
		<input type="hidden" name="acao" value="Login">
		<input type="submit"/>
	</form>

</body>
</html>