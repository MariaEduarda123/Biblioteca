<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formul�rio</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
</head>
<body>
<c:import url="menu.jsp"></c:import>

	<form action="sistema?" method="post">
		<h1>Adicionar Livro</h1>
	<input type="hidden" name="logica" value="AddLivro">
		<div>
			<label>Titulo: <input type="text" name="titulo"></label>
		</div>
		<div>
			<label>Autor: <input type="text" name="autor"></label>
		</div>
		<div>
			<label>Editora: <input type="text" name="editora"></label>
		</div>
		<div>
			<label>Edi��o: <input type="text" name="edicao"></label>
		</div>
		<div>
			<label>Ano de publica��o: <input type="text"
				name="anoPublicacao"></label>
		</div>
		<div>
		<input type="submit" value="Adicionar Livro">
		</div>
	</form>

</body>
</html>