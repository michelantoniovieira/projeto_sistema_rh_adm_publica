/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import Modelo.ControleCadastrarFundamento;
import Modelo.DefinirTamanhoMaximoCampoDeTexto;
import java.awt.event.KeyEvent;
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
    private String numeroDaLei = "";
    private String anoDaLei = "";
    private String dataDaLei = "";
    private String ementaDaLei = "";
    private String atoDaLei = "";
    private String quantidadeCargosEmpregosDaLei = "";
    private JTabbedPane jtp;
    private String de;
    private String para;

    /**
     * Creates new form frmCadastrarFundamento
     */
    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
    }

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, JTabbedPane jtp)
    {
        super(parent, modal);
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
        this.tbFundamentoReajuste = tbFundamentoReajuste;
        initComponents();
        eUmaAlteracao = false;
        txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
        this.jtp = jtp;

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

    public frmCadastrarFundamento(java.awt.Frame parent, boolean modal, DefaultTableModel tbFundamentoCriacaoExclusao, DefaultTableModel tbFundamentoReajuste, String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String quantidadeCargosEmpregosDaLei, int linhaSelecionada, JTabbedPane jtp)
    {
        super(parent, modal);
        this.tbFundamentoCriacaoExclusao = tbFundamentoCriacaoExclusao;
        this.tbFundamentoReajuste = tbFundamentoReajuste;
        initComponents();
        this.txtNumeroLei.setText(numeroDaLei);
        this.numeroDaLei = numeroDaLei;
        this.jffDataLei.setText(dataDaLei);
        this.dataDaLei = dataDaLei;
        this.jtaEmenta.setText(ementaDaLei);
        this.ementaDaLei = ementaDaLei;
        this.cmbAto.getSelectedItem().equals(atoDaLei);
        this.atoDaLei = atoDaLei;
        this.txtQuantidadeVagas.setText(quantidadeCargosEmpregosDaLei);
        this.quantidadeCargosEmpregosDaLei = quantidadeCargosEmpregosDaLei;
        this.eUmaAlteracao = true;
        this.linhaSelecionada = linhaSelecionada;
        this.txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
        this.txtAnoLei.setText(anoDaLei);

        //desativar campos
        this.txtNumeroLei.setEnabled(false);
        this.txtAnoLei.setEnabled(false);

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
        this.numeroDaLei = numeroDaLei;
        this.jffDataLei.setText(dataDaLei);
        this.dataDaLei = dataDaLei;
        this.jtaEmenta.setText(ementaDaLei);
        this.ementaDaLei = ementaDaLei;
        this.cmbAto.getSelectedItem().equals(atoDaLei);
        this.de = de;
        this.para = para;
        this.eUmaAlteracao = true;
        this.linhaSelecionada = linhaSelecionada;
        this.txtAnoLei.setDocument(new DefinirTamanhoMaximoCampoDeTexto(4));
        this.txtAnoLei.setText(anoDaLei);

        //desativar campos
        this.txtNumeroLei.setEnabled(false);
        this.txtAnoLei.setEnabled(false);

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

        jPanel1 = new javax.swing.JPanel();
        lblDataLei = new javax.swing.JLabel();
        jffDataLei = new javax.swing.JFormattedTextField();
        lblNumeroLei = new javax.swing.JLabel();
        txtNumeroLei = new javax.swing.JTextField();
        lblAnoLei = new javax.swing.JLabel();
        txtAnoLei = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEmenta = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Legislação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição Lei", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblDataLei.setText("Data:");

        try
        {
            jffDataLei.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        jffDataLei.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffDataLei.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jffDataLeiFocusLost(evt);
            }
        });
        jffDataLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jffDataLeiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jffDataLeiKeyTyped(evt);
            }
        });

        lblNumeroLei.setText("Número:");

        txtNumeroLei.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNumeroLeiActionPerformed(evt);
            }
        });
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

        lblAnoLei.setText("Ano:");

        txtAnoLei.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtAnoLeiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtAnoLeiFocusLost(evt);
            }
        });
        txtAnoLei.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtAnoLeiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAnoLeiKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroLei)
                    .addComponent(txtNumeroLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnoLei)
                    .addComponent(txtAnoLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataLei)
                    .addComponent(jffDataLei, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataLei)
                    .addComponent(lblAnoLei)
                    .addComponent(lblNumeroLei))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAnoLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jffDataLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNumeroLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ementa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jtaEmenta.setColumns(20);
        jtaEmenta.setRows(5);
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        jtpAto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cmbAto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criação", "Extinção", "Reajuste", "Outros" }));

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

        lblQuantidadeVagas.setText("Quantidade Vagas:");

        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout jpCriacaoExclusaoLayout = new javax.swing.GroupLayout(jpCriacaoExclusao);
        jpCriacaoExclusao.setLayout(jpCriacaoExclusaoLayout);
        jpCriacaoExclusaoLayout.setHorizontalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQuantidadeVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantidadeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCriacaoExclusaoLayout.setVerticalGroup(
            jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriacaoExclusaoLayout.createSequentialGroup()
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeVagas)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriacaoExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addGroup(jpReajusteLayout.createSequentialGroup()
                        .addComponent(lblValorDe)
                        .addGap(94, 94, 94)
                        .addComponent(lblValorPara))
                    .addGroup(jpReajusteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpReajusteLayout.setVerticalGroup(
            jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReajusteLayout.createSequentialGroup()
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPara)
                    .addComponent(lblValorDe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpReajusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jtpAto.addTab("Reajuste", jpReajuste);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpAto)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtpAto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroLeiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNumeroLeiActionPerformed
    {//GEN-HEADEREND:event_txtNumeroLeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLeiActionPerformed

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

        if (jtp.getSelectedIndex() == 0 && !valorDuplicado)
        {
            //executa o for se tiver registro na tabela
            for (int j = 0; j < tbFundamentoCriacaoExclusao.getRowCount(); j++)
            {
                //se o numero e ano da lei estiverem repetidos em algum registro da tabela barra a criação do novo registro
                if (eUmaAlteracao == false && !txtNumeroLei.getText().isEmpty() && txtNumeroLei.getText().equals(tbFundamentoCriacaoExclusao.getValueAt(j, 0)) && !txtAnoLei.getText().isEmpty() && txtAnoLei.getText().equals(tbFundamentoCriacaoExclusao.getValueAt(j, 1)))
                {
                    JOptionPane.showMessageDialog(null, "Registro duplicado na aba Criação/Exclusão!");
                    valorDuplicado = true;
                    break;
                }

                //se os campos estiverem em branco sera mostrado um aviso
                if (eUmaAlteracao == false && txtNumeroLei.getText().isEmpty() || txtAnoLei.getText().isEmpty() || jffDataLei.getText().isEmpty() || txtQuantidadeVagas.getText().isEmpty() || jtaEmenta.getText().isEmpty())
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
                    if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                    {
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tbFundamentoCriacaoExclusao, eUmaAlteracao, linhaSelecionada, txtValorDe.getText(), txtValorPara.getText(), jtp);
                        this.dispose();
                    }
                }
            }
            else
            {
                if (!valorDuplicado)
                {
                    if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty())
                    {
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), cmbAto.getSelectedItem().toString(), txtQuantidadeVagas.getText(), tbFundamentoCriacaoExclusao, eUmaAlteracao, linhaSelecionada, txtValorDe.getText(), txtValorPara.getText(), jtp);
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
                if (eUmaAlteracao == false && !txtNumeroLei.getText().isEmpty() && txtNumeroLei.getText().equals(tbFundamentoReajuste.getValueAt(j, 0)) && !txtAnoLei.getText().isEmpty() && txtAnoLei.getText().equals(tbFundamentoReajuste.getValueAt(j, 1)))
                {
                    JOptionPane.showMessageDialog(null, "Registro duplicado na aba Reajuste!");
                    valorDuplicado = true;
                    break;
                }
                //se os campos estiverem em branco sera mostrado um aviso
                if (eUmaAlteracao == false && txtNumeroLei.getText().isEmpty() || txtAnoLei.getText().isEmpty() || jffDataLei.getText().isEmpty() || txtValorDe.getText().isEmpty() || txtValorPara.getText().isEmpty() || jtaEmenta.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Preencha os campos para continuar.");
                    break;
                }
            }           //script para lançar as informações das tabelas
            if (eUmaAlteracao)
            {
                if (!valorDuplicado)
                {
                    if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtValorDe.getText().isEmpty() && !txtValorPara.getText().isEmpty())
                    {
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), txtValorDe.getText(), txtValorPara.getText(), tbFundamentoReajuste, eUmaAlteracao, linhaSelecionada, jtp);
                        this.dispose();
                    }
                }
            }
            else
            {
                if (!valorDuplicado)
                {

                    if (!txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !jtaEmenta.getText().isEmpty() && !txtValorDe.getText().isEmpty() && !txtValorPara.getText().isEmpty())
                    {
                        ControleCadastrarFundamento controle = new ControleCadastrarFundamento(txtNumeroLei.getText(), txtAnoLei.getText(), jffDataLei.getText(), jtaEmenta.getText(), txtValorDe.getText(), txtValorPara.getText(), tbFundamentoReajuste, eUmaAlteracao, linhaSelecionada, jtp);
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
        boolean camposPreenchidos = !txtNumeroLei.getText().isEmpty() && !txtAnoLei.getText().isEmpty() && !jffDataLei.getText().isEmpty() && !txtQuantidadeVagas.getText().isEmpty() && !jtaEmenta.getText().isEmpty();
        btnCadastrar.setEnabled(camposPreenchidos);
    }

    private void txtAnoLeiKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAnoLeiKeyTyped
    {//GEN-HEADEREND:event_txtAnoLeiKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
        else
        {
            String texto = txtAnoLei.getText();
            if (texto.length() == 3)
            {
                txtAnoLei.setFocusTraversalKeysEnabled(true);
            }
        }
    }//GEN-LAST:event_txtAnoLeiKeyTyped

    private void jffDataLeiKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jffDataLeiKeyTyped
    {//GEN-HEADEREND:event_jffDataLeiKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
        else
        {
            String texto = jffDataLei.getText();
            if (texto.length() == 8)
            {
                jffDataLei.setFocusTraversalKeysEnabled(true);
            }

        }
    }//GEN-LAST:event_jffDataLeiKeyTyped

    private void txtQuantidadeVagasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyTyped
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyTyped
        //Esse código verifica se o caractere digitado é uma letra, um backspace ou um delete. Se não for, o método consume() é chamado no evento, o que impede que o caractere seja inserido no campo de texto.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeVagasKeyTyped

    private void jffDataLeiFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jffDataLeiFocusLost
    {//GEN-HEADEREND:event_jffDataLeiFocusLost

        String data = jffDataLei.getText(); // Obtém o texto do campo
        data = data.replaceAll("[^\\d]", ""); // Remove todos os caracteres que não são dígitos (espaços em branco e a barra)
        int numCaracteresPreenchidos = data.length(); // Conta o número de dígitos restantes

        if (numCaracteresPreenchidos != 8)
        {
            JOptionPane.showMessageDialog(null, "Campo data não pode estar vazio!");
            jffDataLei.requestFocus();
        }
        else
        {
            jffDataLei.setFocusTraversalKeysEnabled(true);
        }
    }//GEN-LAST:event_jffDataLeiFocusLost

    private void txtAnoLeiFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtAnoLeiFocusLost
    {//GEN-HEADEREND:event_txtAnoLeiFocusLost
        String data = txtAnoLei.getText(); // Obtém o texto do campo
        data = data.replaceAll("[^\\d]", ""); // Remove todos os caracteres que não são dígitos (espaços em branco e a barra)
        int numCaracteresPreenchidos = data.length(); // Conta o número de dígitos restantes

        if (numCaracteresPreenchidos != 4)
        {
            JOptionPane.showMessageDialog(null, "Campo ano não pode ser inferior a 4 digitos!");
            txtAnoLei.requestFocusInWindow();
        }


    }//GEN-LAST:event_txtAnoLeiFocusLost

    private void txtAnoLeiKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAnoLeiKeyReleased
    {//GEN-HEADEREND:event_txtAnoLeiKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtAnoLeiKeyReleased

    private void txtAnoLeiFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtAnoLeiFocusGained
    {//GEN-HEADEREND:event_txtAnoLeiFocusGained
        txtAnoLei.setFocusTraversalKeysEnabled(false);
    }//GEN-LAST:event_txtAnoLeiFocusGained

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

    private void jffDataLeiKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jffDataLeiKeyReleased
    {//GEN-HEADEREND:event_jffDataLeiKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_jffDataLeiKeyReleased

    private void txtQuantidadeVagasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeVagasKeyReleased
    {//GEN-HEADEREND:event_txtQuantidadeVagasKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_txtQuantidadeVagasKeyReleased

    private void jtaEmentaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaEmentaKeyReleased
    {//GEN-HEADEREND:event_jtaEmentaKeyReleased
        verificarSeOsCamposEstaoPreenchidos();
    }//GEN-LAST:event_jtaEmentaKeyReleased

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
    private javax.swing.JComboBox<String> cmbAto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jffDataLei;
    private javax.swing.JPanel jpCriacaoExclusao;
    private javax.swing.JPanel jpReajuste;
    private javax.swing.JTextArea jtaEmenta;
    private javax.swing.JTabbedPane jtpAto;
    private javax.swing.JLabel lblAnoLei;
    private javax.swing.JLabel lblDataLei;
    private javax.swing.JLabel lblNumeroLei;
    private javax.swing.JLabel lblQuantidadeVagas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValorDe;
    private javax.swing.JLabel lblValorPara;
    private javax.swing.JTextField txtAnoLei;
    private javax.swing.JTextField txtNumeroLei;
    private javax.swing.JTextField txtQuantidadeVagas;
    private javax.swing.JTextField txtValorDe;
    private javax.swing.JTextField txtValorPara;
    // End of variables declaration//GEN-END:variables
}
