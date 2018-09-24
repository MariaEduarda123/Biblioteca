<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Lista de alunos</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
</head>
<body>
<c:import url="menu.jsp"></c:import>
	<table id="customers" style="width:400px; margin: 0 auto; ">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Matrícula</th>
				<th>CPF</th>
				<th>Endereço</th>
				<th>Data de Nascimento</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="aluno" items="${alunos }">

				
				<tr>

					<td>${aluno.nome}</td>
					<td>${aluno.matricula}</td>
					<td>${aluno.cpf}</td>
					<td>${aluno.endereco }</td>
					<td>${aluno.dataNascimento.time }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>