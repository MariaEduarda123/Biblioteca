package servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDAO;
import dao.EmprestimoDAO;
import dao.LivroDAO;
import logica.Logica;
import models.Aluno;
import models.Emprestimo;
import models.Livro;

public class EmprestimoServlet implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String livro_titulo = req.getParameter("livro_titulo");
		Livro livro = new LivroDAO().getLivroByTitulo(livro_titulo);

		String aluno_matricula = req.getParameter("aluno_matricula");
		Aluno aluno = new AlunoDAO().getAlunoByMatricula(aluno_matricula);

		LivroDAO livroDao = new LivroDAO();
		AlunoDAO alunoDao = new AlunoDAO();
		Emprestimo e = new Emprestimo();
		EmprestimoDAO dao = new EmprestimoDAO();

		e.setAluno(aluno);
		e.setLivro(livro);
		e.setDataEmprestimo(Calendar.getInstance());

		// TESTES
		// Livro está cadastrado?
		if (livro_titulo == null || livroDao.getLivroByTitulo(livro_titulo) == null) {
			req.setAttribute("message", "Livro invalido!!!");
			return "pegarLivros.jsp";
		} else {
			// Aluno está cadastrado?
			if (aluno_matricula == null || alunoDao.getAlunoByMatricula(aluno_matricula) == null) {
				req.setAttribute("message", "Aluno não cadastrado!!!");
				return "pegarLivros.jsp";
			} else {
					// Quantidade de livros que pode pegar
					if (dao.quantidadeDeEmprestimo(aluno)) {
						dao.adicionar(e);
						return "sistema?logica=ListaLivrosEmprestadosAbertos";
					} else {
						req.setAttribute("message", "Aluno não pode pegar mais livros!!!");
						return "pegarLivros.jsp";

					} 
					
					}
				}
			}
		}
	

