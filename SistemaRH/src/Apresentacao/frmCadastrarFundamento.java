/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import Modelo.ControleCadastrarFundamento;
import Modelo.DefinirTamanhoMaximoCampoDeTexto;
import com.toedter.calendar.JCalendar;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmCadastrarFundamento extends javax.swing.JDialog
{

    private DefaultTableModel tbFundamentoCriacaoExclusao, tbFundamentoReajuste;
    private boolean eUmaAlteracao = false;
    private int linhaSelecionada = -1;
    private String atoDaLei = "";
    private String quantidadeCargosEmpregosDaLei = "";
    private JTabbedPane jtp;
    private String codigoCargoEmprego = "";
    private String codigoAtoLegal = "";
    private String dataDaLei;
    private String dataFormatada;

    /**
     * Creates new form frmCadastrarFundamento
     */
    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();

        // Desabilitar a edição do JTextField associado ao JDateChooser
    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, JTabbedPane jtp, String codigoCargoEmprego)
    {
        super(parent, modal);
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
        this.tbFundamentoReajuste = tbFundamentoReajuste;
        initComponents();
        eUmaAlteracao = false;
        this.jtp = jtp;
        this.codigoCargoEmprego = codigoCargoEmprego;

        //se a aba Criação/Exclusao do frmCadastrarCargoEmprego estiver visivel desativa a aba reajuste do jtpAto
        if (jtp.getSelectedIndex() == 0)
        {
            //foca a aba Criação/Exclusao
            jtpAto.setSelectedIndex(0);
            jtpAto.setEnabledAt(1, false);
        }
        //se a aba Reajuste do frmCadastrarCargoEmprego estiver visivel desativa a aba Criação/Exclusao do jtpAto
        else if (jtp.getSelectedIndex() == 1)
        {
            //foca a aba Reajuste
            jtpAto.setSelectedIndex(1);
            jtpAto.setEnabledAt(0, false);
        }
    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, int linhaSelecionada, JTabbedPane jtp)
    {
        super(parent, modal);
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
        this.tbFundamentoReajuste = tbFundamentoReajuste;
        initComponents();
        this.txtNumeroLei.setText(numeroDaLei);
        //this.numeroDaLei = numeroDaLei;
        //this.jffDataLei.setText(dataDaLei);
        //this.dataDaLei = dataDaLei;
        this.jtaEmenta.setText(ementaDaLei);
        //this.ementaDaLei = ementaDaLei;
        this.cmbAto.getSelectedItem().equals(atoDaLei);
        //this.atoDaLei = atoDaLei;
        this.txtQuantidadeVagas.setText(quantidadeCargosEmpregosDaLei);
        this.quantidadeCargosEmpregosDaLei = quantidadeCargosEmpregosDaLei;
        this.eUmaAlteracao = true;
        this.linhaSelecionada = linhaSelecionada;

        //desativar campos
        this.txtNumeroLei.setEnabled(false);

        //se a aba Criação/Exclusao do frmCadastrarCargoEmprego estiver visivel desativa a aba reajuste do jtpAto
        if (jtp.getSelectedIndex() == 0)
        {
            //foca a aba Criação/Exclusao
            jtpAto.setSelectedIndex(0);
            jtpAto.setEnabledAt(1, false);
        }
        //se a aba Reajuste do frmCadastrarCargoEmprego estiver visivel desativa a aba Criação/Exclusao do jtpAto
        else if (jtp.getSelectedIndex() == 1)
        {
            //foca a aba Reajuste
            jtpAto.setSelectedIndex(1);
            jtpAto.setEnabledAt(0, false);
        }
        this.jtp = jtp;

    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String de, String para, int linhaSelecionada, JTabbedPane jtp, int i)
    {
        super(parent, modal);
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
        this.tbFundamentoReajuste = tbFundamentoReajuste;
        initComponents();
        this.txtNumeroLei.setText(numeroDaLei);
        //this.numeroDaLei = numeroDaLei;
        //this.jffDataLei.setText(dataDaLei);
        //this.dataDaLei = dataDaLei;
        this.jtaEmenta.setText(ementaDaLei);
        //this.ementaDaLei = ementaDaLei;
        this.cmbAto.getSelectedItem().equals(atoDaLei);
        //this.de = de;
        ////this.para = para;
        this.eUmaAlteracao = true;
        this.linhaSelecionada = linhaSelecionada;

        //desativar campos
        this.txtNumeroLei.setEnabled(false);

        //se a aba Criação/Exclusao do frmCadastrarCargoEmprego estiver visivel desativa a aba reajuste do jtpAto
        if (jtp.getSelectedIndex() == 0)
        {
            //foca a aba Criação/Exclusao
            jtpAto.setSelectedIndex(0);
            jtpAto.setEnabledAt(1, false);
        }
        //se a aba Reajuste do frmCadastrarCargoEmprego estiver visivel desativa a aba Criação/Exclusao do jtpAto
        else if (jtp.getSelectedIndex() == 1)
        {
            //foca a aba Reajuste
            jtpAto.setSelectedIndex(1);
            jtpAto.setEnabledAt(0, false);
        }
        this.jtp = jtp;
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

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroLei = new javax.swing.JLabel();
        txtNumeroLei = new javax.swing.JTextField();
        jtpAto = new javax.swing.JTabbedPane();
        jpCriacaoExclusao = new javax.swing.JPanel();
        cmbAto = new javax.swing.JComboBox<>();
        txtQuantidadeVagas = new javax.swing.JTextField();
        lblQuantidadeVagas = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jpReajuste = new javax.swing.JPanel();
        lblValorDe = new javax.swing.JLabel();
        lblValorPara = new javax.swing.JLabel();
        txtValorPara = new javax.swing.JTextField();
        txtValorDe = new javax.swing.JTextField();
        lblDataLei = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEmenta = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Legislação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição Lei", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNumeroLei.setText("Número:");

        txtNumeroLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtNumeroLeiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNumeroLeiKeyTyped(evt);
            }
        });

        jtpAto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cmbAto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CRIAÇÃO", "EXTINÇÃO", "REAJUSTE", "OUTROS" }));

        txtQuantidadeVagas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtQuantidadeVagasActionPerformed(evt);
            }
        });
        txtQuantidadeVagas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtQuantidadeVagasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtQuantidadeVagasKeyTyped(evt);
            }
        });

        lblQuantidadeVagas.setText("Quantidade Vagas");

        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout jpCriacaoExclusaoLayout = new javax.swing.GroupLayout(jpCriacaoExclusao);
        jpCriacaoExclusao.setLayout(jpCriacaoExclusaoLayout);
        jpCriacaoExclusaoLayout.setHorizontalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQuantidadeVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantidadeVagas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCriacaoExclusaoLayout.setVerticalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeVagas)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpAto.addTab("Criação/Exclusão", jpCriacaoExclusao);

        lblValorDe.setText("De:");

        lblValorPara.setText("Para:");

        txtValorPara.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtValorParaActionPerformed(evt);
            }
        });
        txtValorPara.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtValorParaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtValorParaKeyTyped(evt);
            }
        });

        txtValorDe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtValorDeActionPerformed(evt);
            }
        });
        txtValorDe.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtValorDeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtValorDeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpReajusteLayout = new javax.swing.GroupLayout(jpReajuste);
        jpReajuste.setLayout(jpReajusteLayout);
        jpReajusteLayout.setHorizontalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorDe)
                    .addGroup(jpReajusteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPara)
                    .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpReajusteLayout.setVerticalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDe)
                    .addComponent(lblValorPara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jtpAto.addTab("Reajuste", jpReajuste);

        lblDataLei.setText("Data:");

        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                calendarioPropertyChange(evt);
            }
        });
        calendario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                calendarioKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ementa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jtaEmenta.setColumns(20);
        jtaEmenta.setRows(5);
        jtaEmenta.setWrapStyleWord(true);
        jtaEmenta.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtaEmentaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaEmenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpAto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroLei)
                            .addComponent(txtNumeroLei, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataLei))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroLei)
                            .addComponent(lblDataLei))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroLei))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtpAto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

        // Obtém a data selecionada do JDateChooser
        Date dataSelecionada = calendario.getDate();

        // Verifica se uma data foi selecionada
        if (dataSelecionada != null)
        {
            // Formata a data para o formato desejado (dd-MM-yyyy)
            SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy");
            dataFormatada = formatoSaida.format(dataSelecionada);

        }

        // Converte a data para Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataSelecionada);

