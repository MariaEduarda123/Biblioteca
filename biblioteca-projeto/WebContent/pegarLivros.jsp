<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emprestar livro</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
</head>

<body>
<c:import url="menu.jsp"></c:import>
	<div class="secao-cadastro">
		
		
		<form class="form" action="sistema?" method="post">
		<h2>${message }</h2>
		<h1>Emprestar livro</h1>
			<div>
				<label>Livro</label> <input type="text" name="livro_titulo"
					value="${livro.titulo}" />
			</div>


			<div>
				<label>Matricula do aluno:</label> <input type="text" name="aluno_matricula"
					value="${aluno.matricula}" />
			</div>

			<div>
				<input type="submit" value="Emprestar livro">
			</div>

			<div>
				<input type="hidden" name="logica" value="EmprestimoServlet" />
			</div>
		</form>
	</div>

</body>
</html>