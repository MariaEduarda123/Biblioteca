
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #FFB6C1;
}

li {
	float: left;
}

li a {
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not (.active ) {
	background-color: #111;
}


</style>

<ul>
  <li><a class="active" href="adicionar-aluno.jsp">Adicionar Aluno</a></li>
  <li><a href="adicionar-livro.jsp">Adicionar Livro</a></li>
  <li><a href="sistema?logica=ListaAlunos">Lista de Alunos</a></li>
  <li><a href="sistema?logica=ListaLivros">Lista de Livros</a></li>
  <li><a href="pegarLivros.jsp">Fazer Empréstimos</a></li>
  <li><a href="sistema?logica=RegistroEmprestimos">Registro de Empréstimos</a></li>
  <li><a href="sistema?logica=ListaLivrosEmprestadosAtraso">Empréstimos Atrasados</a></li>
  <li><a href="sistema?logica=ListaLivrosEmprestadosAbertos">Empréstimos Ativos</a></li>
</ul>
