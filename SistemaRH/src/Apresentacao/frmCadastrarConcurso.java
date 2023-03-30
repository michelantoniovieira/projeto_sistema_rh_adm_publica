/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DAO.PopularCmbDAO;
import DTO.PesquisarConcursoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author miche
 */
public class frmCadastrarConcurso extends javax.swing.JInternalFrame
{

    private String codigoConcurso = "";
    private String numeroConcurso = "";
    private String anoConcurso = "";
    private String situacaoConcurso = "";
    private String fk_matricula_responsavel_concurso = "1";
    private String fk_codigo_banca = "";
    public int contador = 0;
    private ArrayList<Object> popularCMB;

    private ArrayList<PesquisarConcursoDTO> lista;

    public frmCadastrarConcurso()
    {
        initComponents();
        contador = 0;
        popularCMB = new ArrayList<Object>();
    }

    public void gravarRegistro()
    {
        setCodigoConcurso(txtCodigoConcurso.getText());
        setNumeroConcurso(txtNumeroConcurso.getText());
        setAnoConcurso(txtAnoConcurso.getText());
        setSituacaoConcurso(String.valueOf(cmbSituacaoConcurso.getSelectedIndex()));
        setFk_matricula_responsavel_concurso((String) cmbFkMatriculaResponsavelConcurso.getSelectedItem());
        setFk_codigo_banca(String.valueOf(cmbFkCodigoBanca.getSelectedIndex()));
    }

    public void preencherLista(ArrayList<PesquisarConcursoDTO> lista, int index)
    {
        this.setLista(lista);
        setCodigoConcurso(String.valueOf(getLista().get(index).getCodigoConcurso()));
        setNumeroConcurso(String.valueOf(getLista().get(index).getNumero_concurso()));
        setAnoConcurso(String.valueOf(getLista().get(index).getAno_concurso()));
        setSituacaoConcurso(String.valueOf(getLista().get(index).getSituacao_concurso()));
        setFk_matricula_responsavel_concurso(String.valueOf(getLista().get(index).getFk_matricula_responsavel_concurso()));
        setFk_codigo_banca(String.valueOf(getLista().get(index).getFk_codigo_banca()));
        preencherCampos();
    }

    public void preencherCampos()
    {
        txtCodigoConcurso.setText(getCodigoConcurso());
        txtNumeroConcurso.setText(getNumeroConcurso());
        txtAnoConcurso.setText(getAnoConcurso());
        cmbSituacaoConcurso.setSelectedIndex(Integer.parseInt(getSituacaoConcurso()));
        cmbFkCodigoBanca.setSelectedIndex(Integer.parseInt(getFk_codigo_banca()));
        cmbFkMatriculaResponsavelConcurso.setSelectedIndex(0);
    }

    //liberar os campos para edição
    public void ativarCampos()
    {
        //txtCodigoConcurso.setEnabled(true);
        txtNumeroConcurso.setEnabled(true);
        txtAnoConcurso.setEnabled(true);
        cmbSituacaoConcurso.setEnabled(true);
        cmbFkMatriculaResponsavelConcurso.setEnabled(true);
        cmbFkCodigoBanca.setEnabled(true);
        //outro problema é quando eu fecho a janela de cadastro de concurso e abro novamente ele executa esse mesmo bloco de comando, repetindo as informações no combobox
        //contador utilizado para limitar as aberturas dos itens na lista de forma dobradado cadastro de concurso
    }

    //travar os campos para edição
    public void desativarCampos()
    {
        txtCodigoConcurso.setEnabled(false);
        txtNumeroConcurso.setEnabled(false);
        txtAnoConcurso.setEnabled(false);
        cmbSituacaoConcurso.setEnabled(false);
        cmbFkMatriculaResponsavelConcurso.setEnabled(false);
        cmbFkCodigoBanca.setEnabled(false);
    }

