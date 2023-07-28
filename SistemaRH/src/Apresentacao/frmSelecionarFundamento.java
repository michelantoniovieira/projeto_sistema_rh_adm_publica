/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import Modelo.ControleCadastrarFundamento;
import Modelo.DefinirTamanhoMaximoCampoDeTexto;
import com.toedter.calendar.JCalendar;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmSelecionarFundamento extends javax.swing.JDialog
{

    /**
     * Creates new form frmCadastrarFundamento
     */
    public frmSelecionarFundamento(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    public frmSelecionarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, JTabbedPane jtp, String codigoCargoEmprego)
    {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jtpAto = new javax.swing.JTabbedPane();
        jpCriacaoExclusao = new javax.swing.JPanel();
        cmbAto = new javax.swing.JComboBox<>();
        txtQuantidadeVagas = new javax.swing.JTextField();
        lblQuantidadeVagas = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jpReajuste = new javax.swing.JPanel();
        lblValorDe = new javax.swing.JLabel();
        lblValorPara = new javax.swing.JLabel();
        txtValorPara = new javax.swing.JTextField();
        txtValorDe = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Legislação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição Lei", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jtpAto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cmbAto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CRIAÇÃO", "EXTINÇÃO", "REAJUSTE", "OUTROS" }));

        txtQuantidadeVagas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtQuantidadeVagasActionPerformed(evt);
            }
        });
        txtQuantidadeVagas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtQuantidadeVagasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtQuantidadeVagasKeyTyped(evt);
            }
        });

        lblQuantidadeVagas.setText("Quantidade Vagas");

        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout jpCriacaoExclusaoLayout = new javax.swing.GroupLayout(jpCriacaoExclusao);
        jpCriacaoExclusao.setLayout(jpCriacaoExclusaoLayout);
        jpCriacaoExclusaoLayout.setHorizontalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQuantidadeVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantidadeVagas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCriacaoExclusaoLayout.setVerticalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeVagas)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jtpAto.addTab("Criação/Exclusão", jpCriacaoExclusao);

        lblValorDe.setText("De:");

        lblValorPara.setText("Para:");

        txtValorPara.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtValorParaActionPerformed(evt);
            }
        });
        txtValorPara.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtValorParaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtValorParaKeyTyped(evt);
            }
        });

        txtValorDe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtValorDeActionPerformed(evt);
            }
        });
        txtValorDe.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtValorDeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtValorDeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpReajusteLayout = new javax.swing.GroupLayout(jpReajuste);
        jpReajuste.setLayout(jpReajusteLayout);
        jpReajusteLayout.setHorizontalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorDe)
                    .addGroup(jpReajusteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPara)
                    .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpReajusteLayout.setVerticalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDe)
                    .addComponent(lblValorPara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jtpAto.addTab("Reajuste", jpReajuste);

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtpAto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpAto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeVagasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtQuantidadeVagasActionPerformed
    {//GEN-HEADEREND:event_txtQuantidadeVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeVagasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
        clicouNoBotaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean clicouNoBotaoCancelar()
    {
        return true;
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtQuantidadeVagasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyTyped
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeVagasKeyTyped

    private void txtValorParaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtValorParaActionPerformed
    {//GEN-HEADEREND:event_txtValorParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorParaActionPerformed

    private void txtValorParaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorParaKeyTyped
    {//GEN-HEADEREND:event_txtValorParaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorParaKeyTyped

    private void txtValorDeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtValorDeActionPerformed
    {//GEN-HEADEREND:event_txtValorDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeActionPerformed

    private void txtValorDeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorDeKeyTyped
    {//GEN-HEADEREND:event_txtValorDeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeKeyTyped

    private void txtQuantidadeVagasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyReleased
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyReleased
        verificarCamposPreenchidos();
    }//GEN-LAST:event_txtQuantidadeVagasKeyReleased

    private void txtValorDeKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorDeKeyReleased
    {//GEN-HEADEREND:event_txtValorDeKeyReleased

    }//GEN-LAST:event_txtValorDeKeyReleased

    private void txtValorParaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorParaKeyReleased
    {//GEN-HEADEREND:event_txtValorParaKeyReleased

    }//GEN-LAST:event_txtValorParaKeyReleased
    public void verificarCamposPreenchidos()
    {
        boolean podeCadastrar = !txtQuantidadeVagas.getText().isEmpty();

        if (podeCadastrar)
        {
            btnCadastrar.setEnabled(true);
        }
        else
        {
          btnCadastrar.setEnabled(false);  
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecionarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecionarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecionarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecionarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmSelecionarFundamento dialog = new frmSelecionarFundamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbAto;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCriacaoExclusao;
    private javax.swing.JPanel jpReajuste;
    private javax.swing.JTabbedPane jtpAto;
    private javax.swing.JLabel lblQuantidadeVagas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValorDe;
    private javax.swing.JLabel lblValorPara;
    private javax.swing.JTextField txtQuantidadeVagas;
    private javax.swing.JTextField txtValorDe;
    private javax.swing.JTextField txtValorPara;
    // End of variables declaration//GEN-END:variables
}
