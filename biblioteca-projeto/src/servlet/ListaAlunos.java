package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDAO;
import logica.Logica;
import models.Aluno;

public class ListaAlunos implements Logica{
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Aluno> alunos = new AlunoDAO().getLista();
		req.setAttribute("alunos", alunos);
		return "listar-alunos.jsp";
	}
}