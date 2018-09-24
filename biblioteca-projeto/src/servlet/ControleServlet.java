package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logica.Logica;

@WebServlet("/sistema")
public class ControleServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			String parametro = req.getParameter("logica");
			String nomeDaClasse = "servlet." + parametro;
			try {
			Class classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(req, resp);
			req.getRequestDispatcher(pagina).forward(req, resp);
			} catch (Exception e) {
			throw new ServletException("A lógica de negócios causou uma exceção", e);
			}
			}
}
