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
		Nome: <input type="text" name="nome"/>
		Data de Abertura: <input type="text" name="data"/>
		
		<input type="hidden" name="acao" value="NovaEmpresa">
		<input type="submit"/>
	</form>

</body>
</html>