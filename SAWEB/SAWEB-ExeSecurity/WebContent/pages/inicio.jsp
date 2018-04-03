<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SAWEB - Exercício 1</title>
</head>
<body>
	<form method="POST" action="Servlet1">
		<input type="text" name="nome" placeholder="Nome" required="required" />
		<input type="text" name="sobrenome" placeholder="Sobrenome" required="required" />
		<input type="submit" value="Enviar" />
	</form>
	<a href="../admin">Administração</a>
</body>
</html>