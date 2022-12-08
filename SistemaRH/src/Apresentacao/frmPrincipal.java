/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apresentacao;

import Modelo.CadastrarBancaControle;
import Modelo.CadastrarCargoEmpregoControle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author miche
 */
public class frmPrincipal extends javax.swing.JFrame
{

    frmPortariaDeNomeacao frmPN;
    frmCadastrarUsuario frmCadU;
    frmConfigurarPastaRaiz frmConfigurarPastaRaiz;
    frmPreCadastro frmPC;
    frmCadastrarBanca frmCB;
    frmCadastrarCargoEmprego frmCCE;
    frmCadastrarConcurso frmCC;

    private boolean desativarBotoesFrmCC = true;//essa variavel bloqueia os botoes de menu para não deixar o cara tentar mudar de registro na tela de cadastro de concurso ao clicar no botao novo, por exemplo
    private boolean desativarBotoesFrmCCE = true;

    int index = 0;

    public boolean gravarAlteracaoFrmCC = false;
    public boolean gravarAlteracaoFrmCCE = false;

    public frmPrincipal()
    {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    public frmPrincipal(String usuarioConectado)
    {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.lblUsuarioConectado.setText(usuarioConectado);
        atalhoSair();//permite utilizar as teclas de atalho
        atalhoNovo();
        atalhoPesquisar();
        atalhoAlterar();
        atalhoExcluir();
        atalhoSalvar();
        atalhoPrimeiro();
        atalhoAnterior();
        atalhoProximo();
        atalhoUltimo();
        frmCB = new frmCadastrarBanca();
        frmPN = new frmPortariaDeNomeacao(null, true);
        frmCadU = new frmCadastrarUsuario(null, true);
        frmConfigurarPastaRaiz = new frmConfigurarPastaRaiz(null, true);
        frmPC = new frmPreCadastro();
        frmCCE = new frmCadastrarCargoEmprego();
        frmCC = new frmCadastrarConcurso();
    }

    frmPrincipal(Object object, boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        pnMenu = new java.awt.Panel();
        btnSair = new javax.swing.JButton();
        lblSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnUltimo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        lblAlterar = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        pnRodape = new javax.swing.JPanel();
        lblUsuarioConectado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jdkpPrincipal = new javax.swing.JDesktopPane();
        mnBarra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnCadastrarCargoEmprego = new javax.swing.JMenuItem();
        mnConcurso = new javax.swing.JMenu();
        mnCadastrarBanca = new javax.swing.JMenuItem();
        mnCadastrarConcurso = new javax.swing.JMenuItem();
        mnServidores = new javax.swing.JMenu();
        mnPreCadastroFuncionario = new javax.swing.JMenuItem();
        mnCadastrarFuncionario = new javax.swing.JMenuItem();
        mnPortarias = new javax.swing.JMenu();
        mnPortariaNomeacao = new javax.swing.JMenuItem();
        mnConfiguracao = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnAno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema RH - Michel");
        setName(""); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
        });

