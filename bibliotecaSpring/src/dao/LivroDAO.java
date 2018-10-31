package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConexaoBanco;
import models.Livro;
import models.Livro;

public class LivroDAO {
	private Connection con;

	public LivroDAO() {
		con = ConexaoBanco.getConnection();
	}

	// Método ADICIONA
	public boolean adicionar(Livro l) {

		String query = "insert into livros (titulo, autor, editora, edicao, anoPublicacao) values (?, ?, ?, ?, ?);";
		try {
			
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1, l.getTitulo());
			p.setString(2, l.getAutor());
			p.setString(3, l.getEditora());
			p.setString(4, l.getEdicao());
			p.setInt(5, l.getAnoPublicacao());

			p.execute();
			p.close();

			// issso aqui manda pro BD
		} catch (SQLException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

	// Método LISTA
	public List<Livro> getLista() {
		try {

			List<Livro> livros = new ArrayList<Livro>();
			PreparedStatement stmt = con.prepareStatement("select * from livros;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Livro livro = new Livro();
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setEdicao(rs.getString("edicao"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
				livro.setId(rs.getLong("id"));

				livros.add(livro);
			}
			rs.close();
			stmt.close();
			return livros;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// Método ALTERA
	public void alterar(Livro l) {
		String sql = "update livros set titulo=?, autor=?, editora=?, edicao=?, anoPublicacao=? where id=?;";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, l.getTitulo());
			stmt.setString(2, l.getAutor());
			stmt.setString(3, l.getEditora());
			stmt.setString(4, l.getEdicao());
			// stmt.setDate(5, l.getAnoPublicacao());
			stmt.setLong(6, l.getId());

			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// Método REMOVE
	public void remover(Livro l) {
		try {
			PreparedStatement stmt = con.prepareStatement("delete from livros where id=?;");
			stmt.setLong(1, l.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// Esse método é pra PEGAR a chave
	public Livro getLivroByID(Long id) {
		try {

			Livro livro = null;
			PreparedStatement stmt = this.con.prepareStatement("select * from livros where id=?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				livro = new Livro();
				livro.setId(rs.getLong("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setEdicao(rs.getString("edicao"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
			}
			rs.close();
			stmt.close();
			return livro;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}
	
	public Livro getLivroByTitulo(String titulo) {
		try {

			Livro livro = null;
			PreparedStatement stmt = this.con.prepareStatement("select * from livros where titulo=?;");
			stmt.setString(1, titulo);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				livro = new Livro();
				livro.setId(rs.getLong("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setEdicao(rs.getString("edicao"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
			}
			rs.close();
			stmt.close();
			return livro;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}