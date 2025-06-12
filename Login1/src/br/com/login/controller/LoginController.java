/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.login.model.Progresso;
import br.com.login.view.LoginView;
import br.com.login.view.TelaCadastro;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rinal
 */
public class LoginController {
    
  public void CadastroUsuario(TelaCadastro view) throws SQLException {
    LoginDAO cadastro = new LoginDAO(); 
    cadastro.cadastrarUsuario(
        view.getjTextFieldNome().getText(), 
        view.getjTextFieldEmail().getText(), 
        view.getjPasswordFieldSenha().getText()
    );
}


    public void LoginUsuario(LoginView view) throws SQLException {
    LoginDAO login = new LoginDAO(); 
    boolean autenticado = login.autenticar(
        view.getjTextFieldLogin().getText(), 
        view.getPasswordFieldSenha().getText()
    );

    if (autenticado) {
      JOptionPane.showMessageDialog(view, "Login efetuado com sucesso!");
        // Aqui pode abrir a tela principal, por exemplo
    } else {
        JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos.");
    }
}


    // ✅ Método que estava faltando — adicione ele agora:
    public boolean autenticar(String email, String senha) throws SQLException {
        LoginDAO loginDAO = new LoginDAO();
        return loginDAO.autenticar(email, senha);
     
    }    
    
    
}
