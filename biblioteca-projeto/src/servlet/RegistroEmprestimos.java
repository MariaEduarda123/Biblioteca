package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmprestimoDAO;
import logica.Logica;
import models.Emprestimo;

public class RegistroEmprestimos implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Emprestimo> emprestimos = new EmprestimoDAO().getLista();
		req.setAttribute("emprestimos", emprestimos);

		return "registro-emprestimos.jsp"; 
	}

}
