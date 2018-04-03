<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Security - Autenticação</title>
</head>
<body>
	<form method="POST" action="j_security_check">
		<input type="text" name="j_username" placeholder="Usuário" required="required" />
		<input type="password" name="j_password" placeholder="Senha" required="required" />
		<input type="submit" value="Enviar" />
	</form>
</body>
</html>