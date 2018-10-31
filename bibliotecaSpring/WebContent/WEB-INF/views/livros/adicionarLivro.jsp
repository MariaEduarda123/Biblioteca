<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Livro</title>
</head>
<body>

	<c:import url="menu.jsp"></c:import>

		<h1>Adicionar Livro</h1>
		
		<form action="/bibliotecaSpring/livros" method="post">

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
			<label>Edição: <input type="text" name="edicao"></label>
		</div>
		<div>
			<label>Ano de publicação: <input type="text"
				name="anoPublicacao"></label>
		</div>
		<div>
		<input type="submit" value="Adicionar Livro">
		</div>
	</form>

</body>
</html>