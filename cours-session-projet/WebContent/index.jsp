<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Bienvenue sur le site !</h1>
<h2> Veuillez vous inscrire dans le formulaire ci contre</h2>
<c:out value="${error}"></c:out>
	
<form method="post" action="first">
		<div>Formulaire d'ajout d'une Personne</div>
		<div>
			<label for="nom">Nom *</label> <input type="text" id="nom" name="nom" value="" /> 
		</div>
		<div>
			<label for="prenom">Prénom *</label> <input type="text" id="prenom" name="prenom" value="" /> 
		</div>
		<input type="submit" value="Ajouter" />
		
	</form>

</body>
</html>