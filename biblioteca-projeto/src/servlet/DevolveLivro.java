package servlet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmprestimoDAO;
import logica.Logica;
import models.Emprestimo;

public class DevolveLivro implements Logica {
		@Override
		public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			EmprestimoDAO dao = new EmprestimoDAO();
			long livro_id = Long.parseLong(req.getParameter("livro_id"));
			long aluno_id = Long.parseLong(req.getParameter("aluno_id"));
			if(dao.devolucao(aluno_id, livro_id)) {
				return "sistema?logica=RegistroEmprestimos";
				
			}else {
				return "erro";
			}
			
		}

}
