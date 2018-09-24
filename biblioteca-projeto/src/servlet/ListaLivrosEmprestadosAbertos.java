package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmprestimoDAO;
import logica.Logica;
import models.Emprestimo;



public class ListaLivrosEmprestadosAbertos implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Emprestimo> emprestimos = new EmprestimoDAO().getListaAbertos();
		req.setAttribute("emprestimos", emprestimos);

		return "emprestimos-abertos.jsp"; 
	}
}