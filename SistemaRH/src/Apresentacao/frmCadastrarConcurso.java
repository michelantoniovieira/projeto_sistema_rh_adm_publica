/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DAO.PopularCmbDAO;
import DAO.PopularTabela;
import DTO.PesquisarConcursoDTO;
import Modelo.CadastrarConcursoControle;
import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public final class frmCadastrarConcurso extends javax.swing.JInternalFrame
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
        popularComboBoxNomeBanca("banca", "codigo_banca", "nome_banca_organizadora");
        popularComboBoxNomeCargoEmprego("cargo_emprego", "codigo_cargo_emprego", "descricao_cargo_emprego");
    }

    public void popularComboBoxNomeBanca(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        CadastrarConcursoControle cadastrarConcursoControle = new CadastrarConcursoControle(informarTabela, informarNomeChavePrimaria, informarAtributo);
        for (String nome : cadastrarConcursoControle.getInformarAtributoString())
        {
            cmbFkCodigoBanca.addItem(nome);
        }
        //essa variavel esta aqui para não ficar duplicando as informações no combobox
        //quando fechar a janela e abri-la de novo o contador fica 0 e carrega as informações no combobox
        contador = 1;
    }

    public void popularComboBoxNomeCargoEmprego(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        CadastrarConcursoControle cadastrarConcursoControle = new CadastrarConcursoControle(informarTabela, informarNomeChavePrimaria, informarAtributo);
        for (String nome : cadastrarConcursoControle.getInformarAtributoString())
        {
            cmbCargoEmpregoCadCon.addItem(nome);
        }
        //essa variavel esta aqui para não ficar duplicando as informações no combobox
        //quando fechar a janela e abri-la de novo o contador fica 0 e carrega as informações no combobox
        contador = 1;
    }

    public void popularTabelaCadastroCargoEmprego(String codigoConcurso)
    {
        CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(codigoConcurso));
        controle.atualizar(codigoConcurso);

        DefaultTableModel model = (DefaultTableModel) tabelaCadastroCargosEmpregos.getModel();

        for (Object linha : controle.getListaObjetosRetornadosDoBancoDeDados())
        {
            model.addRow((Object[]) linha);
        }

    }

    public void ativarBotaoCadastrarRemover()
    {
        jtpCadastrarConcurso.setSelectedIndex(1);
        //ativar botões ao carregar informações na janela
        int linhasNaTabela = tabelaCadastroCargosEmpregos.getModel().getRowCount();
        System.out.println(linhasNaTabela);
        if (linhasNaTabela > 0)
        {
            btnCadastrarCadCon.setEnabled(true);
            btnRemoverCadCon.setEnabled(true);
        } else
        {
            btnCadastrarCadCon.setEnabled(true);
            btnRemoverCadCon.setEnabled(false);
        }

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

        //janel cargo/emprego
        cmbCargoEmpregoCadCon.setSelectedIndex(0);
        cmbQuantidadeVagasCadCon.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) tabelaCadastroCargosEmpregos.getModel();
        model.setRowCount(0);
    }

    public void carregarLabels()
    {
        //tela cadastrar cargo/emprego
        lblNumeroConcursoTelaCargoEmprego.setText(txtNumeroConcurso.getText());
        lblAnoConcursoTelaCargoEmprego.setText(txtAnoConcurso.getText());
        lblBancaConcurso.setText(cmbFkCodigoBanca.getSelectedItem().toString().toUpperCase());
        
        //tela cadastrar homologações cargo/emprego
        lblNumeroConcursoTelaCargoEmprego2.setText(txtNumeroConcurso.getText());
        lblAnoConcursoTelaCargoEmprego2.setText(txtAnoConcurso.getText());
        lblBancaConcurso2.setText(cmbFkCodigoBanca.getSelectedItem().toString().toUpperCase());
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
        jpCadastrarConcurso = new javax.swing.JPanel();
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
        jpCadastrarCargoEmprego = new javax.swing.JPanel();
        lblCargoEmpregoCadCon = new javax.swing.JLabel();
        lblQuantidadeVagasCadCon = new javax.swing.JLabel();
        cmbCargoEmpregoCadCon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroCargosEmpregos = new javax.swing.JTable();
        btnCadastrarCadCon = new javax.swing.JButton();
        btnRemoverCadCon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroConcursoTelaCargoEmprego = new javax.swing.JLabel();
        lblConcurso = new javax.swing.JLabel();
        lblbarra = new javax.swing.JLabel();
        lblAnoConcursoTelaCargoEmprego = new javax.swing.JLabel();
        lblBancaConcurso = new javax.swing.JLabel();
        cmbQuantidadeVagasCadCon = new javax.swing.JComboBox<>();
        jpCadastrarHomologacao = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblNumeroConcursoTelaCargoEmprego2 = new javax.swing.JLabel();
        lblConcurso2 = new javax.swing.JLabel();
        lblbarra2 = new javax.swing.JLabel();
        lblAnoConcursoTelaCargoEmprego2 = new javax.swing.JLabel();
        lblBancaConcurso2 = new javax.swing.JLabel();

        lblCadastrarConcurso.setText("label1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Concurso");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });

        jtpCadastrarConcurso.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jtpCadastrarConcursoStateChanged(evt);
            }
        });

        lblNumeroConcurso.setText("Nº Concurso:");

        lblAnoConcurso.setText("Ano Concurso:");

        lblCodigoConcurso.setText("Código Concurso:");

        cmbFkCodigoBanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lblBanca.setText("Banca:");

        lblPrefeitoResponsavel.setText("Responsável/Prefeito");

        cmbSituacaoConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Em andamento", "Homologado", "Cancelado" }));

        cmbFkMatriculaResponsavelConcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

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

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("CADASTRAR CONCURSO");

        javax.swing.GroupLayout jpCadastrarConcursoLayout = new javax.swing.GroupLayout(jpCadastrarConcurso);
        jpCadastrarConcurso.setLayout(jpCadastrarConcursoLayout);
        jpCadastrarConcursoLayout.setHorizontalGroup(
            jpCadastrarConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarConcursoLayout.createSequentialGroup()
                .addGroup(jpCadastrarConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarConcursoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadastrarConcursoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblTitulo)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jpCadastrarConcursoLayout.setVerticalGroup(
            jpCadastrarConcursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarConcursoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jtpCadastrarConcurso.addTab("Cadastrar Concurso", jpCadastrarConcurso);

        lblCargoEmpregoCadCon.setText("Cargo/Emprego:");

        lblQuantidadeVagasCadCon.setText("Quantidade de Vagas");

        tabelaCadastroCargosEmpregos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Cargo/Emprego", "Quantidade de Vagas"
            }
        ));
        jScrollPane1.setViewportView(tabelaCadastroCargosEmpregos);

        btnCadastrarCadCon.setText("Cadastrar");
        btnCadastrarCadCon.setEnabled(false);
        btnCadastrarCadCon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarCadConActionPerformed(evt);
            }
        });

        btnRemoverCadCon.setText("Remover");
        btnRemoverCadCon.setEnabled(false);
        btnRemoverCadCon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemoverCadConActionPerformed(evt);
            }
        });

        lblNumeroConcursoTelaCargoEmprego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumeroConcursoTelaCargoEmprego.setText("Nº ");

        lblConcurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConcurso.setText("CONCURSO:");

        lblbarra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblbarra.setText("/");

        lblAnoConcursoTelaCargoEmprego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAnoConcursoTelaCargoEmprego.setText("ANO");

        lblBancaConcurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBancaConcurso.setText("BANCA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblBancaConcurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConcurso)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroConcursoTelaCargoEmprego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnoConcursoTelaCargoEmprego)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBancaConcurso)
                    .addComponent(lblConcurso)
                    .addComponent(lblNumeroConcursoTelaCargoEmprego)
                    .addComponent(lblbarra)
                    .addComponent(lblAnoConcursoTelaCargoEmprego))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        cmbQuantidadeVagasCadCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CR", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jpCadastrarCargoEmpregoLayout = new javax.swing.GroupLayout(jpCadastrarCargoEmprego);
        jpCadastrarCargoEmprego.setLayout(jpCadastrarCargoEmpregoLayout);
        jpCadastrarCargoEmpregoLayout.setHorizontalGroup(
            jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCargoEmpregoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarCargoEmpregoLayout.createSequentialGroup()
                        .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCargoEmpregoCadCon)
                            .addComponent(cmbCargoEmpregoCadCon, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeVagasCadCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbQuantidadeVagasCadCon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrarCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoverCadCon)))
                .addGap(18, 18, 18))
        );
        jpCadastrarCargoEmpregoLayout.setVerticalGroup(
            jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCargoEmpregoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(lblCargoEmpregoCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCargoEmpregoCadCon)
                            .addComponent(cmbQuantidadeVagasCadCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpCadastrarCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(lblQuantidadeVagasCadCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadastrarCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverCadCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarCadCon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(635, 635, 635))
        );

        jtpCadastrarConcurso.addTab("Cadastrar Cargo/Emprego", jpCadastrarCargoEmprego);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String []
            {
                "Cargo/Emprego", "Cadastrar data da Homologação"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        lblNumeroConcursoTelaCargoEmprego2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumeroConcursoTelaCargoEmprego2.setText("Nº ");

        lblConcurso2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConcurso2.setText("CONCURSO:");

        lblbarra2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblbarra2.setText("/");

        lblAnoConcursoTelaCargoEmprego2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAnoConcursoTelaCargoEmprego2.setText("ANO");

        lblBancaConcurso2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBancaConcurso2.setText("BANCA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblBancaConcurso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConcurso2)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroConcursoTelaCargoEmprego2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbarra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnoConcursoTelaCargoEmprego2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBancaConcurso2)
                    .addComponent(lblConcurso2)
                    .addComponent(lblNumeroConcursoTelaCargoEmprego2)
                    .addComponent(lblbarra2)
                    .addComponent(lblAnoConcursoTelaCargoEmprego2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCadastrarHomologacaoLayout = new javax.swing.GroupLayout(jpCadastrarHomologacao);
        jpCadastrarHomologacao.setLayout(jpCadastrarHomologacaoLayout);
        jpCadastrarHomologacaoLayout.setHorizontalGroup(
            jpCadastrarHomologacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarHomologacaoLayout.createSequentialGroup()
                .addGroup(jpCadastrarHomologacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarHomologacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                    .addGroup(jpCadastrarHomologacaoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCadastrarHomologacaoLayout.setVerticalGroup(
            jpCadastrarHomologacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarHomologacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpCadastrarConcurso.addTab("Cadastrar Homologação", jpCadastrarHomologacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpCadastrarConcurso)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpCadastrarConcurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //se clicar nas abas da tela cadastrar concurso e alterar de um para outra e de outra para outra bloqueia os campos
    private void jtpCadastrarConcursoStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jtpCadastrarConcursoStateChanged
    {//GEN-HEADEREND:event_jtpCadastrarConcursoStateChanged
        desativarCampos();
    }//GEN-LAST:event_jtpCadastrarConcursoStateChanged

    private void btnCadastrarCadConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarCadConActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarCadConActionPerformed
        int colunaDesejada = 0;
        boolean encontrouValorIgual = false;
        DefaultTableModel model = (DefaultTableModel) tabelaCadastroCargosEmpregos.getModel();
        CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(txtCodigoConcurso.getText()), cmbCargoEmpregoCadCon.getSelectedItem().toString(), cmbQuantidadeVagasCadCon.getSelectedItem().toString());
        //atualizações na tabela
        for (int i = 0; i < model.getRowCount(); i++)
        { // percorre todas as linhas da tabela
            Object valorCelula = model.getValueAt(i, colunaDesejada); // obtém o valor da célula da coluna desejada na linha atual
            if (valorCelula != null && valorCelula.equals(controle.getCargoEmpregoSelecionado()))
            {
                encontrouValorIgual = true;
                // faça algo aqui, se quiser
                //atualiza a quantidade de emprego 
                model.setValueAt(cmbQuantidadeVagasCadCon.getSelectedItem(), i, 1);
                break; // encerra o loop, pois já encontrou um valor igual
            }
        }
        if (encontrouValorIgual)
        {
            // pelo menos uma célula na coluna desejada é igual a controle.getCargoEmpregoSelecionado()
            System.out.println("não pode repetir informacao");
            CadastrarConcursoControle controleAlterar = new CadastrarConcursoControle(Integer.parseInt(txtCodigoConcurso.getText()), cmbCargoEmpregoCadCon.getSelectedItem().toString(), cmbQuantidadeVagasCadCon.getSelectedItem().toString(), "alteracao");
        } else
        {
            CadastrarConcursoControle controleInclusao = new CadastrarConcursoControle(Integer.parseInt(txtCodigoConcurso.getText()), cmbCargoEmpregoCadCon.getSelectedItem().toString(), cmbQuantidadeVagasCadCon.getSelectedItem().toString(), "inclusao");
            model.addRow(new Object[]
            {
                //aqui passa as informações para a coluna
                controle.getCargoEmpregoSelecionado(), cmbQuantidadeVagasCadCon.getSelectedItem()
            });
        }
        ativarBotaoCadastrarRemover();
    }//GEN-LAST:event_btnCadastrarCadConActionPerformed

    private void btnRemoverCadConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemoverCadConActionPerformed
    {//GEN-HEADEREND:event_btnRemoverCadConActionPerformed
        int selectedRow = tabelaCadastroCargosEmpregos.getSelectedRow();
        if (selectedRow != -1)
        { // se alguma linha foi selecionada
            DefaultTableModel model = (DefaultTableModel) tabelaCadastroCargosEmpregos.getModel();

            //pegar o nome do cargo que esta com a linha selecionada no jtable
            int columnIndex = model.findColumn("Cargo/Emprego");
            Object cargoEmpregoSelecionado = model.getValueAt(selectedRow, columnIndex);
            System.out.println(cargoEmpregoSelecionado);
            CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(txtCodigoConcurso.getText()), cargoEmpregoSelecionado.toString(), cmbQuantidadeVagasCadCon.getSelectedItem().toString(), "exclusao");

            //excluir da tabela e redesenhar a tabela
            model.removeRow(selectedRow);
            tabelaCadastroCargosEmpregos.repaint();
            ativarBotaoCadastrarRemover();
        }
    }//GEN-LAST:event_btnRemoverCadConActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosed
    {//GEN-HEADEREND:event_formInternalFrameClosed
        limparCampos();
        //ao fechar o jinternal frame seleciona o primeiro jtabbedpane
        jtpCadastrarConcurso.setSelectedIndex(0);
        btnCadastrarCadCon.setEnabled(false);
        btnRemoverCadCon.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadCon;
    private javax.swing.JButton btnRemoverCadCon;
    private javax.swing.JComboBox<String> cmbCargoEmpregoCadCon;
    private javax.swing.JComboBox<String> cmbFkCodigoBanca;
    private javax.swing.JComboBox<String> cmbFkMatriculaResponsavelConcurso;
    private javax.swing.JComboBox<String> cmbQuantidadeVagasCadCon;
    private javax.swing.JComboBox<String> cmbSituacaoConcurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpCadastrarCargoEmprego;
    private javax.swing.JPanel jpCadastrarConcurso;
    private javax.swing.JPanel jpCadastrarHomologacao;
    private javax.swing.JTabbedPane jtpCadastrarConcurso;
    private javax.swing.JLabel lblAnoConcurso;
    private javax.swing.JLabel lblAnoConcursoTelaCargoEmprego;
    private javax.swing.JLabel lblAnoConcursoTelaCargoEmprego1;
    private javax.swing.JLabel lblAnoConcursoTelaCargoEmprego2;
    private javax.swing.JLabel lblBanca;
    private javax.swing.JLabel lblBancaConcurso;
    private javax.swing.JLabel lblBancaConcurso1;
    private javax.swing.JLabel lblBancaConcurso2;
    private java.awt.Label lblCadastrarConcurso;
    private javax.swing.JLabel lblCargoEmpregoCadCon;
    private javax.swing.JLabel lblCodigoConcurso;
    private javax.swing.JLabel lblConcurso;
    private javax.swing.JLabel lblConcurso1;
    private javax.swing.JLabel lblConcurso2;
    private javax.swing.JLabel lblNumeroConcurso;
    private javax.swing.JLabel lblNumeroConcursoTelaCargoEmprego;
    private javax.swing.JLabel lblNumeroConcursoTelaCargoEmprego1;
    private javax.swing.JLabel lblNumeroConcursoTelaCargoEmprego2;
    private javax.swing.JLabel lblPrefeitoResponsavel;
    private javax.swing.JLabel lblQuantidadeVagasCadCon;
    private javax.swing.JLabel lblSituacaoConcurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbarra;
    private javax.swing.JLabel lblbarra1;
    private javax.swing.JLabel lblbarra2;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JTable tabelaCadastroCargosEmpregos;
    private javax.swing.JTextField txtAnoConcurso;
    private javax.swing.JTextField txtCodigoConcurso;
    private javax.swing.JTextField txtNumeroConcurso;
    // End of variables declaration//GEN-END:variables

}
