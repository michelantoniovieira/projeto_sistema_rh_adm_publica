/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import DAO.CadastrarUsuarioDAO;
import DAO.ConfigurarPastaRaizDAO;
import DTO.CadastrarUsuarioDTO;
import DTO.ConfigurarPastaRaizDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author miche
 */
public class frmConfigurarPastaRaiz extends javax.swing.JDialog {

    /**
     * Creates new form frmConfigurarPastaRaiz
     */
    public frmConfigurarPastaRaiz(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarCaminhoSalvo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JLabel();
        btnSelecionarCaminho = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPaneCaminhoDirecionar = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar Pasta Raiz");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CONFIGURAR PASTA RAIZ");

        lblCaminho.setText("Caminho a ser salvo:");

        btnSelecionarCaminho.setText("Selecionar Caminho");
        btnSelecionarCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarCaminhoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtPaneCaminhoDirecionar.setBorder(new javax.swing.border.MatteBorder(null));
        txtPaneCaminhoDirecionar.setAutoscrolls(false);
        txtPaneCaminhoDirecionar.setEnabled(false);
        txtPaneCaminhoDirecionar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPaneCaminhoDirecionarPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txtPaneCaminhoDirecionar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCaminho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionarCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnSalvar)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelar)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaminho)
                    .addComponent(btnSelecionarCaminho))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarCaminhoActionPerformed

        //codigo para pegar o caminho desejado para salvar a pasta
        if (evt.getSource() == btnSelecionarCaminho) {

            //por padrão abrir a pasta c:
            JFileChooser j = new JFileChooser("C:\\");

            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            //se clicar em salvar entra no if
            int i = j.showSaveDialog(null);
            if (i == 0) {
                //passar na label o caminho escolhido pelo usuario
                txtPaneCaminhoDirecionar.setText(j.getSelectedFile().getAbsolutePath()+"\\");
            } else {

            }
        }
    }//GEN-LAST:event_btnSelecionarCaminhoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtPaneCaminhoDirecionar.getText().equals("")) {
            ConfigurarPastaRaizDTO objconfigurarpastaraizdto = new ConfigurarPastaRaizDTO();

            objconfigurarpastaraizdto.setId(1);
            objconfigurarpastaraizdto.setCaminho(txtPaneCaminhoDirecionar.getText());

            ConfigurarPastaRaizDAO objCadastrarPastaRaizDAO = new ConfigurarPastaRaizDAO();
            ResultSet rscadastrapastaraizdao = objCadastrarPastaRaizDAO.verificarAntesDeCadastrar(objconfigurarpastaraizdto);

            try {
                if (rscadastrapastaraizdao.next()) {
                    //envia mensagem para o form falando que o usuario esta no banco de dados
                    objCadastrarPastaRaizDAO.alterarCaminho(objconfigurarpastaraizdto);

                } else {
                    //enviar mensagem dizendo que posso inserir no banco de dados
                    objCadastrarPastaRaizDAO.cadastrarCaminho(objconfigurarpastaraizdto);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um caminho antes de salvar.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void mostrarCaminhoSalvo() 
    {
            ConfigurarPastaRaizDTO objconfigurarpastaraizdto = new ConfigurarPastaRaizDTO();

            objconfigurarpastaraizdto.setId(1);

            ConfigurarPastaRaizDAO objCadastrarPastaRaizDAO = new ConfigurarPastaRaizDAO();
            
            ResultSet rscadastrapastaraizdao = objCadastrarPastaRaizDAO.verificarAntesDeCadastrar(objconfigurarpastaraizdto);

            try 
            {
                if (rscadastrapastaraizdao.next()) {
                    //envia mensagem para o form falando que o usuario esta no banco de dados
                    txtPaneCaminhoDirecionar.setText(rscadastrapastaraizdao.getString("caminho"));

                } else {
                    //enviar mensagem dizendo que posso inserir no banco de dados
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
    }
    
    private void txtPaneCaminhoDirecionarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPaneCaminhoDirecionarPropertyChange
        //COMANDO PARA JUSTIFICAR O TEXTO DENTRO DO TEXT PANE
        StyledDocument doc = txtPaneCaminhoDirecionar.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }//GEN-LAST:event_txtPaneCaminhoDirecionarPropertyChange

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
            java.util.logging.Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConfigurarPastaRaiz dialog = new frmConfigurarPastaRaiz(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionarCaminho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaminho;
    private javax.swing.JTextPane txtPaneCaminhoDirecionar;
    // End of variables declaration//GEN-END:variables

}
