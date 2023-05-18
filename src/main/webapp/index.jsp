<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto JSP JDEV Treinamentos</title>
</head>
<body>
	<h1>Bem vindo ao curso de JSP</h1>

	<!-- ENVIO DOS DADOS PARA OUTRA PAGINA ATRAVES DO FORMULARIO-->
	<form action="ServletLogin" method="post">
	<label>Login: </label>
		<input name = "login" type = "text"> <!-- PARAMETROS QUE SERAO ENVIADOS PARA O JSP -->
	<label> <br> <br>Senha: </label>	
		<input name = "senha" type = "password">
		<input type= "submit" value = "Enviar">
	</form>
	
	<h2>${msg}</h2>
	
</body>
</html>