// Obtém o ano da data selecionada
        int ano = calendar.get(Calendar.YEAR);

        if (jtp.getSelectedIndex() == 0 && !valorDuplicado)
        {
            //executa o for se tiver registro na tabela
            for (int j = 0; j < tbFundamentoCriacaoExclusao.getRowCount(); j++)
            {
                //se o numero e ano da lei estiverem repetidos em algum registro da tabela barra a criação do novo registro
                if (eUmaAlteracao == false && !txtNumeroLei.getText().isEmpty() && txtNumeroLei.getText().equals(tbFundamentoCriacaoExclusao.getValueAt(j, 0)))
                {
                    JOptionPane.showMessageDialog(null, "Registro duplicado na aba Criação/Exclusão!");
                    valorDuplicado = true;
                    break;
                }

                //se os campos estiverem em branco sera mostrado um aviso
                if (eUmaAlteracao == false && txtNumeroLei.getText().isEmpty() || txtQuantidadeVagas.getText().isEmpty() || jtaEmenta.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Preencha os campos para continuar.");
                    break;
                }
            }
            //script para lançar as informações das tabelas
            if (eUmaAlteracao)
            {
                if (!valorDuplicado)
                {
                    if (!txtNumeroLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                    {
                        System.out.println(dataFormatada);
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), String.valueOf(calendario.getDate()), dataFormatada, jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tbFundamentoCriacaoExclusao, eUmaAlteracao, linhaSelecionada, txtValorDe.getText(), txtValorPara.getText(), jtp, codigoCargoEmprego, codigoAtoLegal);
                        this.dispose();
                    }
                }
            }
            else
            {
                if (!valorDuplicado)
                {
                    if (!txtNumeroLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                    {
                        System.out.println(dataFormatada);
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), String.valueOf(ano), dataFormatada, jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tbFundamentoCriacaoExclusao, eUmaAlteracao, linhaSelecionada, txtValorDe.getText(), txtValorPara.getText(), jtp, codigoCargoEmprego, codigoAtoLegal);
                        this.dispose();
                    }
                }
            }
        }

        if (jtp.getSelectedIndex() == 1 && !valorDuplicado)
        {
            valorDuplicado = false;
            //executa o for se tiver registro na tabela
            for (int j = 0; j < tbFundamentoReajuste.getRowCount(); j++)
            {
                //se o numero e ano da lei estiverem repetidos em algum registro da tabela barra a criação do novo registro
                if (eUmaAlteracao == false && !txtNumeroLei.getText().isEmpty() && txtNumeroLei.getText().equals(tbFundamentoReajuste.getValueAt(j, 0)))
                {
                    JOptionPane.showMessageDialog(null, "Registro duplicado na aba Reajuste!");
                    valorDuplicado = true;
                    break;
                }
                //se os campos estiverem em branco sera mostrado um aviso
                if (eUmaAlteracao == false && txtNumeroLei.getText().isEmpty() || txtValorDe.getText().isEmpty() || txtValorPara.getText().isEmpty() || jtaEmenta.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Preencha os campos para continuar.");
                    break;
                }
            }           //script para lançar as informações das tabelas
            if (eUmaAlteracao)
            {
                if (!valorDuplicado)
                {
                    if (!txtNumeroLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtValorDe.getText().isEmpty() && !txtValorPara.getText().isEmpty())
                    {
                        System.out.println(dataFormatada);
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), String.valueOf(calendario.getDate()), dataFormatada, jtaEmenta.getText(), txtValorDe.getText(), txtValorPara.getText(), tbFundamentoReajuste, eUmaAlteracao, linhaSelecionada, jtp);
                        this.dispose();
                    }
                }
            }
            else
            {
                if (!valorDuplicado)
                {

                    if (!txtNumeroLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtValorDe.getText().isEmpty() && !txtValorPara.getText().isEmpty())
                    {
                        System.out.println(dataFormatada);
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), String.valueOf(calendario.getDate()), dataFormatada, jtaEmenta.getText(), txtValorDe.getText(), txtValorPara.getText(), tbFundamentoReajuste, eUmaAlteracao, linhaSelecionada, jtp);
                        this.dispose();
                    }
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

    public void verificarSeOsCamposEstaoPreenchidos()
    {
        if (jtpAto.getSelectedIndex() == 0)
        {
            boolean camposPreenchidos = !txtNumeroLei.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && calendario.getDate() != null;
            btnCadastrar.setEnabled(camposPreenchidos);
        }
        else if (jtpAto.getSelectedIndex() == 1)
        {

            boolean camposPreenchidos = !txtNumeroLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtValorDe.getText().isEmpty() && !txtValorPara.getText().isEmpty() && calendario.getDate() != null;
            btnCadastrar.setEnabled(camposPreenchidos);
        }
    }

    private void txtQuantidadeVagasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyTyped
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeVagasKeyTyped

    private void txtValorParaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtValorParaActionPerformed
    {//GEN-HEADEREND:event_txtValorParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorParaActionPerformed

    private void txtValorParaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorParaKeyTyped
    {//GEN-HEADEREND:event_txtValorParaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorParaKeyTyped

    private void txtValorDeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtValorDeActionPerformed
    {//GEN-HEADEREND:event_txtValorDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeActionPerformed

    private void txtValorDeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorDeKeyTyped
    {//GEN-HEADEREND:event_txtValorDeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeKeyTyped

    private void txtNumeroLeiKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNumeroLeiKeyReleased
    {//GEN-HEADEREND:event_txtNumeroLeiKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtNumeroLeiKeyReleased

    private void txtQuantidadeVagasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyReleased
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtQuantidadeVagasKeyReleased

    private void jtaEmentaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaEmentaKeyReleased
    {//GEN-HEADEREND:event_jtaEmentaKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_jtaEmentaKeyReleased

    private void txtValorDeKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorDeKeyReleased
    {//GEN-HEADEREND:event_txtValorDeKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtValorDeKeyReleased

    private void txtValorParaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtValorParaKeyReleased
    {//GEN-HEADEREND:event_txtValorParaKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtValorParaKeyReleased

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_calendarioPropertyChange
    {//GEN-HEADEREND:event_calendarioPropertyChange
        calendario.getDateEditor().setEnabled(false);
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_calendarioPropertyChange

    private void calendarioKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_calendarioKeyReleased
    {//GEN-HEADEREND:event_calendarioKeyReleased

    }//GEN-LAST:event_calendarioKeyReleased

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
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastrarFundamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cmbAto;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCriacaoExclusao;
    private javax.swing.JPanel jpReajuste;
    private javax.swing.JTextArea jtaEmenta;
    private javax.swing.JTabbedPane jtpAto;
    private javax.swing.JLabel lblDataLei;
    private javax.swing.JLabel lblNumeroLei;
    private javax.swing.JLabel lblQuantidadeVagas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValorDe;
    private javax.swing.JLabel lblValorPara;
    private javax.swing.JTextField txtNumeroLei;
    private javax.swing.JTextField txtQuantidadeVagas;
    private javax.swing.JTextField txtValorDe;
    private javax.swing.JTextField txtValorPara;
    // End of variables declaration//GEN-END:variables
}
