/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import javax.swing.JTextField;

/**
 *
 * @author miche
 */
public class frmCadastrarConcurso extends javax.swing.JInternalFrame
{

    private String numeroConcurso = "";
    private String anoConcurso = "";
    private String bancaConcurso = "";
    private String telBanca = "";
    private String responsavelBanca = "";
    private String telResposanvelBanca = "";
    private String emailResponsavel = "";
    
    
    public frmCadastrarConcurso()
    {
        initComponents();

    }

    public void gravarRegistro()
    {
        setNumeroConcurso(txtNumeroConcurso.getText());
        setAnoConcurso(txtAnoConcurso.getText());
        setBancaConcurso(txtBancaConcurso.getText());
        setTelBanca(txtTelBanca.getText());
        setResponsavelBanca(txtTelResponsavelBanca.getText());
        setTelResposanvelBanca(txtTelResponsavelBanca.getText());
        setEmailResponsavel(txtEmail.getText());
        
        
    }

    public String getNumeroConcurso()
    {
        return numeroConcurso;
    }

    public void setNumeroConcurso(String numeroConcurso)
    {
        this.numeroConcurso = numeroConcurso;
    }    
    
    public String getAnoConcurso()
    {
        return anoConcurso;
    }

    public void setAnoConcurso(String anoConcurso)
    {
        this.anoConcurso = anoConcurso;
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

    public String getTelResposanvelBanca()
    {
        return telResposanvelBanca;
    }

    public void setTelResposanvelBanca(String telResposanvelBanca)
    {
        this.telResposanvelBanca = telResposanvelBanca;
    }

    public String getEmailResponsavel()
    {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel)
    {
        this.emailResponsavel = emailResponsavel;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblCadastrarConcurso = new java.awt.Label();
        pPrincipal = new javax.swing.JPanel();
        pInformacoes = new javax.swing.JPanel();
        txtTelBanca = new javax.swing.JTextField();
        lblTelBanca = new javax.swing.JLabel();
        txtTelResponsavelBanca = new javax.swing.JTextField();
        lblTelResponsavelBanca = new javax.swing.JLabel();
        lblResponsavelBanca = new javax.swing.JLabel();
        txtResponsavelBancaConcurso = new javax.swing.JTextField();
        lblBancaConcurso = new javax.swing.JLabel();
        txtBancaConcurso = new javax.swing.JTextField();
        lblNumeroConcurso = new javax.swing.JLabel();
        txtNumeroConcurso = new javax.swing.JTextField();
        lblAnoConcurso = new javax.swing.JLabel();
        txtAnoConcurso = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();

        lblCadastrarConcurso.setText("label1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Concurso");
        setToolTipText("");

        lblTelBanca.setText("Tel.:");

        lblTelResponsavelBanca.setText("Tel.:");

        lblResponsavelBanca.setText("Responsável:");

        txtResponsavelBancaConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtResponsavelBancaConcursoActionPerformed(evt);
            }
        });

        lblBancaConcurso.setText("Banca:");

        lblNumeroConcurso.setText("Nº Concurso:");

        lblAnoConcurso.setText("Ano Concurso:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Cadastrar Concurso");

        txtEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        javax.swing.GroupLayout pInformacoesLayout = new javax.swing.GroupLayout(pInformacoes);
        pInformacoes.setLayout(pInformacoesLayout);
        pInformacoesLayout.setHorizontalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pInformacoesLayout.createSequentialGroup()
                                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblResponsavelBanca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResponsavelBancaConcurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pInformacoesLayout.createSequentialGroup()
                                        .addComponent(lblTelResponsavelBanca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtTelResponsavelBanca)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pInformacoesLayout.createSequentialGroup()
                                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTitulo)
                                        .addGroup(pInformacoesLayout.createSequentialGroup()
                                            .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNumeroConcurso)
                                                .addComponent(txtNumeroConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(pInformacoesLayout.createSequentialGroup()
                                                    .addComponent(lblAnoConcurso)
                                                    .addGap(92, 92, 92))
                                                .addComponent(txtAnoConcurso))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pInformacoesLayout.createSequentialGroup()
                                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                                .addComponent(lblBancaConcurso)
                                                .addGap(202, 202, 202))
                                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                                .addComponent(txtBancaConcurso)
                                                .addGap(6, 6, 6)))
                                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelBanca)
                                            .addComponent(txtTelBanca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(150, 150, 150))))
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroConcurso)
                    .addComponent(lblAnoConcurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblBancaConcurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBancaConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(lblTelBanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addComponent(pInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAnoConcurso;
    private javax.swing.JLabel lblBancaConcurso;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNumeroConcurso;
    private javax.swing.JLabel lblResponsavelBanca;
    private javax.swing.JLabel lblTelBanca;
    private javax.swing.JLabel lblTelResponsavelBanca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField txtAnoConcurso;
    private javax.swing.JTextField txtBancaConcurso;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNumeroConcurso;
    private javax.swing.JTextField txtResponsavelBancaConcurso;
    private javax.swing.JTextField txtTelBanca;
    private javax.swing.JTextField txtTelResponsavelBanca;
    // End of variables declaration//GEN-END:variables
}
