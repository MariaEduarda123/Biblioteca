package servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDAO;
import logica.Logica;
import models.Aluno;

public class AddAluno implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Aluno aluno = new Aluno();
		AlunoDAO dao = new AlunoDAO();
				
		String idTexto = req.getParameter("id");

		String nome = req.getParameter("nome");
		String matricula = req.getParameter("matricula");
		String endereco = req.getParameter("endereco");
		String cpf = req.getParameter("cpf");
		String dataTexto = req.getParameter("dataTexto");

		Calendar dataDeNascimento = null;
		try {
			Date datatemporaria = new SimpleDateFormat("dd/MM/yyyy").parse(dataTexto);
			dataDeNascimento = Calendar.getInstance();
			dataDeNascimento.setTime(datatemporaria);
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
		aluno.setNome(nome);
		aluno.setMatricula(matricula);
		aluno.setCpf(cpf);
		aluno.setEndereco(endereco);
		aluno.setDataNascimento(dataDeNascimento);
		
		dao.adicionar(aluno);

		List<Aluno> alunos = dao.getLista();
		req.setAttribute("alunos", aluno);
		return "sistema?logica=ListaAlunos";
	}
}