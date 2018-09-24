<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
<link rel="stylesheet" type="text/css" href="css/css.css">
</head>
<body>

<c:import url="menu.jsp"></c:import>
	

	<form action="sistema?" method="post">
	<h1>Adicionar alunos</h1>
	<input type="hidden" name="logica" value="AddAluno">
	
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