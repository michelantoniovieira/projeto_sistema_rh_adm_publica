/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DTO.PesquisarBancaDTO;
import DTO.PesquisarCargoEmpregoDTO;
import Modelo.CentralizarJanela;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmCadastrarCargoEmprego extends javax.swing.JInternalFrame
{

    private String codigoCargoEmprego;
    private String nomeCargoEmprego;
    private String regimeJuridico;
    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;
    private String referenciaSalarial = "";
    private ArrayList<PesquisarCargoEmpregoDTO> lista;
    private String itemSelecionadoNoComboBox = "";

    public frmCadastrarCargoEmprego()
    {
        initComponents();
    }

    public void gravarRegistro()
    {
        setCodigoCargoEmprego(txtCodigoCargoEmprego.getText());
        setNomeCargoEmprego(txtDescricaoCargoEmprego.getText());
        itemSelecionadoNoComboBox = cmbRegimeJuridico.getSelectedItem().toString();
        setRegimeJuridico(itemSelecionadoNoComboBox);
    }

    public void preencherLista(ArrayList<PesquisarCargoEmpregoDTO> lista, int index)
    {
        this.setLista(lista);
        setCodigoCargoEmprego(String.valueOf(getLista().get(index).getCodigoCargoEmprego()));
        setNomeCargoEmprego(String.valueOf(getLista().get(index).getDescricaoCargoEmprego()));
        setRegimeJuridico(String.valueOf(getLista().get(index).getRegimeJuridicoCargoEmprego()));
        setNumeroLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getNumeroLeiCriaCargoEmprego()));
        setDataLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getDataLeiCriaCargoEmprego()));
        setReferenciaSalarial(String.valueOf(getLista().get(index).getReferenciaSalarialCargoEmprego()));
        preencherCampos();
    }

    public void preencherCampos()
    {
        txtCodigoCargoEmprego.setText(getCodigoCargoEmprego());
        txtDescricaoCargoEmprego.setText(getNomeCargoEmprego());
        cmbRegimeJuridico.setSelectedItem(getRegimeJuridico());
    }

    //liberar os campos para edição
    public void ativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtDescricaoCargoEmprego.setEnabled(true);
        cmbRegimeJuridico.setEnabled(true);
    }

    //travar os campos para edição
    public void desativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtDescricaoCargoEmprego.setEnabled(false);
        cmbRegimeJuridico.setEnabled(false);
    }

    public void limparCampos()
    {
        //this.setCodigoConcurso("");
        txtCodigoCargoEmprego.setText("");
        this.setCodigoCargoEmprego("");
        txtDescricaoCargoEmprego.setText("");
        this.setNomeCargoEmprego("");
        cmbRegimeJuridico.setSelectedIndex(1);
        this.setRegimeJuridico("0");

    }

    public String getCodigoCargoEmprego()
    {
        return codigoCargoEmprego;
    }

    public String setCodigoCargoEmprego(String codigoCargoEmprego)
    {
        this.codigoCargoEmprego = codigoCargoEmprego;
        return null;
    }

    public String getNomeCargoEmprego()
    {
        return nomeCargoEmprego;
    }

    public void setNomeCargoEmprego(String nomeCargoEmprego)
    {
        this.nomeCargoEmprego = nomeCargoEmprego;
    }

    public String getRegimeJuridico()
    {
        return regimeJuridico;
    }

    public void setRegimeJuridico(String regimeJuridico)
    {
        this.regimeJuridico = regimeJuridico;
    }

    public String getNumeroLeiCriaCargoEmprego()
    {
        return numeroLeiCriaCargoEmprego;
    }

    public void setNumeroLeiCriaCargoEmprego(String numeroLeiCriaCargoEmprego)
    {
        this.numeroLeiCriaCargoEmprego = numeroLeiCriaCargoEmprego;
    }

    public String getDataLeiCriaCargoEmprego()
    {
        return dataLeiCriaCargoEmprego;
    }

    public void setDataLeiCriaCargoEmprego(String dataLeiCriaCargoEmprego)
    {
        this.dataLeiCriaCargoEmprego = dataLeiCriaCargoEmprego;
    }

    public ArrayList<PesquisarCargoEmpregoDTO> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<PesquisarCargoEmpregoDTO> lista)
    {
        this.lista = lista;
    }

    public String getReferenciaSalarial()
    {
        return referenciaSalarial;
    }

    public void setReferenciaSalarial(String referenciaSalarial)
    {
        this.referenciaSalarial = referenciaSalarial;
    }

    public String getItemSelecionadoNoComboBox()
    {
        return itemSelecionadoNoComboBox;
    }

    public void setItemSelecionadoNoComboBox(String itemSelecionadoNoComboBox)
    {
        this.itemSelecionadoNoComboBox = itemSelecionadoNoComboBox;
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

        jpCadastroCargoEmprego = new javax.swing.JPanel();
        jpCargoEmprego = new javax.swing.JPanel();
        txtDescricaoCargoEmprego = new javax.swing.JTextField();
        lblDescricaoCargoEmprego = new javax.swing.JLabel();
        txtCodigoCargoEmprego = new javax.swing.JTextField();
        lblCodigoCargoEmprego = new javax.swing.JLabel();
        lblRegimeJuridicoCargoEmprego = new javax.swing.JLabel();
        cmbRegimeJuridico = new javax.swing.JComboBox<>();
        lblCboCargoEmprego = new javax.swing.JLabel();
        txtCboCargoEmprego = new javax.swing.JTextField();
        chkAtivo = new javax.swing.JCheckBox();
        jpExigencias = new javax.swing.JPanel();
        cmbEscolaridade = new javax.swing.JComboBox<>();
        lblEscolaridade = new javax.swing.JLabel();
        jpCargaHoraria = new javax.swing.JPanel();
        lblSemanal = new javax.swing.JLabel();
        lblSemanal1 = new javax.swing.JLabel();
        cmbCargaHorariaSemanal = new javax.swing.JComboBox<>();
        cmbCargaHorariaMensal = new javax.swing.JComboBox<>();
        jpQuadro = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbQuadro = new javax.swing.JTable();
        jtpRemuneracao = new javax.swing.JTabbedPane();
        jpTabelaVencimentos = new javax.swing.JPanel();
        lblReferenciaSalarial = new javax.swing.JLabel();
        cmbReferenciaSalarial = new javax.swing.JComboBox<>();
        lblGrau = new javax.swing.JLabel();
        cmbGrau = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpEscalaVencimentosDocente = new javax.swing.JPanel();
        lblFaixa = new javax.swing.JLabel();
        cmbFaixaSalarial = new javax.swing.JComboBox<>();
        lblGrauProf = new javax.swing.JLabel();
        cmbGrauSalario = new javax.swing.JComboBox<>();
        lblRs = new javax.swing.JLabel();
        jpInsalubridade = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jpRequisitosDeProvimento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRequisitosProvimento = new javax.swing.JTextArea();
        jpCarreira = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtpLegislacao = new javax.swing.JTabbedPane();
        jpLegislacao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFundamentoCriacaoExclusao = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbFundamentoReajuste = new javax.swing.JTable();
        jpOperacoes = new javax.swing.JPanel();
        btnCadastrarFundamento = new javax.swing.JButton();
        btnAlterarFundamento = new javax.swing.JButton();
        btnExcluirFundamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manutenção de Cargos e Empregos");
        addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
                formAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        jpCadastroCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cargos e Empregos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jpCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo/Emprego", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblDescricaoCargoEmprego.setText("Descrição:");

        lblCodigoCargoEmprego.setText("Código:");

        lblRegimeJuridicoCargoEmprego.setText("Regime Jurídico:");

        cmbRegimeJuridico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTATUTÁRIO", "CELETISTA" }));

        lblCboCargoEmprego.setText("CBO:");

        chkAtivo.setSelected(true);
        chkAtivo.setText("Ativo");

        javax.swing.GroupLayout jpCargoEmpregoLayout = new javax.swing.GroupLayout(jpCargoEmprego);
        jpCargoEmprego.setLayout(jpCargoEmpregoLayout);
        jpCargoEmpregoLayout.setHorizontalGroup(
            jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoCargoEmprego)
                    .addComponent(txtCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoCargoEmprego))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCboCargoEmprego, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(lblCboCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegimeJuridicoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(cmbRegimeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAtivo)))
                .addContainerGap())
        );
        jpCargoEmpregoLayout.setVerticalGroup(
            jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRegimeJuridicoCargoEmprego)
                                .addComponent(lblCboCargoEmprego))
                            .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbRegimeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkAtivo))))
                        .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCboCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoCargoEmprego)
                        .addComponent(lblDescricaoCargoEmprego)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpExigencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exigências", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cmbEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENSINO FUNDAMENTAL INCOMPLETO", "ENSINO FUNDAMENTAL COMPLETO", "ENSINO MÉDIO COMPLETO", "ENSINO TÉCNICO COMPLETO", "ENSINO SUPERIOR COMPLETO", " " }));
        cmbEscolaridade.setSelectedIndex(4);

        lblEscolaridade.setText("Escolaridade:");

        javax.swing.GroupLayout jpExigenciasLayout = new javax.swing.GroupLayout(jpExigencias);
        jpExigencias.setLayout(jpExigenciasLayout);
        jpExigenciasLayout.setHorizontalGroup(
            jpExigenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExigenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpExigenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpExigenciasLayout.createSequentialGroup()
                        .addComponent(lblEscolaridade)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbEscolaridade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpExigenciasLayout.setVerticalGroup(
            jpExigenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExigenciasLayout.createSequentialGroup()
                .addComponent(lblEscolaridade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpCargaHoraria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carga Horária", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblSemanal.setText("Semanal:");

        lblSemanal1.setText("Mensal:");

        cmbCargaHorariaSemanal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10h", "20h", "30h", "40h", "44h", "12x36" }));
        cmbCargaHorariaSemanal.setSelectedIndex(4);

        cmbCargaHorariaMensal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50h", "100h", "150h", "200h", "220h", "240h" }));
        cmbCargaHorariaMensal.setSelectedIndex(4);

        javax.swing.GroupLayout jpCargaHorariaLayout = new javax.swing.GroupLayout(jpCargaHoraria);
        jpCargaHoraria.setLayout(jpCargaHorariaLayout);
        jpCargaHorariaLayout.setHorizontalGroup(
            jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargaHorariaLayout.createSequentialGroup()
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCargaHorariaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblSemanal1))
                    .addGroup(jpCargaHorariaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSemanal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbCargaHorariaSemanal, 0, 64, Short.MAX_VALUE)
                    .addComponent(cmbCargaHorariaMensal, 0, 1, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jpCargaHorariaLayout.setVerticalGroup(
            jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargaHorariaLayout.createSequentialGroup()
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemanal)
                    .addComponent(cmbCargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemanal1)
                    .addComponent(cmbCargaHorariaMensal))
                .addContainerGap())
        );

        jpQuadro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quadro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbQuadro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null}
            },
            new String []
            {
                "Vagas Criadas", "Vagas Providas", "Vagas Reservadas", "Vagas Disponiveis"
            }
        ));
        jScrollPane5.setViewportView(tbQuadro);

        javax.swing.GroupLayout jpQuadroLayout = new javax.swing.GroupLayout(jpQuadro);
        jpQuadro.setLayout(jpQuadroLayout);
        jpQuadroLayout.setHorizontalGroup(
            jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpQuadroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpQuadroLayout.setVerticalGroup(
            jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        jtpRemuneracao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remuneração", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblReferenciaSalarial.setText("Referência:");

        cmbReferenciaSalarial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "RME" }));

        lblGrau.setText("Grau:");

        cmbGrau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("R$:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("3.917,95");

        javax.swing.GroupLayout jpTabelaVencimentosLayout = new javax.swing.GroupLayout(jpTabelaVencimentos);
        jpTabelaVencimentos.setLayout(jpTabelaVencimentosLayout);
        jpTabelaVencimentosLayout.setHorizontalGroup(
            jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaVencimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReferenciaSalarial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbReferenciaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblGrau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbGrau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTabelaVencimentosLayout.setVerticalGroup(
            jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaVencimentosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrau)
                    .addComponent(cmbReferenciaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferenciaSalarial)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Tabela de Vencimentos", jpTabelaVencimentos);

        lblFaixa.setText("Faixa:");

        cmbFaixaSalarial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROF PEB I - COM GRADUAÇÃO", "PROF PEB I - COM ESPECIALIZAÇÃO", "PROF PEB I - COM MESTRADO", "PROF PEB I - COM DOUTORADO", "PROF PEB II - COM GRADUAÇÃO", "PROF PEB II - COM ESPECIALIZAÇÃO", "PROF PEB II - COM MESTRADO", "PROF PEB II - COM DOUTORADO", "PROF AUXILIAR - COM ENSINO MÉDIO", "PROF AUXILIAR - COM GRADUAÇÃO", "PROF AUXILIAR - COM PÓS GRADUAÇÃO" }));

        lblGrauProf.setText("Grau:");

        cmbGrauSalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADM", "A", "B", "C", "D", "E", "F" }));

        lblRs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRs.setText("R$:");

        javax.swing.GroupLayout jpEscalaVencimentosDocenteLayout = new javax.swing.GroupLayout(jpEscalaVencimentosDocente);
        jpEscalaVencimentosDocente.setLayout(jpEscalaVencimentosDocenteLayout);
        jpEscalaVencimentosDocenteLayout.setHorizontalGroup(
            jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblFaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFaixaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGrauProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGrauSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEscalaVencimentosDocenteLayout.setVerticalGroup(
            jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaixa)
                    .addComponent(cmbFaixaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrauProf)
                    .addComponent(cmbGrauSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Escala de Vencimentos - Docente", jpEscalaVencimentosDocente);

        jLabel2.setText("Grau:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Leve - 10%", "Médio - 20%", "Máximo - 40%" }));

        javax.swing.GroupLayout jpInsalubridadeLayout = new javax.swing.GroupLayout(jpInsalubridade);
        jpInsalubridade.setLayout(jpInsalubridadeLayout);
        jpInsalubridadeLayout.setHorizontalGroup(
            jpInsalubridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInsalubridadeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jpInsalubridadeLayout.setVerticalGroup(
            jpInsalubridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInsalubridadeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpInsalubridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Insalubridade", jpInsalubridade);

        jpRequisitosDeProvimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requisitos de Provimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtAreaRequisitosProvimento.setColumns(20);
        txtAreaRequisitosProvimento.setLineWrap(true);
        txtAreaRequisitosProvimento.setRows(5);
        jScrollPane1.setViewportView(txtAreaRequisitosProvimento);

        javax.swing.GroupLayout jpRequisitosDeProvimentoLayout = new javax.swing.GroupLayout(jpRequisitosDeProvimento);
        jpRequisitosDeProvimento.setLayout(jpRequisitosDeProvimentoLayout);
        jpRequisitosDeProvimentoLayout.setHorizontalGroup(
            jpRequisitosDeProvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRequisitosDeProvimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpRequisitosDeProvimentoLayout.setVerticalGroup(
            jpRequisitosDeProvimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRequisitosDeProvimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpCarreira.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carreira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Técnico", "Professor", "Eletivo", "Comissão", "Aposentado" }));

        jLabel1.setText("Tipo:");

        javax.swing.GroupLayout jpCarreiraLayout = new javax.swing.GroupLayout(jpCarreira);
        jpCarreira.setLayout(jpCarreiraLayout);
        jpCarreiraLayout.setHorizontalGroup(
            jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarreiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCarreiraLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpCarreiraLayout.setVerticalGroup(
            jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarreiraLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtpLegislacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Legislação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jpLegislacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbFundamentoCriacaoExclusao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbFundamentoCriacaoExclusao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Número", "Ano", "Data", "Ementa", "Ato", "Quantidade"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbFundamentoCriacaoExclusao);

        javax.swing.GroupLayout jpLegislacaoLayout = new javax.swing.GroupLayout(jpLegislacao);
        jpLegislacao.setLayout(jpLegislacaoLayout);
        jpLegislacaoLayout.setHorizontalGroup(
            jpLegislacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLegislacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpLegislacaoLayout.setVerticalGroup(
            jpLegislacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLegislacaoLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpLegislacao.addTab("Criação/Exclusão", jpLegislacao);

        tbFundamentoReajuste.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbFundamentoReajuste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Número", "Ano", "Data", "Ementa", "De ", "Para"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbFundamentoReajuste);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpLegislacao.addTab("Reajuste", jPanel3);

        jpOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnCadastrarFundamento.setText("Cadastrar");
        btnCadastrarFundamento.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarFundamentoActionPerformed(evt);
            }
        });

        btnAlterarFundamento.setText("Alterar");
        btnAlterarFundamento.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarFundamentoActionPerformed(evt);
            }
        });

        btnExcluirFundamento.setText("Excluir");
        btnExcluirFundamento.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirFundamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpOperacoesLayout = new javax.swing.GroupLayout(jpOperacoes);
        jpOperacoes.setLayout(jpOperacoesLayout);
        jpOperacoesLayout.setHorizontalGroup(
            jpOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOperacoesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jpOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirFundamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarFundamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarFundamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpOperacoesLayout.setVerticalGroup(
            jpOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCadastrarFundamento)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarFundamento)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirFundamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCadastroCargoEmpregoLayout = new javax.swing.GroupLayout(jpCadastroCargoEmprego);
        jpCadastroCargoEmprego.setLayout(jpCadastroCargoEmpregoLayout);
        jpCadastroCargoEmpregoLayout.setHorizontalGroup(
            jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpQuadro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jpCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCarreira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jtpLegislacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpRequisitosDeProvimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jpCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpExigencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtpRemuneracao, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jpCadastroCargoEmpregoLayout.setVerticalGroup(
            jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpCargaHoraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCarreira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCargoEmprego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpExigencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jpQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtpLegislacao)
                            .addComponent(jpOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jtpRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpRequisitosDeProvimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_formAncestorMoved
    {//GEN-HEADEREND:event_formAncestorMoved
        CentralizarJanela c = new CentralizarJanela();
        c.NaoUltrapassarLimites(this, frmPrincipal.jdkpPrincipal);

    }//GEN-LAST:event_formAncestorMoved

    private void btnCadastrarFundamentoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarFundamentoActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarFundamentoActionPerformed
        if (jtpLegislacao.getSelectedIndex() == 0)
        {

            frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), jtpLegislacao);
            frmCadastrarFundamento.setVisible(true);
            frmCadastrarFundamento.setLocationRelativeTo(null);
            frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }

        if (jtpLegislacao.getSelectedIndex() == 1)
        {
            frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), jtpLegislacao);
            frmCadastrarFundamento.setVisible(true);
            frmCadastrarFundamento.setLocationRelativeTo(null);
            frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_btnCadastrarFundamentoActionPerformed

    private void btnExcluirFundamentoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirFundamentoActionPerformed
    {//GEN-HEADEREND:event_btnExcluirFundamentoActionPerformed
        if (jtpLegislacao.getSelectedIndex() == 0)
        {
            DefaultTableModel model = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();

            int linhaSelecionada = tbFundamentoCriacaoExclusao.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                model.removeRow(linhaSelecionada);
            }
        }
        if (jtpLegislacao.getSelectedIndex() == 1)
        {
            DefaultTableModel model = (DefaultTableModel) tbFundamentoReajuste.getModel();

            int linhaSelecionada = tbFundamentoReajuste.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                model.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btnExcluirFundamentoActionPerformed

    private void btnAlterarFundamentoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarFundamentoActionPerformed
    {//GEN-HEADEREND:event_btnAlterarFundamentoActionPerformed
        if (jtpLegislacao.getSelectedIndex() == 0)
        {
            DefaultTableModel model = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();

            int linhaSelecionada = tbFundamentoCriacaoExclusao.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                // Obtenha os valores da linha selecionada
                Object numeroDaLei = model.getValueAt(linhaSelecionada, 0);
                Object anoDaLei = model.getValueAt(linhaSelecionada, 1);
                Object dataDaLei = model.getValueAt(linhaSelecionada, 2);
                Object ementaDaLei = model.getValueAt(linhaSelecionada, 3);
                Object atoDaLei = model.getValueAt(linhaSelecionada, 4);
                Object quantidadeDaLei = model.getValueAt(linhaSelecionada, 5);

                frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), numeroDaLei.toString(), anoDaLei.toString(), dataDaLei.toString(), ementaDaLei.toString(), atoDaLei.toString(), quantidadeDaLei.toString(), linhaSelecionada, jtpLegislacao);
                frmCadastrarFundamento.setVisible(true);
                frmCadastrarFundamento.setLocationRelativeTo(null);
                frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        }
        if (jtpLegislacao.getSelectedIndex() == 1)
        {
            DefaultTableModel model = (DefaultTableModel) tbFundamentoReajuste.getModel();

            int linhaSelecionada = tbFundamentoReajuste.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                // Obtenha os valores da linha selecionada
                Object numeroDaLei = model.getValueAt(linhaSelecionada, 0);
                Object anoDaLei = model.getValueAt(linhaSelecionada, 1);
                Object dataDaLei = model.getValueAt(linhaSelecionada, 2);
                Object ementaDaLei = model.getValueAt(linhaSelecionada, 3);
                Object de = model.getValueAt(linhaSelecionada, 4);
                Object para = model.getValueAt(linhaSelecionada, 5);

                frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), numeroDaLei.toString(), anoDaLei.toString(), dataDaLei.toString(), ementaDaLei.toString(), de.toString(), para.toString(), linhaSelecionada, jtpLegislacao, 0);
                frmCadastrarFundamento.setVisible(true);
                frmCadastrarFundamento.setLocationRelativeTo(null);
                frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_btnAlterarFundamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFundamento;
    private javax.swing.JButton btnCadastrarFundamento;
    private javax.swing.JButton btnExcluirFundamento;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JComboBox<String> cmbCargaHorariaMensal;
    private javax.swing.JComboBox<String> cmbCargaHorariaSemanal;
    private javax.swing.JComboBox<String> cmbEscolaridade;
    private javax.swing.JComboBox<String> cmbFaixaSalarial;
    private javax.swing.JComboBox<String> cmbGrau;
    private javax.swing.JComboBox<String> cmbGrauSalario;
    private javax.swing.JComboBox<String> cmbReferenciaSalarial;
    private javax.swing.JComboBox<String> cmbRegimeJuridico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel jpCadastroCargoEmprego;
    private javax.swing.JPanel jpCargaHoraria;
    private javax.swing.JPanel jpCargoEmprego;
    private javax.swing.JPanel jpCarreira;
    private javax.swing.JPanel jpEscalaVencimentosDocente;
    private javax.swing.JPanel jpExigencias;
    private javax.swing.JPanel jpInsalubridade;
    private javax.swing.JPanel jpLegislacao;
    private javax.swing.JPanel jpOperacoes;
    private javax.swing.JPanel jpQuadro;
    private javax.swing.JPanel jpRequisitosDeProvimento;
    private javax.swing.JPanel jpTabelaVencimentos;
    private javax.swing.JTabbedPane jtpLegislacao;
    private javax.swing.JTabbedPane jtpRemuneracao;
    private javax.swing.JLabel lblCboCargoEmprego;
    private javax.swing.JLabel lblCodigoCargoEmprego;
    private javax.swing.JLabel lblDescricaoCargoEmprego;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblFaixa;
    private javax.swing.JLabel lblGrau;
    private javax.swing.JLabel lblGrauProf;
    private javax.swing.JLabel lblReferenciaSalarial;
    private javax.swing.JLabel lblRegimeJuridicoCargoEmprego;
    private javax.swing.JLabel lblRs;
    private javax.swing.JLabel lblSemanal;
    private javax.swing.JLabel lblSemanal1;
    private javax.swing.JTable tbFundamentoCriacaoExclusao;
    private javax.swing.JTable tbFundamentoReajuste;
    private javax.swing.JTable tbQuadro;
    private javax.swing.JTextArea txtAreaRequisitosProvimento;
    private javax.swing.JTextField txtCboCargoEmprego;
    private javax.swing.JTextField txtCodigoCargoEmprego;
    private javax.swing.JTextField txtDescricaoCargoEmprego;
    // End of variables declaration//GEN-END:variables
}
