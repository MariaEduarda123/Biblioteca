package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmprestimoDAO;
import logica.Logica;
import models.Emprestimo;

public class ListaLivrosEmprestadosAtraso implements Logica{
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Emprestimo> emprestimo = new EmprestimoDAO().getListaAtraso();
		req.setAttribute("emprestimos", emprestimo);

		return "emprestimos-atraso.jsp"; 
	}
}