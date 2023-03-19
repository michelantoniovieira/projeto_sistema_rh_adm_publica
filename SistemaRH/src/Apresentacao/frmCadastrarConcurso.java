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

    private ArrayList<PesquisarConcursoDTO> lista;

    public frmCadastrarConcurso()
    {
        initComponents();
        contador = 0;
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
        jtpCargos = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();

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
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jtpPrincipalLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jtpPrincipalLayout.setVerticalGroup(
            jtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpCadastrarConcurso.addTab("Concurso", jtpPrincipal);
        jtpCadastrarConcurso.addTab("Cargos", jtpCargos);
        jtpCadastrarConcurso.addTab("tab3", jTabbedPane2);

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
                .addGap(15, 15, 15)
                .addComponent(jtpCadastrarConcurso, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
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
    //se clicar nas abas da tela cadastrar concurso e alterar de um para outra e de outra para outra bloqueia os campos
    private void jtpCadastrarConcursoStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jtpCadastrarConcursoStateChanged
    {//GEN-HEADEREND:event_jtpCadastrarConcursoStateChanged
        desativarCampos();
    }//GEN-LAST:event_jtpCadastrarConcursoStateChanged

    public void popularCMBs()
    {
        PopularCmbDAO pcd = new PopularCmbDAO();

        ArrayList<Object> popularCMB = new ArrayList<Object>();
        //popular nome das bancas

        popularCMB = pcd.pesquisar("codigo_banca", "banca", "nome_banca_organizadora");

        //parei aqui, o problema é que quando eu crio um concurso o codigo da banca que vai é o ultimo do combobox. Ai eu estou tentando fazer com que o item selecionado no combobox seja cadastrado com seu respectivo codigo.
        for (Object obj : popularCMB)
        {
            //mostrar informações da listaObjeto para o combobox
            if (obj instanceof String)
            {
                cmbFkCodigoBanca.addItem((String) obj);
            }
            //aqui funciona assim, no combobox mostra qual é a banca mais aqui vai passar o codigo da banca para salvar no banco de dados
            if (obj instanceof Integer)
            {
                // cmbFkCodigoBanca.addItem(obj.toString());
                setFk_codigo_banca(obj.toString());
            }
        }
        contador = 1;
        //LISTAR O NOME DOS PREFEITOS
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFkCodigoBanca;
    private javax.swing.JComboBox<String> cmbFkMatriculaResponsavelConcurso;
    private javax.swing.JComboBox<String> cmbSituacaoConcurso;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jtpCadastrarConcurso;
    private javax.swing.JTabbedPane jtpCargos;
    private javax.swing.JPanel jtpPrincipal;
    private javax.swing.JLabel lblAnoConcurso;
    private javax.swing.JLabel lblBanca;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblCodigoConcurso;
    private javax.swing.JLabel lblNumeroConcurso;
    private javax.swing.JLabel lblPrefeitoResponsavel;
    private javax.swing.JLabel lblSituacaoConcurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JTextField txtAnoConcurso;
    private javax.swing.JTextField txtCodigoConcurso;
    private javax.swing.JTextField txtNumeroConcurso;
    // End of variables declaration//GEN-END:variables
}
