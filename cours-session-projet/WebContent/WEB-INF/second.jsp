<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav> <a href="${second}"> page2 </a> <a href="${second}"> page3 </a></nav>

<h1>  Bienvenue sur la deuxième page </h1>
<h2> Bonjour	${ sessionScope.perso.nom} , ${ sessionScope.perso.prenom}</h2></body>
</html>