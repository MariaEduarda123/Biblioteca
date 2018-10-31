<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Aluno</title>
</head>
<body>

	<c:import url="menu.jsp"></c:import>
	
	<h1>Adicionar alunos</h1>
		<form action="/bibliotecaSpring/alunos" method="post">
	
		<div>
			<label>Nome: <input type="text" name="nome"></label>
		</div>
		<div>
			<label>Matricula: <input type="text" name="matricula"></label>
		</div>
		<div>
			<label>CPF: <input type="text" name="cpf"></label>
		</div>
		<div>
			<label>Endereço: <input type="text" name="endereco"></label>
		</div>
		<div>
			<label>Data de Nascimento: <input type="text"
				name="dataTexto"></label>
		</div>
		<div>
			 <input type="submit" value="Adicionar Aluno">
		</div>
	</form>

</body>
</html>