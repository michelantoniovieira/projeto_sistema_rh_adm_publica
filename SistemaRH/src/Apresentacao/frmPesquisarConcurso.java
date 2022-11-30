/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;

import DTO.PesquisarConcursoDTO;
import DAO.PesquisarConcursoDAO;
import Modelo.PesquisarConcursoControle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class frmPesquisarConcurso extends javax.swing.JDialog {

    private ArrayList<PesquisarConcursoDTO> lista;
    private int index;
    private String mensagem;
    //variavel que pega o ultimo registro da tabela pesquisar concurso, ela sera passada para o botão ultimo que esta no formulario principal. ai eu consigo navegar entre o primeiro e ultimo registro
    public static int ultimoRegistro;
    

    /**
     * Creates new form frmPesquisarFuncionario
     */
    public frmPesquisarConcurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PesquisarConcursoControle controle = new PesquisarConcursoControle("tudo", "");
        listarValores(controle);
        ultimoRegistro = tbPesquisarFuncionarios.getRowCount()-1;
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

        cmbModoDePesquisa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisarFuncionarios = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        lblPesquisarPor = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Funcionário");
        setResizable(false);

        cmbModoDePesquisa.setMaximumRowCount(3);
        cmbModoDePesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número do Concurso", "Ano do Concurso", "Nome da Banca", " " }));
        cmbModoDePesquisa.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmbModoDePesquisaKeyPressed(evt);
            }
        });

        //sobrescrever o método para bloquear a edição da célula.
        tbPesquisarFuncionarios = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tbPesquisarFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Codigo do Concurso", "Número do Concurso", "Ano do Concurso", "Nome da Banca", "Telefone da Banca", "Responsável da Banca", "Telefone Responsável", "Email da Banca"
            }
        ));
        tbPesquisarFuncionarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbPesquisarFuncionarios.setAutoscrolls(false);
        tbPesquisarFuncionarios.setFocusable(false);
        tbPesquisarFuncionarios.setIntercellSpacing(new java.awt.Dimension(30, 0));
        tbPesquisarFuncionarios.setRequestFocusEnabled(false);
        tbPesquisarFuncionarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPesquisarFuncionarios.getTableHeader().setReorderingAllowed(false);
        tbPesquisarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tbPesquisarFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisarFuncionarios);

        txtPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPesquisarActionPerformed(evt);
            }
        });

        lblPesquisarPor.setText("Pesquisa por:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbModoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesquisarPor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPesquisarPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        botaoBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbPesquisarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisarFuncionariosMouseClicked
    //PASSAR VALOR DA CELULA DO FORMULARIO PESQUISA PARA O FORMULÁRIO DE SERVIDORES    
    //qual fileira o usuario clicou?
        this.setIndex(tbPesquisarFuncionarios.getSelectedRow()); 
        passarValores(index);        
        this.setMensagem("pode passar");
        this.dispose();
    }//GEN-LAST:event_tbPesquisarFuncionariosMouseClicked

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
    // TODO add your handling code here:
        btnBuscar.requestFocus();
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
    {
       botaoBuscar();
    }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void cmbModoDePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbModoDePesquisaKeyPressed
    // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
          txtPesquisar.requestFocus();
        }
    }//GEN-LAST:event_cmbModoDePesquisaKeyPressed

    public void botaoBuscar()
    {
    //BOTÃO BUSCAR
        String modoPesquisa;
        modoPesquisa = (String) cmbModoDePesquisa.getSelectedItem();
        
        PesquisarConcursoControle controle = new PesquisarConcursoControle(modoPesquisa, txtPesquisar.getText());
        if(controle.getMensagem().equals("ok"))
        {
            listarValores(controle);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesquisarConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesquisarConcurso dialog = new frmPesquisarConcurso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbModoDePesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisarPor;
    private javax.swing.JTable tbPesquisarFuncionarios;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

private void listarValores(PesquisarConcursoControle controle)
    {
        try 
        {
            PesquisarConcursoDAO objPesquisarConcursoDAO = new PesquisarConcursoDAO(controle.getComandoSqlParaPesquisa(), controle.getDigitadoNoCampoPesquisa());
            DefaultTableModel model = (DefaultTableModel) tbPesquisarFuncionarios.getModel();
            model.setNumRows(0);
            
            //CENTRALIZAR AS CELULAS DAS COLUNAS
            DefaultTableCellRenderer centralizarCelula = new DefaultTableCellRenderer();
            centralizarCelula.setHorizontalAlignment(SwingConstants.CENTER);
            
            //COMANDO PARA AUMENTAR O TAMANHO DAS CELULAS E PARA CENTRALIZAR
            for(int i = 0; i <= 6; i++)
            {                
                tbPesquisarFuncionarios.getColumnModel().getColumn(i).setPreferredWidth(200);
                tbPesquisarFuncionarios.getColumnModel().getColumn(i).setCellRenderer(centralizarCelula);
            }
            
            ArrayList<PesquisarConcursoDTO> lista = objPesquisarConcursoDAO.pesquisarConcurso();
           
            for(int num = 0; num < lista.size(); num++)
            {
             model.addRow(new Object[]
             {
                lista.get(num).getCodigoConcurso(),
                lista.get(num).getNumero_concurso(),
                lista.get(num).getAno_concurso(),
                lista.get(num).getNome_banca_organizadora(),
                lista.get(num).getTelefone_banca_organizadora(),
                lista.get(num).getResponsavel_banca_organizadora(),
                lista.get(num).getTelefone_responsavel_banca_organizadora(),
                lista.get(num).getEmail_banca_organizadora(),                
             });
                
                setLista(lista);
               
            }
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, "Listar Valores: " + erro);
        }
    }

    public void passarValores(int index)
    {
        lista.get(getIndex());
    }

    public ArrayList<PesquisarConcursoDTO> getLista() {
        return lista;
    }

    public void setLista(ArrayList<PesquisarConcursoDTO> lista) {
        this.lista = lista;
    }    
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
