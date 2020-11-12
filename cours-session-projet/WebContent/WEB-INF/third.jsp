<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Third view</title>
</head>
<body>
	<H1>Third view</H1>
	<h3>Bonjour <c:out value="${ sessionScope.perso.prenom} ${ sessionScope.perso.nom}"/></h3>
	<c:url var="first" value="/First"></c:url>
	<a href="${ first }"> First view</a><br />
	<c:url var="second" value="/Second"></c:url>
	<a href="${ second }"> Second view</a><br />
	<c:url var="disconnect" value="/disconnect"></c:url>
	<a href="${ disconnect }"> Deconnection</a>
</body>
</html>