        pnMenu.setBackground(new java.awt.Color(204, 204, 204));
        pnMenu.setForeground(new java.awt.Color(204, 204, 204));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnSairKeyPressed(evt);
            }
        });

        lblSair.setText("Sair (backspace)");

        jLabel1.setText("Novo (F5)");

        jLabel2.setText("Excluir (F11)");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Sair");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("Salvar (F2)");

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/anterior 2.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Sair");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrimeiroActionPerformed(evt);
            }
        });

        jLabel4.setText("Primeiro (F9)");

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/anterior 1.png"))); // NOI18N
        btnAnterior.setToolTipText("Sair");
        btnAnterior.setBorder(null);
        btnAnterior.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel5.setText("Anterior (F7)");

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/proximo 1.png"))); // NOI18N
        btnProximo.setToolTipText("Sair");
        btnProximo.setBorder(null);
        btnProximo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProximoActionPerformed(evt);
            }
        });

        jLabel7.setText("Último (F10)");

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/proximo 2.png"))); // NOI18N
        btnUltimo.setToolTipText("Sair");
        btnUltimo.setBorder(null);
        btnUltimo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUltimoActionPerformed(evt);
            }
        });

        jLabel6.setText("Próximo (F8)");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Sair");
        btnExcluir.setBorder(null);
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/alterar.png"))); // NOI18N
        btnAlterar.setToolTipText("Sair");
        btnAlterar.setBorder(null);
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        lblPesquisar.setText("Pesquisar (F6)");

        lblAlterar.setText("Alterar (F7)");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Sair");
        btnPesquisar.setBorder(null);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/novo.png"))); // NOI18N
        btnNovo.setToolTipText("Sair");
        btnNovo.setBorder(null);
        btnNovo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSair)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSair)))
                .addGap(30, 30, 30)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnNovo))
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblPesquisar)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnPesquisar)
                        .addGap(52, 52, 52)))
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlterar)
                    .addComponent(btnAlterar))
                .addGap(46, 46, 46)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(42, 42, 42)))
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnPrimeiro))
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAnterior))
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnProximo))
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnUltimo))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel4)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlterar))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisar)
                            .addComponent(btnSair)
                            .addComponent(btnNovo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSair)
                                .addComponent(jLabel1))
                            .addComponent(lblPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar");

        pnRodape.setBackground(new java.awt.Color(204, 204, 204));

        lblUsuarioConectado.setText("michel");

        lblUsuario.setText("Usuário:");

        javax.swing.GroupLayout pnRodapeLayout = new javax.swing.GroupLayout(pnRodape);
        pnRodape.setLayout(pnRodapeLayout);
        pnRodapeLayout.setHorizontalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioConectado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioConectado)
                    .addComponent(lblUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdkpPrincipalLayout = new javax.swing.GroupLayout(jdkpPrincipal);
        jdkpPrincipal.setLayout(jdkpPrincipalLayout);
        jdkpPrincipalLayout.setHorizontalGroup(
            jdkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1362, Short.MAX_VALUE)
        );
        jdkpPrincipalLayout.setVerticalGroup(
            jdkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jDesktopPane2.setLayer(pnMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(pnRodape, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jdkpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jdkpPrincipal)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdkpPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Cargo/Emprego");

        mnCadastrarCargoEmprego.setText("1 - Cadastrar Cargo/Emprego");
        mnCadastrarCargoEmprego.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarCargoEmpregoActionPerformed(evt);
            }
        });
        jMenu1.add(mnCadastrarCargoEmprego);

        mnBarra.add(jMenu1);

        mnConcurso.setText("Concurso");

        mnCadastrarBanca.setText("1 - Cadastrar Banca");
        mnCadastrarBanca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarBancaActionPerformed(evt);
            }
        });
        mnConcurso.add(mnCadastrarBanca);

        mnCadastrarConcurso.setText("2 - Cadastrar Concurso");
        mnCadastrarConcurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarConcursoActionPerformed(evt);
            }
        });
        mnConcurso.add(mnCadastrarConcurso);

        mnBarra.add(mnConcurso);

        mnServidores.setText("Funcionário");

        mnPreCadastroFuncionario.setText("1 - Pré Cadastro ");
        mnPreCadastroFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnPreCadastroFuncionarioActionPerformed(evt);
            }
        });
        mnServidores.add(mnPreCadastroFuncionario);

        mnCadastrarFuncionario.setText("2 - Cadastrar Funcionário");
        mnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarFuncionarioActionPerformed(evt);
            }
        });
        mnServidores.add(mnCadastrarFuncionario);

        mnBarra.add(mnServidores);

        mnPortarias.setText("Portarias");

        mnPortariaNomeacao.setText("1 - Portaria de Nomeação");
        mnPortariaNomeacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnPortariaNomeacaoActionPerformed(evt);
            }
        });
        mnPortarias.add(mnPortariaNomeacao);

        mnBarra.add(mnPortarias);

        mnConfiguracao.setText("Configuração");

        jMenuItem2.setText("1 - Cadastrar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnConfiguracao.add(jMenuItem2);

        mnAno.setText("2 - Configurar Pasta Raiz");
        mnAno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnAnoActionPerformed(evt);
            }
        });
        mnConfiguracao.add(mnAno);

        mnBarra.add(mnConfiguracao);

        setJMenuBar(mnBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarFuncionarioActionPerformed
        //CODIGO DO BOTÃO MANUTENÇÃO

    }//GEN-LAST:event_mnCadastrarFuncionarioActionPerformed

    private void mnPortariaNomeacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPortariaNomeacaoActionPerformed
        frmPN.setVisible(true);
    }//GEN-LAST:event_mnPortariaNomeacaoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmCadU.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAnoActionPerformed
        frmConfigurarPastaRaiz.setVisible(true);
    }//GEN-LAST:event_mnAnoActionPerformed

    private void mnPreCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPreCadastroFuncionarioActionPerformed
        jdkpPrincipal.add(frmPC);
        frmPC.setVisible(true);
    }//GEN-LAST:event_mnPreCadastroFuncionarioActionPerformed

    private void mnCadastrarBancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarBancaActionPerformed
        jdkpPrincipal.add(frmCB);
        frmCB.setVisible(true);
        frmCB.limparCampos();
        frmCB.desativarCampos();

    }//GEN-LAST:event_mnCadastrarBancaActionPerformed


    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //BOTÃO SAIR

        if (evt.getSource() == btnSair)
        {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed


    }//GEN-LAST:event_btnSairKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //se tiver aparecendo a janela de cadastrar concurso executa essa parte do sistema
        //tela cadastrar banca
        frmCB.gravarRegistro();
        desativarBotoesFrmCC = false;

        //entra aqui quando for gravar o primeiro cadastro
        if (frmCB.isVisible() && !frmCB.getBancaConcurso().equals("") && gravarAlteracaoFrmCC == false)
        {
            //quando eu digitar nos campos da janela CadastrarConcurso e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           
            CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getBancaConcurso(), frmCB.getTelBanca(), frmCB.getResponsavelBanca(), frmCB.getTelResponsavelBanca(), frmCB.getEmailResponsavel());
            controle.cadastrar();
            if (controle.getMensagem().equals("erro 1"))
            {
                JOptionPane.showMessageDialog(null, "Esta banca já foi cadastrada!");
            } else if (controle.getMensagem().equals("ok"))
            {
                JOptionPane.showMessageDialog(null, "Banca cadastrada com sucesso.");
                frmCB.limparCampos();
                frmCB.desativarCampos();
                frmCB.desativarCampos();
            }
        }

        //entra aqui quando for alterar um cadastro
        if (frmCB.isVisible() && !frmCB.getCodigoBanca().equals("") && gravarAlteracaoFrmCC == true)
        {
            CadastrarBancaControle controle = new CadastrarBancaControle(Integer.parseInt(frmCB.getCodigoBanca()), frmCB.getBancaConcurso(), frmCB.getTelBanca(), frmCB.getResponsavelBanca(), frmCB.getTelResponsavelBanca(), frmCB.getEmailResponsavel());
            controle.alterar();
            gravarAlteracaoFrmCC = false;
            frmCB.limparCampos();
            frmCB.desativarCampos();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        }
        
        
        //*******************************************************************************************************************************************************************************************************************************************************************************
        //tela cadastrar cargo/emprego
        frmCCE.gravarRegistro();
        desativarBotoesFrmCCE = false;

        //entra aqui quando for gravar o primeiro cadastro
        if (frmCCE.isVisible() && !frmCCE.getNomeCargoEmprego().equals("") && gravarAlteracaoFrmCCE == false)
        {
            //quando eu digitar nos campos da janela CadastrarConcurso e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           
            CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE.getNomeCargoEmprego(), frmCCE.getRegimeJuridico(), frmCCE.getNumeroLeiCriaCargoEmprego(), frmCCE.getDataLeiCriaCargoEmprego(), frmCCE.getReferenciaSalarial());
            controle.cadastrar();
            if (controle.getMensagem().equals("erro 1"))
            {
                JOptionPane.showMessageDialog(null, "Esta banca já foi cadastrada!");
            } else if (controle.getMensagem().equals("ok"))
            {
                JOptionPane.showMessageDialog(null, "Banca cadastrada com sucesso.");
                frmCCE.limparCampos();
                frmCCE.desativarCampos();
                frmCCE.desativarCampos();
            }
        }

        //entra aqui quando for alterar um cadastro
        if (frmCCE.isVisible() && !frmCCE.getCodigoCargoEmprego().equals("") && gravarAlteracaoFrmCCE == true)
        {
            
            CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(Integer.parseInt(frmCCE.getCodigoCargoEmprego()), frmCCE.getNomeCargoEmprego(), frmCCE.getRegimeJuridico(), frmCCE.getNumeroLeiCriaCargoEmprego(), frmCCE.getDataLeiCriaCargoEmprego(), frmCCE.getReferenciaSalarial());
            controle.alterar();
            gravarAlteracaoFrmCCE = false;
            frmCCE.limparCampos();
            frmCCE.desativarCampos();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            index = 0;
            preencherTelaCadastroBanca(index);
        }

        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            index = 0;
            preencherTelaCadastroCargoEmprego(index);
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            index--;
            if (index >= 0)
            {
                preencherTelaCadastroBanca(index);
            } else
            {
                index = 0;
            }
        }

        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            index--;
            if (index >= 0)
            {
                preencherTelaCadastroCargoEmprego(index);
            } else
            {
                index = 0;
            }
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed

        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            index++;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarBanca.ultimoRegistro)
            {
                index = frmPesquisarBanca.ultimoRegistro;
            }
            preencherTelaCadastroBanca(index);
        }

        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            index++;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarCargoEmprego.ultimoRegistro)
            {
                index = frmPesquisarCargoEmprego.ultimoRegistro;
            }
            preencherTelaCadastroCargoEmprego(index);
        }

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            index = frmPesquisarBanca.ultimoRegistro;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarBanca.ultimoRegistro)
            {
                index = frmPesquisarBanca.ultimoRegistro;
            }

            preencherTelaCadastroBanca(index);
        }

        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            index = frmPesquisarCargoEmprego.ultimoRegistro;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarCargoEmprego.ultimoRegistro)
            {
                index = frmPesquisarCargoEmprego.ultimoRegistro;
            }

            preencherTelaCadastroCargoEmprego(index);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void preencherTelaCadastroBanca(int index)
    {
        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getBancaConcurso());
            controle.pesquisar(index);

            if (!frmCB.getCodigoBanca().equals(""))
            {
                frmCB.setCodigoBanca(String.valueOf(controle.getCodigo_Banca()));
                frmCB.setBancaConcurso(String.valueOf(controle.getNome_banca_organizadora()));
                frmCB.setTelBanca(String.valueOf(controle.getTelefone_banca_organizadora()));
                frmCB.setResponsavelBanca(String.valueOf(controle.getResponsavel_banca_organizadora()));
                frmCB.setTelResponsavelBanca(String.valueOf(controle.getTelefone_responsavel_banca_organizadora()));
                frmCB.setEmailResponsavel(String.valueOf(controle.getEmail_banca_organizadora()));
                frmCB.preencherCampos();
            }
        }

    }

    private void preencherTelaCadastroCargoEmprego(int index)
    {
        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE.getNomeCargoEmprego());
            controle.pesquisar(index);

            if (!frmCCE.getCodigoCargoEmprego().equals(""))
            {
                frmCCE.setCodigoCargoEmprego(String.valueOf(controle.getCodigoCargoEmprego()));
                frmCCE.setNomeCargoEmprego(String.valueOf(controle.getNomeCargoEmprego()));
                frmCCE.setRegimeJuridico(String.valueOf(controle.getRegimeJuridico()));
                frmCCE.setNumeroLeiCriaCargoEmprego(String.valueOf(controle.getNumeroLeiCriaCargoEmprego()));
                frmCCE.setDataLeiCriaCargoEmprego(String.valueOf(controle.getDataLeiCriaCargoEmprego()));
                frmCCE.setReferenciaSalarial(String.valueOf(controle.getReferenciaSalarial()));
                frmCCE.preencherCampos();
            }
        }
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //cadastrar banca
        if (frmCB.isVisible() && !frmCB.getBancaConcurso().equals("") && desativarBotoesFrmCC == false)
        {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a exclusão do registro?", "Sair", JOptionPane.YES_NO_OPTION, 2);

            if (resposta == JOptionPane.YES_OPTION)
            {
                CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getBancaConcurso());
                controle.excluir();
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                frmCB.limparCampos();
            }
        }
        
        //cadastrar cargo/emprego
        if (frmCCE.isVisible() && !frmCCE.getNomeCargoEmprego().equals("") && desativarBotoesFrmCCE == false)
        {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a exclusão do registro?", "Sair", JOptionPane.YES_NO_OPTION, 2);

            if (resposta == JOptionPane.YES_OPTION)
            {
                CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE.getNomeCargoEmprego());
                controle.excluir();
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                frmCCE.limparCampos();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        //janela cadastrar banca
        if (frmCB.isVisible() && !frmCB.getBancaConcurso().equals("") && gravarAlteracaoFrmCC == false)
        {
            frmCB.ativarCampos();
            gravarAlteracaoFrmCC = true;
        }
        
        //janela cadastrar cargo/emprego
        if (frmCCE.isVisible() && !frmCCE.getNomeCargoEmprego().equals("") && gravarAlteracaoFrmCCE == false)
        {
            frmCCE.ativarCampos();
            gravarAlteracaoFrmCCE = true;
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        //se tiver aparecendo a janela de cadastrar concurso executa essa parte do sistema
        //COMANDO PARA pesquisar AS INFORMAÇÕES NA TELA CONCURSO
        //frmCC.gravarRegistro();
        //tela cadastrar banca
        if (frmCB.isVisible())
        {

            frmPesquisarBanca frmPB = new frmPesquisarBanca(null, true);
            if (frmPB.getLista() != null)
            {
                frmPB.setVisible(true);
                //se a mensagem for pode passar entra no if abaixo
                if (frmPB.getMensagem().equals("pode passar"))
                {
                    //coloco na tela de cadastro de concurso, seto na variavel a lista e o index puxado direto da tela frmPesquisarConcurso 
                    frmCB.setCodigoBanca(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getCodigoBanca()));
                    frmCB.setBancaConcurso(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getNome_banca_organizadora()));
                    frmCB.setTelBanca(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getTelefone_banca_organizadora()));
                    frmCB.setResponsavelBanca(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getResponsavel_banca_organizadora()));
                    frmCB.setTelResponsavelBanca(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getTelefone_responsavel_banca_organizadora()));
                    frmCB.setEmailResponsavel(String.valueOf(frmPB.getLista().get(frmPB.getIndex()).getEmail_banca_organizadora()));

                    frmCB.preencherCampos();
                    frmCB.desativarCampos();
                    desativarBotoesFrmCC = false;
                    gravarAlteracaoFrmCC = false;//este botão serve para quando o usuario selecionar algum registro e clicar em alterar e caso clique no botão pesquisar e depois alterar ele consegue realizar a alteração

                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Não existem registros para serem consultados!");
            }

        } else if (frmCB.isVisible())
        {
            JOptionPane.showMessageDialog(null, "Digite as informações antes de salvar.");
        }

        //***************************************************************************************
        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible())
        {
            frmPesquisarCargoEmprego frmPCE = new frmPesquisarCargoEmprego(null, true);
            if (frmPCE.getLista() != null)
            {
                frmPCE.setVisible(true);
                //se a mensagem for pode passar entra no if abaixo
                if (frmPCE.getMensagem().equals("pode passar"))
                {
                    //coloco na tela de cadastro de concurso, seto na variavel a lista e o index puxado direto da tela frmPesquisarConcurso 
                    frmCCE.setCodigoCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getCodigoCargoEmprego()));
                    frmCCE.setNomeCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getNomeCargoEmprego()));
                    frmCCE.setRegimeJuridico(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getRegimeJuridico()));
                    frmCCE.setNumeroLeiCriaCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getNumeroLeiCriaCargoEmprego()));
                    frmCCE.setDataLeiCriaCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getDataLeiCriaCargoEmprego()));
                    frmCCE.setReferenciaSalarial(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getReferenciaSalarial()));

                    frmCCE.preencherCampos();
                    frmCCE.desativarCampos();
                    desativarBotoesFrmCCE = false;
                    gravarAlteracaoFrmCCE = false;//este botão serve para quando o usuario selecionar algum registro e clicar em alterar e caso clique no botão pesquisar e depois alterar ele consegue realizar a alteração

                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Não existem registros para serem consultados!");
            }

        } else if (frmCB.isVisible())
        {
            JOptionPane.showMessageDialog(null, "Digite as informações antes de salvar.");
        }


    }//GEN-LAST:event_btnPesquisarActionPerformed


    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        //tela cadastro banca
        if (frmCB.isVisible())
        {
            desativarBotoesFrmCC = true;
            frmCB.ativarCampos();
            frmCB.limparCampos();
        }
        
        //tela cadastro cargo/emprego
        if (frmCCE.isVisible())
        {
            desativarBotoesFrmCCE = true;
            frmCCE.ativarCampos();
            frmCCE.limparCampos();
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void mnCadastrarConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnCadastrarConcursoActionPerformed
    {//GEN-HEADEREND:event_mnCadastrarConcursoActionPerformed
        jdkpPrincipal.add(frmCC);
        frmCC.setVisible(true);
        frmCC.limparCampos();
        frmCC.desativarCampos();
    }//GEN-LAST:event_mnCadastrarConcursoActionPerformed

    private void mnCadastrarCargoEmpregoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnCadastrarCargoEmpregoActionPerformed
    {//GEN-HEADEREND:event_mnCadastrarCargoEmpregoActionPerformed
        jdkpPrincipal.add(frmCCE);
        frmCCE.setVisible(true);
        frmCCE.limparCampos();
        frmCCE.desativarCampos();
    }//GEN-LAST:event_mnCadastrarCargoEmpregoActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    //para este metodo funcionar eu devo chamalo no método construtor
    public void atalhoSair()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "BACKSPACE");
        rootPane.getRootPane().getActionMap().put("BACKSPACE", new AbstractAction("BACKSPACE")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnSair.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoNovo()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "NOVO");
        rootPane.getRootPane().getActionMap().put("NOVO", new AbstractAction("NOVO")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnNovo.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoPesquisar()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0), "PESQUISAR");
        rootPane.getRootPane().getActionMap().put("PESQUISAR", new AbstractAction("PESQUISAR")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnPesquisar.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoAlterar()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "ALTERAR");
        rootPane.getRootPane().getActionMap().put("ALTERAR", new AbstractAction("ALTERAR")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnAlterar.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoExcluir()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "EXCLUIR");
        rootPane.getRootPane().getActionMap().put("EXCLUIR", new AbstractAction("EXCLUIR")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnExcluir.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoSalvar()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), "SALVAR");
        rootPane.getRootPane().getActionMap().put("SALVAR", new AbstractAction("SALVAR")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnSalvar.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoPrimeiro()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "PRIMEIRO");
        rootPane.getRootPane().getActionMap().put("PRIMEIRO", new AbstractAction("PRIMEIRO")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnPrimeiro.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoAnterior()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "ANTERIOR");
        rootPane.getRootPane().getActionMap().put("ANTERIOR", new AbstractAction("ANTERIOR")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnAnterior.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoProximo()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0), "PROXIMO");
        rootPane.getRootPane().getActionMap().put("PROXIMO", new AbstractAction("PROXIMO")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnProximo.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }

    public void atalhoUltimo()
    {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0), "ULTIMO");
        rootPane.getRootPane().getActionMap().put("ULTIMO", new AbstractAction("ULTIMO")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnUltimo.doClick();//Aqui é onde ocorre o evento simulando o click do botão através da tecla ENTER
                // Mas o indicado é você criar um método para realizar essa tarefa e chama-lo onde for necessário.
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdkpPrincipal;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioConectado;
    private javax.swing.JMenuItem mnAno;
    private javax.swing.JMenuBar mnBarra;
    private javax.swing.JMenuItem mnCadastrarBanca;
    private javax.swing.JMenuItem mnCadastrarCargoEmprego;
    private javax.swing.JMenuItem mnCadastrarConcurso;
    private javax.swing.JMenuItem mnCadastrarFuncionario;
    private javax.swing.JMenu mnConcurso;
    private javax.swing.JMenu mnConfiguracao;
    private javax.swing.JMenuItem mnPortariaNomeacao;
    private javax.swing.JMenu mnPortarias;
    private javax.swing.JMenuItem mnPreCadastroFuncionario;
    private javax.swing.JMenu mnServidores;
    private java.awt.Panel pnMenu;
    private javax.swing.JPanel pnRodape;
    // End of variables declaration//GEN-END:variables
}
