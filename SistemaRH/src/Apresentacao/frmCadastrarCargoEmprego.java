/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import Controle.CadastrarCargoEmpregoControle;
import DTO.PesquisarCargoEmpregoDTO;
import DTO.CadastrarCargoEmpregoDTO;
import Modelo.CentralizarJanela;
import Modelo.ControleCadastrarFundamento;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmCadastrarCargoEmprego extends javax.swing.JInternalFrame implements Modelo.MetodosComunsParaTodosOsJIF<frmCadastrarCargoEmprego>
{

    //cargo emprego
    private String codigoCargoEmprego;
    private String descricaoCargoEmprego;
    private String cboCargoEmprego;
    private String regimeJuridico;
    private boolean cargoEmpregoEstaAtivo;

    //carreira
    private String tipoDeCarreira;

    //carga horária
    private String cargaHorariaSemanalCargoEmprego;
    private String cargaHorariaMensalCargoEmprego;

    //escolaridade
    private String escolaridadeCargoEmprego;

    //tabela - quadro cargo emprego
    private JTable quadro;

    //tabela - remuneração - tabela de vencimentos
    private String referenciaTecnicoCargoEmprego;
    private String grauTecnicoCargoEmprego;
    private String valorTecnicoCargoEmprego;

    //tabela - remuneração - escala de vencimentos docente
    private String faixaProfessorCargoEmprego;
    private String grauProfessorCargoEmprego;
    private String valorProfessorCargoEmprego;

    //tabela - remuneração - insalubridade
    private String grauInsalubridade;

    //tabela - legislação - criação/exclusão
    private String numeroLegislacaoCriacaoExclusaoCargoEmprego;
    private String anoLegislacaoCriacaoExclusaoCargoEmprego;
    private String dataLegislacaoCriacaoExclusaoCargoEmprego;
    private String ementaLegislacaoCriacaoExclusaoCargoEmprego;
    private String atoLegislacaoCriacaoExclusaoCargoEmprego;
    private String quantidadeLegislacaoCriacaoExclusaoCargoEmprego;

    //tabela - legislação - reajuste
    private String numeroLegislacaoReajusteCargoEmprego;
    private String anoLegislacaoReajusteCargoEmprego;
    private String dataLegislacaoReajusteCargoEmprego;
    private String ementaLegislacaoReajusteCargoEmprego;
    private String deLegislacaoReajusteCargoEmprego;
    private String paraLegislacaoReajusteCargoEmprego;

    //provimento cargo emprego
    private String requisitoProvimentoCargoEmprego;

    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;
    private ArrayList<PesquisarCargoEmpregoDTO> lista;
    private String itemSelecionadoNoComboBox = "";

    public static int indiceConsultaCargoEmprego = 0;

    private List<Integer> codigoCargosEmpregos;

    public CadastrarCargoEmpregoControle controle;

    public boolean alterarRemuneracao = false;

    ItemListener cmbRefSal;
    ItemListener cmbGrauSal;

    public frmCadastrarCargoEmprego()
    {
        initComponents();
        gerenciadorDeTabelas(tbQuadro);
        gerenciadorDeTabelas(tbFundamentoCriacaoExclusao);
        gerenciadorDeTabelas(tbFundamentoReajuste);
        controle = new CadastrarCargoEmpregoControle();
        quadro = tbQuadro;
        preencherQuadro();
    }

    public void consultarUltimoRegistro()
    {
        txtCodigoCargoEmprego.setText(controle.pesquisarUltimoRegistro());
    }

    public void gravarRegistro()
    {
        setCodigoCargoEmprego(txtCodigoCargoEmprego.getText());
        setDescricaoCargoEmprego(txtDescricaoCargoEmprego.getText());
        itemSelecionadoNoComboBox = cmbRegimeJuridico.getSelectedItem().toString();
        setRegimeJuridico(itemSelecionadoNoComboBox);
    }

    public void preencherLista(ArrayList<PesquisarCargoEmpregoDTO> lista, int index)
    {
        this.setLista(lista);
        setCodigoCargoEmprego(String.valueOf(getLista().get(index).getCodigoCargoEmprego()));
        setDescricaoCargoEmprego(String.valueOf(getLista().get(index).getDescricaoCargoEmprego()));
        setRegimeJuridico(String.valueOf(getLista().get(index).getRegimeJuridicoCargoEmprego()));
        setNumeroLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getNumeroLeiCriaCargoEmprego()));
        setDataLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getDataLeiCriaCargoEmprego()));
        preencherCamposListaPesquisa(lista);
    }

    public void preencherCamposListaPesquisa(ArrayList<PesquisarCargoEmpregoDTO> lista)
    {
        if (lista.isEmpty())
        {
            limparCampos();
        }
        txtCodigoCargoEmprego.setText(String.valueOf(lista.get(0).getDescricaoCargoEmprego()));
        txtDescricaoCargoEmprego.setText(String.valueOf(lista.get(0).getDescricaoCargoEmprego()));
    }

    public void preencherCamposLista(List<CadastrarCargoEmpregoDTO> lista)
    {
        if (lista.isEmpty())
        {
            limparCampos();
        }

        //cargo/emprego
        txtCodigoCargoEmprego.setText(String.valueOf(lista.get(0).getCodigoCargoEmprego()));
        txtDescricaoCargoEmprego.setText(String.valueOf(lista.get(0).getDescricaoCargoEmprego()));
        txtCboCargoEmprego.setText(String.valueOf(lista.get(0).getCboCargoEmprego()));
        cmbRegimeJuridico.setSelectedItem(String.valueOf(lista.get(0).getRegimeJuridicoCargoEmprego()));
        chkAtivo.setSelected(lista.get(0).getChkAtivoCargoEmprego());

        //carreira
        cmbCarreira.setSelectedItem(String.valueOf(lista.get(0).getTipoCarreira()));

        //tipo
        cmbCargaHorariaSemanal.setSelectedItem(String.valueOf(lista.get(0).getCargaHorariaSemanal()));
        cmbCargaHorariaMensal.setSelectedItem(String.valueOf(lista.get(0).getCargaHorariaMensal()));

        //exigências
        cmbEscolaridade.setSelectedItem(String.valueOf(lista.get(0).getEscolaridade()));

        //preencher quadro 
        preencherQuadro();

        preencherLegislacao(String.valueOf(lista.get(0).getCodigoAto()));

        //preencher remuneração
        preencherReferenciaVencimento();
        preencherGrauVencimento();

        //puxa o codigo do vencimento do banco de dados e passa para ca, para uma nova consulta
        consultarReferenciaGrauVencimento(String.valueOf(lista.get(0).getCodigoVencimento()));
        preencherVencimento();

        //o problema é que eu estou fechando o listener mesmo sem ter mudado de tela. 
        //para resolver o problema eu preciso fechar o listener depois que mudar de tela ou quando eu terminar de consultar os valores
    }

    public void consultarReferenciaGrauVencimento(String codigo_vencimento)
    {
        String referencia = controle.consultarReferenciaGrauVencimento(codigo_vencimento).getReferencia();
        if (referencia != null)
        {
            cmbReferenciaSalarial.setSelectedItem(referencia);
            cmbGrau.setSelectedItem(controle.consultarReferenciaGrauVencimento(codigo_vencimento).getGrau());
            lblRemuneracao.setText(controle.consultarReferenciaGrauVencimento(codigo_vencimento).getValorVencimento());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "nulo consulta referencia vencimento");
        }
    }

    //processo para preencher quadro
    public void preencherQuadro()
    {
        //criar padrão de tabela
        DefaultTableModel model = (DefaultTableModel) tbQuadro.getModel();

        // Crie um array para representar os dados da nova linha
        Object[] novaLinha =
        {
            controle.preencherQuadro(txtCodigoCargoEmprego.getText())
        };

        if (model.getRowCount() < 1)
        {
            model.addRow(novaLinha);
        }

        model.setValueAt(controle.preencherQuadro(txtCodigoCargoEmprego.getText()), 0, 0);

    }

    //preencher referencia no combobox
    public void preencherReferenciaVencimento()
    {
        ArrayList<String> referenciaEncontrada = controle.pesquisarReferenciaRemuneracao();
        Set<String> referenciaUnica = new HashSet<>(referenciaEncontrada);
        TreeSet<String> referenciaOrdenada = new TreeSet<>(new ReferenciaComparator());

        referenciaOrdenada.addAll(referenciaUnica);

        cmbReferenciaSalarial.removeAllItems();

        for (String referencia : referenciaOrdenada)
        {
            cmbReferenciaSalarial.addItem(referencia);
        }
    }

    @Override
    public void cadastrar(frmCadastrarCargoEmprego frm)
    {
        try
        {
            CadastrarCargoEmpregoControle controleCCE = new CadastrarCargoEmpregoControle();
            controleCCE.cadastrarCargoEmprego(frm);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(frmCadastrarCargoEmprego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static class ReferenciaComparator implements Comparator<String>
    {

        @Override
        public int compare(String s1, String s2)
        {
            if (s1.equals("RME"))
            {
                return 1; // Coloca "RME" no final
            }
            else if (s2.equals("RME"))
            {
                return -1; // Coloca "RME" no final
            }
            else
            {
                try
                {
                    int i1 = Integer.parseInt(s1);
                    int i2 = Integer.parseInt(s2);
                    return Integer.compare(i1, i2);
                }
                catch (NumberFormatException e)
                {
                    return s1.compareTo(s2);
                }
            }
        }
    }

    //preencher o grau no combobox
    public void preencherGrauVencimento()
    {
        ArrayList<String> grauEncontrado = controle.pesquisarGrauRemuneracao();
        Set<String> grauUnico = new HashSet<>(grauEncontrado);

        cmbGrau.removeAllItems(); // Remover todos os itens existentes no combobox antes de adicionar os novos

        for (String grau : grauUnico)
        {
            cmbGrau.addItem(grau);
        }
    }

    public void preencherVencimentoSemPrecisarSelecionarOCMBReferenciaOuGrau()
    {
        // Aqui você pode chamar o método ou fazer qualquer ação desejada
        BigDecimal remuneracao = controle.vincularRemuneração(cmbCarreira.getSelectedItem().toString(), cmbReferenciaSalarial.getSelectedItem().toString(), cmbGrau.getSelectedItem().toString());
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String valorFormatado = decimalFormat.format(remuneracao);
        lblRemuneracao.setText(valorFormatado);
    }

    public void preencherVencimento()
    {
        // Adiciona um ItemListener ao cmbReferenciaSalarial, ao  mudar no combobox ele ja atualiza

        cmbRefSal = new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    // Aqui você pode chamar o método ou fazer qualquer ação desejada
                    BigDecimal remuneracao = controle.vincularRemuneração(cmbCarreira.getSelectedItem().toString(), cmbReferenciaSalarial.getSelectedItem().toString(), cmbGrau.getSelectedItem().toString());
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                    String valorFormatado = decimalFormat.format(remuneracao);
                    lblRemuneracao.setText(valorFormatado);
                }
            }
        };
        // Adiciona um ItemListener ao cmbReferenciaSalarial, ao  mudar no combobox ele ja atualiza
        cmbGrauSal = new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    String selectedItem = (String) cmbGrau.getSelectedItem();
                    // Aqui você pode chamar o método ou fazer qualquer ação desejada
                    BigDecimal remuneracao = controle.vincularRemuneração(cmbCarreira.getSelectedItem().toString(), cmbReferenciaSalarial.getSelectedItem().toString(), cmbGrau.getSelectedItem().toString());
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                    String valorFormatado = decimalFormat.format(remuneracao);
                    lblRemuneracao.setText(valorFormatado);
                }

            }
        };

        String regimeJuridicoSelecionado = cmbCarreira.getSelectedItem().toString();
        JTabbedPane jtp = jtpRemuneracao;
        switch (regimeJuridicoSelecionado)
        {
            case "Técnico":
                jtp.setSelectedIndex(0);
                jtp.setEnabledAt(0, true);
                jtp.setEnabledAt(1, false);
                jtp.setEnabledAt(2, false);
                jtp.setEnabledAt(3, false);
                break;

            case "Professor":
                jtp.setSelectedIndex(1);
                jtp.setEnabledAt(0, false);
                jtp.setEnabledAt(1, true);
                jtp.setEnabledAt(2, false);
                jtp.setEnabledAt(3, false);
                break;

            case "Eletivo":
                jtp.setSelectedIndex(2);
                jtp.setEnabledAt(0, false);
                jtp.setEnabledAt(1, false);
                jtp.setEnabledAt(2, true);
                jtp.setEnabledAt(3, false);
                break;

            case "Comissão":
                jtp.setSelectedIndex(3);
                jtp.setEnabledAt(0, false);
                jtp.setEnabledAt(1, false);
                jtp.setEnabledAt(2, false);
                jtp.setEnabledAt(3, true);
                break;
        }

    }

    public void preencherLegislacao(String fkCodigoAto)
    {
        if (tbFundamentoCriacaoExclusao != null)
        {
            // Limpar a tabela
            DefaultTableModel dft = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();
            dft.setRowCount(0);

            CadastrarCargoEmpregoControle c = new CadastrarCargoEmpregoControle();
            CadastrarCargoEmpregoDTO dto = new CadastrarCargoEmpregoDTO();

            // Retorno das informações do banco de dados
            dto = c.preencherLegislacao(fkCodigoAto);

            // Inserir informações na tabela
            Object[] rowData =
            {
                dto.getNumeroAto(),
                dto.getAnoAto().substring(0, 4),
                dto.getDataAto(),
                dto.getEmentaAto(),
                dto.getCategoriaAto(),
                dto.getQuantidadeAto()
            };

            dft.addRow(rowData);
        }
    }

    //liberar os campos para edição
    public void ativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(true);
        tbQuadro.setEnabled(true);
        tbFundamentoCriacaoExclusao.setEnabled(true);
        tbFundamentoReajuste.setEnabled(true);
        txtDescricaoCargoEmprego.setEnabled(true);
        txtCboCargoEmprego.setEnabled(true);
        cmbRegimeJuridico.setEnabled(true);
        chkAtivo.setEnabled(true);
        cmbCarreira.setEnabled(true);
        cmbCargaHorariaSemanal.setEnabled(true);
        cmbCargaHorariaMensal.setEnabled(true);
        cmbEscolaridade.setEnabled(true);
        cmbReferenciaSalarial.setEnabled(false);
        cmbGrau.setEnabled(false);
        lblRsVencimentos.setEnabled(true);
        chkVencimento.setEnabled(true);
        lblRemuneracao.setEnabled(true);
        cmbFaixaSalarial.setEnabled(true);
        cmbGrauSalario.setEnabled(true);
        lblRsDocente.setEnabled(true);
        btnCadastrarFundamento.setEnabled(true);
        btnAlterarFundamento.setEnabled(true);
        btnExcluirFundamento.setEnabled(true);
    }

    //travar os campos para edição
    @Override
    public void desativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(true);
        tbQuadro.setEnabled(false);
        tbFundamentoCriacaoExclusao.setEnabled(false);
        tbFundamentoReajuste.setEnabled(false);
        txtDescricaoCargoEmprego.setEnabled(false);
        txtCboCargoEmprego.setEnabled(false);
        cmbRegimeJuridico.setEnabled(false);
        chkAtivo.setEnabled(false);
        cmbCarreira.setEnabled(false);
        cmbCargaHorariaSemanal.setEnabled(false);
        cmbCargaHorariaMensal.setEnabled(false);
        cmbEscolaridade.setEnabled(false);
        cmbReferenciaSalarial.setEnabled(false);
        cmbGrau.setEnabled(false);
        lblRsVencimentos.setEnabled(false);
        lblRemuneracao.setEnabled(false);
        chkVencimento.setSelected(false);
        cmbGrau.removeItemListener(cmbGrauSal);
        cmbReferenciaSalarial.removeItemListener(cmbRefSal);
        chkVencimento.setEnabled(false);
        cmbFaixaSalarial.setEnabled(false);
        cmbGrauSalario.setEnabled(false);
        lblRsDocente.setEnabled(false);
        btnCadastrarFundamento.setEnabled(false);
        btnAlterarFundamento.setEnabled(false);
        btnExcluirFundamento.setEnabled(false);
    }

    public void limparCampos()
    {
        txtCodigoCargoEmprego.setText("");
        txtDescricaoCargoEmprego.setText("");
        txtCboCargoEmprego.setText("");
        cmbRegimeJuridico.setSelectedIndex(0);
        chkAtivo.setEnabled(true);
        cmbCarreira.setEnabled(true);
        cmbCargaHorariaSemanal.setSelectedIndex(4);
        cmbCargaHorariaMensal.setSelectedIndex(4);
        cmbEscolaridade.setSelectedIndex(2);
        limparTabelas(tbQuadro);
        limparTabelas(tbFundamentoCriacaoExclusao);
        limparTabelas(tbFundamentoReajuste);
        txtAreaRequisitosProvimento.setText("");

        cmbReferenciaSalarial.setSelectedIndex(0);
        cmbGrau.setSelectedIndex(0);

        // Carregar a primeira remuneração
        BigDecimal remuneracao = controle.vincularRemuneração(cmbCarreira.getSelectedItem().toString(), cmbReferenciaSalarial.getSelectedItem().toString(), cmbGrau.getSelectedItem().toString());
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String valorFormatado = decimalFormat.format(remuneracao);
        lblRemuneracao.setText(valorFormatado);
    }

    public String getCodigoCargoEmprego()
    {
        return txtCodigoCargoEmprego.getText();
    }

    @Override
    public String getCodigo()
    {
        return txtCodigoCargoEmprego.getText();
    }

    public void setCodigoCargoEmprego(String codigoCargoEmprego)
    {
        this.codigoCargoEmprego = codigoCargoEmprego;
    }

    public String getDescricaoCargoEmprego()
    {
        return txtDescricaoCargoEmprego.getText();
    }

    public void setDescricaoCargoEmprego(String descricaoCargoEmprego)
    {
        this.descricaoCargoEmprego = descricaoCargoEmprego;
    }

    public String getCboCargoEmprego()
    {
        return txtCboCargoEmprego.getText();
    }

    public void setCboCargoEmprego(String cboCargoEmprego)
    {
        this.cboCargoEmprego = cboCargoEmprego;
    }

    public String getRegimeJuridico()
    {
        return cmbRegimeJuridico.getSelectedItem().toString();
    }

    public void setRegimeJuridico(String regimeJuridico)
    {
        this.regimeJuridico = regimeJuridico;
    }

    public Boolean getChkAtivoCargoEmprego()
    {
        return chkAtivo.isSelected();
    }

    public void setChkAtivoCargoEmprego(Boolean cargoEmpregoEstaAtivo)
    {
        this.cargoEmpregoEstaAtivo = cargoEmpregoEstaAtivo;
    }

    public String getCarreira()
    {
        return cmbCarreira.getSelectedItem().toString();
    }

    public void setCarreira(String tipoDeCarreira)
    {
        this.tipoDeCarreira = tipoDeCarreira;
    }

    public String getCargaHorariaMensal()
    {
        return cmbCargaHorariaMensal.getSelectedItem().toString();
    }

    public void setCargaHorariaMensal(String cargaHorariaMensalCargoEmprego)
    {
        this.cargaHorariaMensalCargoEmprego = cargaHorariaMensalCargoEmprego;
    }

    public String getCargaHorariaSemanal()
    {
        return cmbCargaHorariaSemanal.getSelectedItem().toString();
    }

    public void setCargaHorariaSemanal(String cargaHorariaSemanalCargoEmprego)
    {
        this.cargaHorariaSemanalCargoEmprego = cargaHorariaSemanalCargoEmprego;
    }

    public String getEscolaridade()
    {
        return cmbEscolaridade.getSelectedItem().toString();
    }

    public void setEscolaridade(String escolaridadeCargoEmprego)
    {
        this.escolaridadeCargoEmprego = escolaridadeCargoEmprego;
    }

    public void setQuadro(JTable quadro)
    {
        this.quadro = quadro;
    }

    public JTable getQuadro()
    {
        return quadro;
    }

    public JTable getTbFundamentoCriacaoExclusao()
    {
        return tbFundamentoCriacaoExclusao;
    }

    public void setTbFundamentoCriacaoExclusao(JTable tbFundamentoCriacaoExclusao)
    {
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
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

    public JComboBox<String> getCmbReferenciaSalarial()
    {
        return cmbReferenciaSalarial;
    }

    public void setCmbReferenciaSalarial(JComboBox<String> cmbReferenciaSalarial)
    {
        this.cmbReferenciaSalarial = cmbReferenciaSalarial;
    }

    public JComboBox<String> getCmbGrau()
    {
        return cmbGrau;
    }

    public void setCmbGrau(JComboBox<String> cmbGrau)
    {
        this.cmbGrau = cmbGrau;
    }

    public void gerenciadorDeTabelas(JTable table)
    {
        DefaultTableCellRenderer centralizarCelulas = new DefaultTableCellRenderer();
        centralizarCelulas.setHorizontalAlignment(SwingConstants.CENTER);
        table.getTableHeader().setReorderingAllowed(false);
        for (int i = 0; i < table.getColumnCount(); i++)
        {
            table.getColumnModel().getColumn(i).setResizable(false);
            table.getColumnModel().getColumn(i).setCellRenderer(centralizarCelulas);
        }
    }

    @Override
    public List<Integer> gerenciadorNavegacao(String acao)
    {
        CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle();
        if (controle.navegarEntreRegistros(acao).equals("ok"))
        {
            preencherCamposLista(controle.getObjPuxadoDaPesquisaDeCargoEmprego());
            this.codigoCargosEmpregos = controle.getCodigoCargosEmpregos();
        }
        return codigoCargosEmpregos;
    }

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
        lblMensal = new javax.swing.JLabel();
        cmbCargaHorariaSemanal = new javax.swing.JComboBox<>();
        cmbCargaHorariaMensal = new javax.swing.JComboBox<>();
        jpQuadro = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbQuadro = new javax.swing.JTable();
        jtpRemuneracao = new javax.swing.JTabbedPane();
        jpTabelaVencimentos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblRemuneracao = new javax.swing.JLabel();
        lblRsVencimentos = new javax.swing.JLabel();
        chkVencimento = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cmbGrau = new javax.swing.JComboBox<>();
        lblGrau = new javax.swing.JLabel();
        lblReferenciaSalarial = new javax.swing.JLabel();
        cmbReferenciaSalarial = new javax.swing.JComboBox<>();
        jpEscalaVencimentosDocente = new javax.swing.JPanel();
        lblFaixa = new javax.swing.JLabel();
        cmbFaixaSalarial = new javax.swing.JComboBox<>();
        lblGrauProf = new javax.swing.JLabel();
        cmbGrauSalario = new javax.swing.JComboBox<>();
        lblRsDocente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpRequisitosDeProvimento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRequisitosProvimento = new javax.swing.JTextArea();
        jpCarreira = new javax.swing.JPanel();
        cmbCarreira = new javax.swing.JComboBox<>();
        lblCarreira = new javax.swing.JLabel();
        jtpLegislacao = new javax.swing.JTabbedPane();
        jpLegislacao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFundamentoCriacaoExclusao = new javax.swing.JTable();
        jpReajuste = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbFundamentoReajuste = new javax.swing.JTable();
        jpOperacoes = new javax.swing.JPanel();
        btnCadastrarFundamento = new javax.swing.JButton();
        btnAlterarFundamento = new javax.swing.JButton();
        btnExcluirFundamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manutenção de Cargos e Empregos");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
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

        jpCadastroCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cargos e Empregos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jpCargoEmprego.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo/Emprego", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtDescricaoCargoEmprego.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDescricaoCargoEmpregoKeyTyped(evt);
            }
        });

        lblDescricaoCargoEmprego.setText("Descrição:");

        txtCodigoCargoEmprego.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCodigoCargoEmpregoActionPerformed(evt);
            }
        });
        txtCodigoCargoEmprego.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtCodigoCargoEmpregoKeyTyped(evt);
            }
        });

        lblCodigoCargoEmprego.setText("Código:");

        lblRegimeJuridicoCargoEmprego.setText("Regime Jurídico:");

        cmbRegimeJuridico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTATUTÁRIO", "CELETISTA" }));

        lblCboCargoEmprego.setText("CBO:");

        txtCboCargoEmprego.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtCboCargoEmpregoFocusLost(evt);
            }
        });
        txtCboCargoEmprego.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtCboCargoEmpregoKeyTyped(evt);
            }
        });

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
                    .addComponent(cmbEscolaridade, 0, 0, Short.MAX_VALUE))
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

        lblMensal.setText("Mensal:");

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
                        .addComponent(lblMensal))
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
                    .addComponent(lblMensal)
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
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
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

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setAutoscrolls(true);

        lblRemuneracao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRemuneracao.setText("3.917,95");

        lblRsVencimentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRsVencimentos.setText("R$:");

        chkVencimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkVencimento.setText("Alterar Vencimento");
        chkVencimento.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkVencimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblRsVencimentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(chkVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRsVencimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbGrau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lblGrau.setText("Grau:");

        lblReferenciaSalarial.setText("Referência:");

        cmbReferenciaSalarial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblGrau))
                    .addComponent(lblReferenciaSalarial))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbReferenciaSalarial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cmbGrau, 0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbReferenciaSalarial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferenciaSalarial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGrau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrau))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpTabelaVencimentosLayout = new javax.swing.GroupLayout(jpTabelaVencimentos);
        jpTabelaVencimentos.setLayout(jpTabelaVencimentosLayout);
        jpTabelaVencimentosLayout.setHorizontalGroup(
            jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaVencimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTabelaVencimentosLayout.setVerticalGroup(
            jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaVencimentosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpTabelaVencimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Técnicos", jpTabelaVencimentos);

        lblFaixa.setText("Faixa:");

        cmbFaixaSalarial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROF PEB I - COM GRADUAÇÃO", "PROF PEB I - COM ESPECIALIZAÇÃO", "PROF PEB I - COM MESTRADO", "PROF PEB I - COM DOUTORADO", "PROF PEB II - COM GRADUAÇÃO", "PROF PEB II - COM ESPECIALIZAÇÃO", "PROF PEB II - COM MESTRADO", "PROF PEB II - COM DOUTORADO", "PROF AUXILIAR - COM ENSINO MÉDIO", "PROF AUXILIAR - COM GRADUAÇÃO", "PROF AUXILIAR - COM PÓS GRADUAÇÃO" }));

        lblGrauProf.setText("Grau:");

        cmbGrauSalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADM", "A", "B", "C", "D", "E", "F" }));

        lblRsDocente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRsDocente.setText("R$:");

        javax.swing.GroupLayout jpEscalaVencimentosDocenteLayout = new javax.swing.GroupLayout(jpEscalaVencimentosDocente);
        jpEscalaVencimentosDocente.setLayout(jpEscalaVencimentosDocenteLayout);
        jpEscalaVencimentosDocenteLayout.setHorizontalGroup(
            jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGrauProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFaixaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGrauSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lblRsDocente)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jpEscalaVencimentosDocenteLayout.setVerticalGroup(
            jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblFaixa))
                    .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpEscalaVencimentosDocenteLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(cmbFaixaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jpEscalaVencimentosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbGrauSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGrauProf)))
                        .addComponent(lblRsDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpRemuneracao.addTab("Docentes", jpEscalaVencimentosDocente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        jtpRemuneracao.addTab("Eletivo", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        jtpRemuneracao.addTab("Comissão", jPanel2);

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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jpCarreira.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carreira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cmbCarreira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Técnico", "Professor", "Eletivo", "Comissão" }));
        cmbCarreira.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbCarreiraItemStateChanged(evt);
            }
        });

        lblCarreira.setText("Tipo:");

        javax.swing.GroupLayout jpCarreiraLayout = new javax.swing.GroupLayout(jpCarreira);
        jpCarreira.setLayout(jpCarreiraLayout);
        jpCarreiraLayout.setHorizontalGroup(
            jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarreiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCarreiraLayout.createSequentialGroup()
                        .addComponent(lblCarreira)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbCarreira, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpCarreiraLayout.setVerticalGroup(
            jpCarreiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarreiraLayout.createSequentialGroup()
                .addComponent(lblCarreira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jpReajusteLayout = new javax.swing.GroupLayout(jpReajuste);
        jpReajuste.setLayout(jpReajusteLayout);
        jpReajusteLayout.setHorizontalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpReajusteLayout.setVerticalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpLegislacao.addTab("Reajuste", jpReajuste);

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
                .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jpQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadastroCargoEmpregoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtpLegislacao)))
                    .addGroup(jpCadastroCargoEmpregoLayout.createSequentialGroup()
                        .addComponent(jtpRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpRequisitosDeProvimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            DefaultTableModel tabelaQuadro = (DefaultTableModel) tbQuadro.getModel();
            DefaultTableModel tabelaFundamento = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();
            if (tbQuadro.getRowCount() == 0)
            {
                tabelaQuadro.addRow(new Object[]
                {
                });
            }
            //para centralizar as celulas da tabela
            gerenciadorDeTabelas(tbFundamentoCriacaoExclusao);
            frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), jtpLegislacao);
            frmCadastrarFundamento.setVisible(true);
            frmCadastrarFundamento.setLocationRelativeTo(null);
            frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            //passar a quantidade de cargos no Quadro
            CadastrarCargoEmpregoControle c = new CadastrarCargoEmpregoControle();
            tbQuadro.setValueAt(c.cadastrarCargoEmpregoNoQuadro(tabelaQuadro, tabelaFundamento), 0, 0);

            //para centralizar as celulas da tabela
            gerenciadorDeTabelas(tbQuadro);
        }

        if (jtpLegislacao.getSelectedIndex() == 1)
        {
            frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), jtpLegislacao);
            frmCadastrarFundamento.setVisible(true);
            frmCadastrarFundamento.setLocationRelativeTo(null);
            frmCadastrarFundamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            //para centralizar as celulas da tabela
            gerenciadorDeTabelas(tbFundamentoReajuste);
        }
    }//GEN-LAST:event_btnCadastrarFundamentoActionPerformed

    private void btnExcluirFundamentoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirFundamentoActionPerformed
    {//GEN-HEADEREND:event_btnExcluirFundamentoActionPerformed
        if (jtpLegislacao.getSelectedIndex() == 0)
        {
            DefaultTableModel tabelaQuadro = (DefaultTableModel) tbQuadro.getModel();
            DefaultTableModel tabelaFundamento = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();

            int linhaSelecionada = tbFundamentoCriacaoExclusao.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                CadastrarCargoEmpregoControle c = new CadastrarCargoEmpregoControle();
                c.excluirCargoEmpregoDoQuadro(tabelaFundamento, linhaSelecionada, 5);
                tabelaFundamento.removeRow(linhaSelecionada);
                tbQuadro.setValueAt(c.cadastrarCargoEmpregoNoQuadro(tabelaQuadro, tabelaFundamento), 0, 0);
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
            DefaultTableModel tabelaQuadro = (DefaultTableModel) tbQuadro.getModel();
            DefaultTableModel tabelaFundamento = (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel();

            int linhaSelecionada = tbFundamentoCriacaoExclusao.getSelectedRow();

            if (linhaSelecionada != -1)
            {
                // Obtenha os valores da linha selecionada
                Object numeroDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 0);
                Object anoDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 1);
                Object dataDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 2);
                Object ementaDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 3);
                Object atoDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 4);
                Object quantidadeDaLei = tabelaFundamento.getValueAt(linhaSelecionada, 5);

                frmCadastrarFundamento frmCadastrarFundamento = new frmCadastrarFundamento(null, true, (DefaultTableModel) tbFundamentoCriacaoExclusao.getModel(), (DefaultTableModel) tbFundamentoReajuste.getModel(), numeroDaLei.toString(), anoDaLei.toString(), dataDaLei.toString(), ementaDaLei.toString(), atoDaLei.toString(), quantidadeDaLei.toString(), linhaSelecionada, jtpLegislacao);
                frmCadastrarFundamento.setVisible(true);
                frmCadastrarFundamento.setLocationRelativeTo(null);

                CadastrarCargoEmpregoControle c = new CadastrarCargoEmpregoControle();
                tbQuadro.setValueAt(c.alterarCargoEmpregoDoQuadro(tabelaQuadro, tabelaFundamento, linhaSelecionada, 5, tabelaFundamento.getValueAt(linhaSelecionada, 5).toString()), 0, 0);
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

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosed
    {//GEN-HEADEREND:event_formInternalFrameClosed
        limparTabelas(tbQuadro);
        limparTabelas(tbFundamentoCriacaoExclusao);
        limparTabelas(tbFundamentoReajuste);
        ControleCadastrarFundamento.quantidadeEmpregoCriada = 0;
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtDescricaoCargoEmpregoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDescricaoCargoEmpregoKeyTyped
    {//GEN-HEADEREND:event_txtDescricaoCargoEmpregoKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, se for ok. Se não for, o método consume() é chamado no evento, o que impede que o digito seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || (!Character.isLetter(c) && c != ' '))
        {
            evt.consume();
        }

        //automaticamente troca a letra para caixa alta caso ela seja minuscula
        if (Character.isLowerCase(c))
        {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtDescricaoCargoEmpregoKeyTyped

    private void txtCboCargoEmpregoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCboCargoEmpregoKeyTyped
    {//GEN-HEADEREND:event_txtCboCargoEmpregoKeyTyped
        //Esse código verifica se o caractere digitado é um numero, se for ok. Se não for, o método consume() é chamado no evento, o que impede que a letra seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
        {
            evt.consume();
        }
        else
        {
            String text = txtCboCargoEmprego.getText();
            if (text.length() >= 6)
            {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCboCargoEmpregoKeyTyped

    private void txtCodigoCargoEmpregoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCodigoCargoEmpregoKeyTyped
    {//GEN-HEADEREND:event_txtCodigoCargoEmpregoKeyTyped
        //Esse código verifica se o caractere digitado é um numero, se for ok. Se não for, o método consume() é chamado no evento, o que impede que a letra seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoCargoEmpregoKeyTyped

    private void txtCboCargoEmpregoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtCboCargoEmpregoFocusLost
    {//GEN-HEADEREND:event_txtCboCargoEmpregoFocusLost

    }//GEN-LAST:event_txtCboCargoEmpregoFocusLost
//ao colocar a matrícula ele faz a consulta no banco de dados e retonar no formulario
    private void txtCodigoCargoEmpregoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCodigoCargoEmpregoActionPerformed
    {//GEN-HEADEREND:event_txtCodigoCargoEmpregoActionPerformed
        CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle();
        indiceConsultaCargoEmprego = Integer.parseInt(txtCodigoCargoEmprego.getText());
        controle.pesquisarCargoEmprego(txtCodigoCargoEmprego.getText());
        preencherCamposLista(controle.getObjPuxadoDaPesquisaDeCargoEmprego());
    }//GEN-LAST:event_txtCodigoCargoEmpregoActionPerformed

    private void chkVencimentoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkVencimentoActionPerformed
    {//GEN-HEADEREND:event_chkVencimentoActionPerformed
        if (chkVencimento.isSelected())
        {
            cmbReferenciaSalarial.setEnabled(true);
            cmbGrau.setEnabled(true);
            cmbReferenciaSalarial.addItemListener(cmbRefSal);
            cmbGrau.addItemListener(cmbGrauSal);
        }
        else
        {
            cmbReferenciaSalarial.setEnabled(false);
            cmbGrau.setEnabled(false);
            cmbGrau.removeItemListener(cmbGrauSal);
            cmbReferenciaSalarial.removeItemListener(cmbRefSal);
        }
    }//GEN-LAST:event_chkVencimentoActionPerformed

    private void cmbCarreiraItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbCarreiraItemStateChanged
    {//GEN-HEADEREND:event_cmbCarreiraItemStateChanged
        String alterarCarreira = cmbCarreira.getSelectedItem().toString();

        switch (alterarCarreira)
        {
            case "Técnico":
                jtpRemuneracao.setSelectedIndex(0);
                break;

            case "Professor":
                jtpRemuneracao.setSelectedIndex(1);
                break;

            case "Eletivo":
                jtpRemuneracao.setSelectedIndex(2);
                break;

            case "Comissão":
                jtpRemuneracao.setSelectedIndex(3);
                break;

            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_cmbCarreiraItemStateChanged
    public void limparTabelas(JTable tabela)
    {
        DefaultTableModel limparTabela = (DefaultTableModel) tabela.getModel();
        limparTabela.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFundamento;
    private javax.swing.JButton btnCadastrarFundamento;
    private javax.swing.JButton btnExcluirFundamento;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JCheckBox chkVencimento;
    private javax.swing.JComboBox<String> cmbCargaHorariaMensal;
    private javax.swing.JComboBox<String> cmbCargaHorariaSemanal;
    private javax.swing.JComboBox<String> cmbCarreira;
    private javax.swing.JComboBox<String> cmbEscolaridade;
    private javax.swing.JComboBox<String> cmbFaixaSalarial;
    private javax.swing.JComboBox<String> cmbGrau;
    private javax.swing.JComboBox<String> cmbGrauSalario;
    private javax.swing.JComboBox<String> cmbReferenciaSalarial;
    private javax.swing.JComboBox<String> cmbRegimeJuridico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JPanel jpLegislacao;
    private javax.swing.JPanel jpOperacoes;
    private javax.swing.JPanel jpQuadro;
    private javax.swing.JPanel jpReajuste;
    private javax.swing.JPanel jpRequisitosDeProvimento;
    private javax.swing.JPanel jpTabelaVencimentos;
    private javax.swing.JTabbedPane jtpLegislacao;
    private javax.swing.JTabbedPane jtpRemuneracao;
    private javax.swing.JLabel lblCarreira;
    private javax.swing.JLabel lblCboCargoEmprego;
    private javax.swing.JLabel lblCodigoCargoEmprego;
    private javax.swing.JLabel lblDescricaoCargoEmprego;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblFaixa;
    private javax.swing.JLabel lblGrau;
    private javax.swing.JLabel lblGrauProf;
    private javax.swing.JLabel lblMensal;
    private javax.swing.JLabel lblReferenciaSalarial;
    private javax.swing.JLabel lblRegimeJuridicoCargoEmprego;
    private javax.swing.JLabel lblRemuneracao;
    private javax.swing.JLabel lblRsDocente;
    private javax.swing.JLabel lblRsVencimentos;
    private javax.swing.JLabel lblSemanal;
    private javax.swing.JTable tbFundamentoCriacaoExclusao;
    private javax.swing.JTable tbFundamentoReajuste;
    public javax.swing.JTable tbQuadro;
    private javax.swing.JTextArea txtAreaRequisitosProvimento;
    private javax.swing.JTextField txtCboCargoEmprego;
    private javax.swing.JTextField txtCodigoCargoEmprego;
    private javax.swing.JTextField txtDescricaoCargoEmprego;
    // End of variables declaration//GEN-END:variables

}
