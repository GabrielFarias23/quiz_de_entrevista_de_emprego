/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.model;

/**
 *
 * @author rinal
 */
public class Progresso {
     private int idUsuario;
    private int ultimaPergunta;
    private int pontuacao;

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getUltimaPergunta() {
        return ultimaPergunta;
    }
    public void setUltimaPergunta(int ultimaPergunta) {
        this.ultimaPergunta = ultimaPergunta;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}

