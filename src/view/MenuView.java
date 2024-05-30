/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import dao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author frank
 */
public class MenuView extends javax.swing.JFrame {
    
    private String ID_servico;
    private String descricao;
    private String data_servico;
    private String CPF;
     private LoginView loginView;

    
    

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.loginView = loginView; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(102, 255, 102));
        jToggleButton1.setText("Solicitar Serviço");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descrição");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 190, 22));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 310, 60));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 310, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID serviço");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, -1));

        jToggleButton2.setText("Avançar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 130, 30));

        jToggleButton3.setText("Voltar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SOLICITAÇÃO DE SERVIÇO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 360, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Imagens/IMA02.jpeg"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(900, 600));
        jLabel6.setMinimumSize(new java.awt.Dimension(900, 600));
        jLabel6.setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -100, 770, 650));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         descricao = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
         CPF = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
        try (Connection conexao = new Conexao().getConnection()) {
            // Obtenha os valores dos campos de entrada
            ID_servico = jTextField3.getText();
            descricao = jTextField1.getText();

            // Verifique se a data inserida está no formato correto (dd/MM/yyyy)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            try {
                date = new Date(sdf.parse(jTextField4.getText()).getTime()); // Converta para java.sql.Date
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "A data inserida não está no formato correto (dd/MM/yyyy).", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Evite continuar com a inserção no banco de dados se a data estiver no formato incorreto.
            }

            CPF = jTextField2.getText();

            // Crie a consulta SQL parametrizada
            String sql = "INSERT INTO servico(ID_servico, descricao, data_servico, CPF) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);

            // Defina os valores dos parâmetros
            statement.setString(1, ID_servico);
            statement.setString(2, descricao);
            statement.setDate(3, date); // Use o objeto Date convertido
            statement.setString(4, CPF);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o serviço.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Alguma chave está sendo duplicada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
   
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        ID_servico = jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
         data_servico = jTextField4.getText();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        this.dispose();
        OrcaView telaDeOrca = new OrcaView();
        telaDeOrca.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      LoginView voltar = new LoginView();
      voltar.setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LoginView telaDeLogin = new LoginView(); // Crie a instância de LoginView
        MenuView telaDeMenu = new MenuView(); // Passe a instância de LoginView como argumento
        telaDeLogin.setVisible(true); // Tornar a tela de login visível
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables

 
}