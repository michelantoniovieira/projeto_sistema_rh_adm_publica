/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DTO.PesquisarBancaDTO;
import Modelo.CadastrarBancaControle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miche
 */
public class frmCadastrarBanca extends javax.swing.JInternalFrame implements Modelo.MetodosComunsParaTodosOsJIF<CadastrarBancaControle>
{

    private String codigoBanca = "";
    private String bancaConcurso = "";
    private String telBanca = "";
    private String responsavelBanca = "";
    private String telResponsavelBanca = "";
    private String emailResponsavel = "";
    private ArrayList<PesquisarBancaDTO> lista;

    public frmCadastrarBanca()
    {
        initComponents();
    }

    public void gravarRegistro()
    {
        setCodigoBanca(txtCodigoBanca.getText());
        setBancaConcurso(txtBancaConcurso.getText());
        setTelBanca(txtTelBanca.getText());
        setResponsavelBanca(txtResponsavelBancaConcurso.getText());
        setTelResponsavelBanca(txtTelResponsavelBanca.getText());
        setEmailResponsavel(txtEmail.getText());
    }

    public void preencherLista(ArrayList<PesquisarBancaDTO> lista, int index)
    {
        this.setLista(lista);
        setCodigoBanca(String.valueOf(getLista().get(index).getCodigoBanca()));
        setBancaConcurso(String.valueOf(getLista().get(index).getNome_banca_organizadora()));
        setTelBanca(String.valueOf(getLista().get(index).getTelefone_banca_organizadora()));
        setResponsavelBanca(String.valueOf(getLista().get(index).getResponsavel_banca_organizadora()));
        setTelResponsavelBanca(String.valueOf(getLista().get(index).getTelefone_responsavel_banca_organizadora()));
        setEmailResponsavel(String.valueOf(getLista().get(index).getEmail_banca_organizadora()));
        preencherCampos();
    }

    public void preencherCampos()
    {
        txtCodigoBanca.setText(getCodigoBanca());
        txtBancaConcurso.setText(getBancaConcurso());
        txtTelBanca.setText(getTelBanca());
        txtResponsavelBancaConcurso.setText(getResponsavelBanca());
        txtTelResponsavelBanca.setText(getTelResponsavelBanca());
        txtEmail.setText(getEmailResponsavel());

    }

    //liberar os campos para edição
    @Override
    public void ativarCampos()
    {
        txtCodigoBanca.setEnabled(false);
        txtBancaConcurso.setEnabled(true);
        txtTelBanca.setEnabled(true);
        txtResponsavelBancaConcurso.setEnabled(true);
        txtTelResponsavelBanca.setEnabled(true);
        txtEmail.setEnabled(true);
    }

    //travar os campos para edição
    @Override
    public void desativarCampos()
    {
        txtCodigoBanca.setEnabled(false);
        txtBancaConcurso.setEnabled(false);
        txtTelBanca.setEnabled(false);
        txtResponsavelBancaConcurso.setEnabled(false);
        txtTelResponsavelBanca.setEnabled(false);
        txtEmail.setEnabled(false);
    }

    public void limparCampos()
    {
        //this.setCodigoConcurso("");
        txtCodigoBanca.setText("");
        this.setBancaConcurso("");
        txtBancaConcurso.setText("");
        this.setTelBanca("");
        txtTelBanca.setText("");
        this.setResponsavelBanca("");
        txtResponsavelBancaConcurso.setText("");
        this.setTelResponsavelBanca("");
        txtTelResponsavelBanca.setText("");
        this.setEmailResponsavel("");
        txtEmail.setText("");
    }

    public String getCodigoBanca()
    {
        return codigoBanca;
    }

    public void setCodigoBanca(String codigoBanca)
    {
        this.codigoBanca = codigoBanca;
    }

    public String getBancaConcurso()
    {
        return bancaConcurso;
    }

    public void setBancaConcurso(String bancaConcurso)
    {
        this.bancaConcurso = bancaConcurso;
    }

    public String getTelBanca()
    {
        return telBanca;
    }

    public void setTelBanca(String telBanca)
    {
        this.telBanca = telBanca;
    }

    public String getResponsavelBanca()
    {
        return responsavelBanca;
    }

    public void setResponsavelBanca(String responsavelBanca)
    {
        this.responsavelBanca = responsavelBanca;
    }

    public String getTelResponsavelBanca()
    {
        return telResponsavelBanca;
    }

