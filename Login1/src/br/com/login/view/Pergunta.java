/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.view;

/**
 *
 * @author rinal
 */
public class Pergunta {
    private String texto;
    private String[] alternativas;

    public Pergunta(String texto, String[] alternativas) {
        this.texto = texto;
        this.alternativas = alternativas;
    }

    public String getTexto() {
        return texto;
    }

    public String[] getAlternativas() {
        return alternativas;
    }
}
