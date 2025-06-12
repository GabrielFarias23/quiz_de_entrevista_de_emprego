package br.com.login.dao;

import br.com.login.model.Progresso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
    Connection conexao = Conexao.getConexao();
    String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
    PreparedStatement statement = conexao.prepareStatement(sql);
    statement.setString(1, nome);
    statement.setString(2, email);
    statement.setString(3, senha);
    statement.executeUpdate();
    statement.close();
    conexao.close();
}


    public boolean autenticar(String email, String senha) throws SQLException {
        Connection conexao = Conexao.getConexao();
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, senha);
        ResultSet rs = statement.executeQuery();

        boolean usuarioExiste = rs.next();
        conexao.close();
        return usuarioExiste;

}
    public Progresso buscarProgresso(int idUsuario) throws SQLException {
        Connection conexao = Conexao.getConexao();
        String sql = "SELECT * FROM progresso WHERE id_usuario = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, idUsuario);
        ResultSet rs = statement.executeQuery();

        Progresso progresso = null;
        if (rs.next()) {
            progresso = new Progresso();
            progresso.setIdUsuario(idUsuario);
            progresso.setUltimaPergunta(rs.getInt("ultima_pergunta"));
            progresso.setPontuacao(rs.getInt("pontuacao"));
        }

        conexao.close();
        return progresso;
    }

    // Método para atualizar o progresso do usuário no banco
    public void atualizarProgresso(Progresso progresso) throws SQLException {
        Connection conexao = Conexao.getConexao();

        String sql = "UPDATE progresso SET ultima_pergunta = ?, pontuacao = ? WHERE id_usuario = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, progresso.getUltimaPergunta());
        statement.setInt(2, progresso.getPontuacao());
        statement.setInt(3, progresso.getIdUsuario());

        int rows = statement.executeUpdate();
        if (rows == 0) {
            // Se não existe ainda, insere um novo registro
            sql = "INSERT INTO progresso (id_usuario, ultima_pergunta, pontuacao) VALUES (?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, progresso.getIdUsuario());
            statement.setInt(2, progresso.getUltimaPergunta());
            statement.setInt(3, progresso.getPontuacao());
            statement.executeUpdate();
        }

        conexao.close();
    }
public int autenticarRetornaId(String email, String senha) throws SQLException {
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet rs = null;

    try {
        conexao = Conexao.getConexao();
        String sql = "SELECT id FROM usuarios WHERE email = ? AND senha = ?";
        statement = conexao.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, senha);
        rs = statement.executeQuery();

        if (rs.next()) {
            return rs.getInt("id"); // retorna id do usuário
        } else {
            return 0; // usuário não encontrado
        }
    } finally {
        if (rs != null) rs.close();
        if (statement != null) statement.close();
        if (conexao != null) conexao.close();
    }
}
    public int buscarIdPorEmail(String email) throws SQLException {
    Connection conexao = Conexao.getConexao();
    String sql = "SELECT id FROM usuarios WHERE email = ?";
    PreparedStatement statement = conexao.prepareStatement(sql);
    statement.setString(1, email);
    ResultSet rs = statement.executeQuery();

    int id = -1;
    if (rs.next()) {
        id = rs.getInt("id");
    }

    rs.close();
    statement.close();
    conexao.close();

    return id;
}
    // outros métodos...
}