    public void setTelResponsavelBanca(String telResponsavelBanca)
    {
        this.telResponsavelBanca = telResponsavelBanca;
    }

    public String getEmailResponsavel()
    {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel)
    {
        this.emailResponsavel = emailResponsavel;
    }

    public ArrayList<PesquisarBancaDTO> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<PesquisarBancaDTO> lista)
    {
        this.lista = lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblCadastrarConcurso = new java.awt.Label();
        pPrincipal = new javax.swing.JPanel();
        pInformacoes = new javax.swing.JPanel();
        lblTelBanca = new javax.swing.JLabel();
        txtTelResponsavelBanca = new javax.swing.JTextField();
        lblTelResponsavelBanca = new javax.swing.JLabel();
        lblResponsavelBanca = new javax.swing.JLabel();
        txtResponsavelBancaConcurso = new javax.swing.JTextField();
        lblBancaConcurso = new javax.swing.JLabel();
        txtBancaConcurso = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCodigoBanca = new javax.swing.JTextField();
        lblNumeroConcurso1 = new javax.swing.JLabel();
        txtTelBanca = new javax.swing.JFormattedTextField();
        lblTitulo = new javax.swing.JLabel();

        lblCadastrarConcurso.setText("label1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Banca");
        setToolTipText("");

        lblTelBanca.setText("Telefone Banca:");

        txtTelResponsavelBanca.setEnabled(false);

        lblTelResponsavelBanca.setText("Telefone Responsável:");

        lblResponsavelBanca.setText("Responsável da Banca:");

        txtResponsavelBancaConcurso.setEnabled(false);
        txtResponsavelBancaConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtResponsavelBancaConcursoActionPerformed(evt);
            }
        });

        lblBancaConcurso.setText("Banca:");

        txtBancaConcurso.setEnabled(false);

        txtEmail.setEnabled(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        txtCodigoBanca.setEnabled(false);
        txtCodigoBanca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCodigoBancaActionPerformed(evt);
            }
        });

        lblNumeroConcurso1.setText("Código Banca");

        txtTelBanca.setEnabled(false);

        javax.swing.GroupLayout pInformacoesLayout = new javax.swing.GroupLayout(pInformacoes);
        pInformacoes.setLayout(pInformacoesLayout);
        pInformacoesLayout.setHorizontalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResponsavelBanca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResponsavelBancaConcurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblTelResponsavelBanca)
                                .addGap(0, 159, Short.MAX_VALUE))
                            .addComponent(txtTelResponsavelBanca)))
                    .addComponent(lblEmail)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pInformacoesLayout.createSequentialGroup()
                                    .addComponent(lblBancaConcurso)
                                    .addGap(202, 202, 202))
                                .addGroup(pInformacoesLayout.createSequentialGroup()
                                    .addComponent(txtBancaConcurso)
                                    .addGap(6, 6, 6)))
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroConcurso1)
                                    .addComponent(txtCodigoBanca, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)))
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblTelBanca)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTelBanca))))
                .addContainerGap())
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNumeroConcurso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblBancaConcurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBancaConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblTelBanca)
                        .addGap(28, 28, 28)))
                .addGap(12, 12, 12)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblResponsavelBanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsavelBancaConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblTelResponsavelBanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelResponsavelBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Cadastrar Banca");

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResponsavelBancaConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtResponsavelBancaConcursoActionPerformed
    {//GEN-HEADEREND:event_txtResponsavelBancaConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavelBancaConcursoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEmailActionPerformed
    {//GEN-HEADEREND:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCodigoBancaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCodigoBancaActionPerformed
    {//GEN-HEADEREND:event_txtCodigoBancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBancaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBancaConcurso;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNumeroConcurso1;
    private javax.swing.JLabel lblResponsavelBanca;
    private javax.swing.JLabel lblTelBanca;
    private javax.swing.JLabel lblTelResponsavelBanca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField txtBancaConcurso;
    private javax.swing.JTextField txtCodigoBanca;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtResponsavelBancaConcurso;
    private javax.swing.JFormattedTextField txtTelBanca;
    private javax.swing.JTextField txtTelResponsavelBanca;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<Integer> gerenciadorNavegacao(String acao)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCodigo()
    {
        return codigoBanca;
    }

    @Override
    public void cadastrar(CadastrarBancaControle frm)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
