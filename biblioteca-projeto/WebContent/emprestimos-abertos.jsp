<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Lista de emprestimos</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
</head>
<body>
	<c:import url="menu.jsp"></c:import>
	<h2>${message }</h2>
	<table id="customers" style="width:400px; margin: 0 auto; ">
		<thead>
			<tr>
				<th>Livro</th>
				<th>Matrícula</th>
				<th>Data do emprestimo</th>
				<th>Devolução</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${emprestimos}">


				<tr>

					<td>${e.livro.titulo}</td>
					<td>${e.aluno.matricula}</td>
					<td>${e.dataEmprestimo.time }</td>
					<td><a href="sistema?logica=DevolveLivro&aluno_id=${e.aluno.id }&livro_id=${e.livro.id}">Devolução do Livro</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>



