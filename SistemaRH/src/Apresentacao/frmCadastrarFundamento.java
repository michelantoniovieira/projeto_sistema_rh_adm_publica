/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import Modelo.ControleCadastrarFundamento;
import Modelo.DefinirTamanhoMaximoCampoDeTexto;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmCadastrarFundamento extends javax.swing.JDialog
{

    private DefaultTableModel tabela;
    private boolean eUmaAlteracao = false;
    private int linhaSelecionada = -1;

    /**
     * Creates new form frmCadastrarFundamento
     */
    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tabela)
    {
        super(parent, modal);
        this.tabela = tabela;
        initComponents();
        eUmaAlteracao = false;
        txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tabela, String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String quantidadeCargosEmpregosDaLei, int linhaSelecionada)
    {
        super(parent, modal);
        this.tabela = tabela;
        initComponents();
        this.txtNumeroLei.setText(numeroDaLei);
        this.txtAnoLei.setText(anoDaLei);
        this.jffDataLei.setText(dataDaLei);
        this.jtaEmenta.setText(ementaDaLei);
        this.cmbAto.getSelectedItem().equals(atoDaLei);
        this.txtQuantidadeVagas.setText(quantidadeCargosEmpregosDaLei);
        this.eUmaAlteracao = true;
        this.linhaSelecionada = linhaSelecionada;
        txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblDataLei = new javax.swing.JLabel();
        jffDataLei = new javax.swing.JFormattedTextField();
        lblNumeroLei = new javax.swing.JLabel();
        txtNumeroLei = new javax.swing.JTextField();
        lblAnoLei = new javax.swing.JLabel();
        txtAnoLei = new javax.swing.JTextField();
        cmbAto = new javax.swing.JComboBox<>();
        lblAto = new javax.swing.JLabel();
        lblQuantidadeVagas = new javax.swing.JLabel();
        txtQuantidadeVagas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEmenta = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Legislação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição Lei", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblDataLei.setText("Data:");

        try
        {
            jffDataLei.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        jffDataLei.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffDataLei.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jffDataLeiFocusLost(evt);
            }
        });
        jffDataLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jffDataLeiKeyTyped(evt);
            }
        });

        lblNumeroLei.setText("Número:");

        txtNumeroLei.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNumeroLeiActionPerformed(evt);
            }
        });
        txtNumeroLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNumeroLeiKeyTyped(evt);
            }
        });

        lblAnoLei.setText("Ano:");

        txtAnoLei.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtAnoLeiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtAnoLeiFocusLost(evt);
            }
        });
        txtAnoLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtAnoLeiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAnoLeiKeyTyped(evt);
            }
        });

        cmbAto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criação", "Extinção", "Reajuste", "Outros" }));

        lblAto.setText("Ato:");

        lblQuantidadeVagas.setText("Quantidade Vagas:");

        txtQuantidadeVagas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtQuantidadeVagasActionPerformed(evt);
            }
        });
        txtQuantidadeVagas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtQuantidadeVagasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroLei)
                    .addComponent(txtNumeroLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnoLei)
                    .addComponent(txtAnoLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataLei)
                    .addComponent(jffDataLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAto)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidadeVagas)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(txtQuantidadeVagas))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAto)
                    .addComponent(lblDataLei)
                    .addComponent(lblQuantidadeVagas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAnoLei)
                    .addComponent(lblNumeroLei))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtQuantidadeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAnoLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jffDataLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumeroLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ementa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jtaEmenta.setColumns(20);
        jtaEmenta.setRows(5);
        jScrollPane1.setViewportView(jtaEmenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroLeiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNumeroLeiActionPerformed
    {//GEN-HEADEREND:event_txtNumeroLeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLeiActionPerformed

    private void txtQuantidadeVagasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtQuantidadeVagasActionPerformed
    {//GEN-HEADEREND:event_txtQuantidadeVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeVagasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        boolean valorDuplicado = false;
        for (int i = 0; i < tabela.getRowCount(); i++)
        {
            String numeroDaLei = tabela.getValueAt(i, 0).toString();
            String anoDaLei = tabela.getValueAt(i, 1).toString();
            System.out.println("entrou");
            if (txtNumeroLei.getText().equals(numeroDaLei) && txtAnoLei.getText().equals(anoDaLei) && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Registro duplicado!");
                valorDuplicado = true;
                break;
            }
        }

        if (eUmaAlteracao)
        {
            if (!valorDuplicado)
            {
                if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                {
                    ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tabela, eUmaAlteracao, linhaSelecionada);
                    this.dispose();
                }
            }
        }
        else
        {
            if (!valorDuplicado)
            {
                if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                {
                    ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tabela, eUmaAlteracao, linhaSelecionada);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNumeroLeiKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNumeroLeiKeyTyped
    {//GEN-HEADEREND:event_txtNumeroLeiKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
        else
        {
            String texto = txtNumeroLei.getText();
            if (texto.length() == 2)
            {
                txtNumeroLei.setFocusTraversalKeysEnabled(true);
            }
        }
    }//GEN-LAST:event_txtNumeroLeiKeyTyped

    private void txtAnoLeiKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAnoLeiKeyTyped
    {//GEN-HEADEREND:event_txtAnoLeiKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
        else
        {
            String texto = txtAnoLei.getText();
            if (texto.length() == 3)
            {
                txtAnoLei.setFocusTraversalKeysEnabled(true);
            }
        }
    }//GEN-LAST:event_txtAnoLeiKeyTyped

    private void jffDataLeiKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jffDataLeiKeyTyped
    {//GEN-HEADEREND:event_jffDataLeiKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
        else
        {
            String texto = jffDataLei.getText();
            if (texto.length() == 8)
            {
                jffDataLei.setFocusTraversalKeysEnabled(true);
            }

        }
    }//GEN-LAST:event_jffDataLeiKeyTyped

    private void txtQuantidadeVagasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyTyped
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeVagasKeyTyped

    private void jffDataLeiFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jffDataLeiFocusLost
    {//GEN-HEADEREND:event_jffDataLeiFocusLost

        String data = jffDataLei.getText(); // Obtém o texto do campo
        data = data.replaceAll("[^\\d]", ""); // Remove todos os caracteres que não são dígitos (espaços em branco e a barra)
        int numCaracteresPreenchidos = data.length(); // Conta o número de dígitos restantes

        if (numCaracteresPreenchidos != 8)
        {
            JOptionPane.showMessageDialog(null, "Campo data não pode estar vazio!");
            jffDataLei.requestFocus();
        }
        else
        {
            jffDataLei.setFocusTraversalKeysEnabled(true);
        }
    }//GEN-LAST:event_jffDataLeiFocusLost

    private void txtAnoLeiFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtAnoLeiFocusLost
    {//GEN-HEADEREND:event_txtAnoLeiFocusLost
        String data = txtAnoLei.getText(); // Obtém o texto do campo
        data = data.replaceAll("[^\\d]", ""); // Remove todos os caracteres que não são dígitos (espaços em branco e a barra)
        int numCaracteresPreenchidos = data.length(); // Conta o número de dígitos restantes

        System.out.println(numCaracteresPreenchidos);
        if (numCaracteresPreenchidos != 4)
        {
            JOptionPane.showMessageDialog(null, "Campo ano não pode ser inferior a 4 digitos!");
            txtAnoLei.requestFocusInWindow();
        }


    }//GEN-LAST:event_txtAnoLeiFocusLost

    private void txtAnoLeiKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAnoLeiKeyReleased
    {//GEN-HEADEREND:event_txtAnoLeiKeyReleased

    }//GEN-LAST:event_txtAnoLeiKeyReleased

    private void txtAnoLeiFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtAnoLeiFocusGained
    {//GEN-HEADEREND:event_txtAnoLeiFocusGained
        txtAnoLei.setFocusTraversalKeysEnabled(false);
    }//GEN-LAST:event_txtAnoLeiFocusGained

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
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmCadastrarFundamento dialog = new frmCadastrarFundamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jffDataLei;
    private javax.swing.JTextArea jtaEmenta;
    private javax.swing.JLabel lblAnoLei;
    private javax.swing.JLabel lblAto;
    private javax.swing.JLabel lblDataLei;
    private javax.swing.JLabel lblNumeroLei;
    private javax.swing.JLabel lblQuantidadeVagas;
    private javax.swing.JTextField txtAnoLei;
    private javax.swing.JTextField txtNumeroLei;
    private javax.swing.JTextField txtQuantidadeVagas;
    // End of variables declaration//GEN-END:variables
}
