/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import br.com.login.controller.LoginController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author rinal
 */
public class TelaQuiz extends javax.swing.JFrame {
private Pergunta[] perguntas;
private int perguntaAtual = 0;
private int[] respostasUsuario = new int[20];

    /**
     * Creates new form TelaQuiz
     */
    public TelaQuiz() {
    initComponents();
    carregarPerguntas();
    mostrarPergunta();


}

    public void carregarPerguntas() {
        perguntas = new Pergunta[20];
        
        perguntas[0] = new Pergunta("Como voce lida com prazos apertados?",
                new String[]{"Dou prioridade ao trabalho e foco em entregar no prazo",
                             "Peco ajuda para distribuir tarefas",
                             "Trabalho ate tarde para terminar",
                             "Prefiro renegociar o prazo"});

        perguntas[1] = new Pergunta("Qual e a sua maior fraqueza?",
                new String[]{"Perfeccionismo",
                             "Procrastinacao",
                             "Dificuldade para delegar",
                             "Impaciencia"});

        perguntas[2] = new Pergunta("Como voce resolve conflitos no trabalho?",
                new String[]{"Converso diretamente com a pessoa",
                             "Ignoro e sigo em frente",
                             "Procuro ajuda do superior",
                             "Evito o confronto"});

        perguntas[3] = new Pergunta("Voce prefere trabalhar em equipe ou sozinho?",
                new String[]{"Em equipe",
                             "Sozinho",
                             "Depende da tarefa",
                             "Nao tenho preferencia"});

        perguntas[4] = new Pergunta("Como voce lida com mudancas inesperadas?",
                new String[]{"Me adapto rapidamente",
                             "Fico desconfortavel, mas tento aceitar",
                             "Prefiro seguir o plano original",
                             "Peco mais informacoes para entender"});

        perguntas[5] = new Pergunta("Quais sao suas expectativas para seu proximo emprego?",
                new String[]{"Crescimento profissional",
                             "Estabilidade financeira",
                             "Bom ambiente de trabalho",
                             "Desafios interessantes"});

        perguntas[6] = new Pergunta("Como voce lida com criticas?",
                new String[]{"Aceito e tento melhorar",
                             "Fico na defensiva",
                             "Ignoro as criticas",
                             "Peco feedback para entender melhor"});

        perguntas[7] = new Pergunta("Como voce se organiza para cumprir suas tarefas?",
                new String[]{"Uso listas e agenda",
                             "Deixo para fazer na hora",
                             "Priorizo as tarefas mais faceis",
                             "Dependo do meu supervisor"});

        perguntas[8] = new Pergunta("Como voce reage ao trabalhar sob pressao?",
                new String[]{"Mantenho a calma e foco",
                             "Fico estressado e ansioso",
                             "Peco ajuda",
                             "Evito situacoes de pressao"});

        perguntas[9] = new Pergunta("O que te motiva no trabalho?",
                new String[]{"Reconhecimento",
                             "Desafios",
                             "Salario",
                             "Crescimento profissional"});

        perguntas[10] = new Pergunta("Voce tem experiencia em lideranca?",
                new String[]{"Sim, lidero equipes regularmente",
                             "Ja liderei em projetos pequenos",
                             "Nunca liderei, mas quero aprender",
                             "Prefiro nao liderar"});

        perguntas[11] = new Pergunta("Como voce lida com multitarefas?",
                new String[]{"Consigo gerenciar varias tarefas bem",
                             "Prefiro focar em uma tarefa por vez",
                             "Fico confuso e atrapalhado",
                             "Evito multitarefas"});

        perguntas[12] = new Pergunta("Voce conhece as principais atividades da empresa que voce almeja se candidatar no processo seletivo?",
                new String[]{"Sim, me preparei bastante",
                             "Tenho uma ideia geral",
                             "Conheco pouco ainda",
                             "Nao conheco, mas estou disposto a aprender"});

        perguntas[13] = new Pergunta("Qual seu metodo para resolver problemas?",
                new String[]{"Analiso e busco solucoes",
                             "Peco ajuda a colegas",
                             "Sigo a intuicao",
                             "Evito problemas"});

        perguntas[14] = new Pergunta("Como voce se ve em cinco anos?",
                new String[]{"Em uma posicao de prestigio",
                             "Crescendo na empresa",
                             "Mudando de carreira",
                             "Nao tenho certeza"});

        perguntas[15] = new Pergunta("Voce esta disposto a aprender novas habilidades?",
                new String[]{"Sim, sempre busco aprender",
                             "Depende da habilidade",
                             "Prefiro o que ja sei",
                             "Estou aberto a sugestoes"});

        perguntas[16] = new Pergunta("Como voce lida com feedback negativo?",
                new String[]{"Aceito e busco melhorar",
                             "Fico chateado",
                             "Tento ignorar",
                             "Peco explicacoes ao meu superior"});

        perguntas[17] = new Pergunta("Qual e a sua abordagem para trabalhar em equipe?",
                new String[]{"Colaboro e ouço os outros",
                             "Prefiro trabalhar sozinho",
                             "Tento ser o lider",
                             "Apenas sigo as instrucoes"});

        perguntas[18] = new Pergunta("Voce pretende perguntar algo para seu recrutador?",
                new String[]{"Sim, sobre o ambiente de trabalho",
                             "Sim, sobre oportunidades de crescimento",
                             "Nao, estou satisfeito",
                             "Nao pensei nisso"});

        perguntas[19] = new Pergunta("Qual seu nivel de ingles?",
                new String[]{"Avancado",
                             "Sei o basico",
                             "Intermediario",
                             "Estou disposto a aprender"});
        
        
      
    
    
    }
    
