<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<c:url value="/Second" var="page2" />
		<a href="${page2}">page2</a>
		<c:url value="/Third" var="page3" />
		<a href="${ page3 }">page3</a>
	</nav>
	<h1>Bonjour ${ sessionScope.perso.nom} , ${ sessionScope.perso.prenom}</h1>
</body>
</html>