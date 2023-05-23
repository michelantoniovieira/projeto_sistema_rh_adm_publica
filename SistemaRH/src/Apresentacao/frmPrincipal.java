/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apresentacao;

import Controle.CadastrarCargoEmpregoControle;
import Modelo.CadastrarBancaControle;
import Modelo.CadastrarConcursoControle;
import Modelo.GerenciadorDeCoresDaInterface;
import Modelo.GerenciadorDeJanelas;
import Modelo.GerenciadorDeJanelas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

/**
 *
 * @author miche
 */
public class frmPrincipal extends javax.swing.JFrame
{

    public int contador = 0;
    frmPortariaDeNomeacao frmPN;
    frmCadastrarUsuario frmCadU;
    frmConfigurarPastaRaiz frmConfigurarPastaRaiz;
    frmPreCadastro frmPC;
    frmCadastrarBanca frmCB;
    frmCadastrarCargoEmprego frmCCE;
    frmCadastrarConcurso frmCC;

    //gerenciadores
    GerenciadorDeJanelas gerenciador;
    GerenciadorDeCoresDaInterface gerenciadorCores;

    //criação do menuJanela que gerencia janelas abertas
    static JMenu menuJanela = new JMenu("Janela");
    static JMenuItem fecharTodasJanelas = new JMenuItem("- Fechar Todas -");
    static JMenuItem organizarJanelas = new JMenuItem("Organizar Janelas");

    private boolean desativarBotoesFrmCC;//essa variavel bloqueia os botoes de menu para não deixar o cara tentar mudar de registro na tela de cadastro de concurso ao clicar no botao novo, por exemplo

    public void setDesativarBotoesFrmCC(boolean desativarBotoesFrmCC)
    {
        this.desativarBotoesFrmCC = desativarBotoesFrmCC;
    }
    private boolean desativarBotoesFrmCCE = true;

    Integer index = 0;

    //cadastrar banca
    public boolean gravarAlteracaoFrmCB = false;
    //cadastrar cargo e emprego
    public boolean gravarAlteracaoFrmCCE = false;
    //cadastrar concurso
    public boolean gravarAlteracaoFrmCC = false;

    public void setGravarAlteracaoFrmCC(boolean gravarAlteracaoFrmCC)
    {
        this.gravarAlteracaoFrmCC = gravarAlteracaoFrmCC;
    }

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

        //menu gerenciador janelas abertas
        mnBarra.add(menuJanela);
        menuJanela.add(fecharTodasJanelas);
        menuJanela.add(organizarJanelas);

        //gerenciador
        gerenciador = new GerenciadorDeJanelas();
        gerenciadorCores = new GerenciadorDeCoresDaInterface();

        //definição
        definicoesSistema();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jdkpCabecalho = new javax.swing.JDesktopPane();
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
        jdkpPrincipal = new javax.swing.JDesktopPane();
        jdkpRodape = new javax.swing.JDesktopPane();
        pnRodape = new javax.swing.JPanel();
        lblUsuarioConectado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        mnBarra = new javax.swing.JMenuBar();
        mnAdministracao = new javax.swing.JMenu();
        mnCargoEmprego = new javax.swing.JMenu();
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
        mnCadastrarUsuario = new javax.swing.JMenuItem();
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

        jdkpCabecalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addGap(59, 59, 59)
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
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
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
                .addGap(0, 5, Short.MAX_VALUE))
        );

        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar");

        jdkpCabecalho.setLayer(pnMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdkpCabecalhoLayout = new javax.swing.GroupLayout(jdkpCabecalho);
        jdkpCabecalho.setLayout(jdkpCabecalhoLayout);
        jdkpCabecalhoLayout.setHorizontalGroup(
            jdkpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdkpCabecalhoLayout.setVerticalGroup(
            jdkpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdkpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jdkpPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jdkpPrincipal.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jdkpPrincipalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jdkpPrincipalLayout = new javax.swing.GroupLayout(jdkpPrincipal);
        jdkpPrincipal.setLayout(jdkpPrincipalLayout);
        jdkpPrincipalLayout.setHorizontalGroup(
            jdkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1114, Short.MAX_VALUE)
        );
        jdkpPrincipalLayout.setVerticalGroup(
            jdkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        jdkpRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                    .addComponent(lblUsuario)
                    .addComponent(lblUsuarioConectado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdkpRodape.setLayer(pnRodape, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdkpRodapeLayout = new javax.swing.GroupLayout(jdkpRodape);
        jdkpRodape.setLayout(jdkpRodapeLayout);
        jdkpRodapeLayout.setHorizontalGroup(
            jdkpRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdkpRodapeLayout.setVerticalGroup(
            jdkpRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mnAdministracao.setText("Administração");
        mnBarra.add(mnAdministracao);

        mnCargoEmprego.setText("Cargo/Emprego");

        mnCadastrarCargoEmprego.setText("1 - Cadastrar Cargo/Emprego");
        mnCadastrarCargoEmprego.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarCargoEmpregoActionPerformed(evt);
            }
        });
        mnCargoEmprego.add(mnCadastrarCargoEmprego);

        mnBarra.add(mnCargoEmprego);

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

        mnCadastrarUsuario.setText("1 - Cadastrar Usuário");
        mnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnConfiguracao.add(mnCadastrarUsuario);

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
            .addComponent(jdkpCabecalho)
            .addComponent(jdkpRodape)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jdkpPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdkpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
                .addComponent(jdkpRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jdkpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarFuncionarioActionPerformed
        //gerenciadorJanelasAbertas(gerenciador);

    }//GEN-LAST:event_mnCadastrarFuncionarioActionPerformed

    private void mnPortariaNomeacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPortariaNomeacaoActionPerformed
        frmPN.setVisible(true);
        //gerenciadorJanelasAbertas(gerenciador, frmPN);
    }//GEN-LAST:event_mnPortariaNomeacaoActionPerformed

    private void mnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarUsuarioActionPerformed
        frmCadU.setVisible(true);
        //gerenciadorJanelasAbertas(gerenciador, frmCadU);
    }//GEN-LAST:event_mnCadastrarUsuarioActionPerformed

    private void mnAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAnoActionPerformed
        frmConfigurarPastaRaiz.setVisible(true);
        //gerenciadorJanelasAbertas(gerenciador, frmConfigurarPastaRaiz);
    }//GEN-LAST:event_mnAnoActionPerformed

    private void mnPreCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPreCadastroFuncionarioActionPerformed
        if (verificarSeAJanelaJaEstaAberta(frmPC, jdkpPrincipal))
        {
            frmPC.toFront();
        }
        else
        {
            jdkpPrincipal.add(frmPC, 5);
            gerenciadorJanelasAbertas(gerenciador, frmPC);
            frmPC.setLocation(0, 0);
            frmPC.setVisible(true);
            frmPC.pack();
        }
    }//GEN-LAST:event_mnPreCadastroFuncionarioActionPerformed

    private void mnCadastrarBancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarBancaActionPerformed
        if (verificarSeAJanelaJaEstaAberta(frmCB, jdkpPrincipal))
        {
            frmCB.toFront();
        }
        else
        {
            frmCB.setLocation(0, 0);
            frmCB.pack();
            jdkpPrincipal.add(frmCB, 3);
            gerenciadorJanelasAbertas(gerenciador, frmCB);
            frmCB.setVisible(true);
            frmCB.limparCampos();
            frmCB.desativarCampos();
        }
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
        if (frmCB.isVisible() && !frmCB.getBancaConcurso().equals("") && gravarAlteracaoFrmCB == false)
        {
            //quando eu digitar nos campos da janela CadastrarConcurso e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           
            CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getBancaConcurso(), frmCB.getTelBanca(), frmCB.getResponsavelBanca(), frmCB.getTelResponsavelBanca(), frmCB.getEmailResponsavel());
            controle.cadastrar();
            if (controle.getMensagem().equals("erro 1"))
            {
                JOptionPane.showMessageDialog(null, "Esta banca já foi cadastrada!");
            }
            else if (controle.getMensagem().equals("ok"))
            {
                JOptionPane.showMessageDialog(null, "Banca cadastrada com sucesso.");
                frmCB.limparCampos();
                frmCB.desativarCampos();
                frmCB.desativarCampos();
            }
        }

        //entra aqui quando for alterar um cadastro
        if (frmCB.isVisible() && !frmCB.getCodigoBanca().equals("") && gravarAlteracaoFrmCB == true)
        {
            CadastrarBancaControle controle = new CadastrarBancaControle(Integer.parseInt(frmCB.getCodigoBanca()), frmCB.getBancaConcurso(), frmCB.getTelBanca(), frmCB.getResponsavelBanca(), frmCB.getTelResponsavelBanca(), frmCB.getEmailResponsavel());
            controle.alterar();
            gravarAlteracaoFrmCB = false;
            frmCB.limparCampos();
            frmCB.desativarCampos();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        }

        //*******************************************************************************************************************************************************************************************************************************************************************************
        //tela cadastrar cargo/emprego
        frmCCE.gravarRegistro();
        desativarBotoesFrmCCE = false;

        //entra aqui quando for gravar o primeiro cadastro
        if (frmCCE.isVisible() && !frmCCE.getDescricaoCargoEmprego().equals("") && gravarAlteracaoFrmCCE == false)
        {

            //quando eu digitar nos campos da janela CadastrarConcursoCargoEmprego e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           
            CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE);
            controle.cadastrarCargoEmprego();
            if (controle.getMensagem().equals("erro 1"))
            {
                JOptionPane.showMessageDialog(null, "Esta banca já foi cadastrada!");
            }
            else if (controle.getMensagem().equals("ok"))
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

            //CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(Integer.parseInt(frmCCE.getCodigoCargoEmprego()), frmCCE.getNomeCargoEmprego(), frmCCE.getRegimeJuridico(), frmCCE.getNumeroLeiCriaCargoEmprego(), frmCCE.getDataLeiCriaCargoEmprego(), frmCCE.getReferenciaSalarial());
            gravarAlteracaoFrmCCE = false;
            frmCCE.limparCampos();
            frmCCE.desativarCampos();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        }

        //*******************************************************************************************************************************************************************************************************************************************************************************
        //tela cadastrar concurso
        frmCC.gravarRegistro();
        desativarBotoesFrmCC = false;

        //entra aqui quando for gravar o primeiro cadastro
        if (frmCC.isVisible() && !frmCC.getNumeroConcurso().equals("") && gravarAlteracaoFrmCC == false)
        {
            //quando eu digitar nos campos da janela CadastrarConcurso e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           

            CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(frmCC.getNumeroConcurso()), Integer.parseInt(frmCC.getAnoConcurso()), Integer.parseInt(frmCC.getSituacaoConcurso()), Integer.parseInt(frmCC.getFk_matricula_responsavel_concurso()), Integer.parseInt(frmCC.getFk_codigo_banca()));
            controle.cadastrar();
            if (controle.getMensagem().equals("erro 1"))
            {
                JOptionPane.showMessageDialog(null, "Este concurso já foi cadastrado!");
            }
            else if (controle.getMensagem().equals("ok"))
            {
                JOptionPane.showMessageDialog(null, "Concurso cadastrado com sucesso.");
                gravarAlteracaoFrmCCE = false;
                frmCC.limparCampos();
                frmCC.desativarCampos();
                JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
            }
        }

        //entra aqui quando for alterar um cadastro
        if (frmCC.isVisible() && !frmCC.getCodigoConcurso().equals("") && gravarAlteracaoFrmCC == true)
        {
            CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(frmCC.getCodigoConcurso()), Integer.parseInt(frmCC.getNumeroConcurso()), Integer.parseInt(frmCC.getAnoConcurso()), Integer.parseInt(frmCC.getSituacaoConcurso()), Integer.parseInt(frmCC.getFk_matricula_responsavel_concurso()), Integer.parseInt(frmCC.getFk_codigo_banca()));
            System.out.println("botao salvar/alterar cadastro concurso/codigo banca" + frmCC.getFk_codigo_banca());
            controle.alterar();
            gravarAlteracaoFrmCC = false;
            frmCC.limparCampos();
            frmCC.desativarCampos();
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

        //tela cadastrar concurso
        if (frmCC.isVisible() && desativarBotoesFrmCC == false)
        {
            index = 0;
            preencherTelaCadastroConcurso(index);
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
            }
            else
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
            }
            else
            {
                index = 0;
            }
        }

        //tela cadastrar concurso
        if (frmCC.isVisible() && desativarBotoesFrmCC == false)
        {
            index--;
            if (index >= 0)
            {
                preencherTelaCadastroConcurso(index);
            }
            else
            {
                index = 0;
            }
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed

        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            if (index == null)
            {
                index = 1;
            }
            else
            {
                index += 0;
            }
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
            if (index == null)
            {
                index = 1;
            }
            else
            {
                index += 0;
            }
            index++;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarCargoEmprego.ultimoRegistro)
            {
                index = frmPesquisarCargoEmprego.ultimoRegistro;
            }
            preencherTelaCadastroCargoEmprego(index);
        }

        //tela cadastrar concurso
        if (frmCC.isVisible() && desativarBotoesFrmCC == false)
        {
            if (index == null)
            {
                index = 1;
            }
            else
            {
                index += 0;
            }
            index++;
            System.out.println("index" + index);
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarConcurso.ultimoRegistro)
            {
                index = frmPesquisarConcurso.ultimoRegistro;
            }
            preencherTelaCadastroConcurso(index);
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

        //tela cadastrar concurso
        if (frmCC.isVisible() && desativarBotoesFrmCC == false)
        {
            index = frmPesquisarConcurso.ultimoRegistro;
            //este bloco de comando não deixa a seleção ser maior que o último registro do banco
            if (index > frmPesquisarConcurso.ultimoRegistro)
            {
                index = frmPesquisarConcurso.ultimoRegistro;
            }
            preencherTelaCadastroConcurso(index);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed
    //prencher tela cadastro cargo emprego
    private void preencherTelaCadastroCargoEmprego(int index)
    {
        //tela cadastrar cargo/emprego
        if (frmCCE.isVisible() && desativarBotoesFrmCCE == false)
        {
            //CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE.getNomeCargoEmprego());
            //controle.pesquisar(index);

            if (!frmCCE.getCodigoCargoEmprego().equals(""))
            {
                /*
                frmCCE.setCodigoCargoEmprego(String.valueOf(controle.getCodigoCargoEmprego()));
                frmCCE.setNomeCargoEmprego(String.valueOf(controle.getDescricaoCargoEmprego()));
                frmCCE.setRegimeJuridico(String.valueOf(controle.getRegimeJuridicoCargoEmprego()));
                frmCCE.setNumeroLeiCriaCargoEmprego(String.valueOf(controle.getNumeroLeiCriaCargoEmprego()));
                frmCCE.setDataLeiCriaCargoEmprego(String.valueOf(controle.getDataLeiCriaCargoEmprego()));
                //frmCCE.setReferenciaSalarial(String.valueOf(controle.getReferenciaSalarial()));
                frmCCE.preencherCampos();
                 */
            }
        }
    }

    //prencher tela cadastro banca
    private void preencherTelaCadastroBanca(int index)
    {
        //tela cadastrar banca
        if (frmCB.isVisible() && desativarBotoesFrmCC == false)
        {
            CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getCodigoBanca(), frmCB.getBancaConcurso());
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

    //prencher tela cadastro concurso
    private void preencherTelaCadastroConcurso(int index)
    {
        //tela cadastrar banca
        if (frmCC.isVisible() && desativarBotoesFrmCC == false)
        {
            System.out.println("" + frmCC.getCodigoConcurso());
            System.out.println("" + frmCC.getNumeroConcurso());
            System.out.println("" + frmCC.getAnoConcurso());
            System.out.println("" + frmCC.getSituacaoConcurso());
            System.out.println("" + frmCC.getFk_matricula_responsavel_concurso());
            System.out.println("" + frmCC.getFk_codigo_banca());
//oproblema esta aqui
            CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(frmCC.getCodigoConcurso()), Integer.parseInt(frmCC.getNumeroConcurso()), Integer.parseInt(frmCC.getAnoConcurso()), Integer.parseInt(frmCC.getSituacaoConcurso()), Integer.parseInt(frmCC.getFk_matricula_responsavel_concurso()), Integer.parseInt(frmCC.getFk_codigo_banca()));

            controle.pesquisar(index);

            if (!frmCC.getCodigoConcurso().equals(""))
            {
                frmCC.setCodigoConcurso(String.valueOf(controle.getCodigo_concurso()));
                frmCC.setNumeroConcurso(String.valueOf(controle.getNumero_Concurso()));
                frmCC.setAnoConcurso(String.valueOf(controle.getAno_Concurso()));
                frmCC.setSituacaoConcurso(String.valueOf(controle.getSituacao_Concurso()));
                frmCC.setFk_matricula_responsavel_concurso(String.valueOf(controle.getFk_Matricula_Responsavel_Concurso()));
                frmCC.setFk_codigo_banca(String.valueOf(controle.getFk_codigo_banca()));
                frmCC.preencherCampos();

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
                CadastrarBancaControle controle = new CadastrarBancaControle(frmCB.getCodigoBanca(), frmCB.getBancaConcurso());
                try
                {
                    controle.excluir();
                    if (controle.getMensagem().equals("concurso_vinculado"))
                    {
                        JOptionPane.showMessageDialog(null, "Não sera possivel excluir a banca, pois a mesma já se encontra vinculada a um concurso!");
                    }
                    else if (controle.getMensagem().equals("ok"))
                    {
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        frmCB.limparCampos();
                    }
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        //cadastrar cargo/emprego
        if (frmCCE.isVisible() && !frmCCE.getDescricaoCargoEmprego().equals("") && desativarBotoesFrmCCE == false)
        {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a exclusão do registro?", "Sair", JOptionPane.YES_NO_OPTION, 2);

            if (resposta == JOptionPane.YES_OPTION)
            {
                //CadastrarCargoEmpregoControle controle = new CadastrarCargoEmpregoControle(frmCCE.getNomeCargoEmprego());
                //controle.excluir();
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                frmCCE.limparCampos();
            }
        }

        //cadastrar concurso
        if (frmCC.isVisible() && !frmCC.getNumeroConcurso().equals("") && !frmCC.getAnoConcurso().equals("") & desativarBotoesFrmCC == false)
        {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a exclusão do registro?", "Sair", JOptionPane.YES_NO_OPTION, 2);

            if (resposta == JOptionPane.YES_OPTION)
            {
                CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(frmCC.getNumeroConcurso()), Integer.parseInt(frmCC.getAnoConcurso()));
                controle.excluir();
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                frmCC.limparCampos();
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        //janela cadastrar banca
        if (frmCB.isVisible() && !frmCB.getBancaConcurso().equals("") && gravarAlteracaoFrmCB == false)
        {
            frmCB.ativarCampos();
            gravarAlteracaoFrmCB = true;
        }

        //janela cadastrar cargo/emprego
        if (frmCCE.isVisible() && !frmCCE.getDescricaoCargoEmprego().equals("") && gravarAlteracaoFrmCCE == false)
        {
            frmCCE.ativarCampos();
            gravarAlteracaoFrmCCE = true;
        }

        //janela cadastrar concurso
        if (frmCC.isVisible() && !frmCC.getNumeroConcurso().equals("") && gravarAlteracaoFrmCC == false)
        {
            frmCC.ativarCampos();
            gravarAlteracaoFrmCC = true;
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
                    gravarAlteracaoFrmCB = false;//este botão serve para quando o usuario selecionar algum registro e clicar em alterar e caso clique no botão pesquisar e depois alterar ele consegue realizar a alteração
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não existem registros para serem consultados!");
            }

        }
        else if (frmCB.isVisible())
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
                    frmCCE.setDescricaoCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getDescricaoCargoEmprego()));
                    frmCCE.setRegimeJuridico(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getRegimeJuridicoCargoEmprego()));
                    frmCCE.setNumeroLeiCriaCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getNumeroLeiCriaCargoEmprego()));
                    frmCCE.setDataLeiCriaCargoEmprego(String.valueOf(frmPCE.getLista().get(frmPCE.getIndex()).getDataLeiCriaCargoEmprego()));

                    frmCCE.preencherCampos();
                    frmCCE.desativarCampos();
                    desativarBotoesFrmCCE = false;
                    gravarAlteracaoFrmCCE = false;//este botão serve para quando o usuario selecionar algum registro e clicar em alterar e caso clique no botão pesquisar e depois alterar ele consegue realizar a alteração
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não existem registros para serem consultados!");
            }
        }
        else if (frmCCE.isVisible())
        {
            JOptionPane.showMessageDialog(null, "Digite as informações antes de salvar.");
        }

        //***************************************************************************************
        //tela cadastrar concurso
        //se a tela estiver visivel e a aba selecionada foi a primeira ele mostra a janela pesquisar concurso
        if (frmCC.isVisible())
        {
            frmPesquisarConcurso frmPC = new frmPesquisarConcurso(null, true);
            if (frmPC.getLista() != null)
            {
                frmPC.setVisible(true);
                //se a mensagem for pode passar entra no if abaixo
                if (frmPC.getMensagem() == "pode passar" && frmPC.getMensagem() != null)
                {
                    frmCC.limparCampos();
                    //coloco na tela de cadastro de concurso, seto na variavel a lista e o index puxado direto da tela frmPesquisarConcurso 
                    frmCC.setCodigoConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getCodigoConcurso()));
                    frmCC.setNumeroConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getNumero_concurso()));
                    frmCC.setAnoConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getAno_concurso()));
                    frmCC.setSituacaoConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getSituacao_concurso()));
                    frmCC.setFk_matricula_responsavel_concurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getFk_matricula_responsavel_concurso()));
                    frmCC.setFk_codigo_banca(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getFk_codigo_banca()));

                    frmCC.preencherCampos();
                    frmCC.desativarCampos();
                    frmCC.popularTabelaCadastroCargoEmprego(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getCodigoConcurso()));
                    frmCC.ativarBotaoCadastrarRemover();
                    desativarBotoesFrmCC = false;
                    gravarAlteracaoFrmCC = false;//este botão serve para quando o usuario selecionar algum registro e clicar em alterar e caso clique no botão pesquisar e depois alterar ele consegue realizar a alteração
                    //ao pesquisar puxa as informações do concurso na tela
                    frmCC.carregarLabels();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não existem registros para serem consultados!");
            }
        }
        else if (frmCC.isVisible() && frmCC.getJtpCadastrarConcurso() == 0)
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

        //tela cadastro concurso
        //se a tela cadastrar concurso estiver visivel e a aba 1 da tela cadastrar concurso estiver visivel abre os campos para cadastrar um novo registro
        if (frmCC.isVisible() && frmCC.getJtpCadastrarConcurso() == 0)
        {
            desativarBotoesFrmCC = true;
            frmCC.ativarCampos();
            frmCC.limparCampos();
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void mnCadastrarConcursoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnCadastrarConcursoActionPerformed
    {//GEN-HEADEREND:event_mnCadastrarConcursoActionPerformed
        if (verificarSeAJanelaJaEstaAberta(frmCC, jdkpPrincipal))
        {
            frmCC.toFront();
        }
        else
        {
            jdkpPrincipal.add(frmCC, 4);
            gerenciadorJanelasAbertas(gerenciador, frmCC);
            frmCC.setLocation(0, 0);
            frmCC.pack();
            frmCC.setVisible(true);
            frmCC.limparCampos();
            frmCC.desativarCampos();
            gravarAlteracaoFrmCC = false;
            index = 0;
        }
    }//GEN-LAST:event_mnCadastrarConcursoActionPerformed

    private void mnCadastrarCargoEmpregoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnCadastrarCargoEmpregoActionPerformed
    {//GEN-HEADEREND:event_mnCadastrarCargoEmpregoActionPerformed
        if (verificarSeAJanelaJaEstaAberta(frmCCE, jdkpPrincipal))
        {
            frmCCE.toFront();
        }
        else
        {
            frmCCE.setLocation((jdkpPrincipal.getWidth() - frmCCE.getWidth()) / 2, (jdkpPrincipal.getHeight() - frmCCE.getHeight()) / 2);
            frmCCE.pack();
            jdkpPrincipal.add(frmCCE, 2);
            gerenciadorJanelasAbertas(gerenciador, frmCCE);
            frmCCE.setVisible(true);
            frmCCE.limparCampos();
            frmCCE.desativarCampos();
        }
    }//GEN-LAST:event_mnCadastrarCargoEmpregoActionPerformed

    private void jdkpPrincipalPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jdkpPrincipalPropertyChange
    {//GEN-HEADEREND:event_jdkpPrincipalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jdkpPrincipalPropertyChange

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

    public void definicoesSistema()
    {
        gerenciadorCores.definirCorMenuDeBarra(mnBarra);

        ArrayList<JMenuItem> mn = new ArrayList<>();
        mn.add(mnCadastrarCargoEmprego);
        mn.add(mnCadastrarBanca);
        mn.add(mnCadastrarConcurso);
        mn.add(mnPreCadastroFuncionario);
        mn.add(mnCadastrarFuncionario);
        mn.add(mnPortariaNomeacao);
        mn.add(mnCadastrarUsuario);
        mn.add(mnAno);
        mn.add(fecharTodasJanelas);

        gerenciadorCores.definirCorMenuItem(mn);
        gerenciadorCores.definirCorCabecalho(jdkpCabecalho, pnMenu);
        gerenciadorCores.definirCorCorpo(jdkpPrincipal);
        gerenciadorCores.definirCorRodape(jdkpRodape, pnRodape);
    }

    public boolean verificarSeAJanelaJaEstaAberta(JInternalFrame frm, JDesktopPane jdk)
    {

        JInternalFrame[] janelasAbertas = jdk.getAllFrames();
        for (JInternalFrame janelaAnalisada : janelasAbertas)
        {
            if (janelaAnalisada.isShowing() && janelaAnalisada.equals(frm))
            {
                return true;
            }
        }
        return false;
    }

    public static void redesenhar()
    {
        jdkpPrincipal.revalidate();
        jdkpPrincipal.repaint();
    }

    public static void gerenciadorJanelasAbertas(GerenciadorDeJanelas gerenciador, JInternalFrame janela)
    {
        gerenciador.gerenciadorJanela(janela, jdkpPrincipal, menuJanela, fecharTodasJanelas, organizarJanelas);
        redesenhar();

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JDesktopPane jdkpCabecalho;
    public static javax.swing.JDesktopPane jdkpPrincipal;
    private javax.swing.JDesktopPane jdkpRodape;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioConectado;
    private javax.swing.JMenu mnAdministracao;
    private javax.swing.JMenuItem mnAno;
    private javax.swing.JMenuBar mnBarra;
    private javax.swing.JMenuItem mnCadastrarBanca;
    private javax.swing.JMenuItem mnCadastrarCargoEmprego;
    private javax.swing.JMenuItem mnCadastrarConcurso;
    private javax.swing.JMenuItem mnCadastrarFuncionario;
    private javax.swing.JMenuItem mnCadastrarUsuario;
    private javax.swing.JMenu mnCargoEmprego;
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