    public void limparCampos()
    {
        this.setCodigoConcurso("");
        txtCodigoConcurso.setText("");
        this.setNumeroConcurso("");
        txtNumeroConcurso.setText("");
        this.setAnoConcurso("");
        txtAnoConcurso.setText("");
        cmbFkCodigoBanca.setSelectedIndex(0);
        cmbFkMatriculaResponsavelConcurso.setSelectedIndex(0);
        cmbSituacaoConcurso.setSelectedIndex(0);
    }

    public void carregarLabels()
    {
        lblNumeroConcursoTelaCargoEmprego.setText(txtNumeroConcurso.getText());
        lblAnoConcursoTelaCargoEmprego.setText(txtAnoConcurso.getText());
    }

    public String getCodigoConcurso()
    {
        return codigoConcurso;
    }

    public void setCodigoConcurso(String codigoConcurso)
    {
        this.codigoConcurso = codigoConcurso;
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

    public String getSituacaoConcurso()
    {
        return situacaoConcurso;
    }

    public void setSituacaoConcurso(String situacaoConcurso)
    {
        this.situacaoConcurso = situacaoConcurso;
    }

    public String getFk_matricula_responsavel_concurso()
    {
        return fk_matricula_responsavel_concurso;
    }

    public void setFk_matricula_responsavel_concurso(String fk_matricula_responsavel_concurso)
    {
        this.fk_matricula_responsavel_concurso = fk_matricula_responsavel_concurso;
    }

    public String getFk_codigo_banca()
    {
        return fk_codigo_banca;
    }

    public void setFk_codigo_banca(String fk_codigo_banca)
    {
        this.fk_codigo_banca = fk_codigo_banca;
    }

    public ArrayList<PesquisarConcursoDTO> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<PesquisarConcursoDTO> lista)
    {
        this.lista = lista;
    }

