package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LivroDAO;
import logica.Logica;
import models.Livro;

public class ListaLivros implements Logica{
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Livro> livros = new LivroDAO().getLista();
		req.setAttribute("livros", livros);
		return "listar-livros.jsp";
	}
}