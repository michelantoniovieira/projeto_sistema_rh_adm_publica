/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apresentacao;

import Modelo.CadastrarConcursoControle;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    frmCadastrarConcurso frmCC;

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
        mnServidores = new javax.swing.JMenu();
        mnPreCadastroFuncionario = new javax.swing.JMenuItem();
        mnCadastroFuncionario = new javax.swing.JMenuItem();
        mnPortarias = new javax.swing.JMenu();
        subMnNomeacao = new javax.swing.JMenuItem();
        mnConfiguracao = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnAno = new javax.swing.JMenuItem();
        mnCadastrarConcurso = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        mnServidores.setText("Funcionário");

        mnPreCadastroFuncionario.setText("Pré Cadastro ");
        mnPreCadastroFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnPreCadastroFuncionarioActionPerformed(evt);
            }
        });
        mnServidores.add(mnPreCadastroFuncionario);

        mnCadastroFuncionario.setText("Cadastro");
        mnCadastroFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnCadastroFuncionarioActionPerformed(evt);
            }
        });
        mnServidores.add(mnCadastroFuncionario);

        mnBarra.add(mnServidores);

        mnPortarias.setText("Portarias");

        subMnNomeacao.setText("Nomeação");
        subMnNomeacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                subMnNomeacaoActionPerformed(evt);
            }
        });
        mnPortarias.add(subMnNomeacao);

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

        mnCadastrarConcurso.setText("Concurso");

        jMenuItem1.setText("Cadastro Concurso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnCadastrarConcurso.add(jMenuItem1);

        mnBarra.add(mnCadastrarConcurso);

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

    private void mnCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroFuncionarioActionPerformed
        //CODIGO DO BOTÃO MANUTENÇÃO

    }//GEN-LAST:event_mnCadastroFuncionarioActionPerformed

    private void subMnNomeacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnNomeacaoActionPerformed
        frmPN = new frmPortariaDeNomeacao(null, true);
        frmPN.setVisible(true);
    }//GEN-LAST:event_subMnNomeacaoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmCadU = new frmCadastrarUsuario(null, true);
        frmCadU.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAnoActionPerformed
        frmConfigurarPastaRaiz = new frmConfigurarPastaRaiz(null, true);
        frmConfigurarPastaRaiz.setVisible(true);
    }//GEN-LAST:event_mnAnoActionPerformed

    private void mnPreCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPreCadastroFuncionarioActionPerformed
        frmPC = new frmPreCadastro();
        jdkpPrincipal.add(frmPC);
        frmPC.setVisible(true);
    }//GEN-LAST:event_mnPreCadastroFuncionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmCC = new frmCadastrarConcurso();
        jdkpPrincipal.add(frmCC);
        frmCC.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //BOTÃO SAIR
        if (evt.getSource() == btnSair) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        //BOTÃO SAIR PELO ATALHO BACKSPACE
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnSairKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //BOTÃO SAIR PELO ATALHO BACKSPACE
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //se tiver aparecendo a janela de cadastrar concurso executa essa parte do sistema
        //COMANDO PARA SALVAR AS INFORMAÇÕES GRAVADAS NA TELA CONCURSO
        frmCC.gravarRegistro();

        if (frmCC.isVisible() && !frmCC.getNumeroConcurso().equals("") && !frmCC.getAnoConcurso().equals("") && !frmCC.getBancaConcurso().equals("")) {
            //quando eu digitar nos campos da janela CadastrarConcurso e clicar no icone salvar da janela principal entra aqui e manda gravar registro que significa que os dados dos campos serão passados para as variaveis que eu acesso por aqui para mandar para a variavel controle           
            CadastrarConcursoControle controle = new CadastrarConcursoControle(Integer.parseInt(frmCC.getNumeroConcurso()), Integer.parseInt(frmCC.getAnoConcurso()), frmCC.getBancaConcurso(), frmCC.getTelBanca(), frmCC.getResponsavelBanca(), frmCC.getTelResponsavelBanca(), frmCC.getEmailResponsavel());
            if (controle.getMensagem().equals("erro 1")) {
                JOptionPane.showMessageDialog(null, "Este concurso já foi cadastrado!");
            } else if (controle.getMensagem().equals("ok")) {
                JOptionPane.showMessageDialog(null, "Concurso cadastrado com sucesso.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite as informações antes de salvar.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        //se tiver aparecendo a janela de cadastrar concurso executa essa parte do sistema
        //COMANDO PARA pesquisar AS INFORMAÇÕES NA TELA CONCURSO
        //frmCC.gravarRegistro();

        if (frmCC.isVisible()) 
        {
            frmPesquisarConcurso frmPC = new frmPesquisarConcurso(null, true);
            frmPC.setVisible(true);
            //se a mensagem for pode passar entra no if abaixo
            if (frmPC.getMensagem().equals("pode passar")) 
            {         
                //coloco na tela de cadastro de concurso, seto na variavel a lista e o index puxado direto da tela frmPesquisarConcurso 
                frmCC.setNumeroConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getNumero_concurso()));
                frmCC.setAnoConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getAno_concurso()));
                frmCC.setBancaConcurso(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getNome_banca_organizadora()));
                frmCC.setTelBanca(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getTelefone_banca_organizadora()));
                frmCC.setResponsavelBanca(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getResponsavel_banca_organizadora()));
                frmCC.setTelResponsavelBanca(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getTelefone_responsavel_banca_organizadora()));
                frmCC.setEmailResponsavel(String.valueOf(frmPC.getLista().get(frmPC.getIndex()).getEmail_banca_organizadora()));
                
                frmCC.preencherCampos();
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Digite as informações antes de salvar.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdkpPrincipal;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioConectado;
    private javax.swing.JMenuItem mnAno;
    private javax.swing.JMenuBar mnBarra;
    private javax.swing.JMenu mnCadastrarConcurso;
    private javax.swing.JMenuItem mnCadastroFuncionario;
    private javax.swing.JMenu mnConfiguracao;
    private javax.swing.JMenu mnPortarias;
    private javax.swing.JMenuItem mnPreCadastroFuncionario;
    private javax.swing.JMenu mnServidores;
    private java.awt.Panel pnMenu;
    private javax.swing.JPanel pnRodape;
    private javax.swing.JMenuItem subMnNomeacao;
    // End of variables declaration//GEN-END:variables
}