    public int getJtpCadastrarConcurso()
    {
        return jtpCadastrarConcurso.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblCadastrarConcurso = new java.awt.Label();
        jtpCadastrarConcurso = new javax.swing.JTabbedPane();
        jtpPrincipal = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        lblCargoEmpregoCadCon = new javax.swing.JLabel();
        txtQuantidadeVagasCadCon = new javax.swing.JTextField();
        lblQuantidadeVagasCadCon = new javax.swing.JLabel();
        cmbCargoEmpregoCadCon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCadastrarCadCon = new javax.swing.JButton();
        btnRemoverCadCon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroConcursoTelaCargoEmprego = new javax.swing.JLabel();
        lblCadastrarCargoEmprego = new javax.swing.JLabel();
        lblConcurso = new javax.swing.JLabel();
        lblbarra = new javax.swing.JLabel();
        lblAnoConcursoTelaCargoEmprego = new javax.swing.JLabel();

        lblCadastrarConcurso.setText("label1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Concurso");
        setToolTipText("");

        jtpCadastrarConcurso.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jtpCadastrarConcursoStateChanged(evt);
            }
        });

        lblNumeroConcurso.setText("Nº Concurso:");

        lblAnoConcurso.setText("Ano Concurso:");

        txtCodigoConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCodigoConcursoActionPerformed(evt);
            }
        });

        lblCodigoConcurso.setText("Código Concurso:");

        cmbFkCodigoBanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbFkCodigoBanca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbFkCodigoBancaActionPerformed(evt);
            }
        });

        lblBanca.setText("Banca:");

        lblPrefeitoResponsavel.setText("Responsável/Prefeito");

        cmbSituacaoConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Em andamento", "Homologado", "Cancelado" }));
        cmbSituacaoConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbSituacaoConcursoActionPerformed(evt);
            }
        });

        cmbFkMatriculaResponsavelConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        cmbFkMatriculaResponsavelConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
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
                    .addComponent(lblBanca)
                    .addGroup(pInformacoesLayout.createSequentialGroup()
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumeroConcurso)
                            .addComponent(lblCodigoConcurso)
                            .addComponent(cmbFkCodigoBanca, 0, 191, Short.MAX_VALUE)
                            .addComponent(txtNumeroConcurso)
                            .addComponent(txtCodigoConcurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSituacaoConcurso)
                            .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPrefeitoResponsavel)
                                .addComponent(txtAnoConcurso)
                                .addComponent(lblAnoConcurso)
                                .addComponent(cmbSituacaoConcurso, 0, 247, Short.MAX_VALUE)
                                .addComponent(cmbFkMatriculaResponsavelConcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoConcurso)
                    .addComponent(lblSituacaoConcurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSituacaoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroConcurso)
                    .addComponent(lblAnoConcurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanca)
                    .addComponent(lblPrefeitoResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFkCodigoBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFkMatriculaResponsavelConcurso))
                .addContainerGap())
        );

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Cadastrar Concurso");

        javax.swing.GroupLayout jtpPrincipalLayout = new javax.swing.GroupLayout(jtpPrincipal);
        jtpPrincipal.setLayout(jtpPrincipalLayout);
        jtpPrincipalLayout.setHorizontalGroup(
            jtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpPrincipalLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jtpPrincipalLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jtpPrincipalLayout.setVerticalGroup(
            jtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jtpCadastrarConcurso.addTab("Concurso", jtpPrincipal);

        lblCargoEmpregoCadCon.setText("Cargo/Emprego:");

        lblQuantidadeVagasCadCon.setText("Quantidade de Vagas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnCadastrarCadCon.setText("Cadastrar");
        btnCadastrarCadCon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarCadConActionPerformed(evt);
            }
        });

        btnRemoverCadCon.setText("Remover");
        btnRemoverCadCon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemoverCadConActionPerformed(evt);
            }
        });

        lblNumeroConcursoTelaCargoEmprego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumeroConcursoTelaCargoEmprego.setText("Nº ");

        lblCadastrarCargoEmprego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadastrarCargoEmprego.setText("CADASTRAR CARGO/EMPREGO");

        lblConcurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConcurso.setText("CONCURSO");

        lblbarra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblbarra.setText("/");

        lblAnoConcursoTelaCargoEmprego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAnoConcursoTelaCargoEmprego.setText("ANO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConcurso)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroConcursoTelaCargoEmprego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnoConcursoTelaCargoEmprego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrarCargoEmprego)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrarCargoEmprego)
                    .addComponent(lblNumeroConcursoTelaCargoEmprego)
                    .addComponent(lblConcurso)
                    .addComponent(lblbarra)
                    .addComponent(lblAnoConcursoTelaCargoEmprego))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCargoEmpregoCadCon)
                            .addComponent(cmbCargoEmpregoCadCon, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeVagasCadCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidadeVagasCadCon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrarCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoverCadCon)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCargoEmpregoCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCargoEmpregoCadCon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblQuantidadeVagasCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverCadCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidadeVagasCadCon)
                            .addComponent(btnCadastrarCadCon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(657, 657, 657))
        );

        jtpCadastrarConcurso.addTab("Cargo/Emprego", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpCadastrarConcurso)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpCadastrarConcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //se clicar nas abas da tela cadastrar concurso e alterar de um para outra e de outra para outra bloqueia os campos
    private void jtpCadastrarConcursoStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jtpCadastrarConcursoStateChanged
    {//GEN-HEADEREND:event_jtpCadastrarConcursoStateChanged
        desativarCampos();
    }//GEN-LAST:event_jtpCadastrarConcursoStateChanged

    private void cmbFkMatriculaResponsavelConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbFkMatriculaResponsavelConcursoActionPerformed
    {//GEN-HEADEREND:event_cmbFkMatriculaResponsavelConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFkMatriculaResponsavelConcursoActionPerformed

    private void cmbFkCodigoBancaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbFkCodigoBancaActionPerformed
    {//GEN-HEADEREND:event_cmbFkCodigoBancaActionPerformed

    }//GEN-LAST:event_cmbFkCodigoBancaActionPerformed

    private void txtCodigoConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCodigoConcursoActionPerformed
    {//GEN-HEADEREND:event_txtCodigoConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoConcursoActionPerformed

    private void cmbSituacaoConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbSituacaoConcursoActionPerformed
    {//GEN-HEADEREND:event_cmbSituacaoConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSituacaoConcursoActionPerformed

    private void btnRemoverCadConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemoverCadConActionPerformed
    {//GEN-HEADEREND:event_btnRemoverCadConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverCadConActionPerformed

    private void btnCadastrarCadConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarCadConActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarCadConActionPerformed
        //algoritmo        
        //puxar a informação do combobox e jogar para a tabela
    }//GEN-LAST:event_btnCadastrarCadConActionPerformed

    //metodo automatico onde eu passo qual é a chave primaria, tabela e atributo que eu quero puxar no combobox
    public ArrayList<Object> popularCMB(String informarNomeChavePrimaria, String informarTabela, String informarAtributo)
    {
        PopularCmbDAO pcd = new PopularCmbDAO();

        //popular nome das bancas
        return popularCMB = pcd.pesquisar(informarNomeChavePrimaria, informarTabela, informarAtributo);
    }

    public void popularCMBNomeBanca(String informarNomeChavePrimaria, String informarTabela, String informarAtributo)
    {

        //parei aqui, o problema é que quando eu crio um concurso o codigo da banca que vai é o ultimo do combobox. Ai eu estou tentando fazer com que o item selecionado no combobox seja cadastrado com seu respectivo codigo.
        for (Object obj : popularCMB(informarNomeChavePrimaria, informarTabela, informarAtributo))
        {
            //mostrar informações da listaObjeto para o combobox
            if (obj instanceof String)
            {
                cmbFkCodigoBanca.addItem((String) obj);
            }
            //aqui funciona assim, no combobox mostra qual é a banca mais aqui vai passar o codigo da banca para salvar no banco de dados
            if (obj instanceof Integer)
            {
                setFk_codigo_banca(obj.toString());
            }
        }
        contador = 1;
    }

    public void popularCMBNomeCargoEmprego(String informarNomeChavePrimaria, String informarTabela, String informarAtributo)
    {
        for (Object obj : popularCMB(informarNomeChavePrimaria, informarTabela, informarAtributo))
        {
            //mostrar informações da listaObjeto para o combobox
            if (obj instanceof String)
            {
                cmbCargoEmpregoCadCon.addItem((String) obj);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadCon;
    private javax.swing.JButton btnRemoverCadCon;
    private javax.swing.JComboBox<String> cmbCargoEmpregoCadCon;
    private javax.swing.JComboBox<String> cmbFkCodigoBanca;
    private javax.swing.JComboBox<String> cmbFkMatriculaResponsavelConcurso;
    private javax.swing.JComboBox<String> cmbSituacaoConcurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jtpCadastrarConcurso;
    private javax.swing.JPanel jtpPrincipal;
    private javax.swing.JLabel lblAnoConcurso;
    private javax.swing.JLabel lblAnoConcursoTelaCargoEmprego;
    private javax.swing.JLabel lblBanca;
    private javax.swing.JLabel lblCadastrarCargoEmprego;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblCargoEmpregoCadCon;
    private javax.swing.JLabel lblCodigoConcurso;
    private javax.swing.JLabel lblConcurso;
    private javax.swing.JLabel lblNumeroConcurso;
    private javax.swing.JLabel lblNumeroConcursoTelaCargoEmprego;
    private javax.swing.JLabel lblPrefeitoResponsavel;
    private javax.swing.JLabel lblQuantidadeVagasCadCon;
    private javax.swing.JLabel lblSituacaoConcurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbarra;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JTextField txtAnoConcurso;
    private javax.swing.JTextField txtCodigoConcurso;
    private javax.swing.JTextField txtNumeroConcurso;
    private javax.swing.JTextField txtQuantidadeVagasCadCon;
    // End of variables declaration//GEN-END:variables

}