    private void mostrarPergunta() {
        lblNumeroPergunta.setText("Pergunta " + (perguntaAtual + 1));

        if (perguntaAtual < perguntas.length)
            lblPergunta.setText(perguntas[perguntaAtual].getTexto());
        rbAlternativa1.setText(perguntas[perguntaAtual].getAlternativas()[0]);
        rbAlternativa2.setText(perguntas[perguntaAtual].getAlternativas()[1]);
        rbAlternativa3.setText(perguntas[perguntaAtual].getAlternativas()[2]);
        rbAlternativa4.setText(perguntas[perguntaAtual].getAlternativas()[3]);
        grupoAlternativas.clearSelection(); // Desmarca as alternativas
          
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlternativas = new javax.swing.ButtonGroup();
        lblPergunta = new javax.swing.JLabel();
        rbAlternativa4 = new javax.swing.JRadioButton();
        rbAlternativa1 = new javax.swing.JRadioButton();
        rbAlternativa2 = new javax.swing.JRadioButton();
        rbAlternativa3 = new javax.swing.JRadioButton();
        btnProxima = new javax.swing.JButton();
        lblNumeroPergunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPergunta.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("PERGUNTA VAI AQUI");
        lblPergunta.setToolTipText("");

        grupoAlternativas.add(rbAlternativa4);
        rbAlternativa4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbAlternativa4.setText("alternativa 4");
        rbAlternativa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlternativa4ActionPerformed(evt);
            }
        });

        grupoAlternativas.add(rbAlternativa1);
        rbAlternativa1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbAlternativa1.setText("alternativa 1");
        rbAlternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlternativa1ActionPerformed(evt);
            }
        });

        grupoAlternativas.add(rbAlternativa2);
        rbAlternativa2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbAlternativa2.setText("alternativa 2");

        grupoAlternativas.add(rbAlternativa3);
        rbAlternativa3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        rbAlternativa3.setText("alternativa 3");

        btnProxima.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnProxima.setText("PROXÍMA");
        btnProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });

        lblNumeroPergunta.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblNumeroPergunta.setText("Pergunta 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbAlternativa4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbAlternativa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbAlternativa1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                            .addComponent(rbAlternativa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProxima)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumeroPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNumeroPergunta)
                .addGap(18, 18, 18)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnProxima)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbAlternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlternativa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlternativa4ActionPerformed

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
    int resposta = 0;
    if (rbAlternativa1.isSelected()) resposta = 1;
    else if (rbAlternativa2.isSelected()) resposta = 2;
    else if (rbAlternativa3.isSelected()) resposta = 3;
    else if (rbAlternativa4.isSelected()) resposta = 4;

    respostasUsuario[perguntaAtual] = resposta;
    perguntaAtual++;

    if (perguntaAtual < perguntas.length) {
        mostrarPergunta();
    } else {
        JOptionPane.showMessageDialog(this, "Quiz finalizado!");

        // Lista com os 5 feedbacks prontos
        String[] feedbacks = {
            "Você demonstrou perfil de liderança e proatividade. Excelente para ambientes dinâmicos!",
            "Seu foco em colaboração e aprendizado contínuo mostra que você se adapta bem em equipe.",
            "Seu perfil indica que valoriza estabilidade e organização. Ideal para cargos operacionais!",
            "Você possui traços analíticos e foco em resultados. Perfil promissor para cargos estratégicos.",
            "Você mostrou que está aberto a desafios e tem boa flexibilidade. Ótimo para ambientes inovadores!"
        };

        // Gera número aleatório entre 0 e 4
        int sorteio = new java.util.Random().nextInt(feedbacks.length);

        // Mostra o feedback sorteado
        JOptionPane.showMessageDialog(this, "Feedback final da entrevista:\n\n" + feedbacks[sorteio]);

        // Desativa botão
        btnProxima.setEnabled(false);
    }

    }//GEN-LAST:event_btnProximaActionPerformed

    private void rbAlternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlternativa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlternativa1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProxima;
    private javax.swing.ButtonGroup grupoAlternativas;
    private javax.swing.JLabel lblNumeroPergunta;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rbAlternativa1;
    private javax.swing.JRadioButton rbAlternativa2;
    private javax.swing.JRadioButton rbAlternativa3;
    private javax.swing.JRadioButton rbAlternativa4;
    // End of variables declaration//GEN-END:variables
}