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
        setNumeroLeiCriaCargoEmprego(txtNumeroLeiCriaCargoEmprego.getText());
        setDataLeiCriaCargoEmprego(txtDataLeiCriacaoCargoEmprego.getText());
        setReferenciaSalarial(txtReferenciaSalarialCargoEmprego.getText());
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
        txtNumeroLeiCriaCargoEmprego.setText(getNumeroLeiCriaCargoEmprego());
        txtDataLeiCriacaoCargoEmprego.setText(getDataLeiCriaCargoEmprego());
        txtReferenciaSalarialCargoEmprego.setText(getReferenciaSalarial());
    }

    //liberar os campos para edição
    public void ativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtDescricaoCargoEmprego.setEnabled(true);
        cmbRegimeJuridico.setEnabled(true);
        txtNumeroLeiCriaCargoEmprego.setEnabled(true);
        txtDataLeiCriacaoCargoEmprego.setEnabled(true);
        txtReferenciaSalarialCargoEmprego.setEnabled(true);
    }

    //travar os campos para edição
    public void desativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtDescricaoCargoEmprego.setEnabled(false);
        cmbRegimeJuridico.setEnabled(false);
        txtNumeroLeiCriaCargoEmprego.setEnabled(false);
        txtDataLeiCriacaoCargoEmprego.setEnabled(false);
        txtReferenciaSalarialCargoEmprego.setEnabled(false);
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
        txtNumeroLeiCriaCargoEmprego.setText("");
        this.setNumeroLeiCriaCargoEmprego("");
        txtDataLeiCriacaoCargoEmprego.setText("");
        this.setDataLeiCriaCargoEmprego("");
        txtReferenciaSalarialCargoEmprego.setText("");
        this.setReferenciaSalarial("");

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
        chkProfessor = new javax.swing.JCheckBox();
        txtCboCargoEmprego = new javax.swing.JTextField();
        chkProfessor1 = new javax.swing.JCheckBox();
        jpExigencias = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblEscolaridade = new javax.swing.JLabel();
        jpCargaHoraria = new javax.swing.JPanel();
        lblSemanal = new javax.swing.JLabel();
        lblSemanal1 = new javax.swing.JLabel();
        cmbCargaHorariaSemanal = new javax.swing.JComboBox<>();
        cmbCargaHorariaMensal = new javax.swing.JComboBox<>();
        jpQuadro = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtpRemuneracao = new javax.swing.JTabbedPane();
        jpTabelaVencimentos = new javax.swing.JPanel();
        lblReferenciaSalarial = new javax.swing.JLabel();
        cmbReferenciaSalarial = new javax.swing.JComboBox<>();
        lblGrau = new javax.swing.JLabel();
        cmbGrau = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFaixa = new javax.swing.JLabel();
        cmbFaixa = new javax.swing.JComboBox<>();
        lblGrauProf = new javax.swing.JLabel();
        cmbGrauProf = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtpLegislacao = new javax.swing.JTabbedPane();
        jpLegislacaoCriacaoCargoEmprego = new javax.swing.JPanel();
        txtNumeroLeiCriaCargoEmprego = new javax.swing.JTextField();
        lblNumeroLeiCriaCargoEmprego = new javax.swing.JLabel();
        lblLeiCriacaoCargoEmprego = new javax.swing.JLabel();
        txtDataLeiCriacaoCargoEmprego = new javax.swing.JFormattedTextField();
        lblEmentaCriacao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAEmentaCriacao = new javax.swing.JTextArea();
        jpExtincaoCargoEmprego = new javax.swing.JPanel();
        txtNumeroLeiExtingueCargoEmprego = new javax.swing.JTextField();
        lblNumeroLeiExtingueCargoEmprego = new javax.swing.JLabel();
        lblLeiExtingueCargoEmprego = new javax.swing.JLabel();
        txtDataLeiExtingueCargoEmprego = new javax.swing.JFormattedTextField();
        lblEmentaExtincao = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAEmentaExtincao = new javax.swing.JTextArea();
        jpRequisitosDeProvimento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRequisitosProvimento = new javax.swing.JTextArea();

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

        chkProfessor.setText("Professor");

        chkProfessor1.setText("Ativo");

        javax.swing.GroupLayout jpCargoEmpregoLayout = new javax.swing.GroupLayout(jpCargoEmprego);
        jpCargoEmprego.setLayout(jpCargoEmpregoLayout);
        jpCargoEmpregoLayout.setHorizontalGroup(
            jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCargoEmpregoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCboCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCboCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegimeJuridicoCargoEmprego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRegimeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkProfessor1)
                    .addComponent(chkProfessor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCargoEmpregoLayout.setVerticalGroup(
            jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoCargoEmprego)
                    .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRegimeJuridicoCargoEmprego)
                        .addComponent(chkProfessor1))
                    .addComponent(lblDescricaoCargoEmprego)
                    .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCboCargoEmprego)
                            .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtCboCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpCargoEmpregoLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbRegimeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkProfessor))
                                .addGroup(jpCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDescricaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpExigencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exigências", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENSINO FUNDAMENTAL INCOMPLETO", "ENSINO FUNDAMENTAL COMPLETO", "ENSINO MÉDIO COMPLETO", "ENSINO TÉCNICO COMPLETO", "ENSINO SUPERIOR COMPLETO", " " }));
        jComboBox1.setSelectedIndex(4);

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
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpExigenciasLayout.setVerticalGroup(
            jpExigenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExigenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscolaridade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addGap(15, 15, 15)
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemanal1)
                    .addComponent(lblSemanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbCargaHorariaSemanal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCargaHorariaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jpCargaHorariaLayout.setVerticalGroup(
            jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargaHorariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemanal)
                    .addComponent(cmbCargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemanal1)
                    .addComponent(cmbCargaHorariaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpQuadro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quadro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

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
                "Vagas Criadas", "Vagas Providas", "Vagas Reservadas", "Vagas Disponiveis"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jpQuadroLayout = new javax.swing.GroupLayout(jpQuadro);
        jpQuadro.setLayout(jpQuadroLayout);
        jpQuadroLayout.setHorizontalGroup(
            jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuadroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jpQuadroLayout.setVerticalGroup(
            jpQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuadroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(14, 14, 14)
                .addComponent(lblReferenciaSalarial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbReferenciaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(46, 46, 46))
        );
        jpTabelaVencimentosLayout.setVerticalGroup(
            jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaVencimentosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGrau)
                        .addComponent(cmbGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReferenciaSalarial)
                        .addComponent(cmbReferenciaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Tabela de Vencimentos", jpTabelaVencimentos);

        lblFaixa.setText("Faixa:");

        cmbFaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROF PEB I - COM GRADUAÇÃO", "PROF PEB I - COM ESPECIALIZAÇÃO", "PROF PEB I - COM MESTRADO", "PROF PEB I - COM DOUTORADO", "PROF PEB II - COM GRADUAÇÃO", "PROF PEB II - COM ESPECIALIZAÇÃO", "PROF PEB II - COM MESTRADO", "PROF PEB II - COM DOUTORADO", "PROF AUXILIAR - COM ENSINO MÉDIO", "PROF AUXILIAR - COM GRADUAÇÃO", "PROF AUXILIAR - COM PÓS GRADUAÇÃO" }));

        lblGrauProf.setText("Grau:");

        cmbGrauProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADM", "A", "B", "C", "D", "E", "F" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("R$:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("3.917,95");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblFaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrauProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGrauProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGrauProf)
                        .addComponent(cmbGrauProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFaixa)
                        .addComponent(cmbFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Escala de Vencimentos - Docente", jPanel2);

        jtpLegislacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Legislação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jpLegislacaoCriacaoCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNumeroLeiCriaCargoEmprego.setText("Número da Lei:");

        lblLeiCriacaoCargoEmprego.setText("Data da Lei:");

        try
        {
            txtDataLeiCriacaoCargoEmprego.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        lblEmentaCriacao.setText("Ementa Criação:");

        txtAEmentaCriacao.setColumns(20);
        txtAEmentaCriacao.setLineWrap(true);
        txtAEmentaCriacao.setRows(5);
        jScrollPane3.setViewportView(txtAEmentaCriacao);

        javax.swing.GroupLayout jpLegislacaoCriacaoCargoEmpregoLayout = new javax.swing.GroupLayout(jpLegislacaoCriacaoCargoEmprego);
        jpLegislacaoCriacaoCargoEmprego.setLayout(jpLegislacaoCriacaoCargoEmpregoLayout);
        jpLegislacaoCriacaoCargoEmpregoLayout.setHorizontalGroup(
            jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroLeiCriaCargoEmprego)
                    .addComponent(txtNumeroLeiCriaCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLeiCriacaoCargoEmprego)
                    .addComponent(txtDataLeiCriacaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmentaCriacao)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jpLegislacaoCriacaoCargoEmpregoLayout.setVerticalGroup(
            jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroLeiCriaCargoEmprego)
                    .addComponent(lblLeiCriacaoCargoEmprego)
                    .addComponent(lblEmentaCriacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLegislacaoCriacaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroLeiCriaCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataLeiCriacaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jtpLegislacao.addTab("Criação", jpLegislacaoCriacaoCargoEmprego);

        jpExtincaoCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNumeroLeiExtingueCargoEmprego.setText("Número da Lei:");

        lblLeiExtingueCargoEmprego.setText("Data da Lei:");

        try
        {
            txtDataLeiExtingueCargoEmprego.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        lblEmentaExtincao.setText("Ementa Extinção:");

        txtAEmentaExtincao.setColumns(20);
        txtAEmentaExtincao.setLineWrap(true);
        txtAEmentaExtincao.setRows(5);
        jScrollPane5.setViewportView(txtAEmentaExtincao);

        javax.swing.GroupLayout jpExtincaoCargoEmpregoLayout = new javax.swing.GroupLayout(jpExtincaoCargoEmprego);
        jpExtincaoCargoEmprego.setLayout(jpExtincaoCargoEmpregoLayout);
        jpExtincaoCargoEmpregoLayout.setHorizontalGroup(
            jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtincaoCargoEmpregoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroLeiExtingueCargoEmprego)
                    .addComponent(txtNumeroLeiExtingueCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLeiExtingueCargoEmprego)
                    .addComponent(txtDataLeiExtingueCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmentaExtincao)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jpExtincaoCargoEmpregoLayout.setVerticalGroup(
            jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtincaoCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroLeiExtingueCargoEmprego)
                    .addComponent(lblLeiExtingueCargoEmprego)
                    .addComponent(lblEmentaExtincao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpExtincaoCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroLeiExtingueCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataLeiExtingueCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jtpLegislacao.addTab("Extinção", jpExtincaoCargoEmprego);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpCadastroCargoEmpregoLayout = new javax.swing.GroupLayout(jpCadastroCargoEmprego);
        jpCadastroCargoEmprego.setLayout(jpCadastroCargoEmpregoLayout);
        jpCadastroCargoEmpregoLayout.setHorizontalGroup(
            jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtpLegislacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCargoEmprego, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRequisitosDeProvimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtpRemuneracao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jpCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpExigencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpQuadro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpCadastroCargoEmpregoLayout.setVerticalGroup(
            jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpCargoEmprego, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpExigencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jtpLegislacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpRequisitosDeProvimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jtpRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_formAncestorMoved
    {//GEN-HEADEREND:event_formAncestorMoved
        CentralizarJanela c = new CentralizarJanela();
        c.NaoUltrapassarLimites(this);

    }//GEN-LAST:event_formAncestorMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkProfessor;
    private javax.swing.JCheckBox chkProfessor1;
    private javax.swing.JComboBox<String> cmbCargaHorariaMensal;
    private javax.swing.JComboBox<String> cmbCargaHorariaSemanal;
    private javax.swing.JComboBox<String> cmbFaixa;
    private javax.swing.JComboBox<String> cmbGrau;
    private javax.swing.JComboBox<String> cmbGrauProf;
    private javax.swing.JComboBox<String> cmbReferenciaSalarial;
    private javax.swing.JComboBox<String> cmbRegimeJuridico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpCadastroCargoEmprego;
    private javax.swing.JPanel jpCargaHoraria;
    private javax.swing.JPanel jpCargoEmprego;
    private javax.swing.JPanel jpExigencias;
    private javax.swing.JPanel jpExtincaoCargoEmprego;
    private javax.swing.JPanel jpLegislacaoCriacaoCargoEmprego;
    private javax.swing.JPanel jpQuadro;
    private javax.swing.JPanel jpRequisitosDeProvimento;
    private javax.swing.JPanel jpTabelaVencimentos;
    private javax.swing.JTabbedPane jtpLegislacao;
    private javax.swing.JTabbedPane jtpRemuneracao;
    private javax.swing.JLabel lblCboCargoEmprego;
    private javax.swing.JLabel lblCodigoCargoEmprego;
    private javax.swing.JLabel lblDescricaoCargoEmprego;
    private javax.swing.JLabel lblEmentaCriacao;
    private javax.swing.JLabel lblEmentaExtincao;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblFaixa;
    private javax.swing.JLabel lblGrau;
    private javax.swing.JLabel lblGrauProf;
    private javax.swing.JLabel lblLeiCriacaoCargoEmprego;
    private javax.swing.JLabel lblLeiExtingueCargoEmprego;
    private javax.swing.JLabel lblNumeroLeiCriaCargoEmprego;
    private javax.swing.JLabel lblNumeroLeiExtingueCargoEmprego;
    private javax.swing.JLabel lblReferenciaSalarial;
    private javax.swing.JLabel lblRegimeJuridicoCargoEmprego;
    private javax.swing.JLabel lblSemanal;
    private javax.swing.JLabel lblSemanal1;
    private javax.swing.JTextArea txtAEmentaCriacao;
    private javax.swing.JTextArea txtAEmentaExtincao;
    private javax.swing.JTextArea txtAreaRequisitosProvimento;
    private javax.swing.JTextField txtCboCargoEmprego;
    private javax.swing.JTextField txtCodigoCargoEmprego;
    private javax.swing.JFormattedTextField txtDataLeiCriacaoCargoEmprego;
    private javax.swing.JFormattedTextField txtDataLeiExtingueCargoEmprego;
    private javax.swing.JTextField txtDescricaoCargoEmprego;
    private javax.swing.JTextField txtNumeroLeiCriaCargoEmprego;
    private javax.swing.JTextField txtNumeroLeiExtingueCargoEmprego;
    // End of variables declaration//GEN-END:variables
}
