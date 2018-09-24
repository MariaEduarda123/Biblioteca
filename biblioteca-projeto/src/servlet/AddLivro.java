package servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LivroDAO;
import logica.Logica;
import models.Livro;

public class AddLivro implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Livro livro = new Livro();
		LivroDAO dao = new LivroDAO();
				
		String idTexto = req.getParameter("id");

		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String editora = req.getParameter("editora");
		String edicao = req.getParameter("edicao");
		int anoPublicacao = Integer.parseInt(req.getParameter("anoPublicacao"));

				
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setEditora(editora);
		livro.setEdicao(edicao);
		livro.setAnoPublicacao(anoPublicacao);
		
		dao.adicionar(livro);

		List<Livro> livros = dao.getLista();
		req.setAttribute("livros", livro);

		return "sistema?logica=ListaLivros";
	}

}
