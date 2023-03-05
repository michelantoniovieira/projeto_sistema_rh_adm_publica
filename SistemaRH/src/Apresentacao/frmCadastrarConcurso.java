/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DAO.PopularCmbDAO;
import DTO.PesquisarConcursoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class frmCadastrarConcurso extends javax.swing.JInternalFrame {

    private String codigoConcurso = "";
    private String numeroConcurso = "";
    private String anoConcurso = "";
    private String situacaoConcurso = "";
    private String fk_matricula_responsavel_concurso = "";
    private String fk_codigo_banca = "";

    private ArrayList<PesquisarConcursoDTO> lista;

    public frmCadastrarConcurso() {
        initComponents();
    }

    public void gravarRegistro() {
        setCodigoConcurso(txtCodigoConcurso.getText());
        setNumeroConcurso(txtNumeroConcurso.getText());
        setAnoConcurso(txtAnoConcurso.getText());
        setSituacaoConcurso((String) cmbSituacaoConcurso.getSelectedItem());
        setFk_matricula_responsavel_concurso((String) cmbFkMatriculaResponsavelConcurso.getSelectedItem());
        setFk_codigo_banca((String) cmbFkCodigoBanca.getSelectedItem());

    }

    public void preencherLista(ArrayList<PesquisarConcursoDTO> lista, int index) {
        this.setLista(lista);
        setCodigoConcurso(String.valueOf(getLista().get(index).getCodigoConcurso()));
        setNumeroConcurso(String.valueOf(getLista().get(index).getNumero_concurso()));
        setAnoConcurso(String.valueOf(getLista().get(index).getAno_concurso()));
        setSituacaoConcurso(String.valueOf(getLista().get(index).getSituacao_concurso()));
        setFk_matricula_responsavel_concurso(String.valueOf(getLista().get(index).getFk_matricula_responsavel_concurso()));
        setFk_codigo_banca(String.valueOf(getLista().get(index).getFk_codigo_banca()));
        preencherCampos();
    }

    public void preencherCampos() {
        txtCodigoConcurso.setText(getCodigoConcurso());
        txtNumeroConcurso.setText(getNumeroConcurso());
        txtAnoConcurso.setText(getAnoConcurso());
        cmbSituacaoConcurso.setSelectedIndex(0);
        cmbFkCodigoBanca.setSelectedIndex(0);
        cmbFkMatriculaResponsavelConcurso.setSelectedIndex(0);
    }

    //liberar os campos para edição
    public void ativarCampos() {
        txtCodigoConcurso.setEnabled(false);
        txtNumeroConcurso.setEnabled(true);
        txtAnoConcurso.setEnabled(true);
        cmbSituacaoConcurso.setEnabled(true);
        cmbFkMatriculaResponsavelConcurso.setEnabled(true);
        cmbFkCodigoBanca.setEnabled(true);
    }

    //travar os campos para edição
    public void desativarCampos() {
        txtCodigoConcurso.setEnabled(false);
        txtNumeroConcurso.setEnabled(false);
        txtAnoConcurso.setEnabled(false);
        cmbSituacaoConcurso.setEnabled(false);
        cmbFkMatriculaResponsavelConcurso.setEnabled(false);
        cmbFkCodigoBanca.setEnabled(false);
    }

    public void limparCampos() {
        //this.setCodigoConcurso("");
        txtCodigoConcurso.setText("");
        this.setNumeroConcurso("");
        txtNumeroConcurso.setText("");
        this.setAnoConcurso("");
        txtAnoConcurso.setText("");
        cmbFkCodigoBanca.setSelectedIndex(0);
        cmbFkMatriculaResponsavelConcurso.setSelectedIndex(0);
        cmbSituacaoConcurso.setSelectedIndex(0);
    }

    public String getCodigoConcurso() {
        return codigoConcurso;
    }

    public void setCodigoConcurso(String codigoConcurso) {
        this.codigoConcurso = codigoConcurso;
    }

    public String getNumeroConcurso() {
        return numeroConcurso;
    }

    public void setNumeroConcurso(String numeroConcurso) {
        this.numeroConcurso = numeroConcurso;
    }

    public String getAnoConcurso() {
        return anoConcurso;
    }

    public void setAnoConcurso(String anoConcurso) {
        this.anoConcurso = anoConcurso;
    }

    public String getSituacaoConcurso() {
        return situacaoConcurso;
    }

    public void setSituacaoConcurso(String situacaoConcurso) {
        this.situacaoConcurso = situacaoConcurso;
    }

    public String getFk_matricula_responsavel_concurso() {
        return fk_matricula_responsavel_concurso;
    }

    public void setFk_matricula_responsavel_concurso(String fk_matricula_responsavel_concurso) {
        this.fk_matricula_responsavel_concurso = fk_matricula_responsavel_concurso;
    }

    public String getFk_codigo_banca() {
        return fk_codigo_banca;
    }

    public void setFk_codigo_banca(String fk_codigo_banca) {
        this.fk_codigo_banca = fk_codigo_banca;
    }

    public ArrayList<PesquisarConcursoDTO> getLista() {
        return lista;
    }

    public void setLista(ArrayList<PesquisarConcursoDTO> lista) {
        this.lista = lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastrarConcurso = new java.awt.Label();
        pPrincipal = new javax.swing.JPanel();
        pInformacoes = new javax.swing.JPanel();
        lblNumeroConcurso = new javax.swing.JLabel();
        txtNumeroConcurso = new javax.swing.JTextField();
        lblAnoConcurso = new javax.swing.JLabel();
        txtAnoConcurso = new javax.swing.JTextField();
        txtCodigoConcurso = new javax.swing.JTextField();
        lblCodigoConcurso = new javax.swing.JLabel();
        cmbFkCodigoBanca = new javax.swing.JComboBox<>();
        lblBanca = new javax.swing.JLabel();
        lblPrefeitoResponsavel = new javax.swing.JLabel();
        cmbSituacaoConcurso = new javax.swing.JComboBox<>();
        cmbFkMatriculaResponsavelConcurso = new javax.swing.JComboBox<>();
        lblSituacaoConcurso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        lblCadastrarConcurso.setText("label1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Concurso");
        setToolTipText("");

        lblNumeroConcurso.setText("Nº Concurso:");

        lblAnoConcurso.setText("Ano Concurso:");

        txtCodigoConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoConcursoActionPerformed(evt);
            }
        });

        lblCodigoConcurso.setText("Código Concurso:");

        cmbFkCodigoBanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbFkCodigoBanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFkCodigoBancaActionPerformed(evt);
            }
        });

        lblBanca.setText("Banca:");

        lblPrefeitoResponsavel.setText("Responsável/Prefeito");

        cmbSituacaoConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Em andamento", "Homologado", "Cancelado" }));

        cmbFkMatriculaResponsavelConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbFkMatriculaResponsavelConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFkMatriculaResponsavelConcursoActionPerformed(evt);
            }
        });

        lblSituacaoConcurso.setText("Situação Concurso");

        javax.swing.GroupLayout pInformacoesLayout = new javax.swing.GroupLayout(pInformacoes);
        pInformacoes.setLayout(pInformacoesLayout);
        pInformacoesLayout.setHorizontalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbFkCodigoBanca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumeroConcurso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroConcurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnoConcurso)
                            .addComponent(cmbFkMatriculaResponsavelConcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addComponent(txtCodigoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSituacaoConcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblBanca)
                                .addGap(133, 133, 133)
                                .addComponent(lblPrefeitoResponsavel))
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblCodigoConcurso)
                                .addGap(71, 71, 71)
                                .addComponent(lblSituacaoConcurso)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPrefeitoResponsavel)
                        .addGap(28, 28, 28))
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoConcurso)
                            .addComponent(lblSituacaoConcurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSituacaoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblNumeroConcurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pInformacoesLayout.createSequentialGroup()
                                .addComponent(lblAnoConcurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbFkMatriculaResponsavelConcurso)
                            .addComponent(cmbFkCodigoBanca))))
                .addContainerGap())
        );

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Cadastrar Concurso");

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblTitulo)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addComponent(pInformacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCodigoConcursoActionPerformed
    {//GEN-HEADEREND:event_txtCodigoConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoConcursoActionPerformed

    private void cmbFkCodigoBancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFkCodigoBancaActionPerformed

    }//GEN-LAST:event_cmbFkCodigoBancaActionPerformed

    private void cmbFkMatriculaResponsavelConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFkMatriculaResponsavelConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFkMatriculaResponsavelConcursoActionPerformed

    public void popularCMBs() {
        JOptionPane.showMessageDialog(null, "poasd");
        PopularCmbDAO pcd = new PopularCmbDAO();

        ArrayList<String> popularCMB = new ArrayList<String>();
        //popular nome das bancas
        popularCMB = pcd.pesquisar("banca", "nome_banca_organizadora");
        for (String nomes : popularCMB) {
            cmbFkCodigoBanca.addItem(nomes);
        }
        
        //LISTAR O NOME DOS PREFEITOS

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFkCodigoBanca;
    private javax.swing.JComboBox<String> cmbFkMatriculaResponsavelConcurso;
    private javax.swing.JComboBox<String> cmbSituacaoConcurso;
    private javax.swing.JLabel lblAnoConcurso;
    private javax.swing.JLabel lblBanca;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblCodigoConcurso;
    private javax.swing.JLabel lblNumeroConcurso;
    private javax.swing.JLabel lblPrefeitoResponsavel;
    private javax.swing.JLabel lblSituacaoConcurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField txtAnoConcurso;
    private javax.swing.JTextField txtCodigoConcurso;
    private javax.swing.JTextField txtNumeroConcurso;
    // End of variables declaration//GEN-END:variables
}
