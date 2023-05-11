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
	<%
		//PARA COMEÇAR A USAR O JSP, USAMOS A TAG <% E DENTRO DELA USAMOS TODO CODIGO JAVA
		//PARA IMPRIMIR NA TELA PELO JSP USAMOS A PALAVRA RESERVADA "out.print"
		out.print("Seu sucesso garantido");
	%>
	<!-- ENVIO DOS DADOS PARA OUTRA PAGINA -->
	<form action="ServletLogin" method="post">
		<input name = "nome"> <!-- PARAMETROS QUE SERAO ENVIADOS PARA O JSP -->
		<input name = "idade">
		
		<input type="submit" value = "Enviar">
	</form>
</body>
</html>