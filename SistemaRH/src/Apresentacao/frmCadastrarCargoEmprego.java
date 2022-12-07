/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Apresentacao;

import DTO.PesquisarBancaDTO;
import DTO.PesquisarCargoEmpregoDTO;
import java.util.ArrayList;

/**
 *
 * @author miche
 */
public class frmCadastrarCargoEmprego extends javax.swing.JInternalFrame
{

    private String codigoCargoEmprego;
    private String nomeCargoEmprego;
    private int regimeJuridico;
    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;
    private String referenciaSalarial = "";
    private ArrayList<PesquisarCargoEmpregoDTO> lista;

    public frmCadastrarCargoEmprego()
    {
        initComponents();
    }

    public void gravarRegistro()
    {
        setCodigoCargoEmprego(txtCodigoCargoEmprego.getText());
        setNomeCargoEmprego(txtNomeCargoEmprego.getText());
        setRegimeJuridico(cmbRegimeJuridico.getSelectedIndex());
        setNumeroLeiCriaCargoEmprego(txtNumero.getText());
        setDataLeiCriaCargoEmprego(txtDataLeiCriacaoCargoEmprego.getText());
        setReferenciaSalarial(txtReferencia.getText());
    }

    public void preencherLista(ArrayList<PesquisarCargoEmpregoDTO> lista, int index)
    {
        this.setLista(lista);
        setCodigoCargoEmprego(String.valueOf(getLista().get(index).getCodigoCargoEmprego()));
        setNomeCargoEmprego(String.valueOf(getLista().get(index).getNomeCargoEmprego()));
        setRegimeJuridico(Integer.parseInt(getLista().get(index).getRegimeJuridico()));
        setNumeroLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getNumeroLeiCriaCargoEmprego()));
        setDataLeiCriaCargoEmprego(String.valueOf(getLista().get(index).getDataLeiCriaCargoEmprego()));
        setReferenciaSalarial(String.valueOf(getLista().get(index).getReferenciaSalarial()));
        preencherCampos();
    }

    public void preencherCampos()
    {
        txtCodigoCargoEmprego.setText(getCodigoCargoEmprego());
        txtNomeCargoEmprego.setText(getNomeCargoEmprego());
        cmbRegimeJuridico.setSelectedIndex(0);
        txtNumero.setText(getNumeroLeiCriaCargoEmprego());
        txtDataLeiCriacaoCargoEmprego.setText(getDataLeiCriaCargoEmprego());
        txtReferencia.setText(getReferenciaSalarial());
    }

    //liberar os campos para edição
    public void ativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtNomeCargoEmprego.setEnabled(true);
        cmbRegimeJuridico.setEnabled(true);
        txtNumero.setEnabled(true);
        txtDataLeiCriacaoCargoEmprego.setEnabled(true);
        txtReferencia.setEnabled(true);
    }

    //travar os campos para edição
    public void desativarCampos()
    {
        txtCodigoCargoEmprego.setEnabled(false);
        txtNomeCargoEmprego.setEnabled(false);
        cmbRegimeJuridico.setEnabled(false);
        txtNumero.setEnabled(false);
        txtDataLeiCriacaoCargoEmprego.setEnabled(false);
        txtReferencia.setEnabled(false);
    }

    public void limparCampos()
    {
        //this.setCodigoConcurso("");
        txtCodigoCargoEmprego.setText("");
        this.setCodigoCargoEmprego("");
        txtNomeCargoEmprego.setText("");
        this.setNomeCargoEmprego("");
        cmbRegimeJuridico.setSelectedIndex(0);
        this.setRegimeJuridico(0);
        txtNumero.setText("");
        this.setNumeroLeiCriaCargoEmprego("");
        txtDataLeiCriacaoCargoEmprego.setText("");
        this.setDataLeiCriaCargoEmprego("");
        txtReferencia.setText("");
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

    public int getRegimeJuridico()
    {
        return regimeJuridico;
    }

    public void setRegimeJuridico(int regimeJuridico)
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
        txtNomeCargoEmprego = new javax.swing.JTextField();
        lblNomeCargoEmprego = new javax.swing.JLabel();
        txtCodigoCargoEmprego = new javax.swing.JTextField();
        lblCodigoCargoEmprego = new javax.swing.JLabel();
        lblRegimeJuridico = new javax.swing.JLabel();
        cmbRegimeJuridico = new javax.swing.JComboBox<>();
        txtReferencia = new javax.swing.JTextField();
        lblCodigoCargoEmprego1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblLeiCriacaoCargoEmprego = new javax.swing.JLabel();
        txtDataLeiCriacaoCargoEmprego = new javax.swing.JTextField();
        lblLeiCriacaoCargoEmprego1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro de Cargo/Emprego");

        lblNomeCargoEmprego.setText("Nome Cargo/Emprego:");

        lblCodigoCargoEmprego.setText("Código:");

        lblRegimeJuridico.setText("Regime Jurídico:");

        cmbRegimeJuridico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTATUTÁRIO", "CELETISTA" }));

        lblCodigoCargoEmprego1.setText("Referência Salarial:");

        lblLeiCriacaoCargoEmprego.setText("Data da Lei de Criação do Cargo/Emprego");

        lblLeiCriacaoCargoEmprego1.setText("Número:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCodigoCargoEmprego))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLeiCriacaoCargoEmprego1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLeiCriacaoCargoEmprego)
                    .addComponent(txtDataLeiCriacaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbRegimeJuridico, 0, 109, Short.MAX_VALUE)
                    .addComponent(lblRegimeJuridico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigoCargoEmprego1)
                    .addComponent(txtReferencia))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtNomeCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNomeCargoEmprego))
                        .addGap(38, 38, 38)
                        .addComponent(lblLeiCriacaoCargoEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataLeiCriacaoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRegimeJuridico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbRegimeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoCargoEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCodigoCargoEmprego))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoCargoEmprego1)
                            .addComponent(lblLeiCriacaoCargoEmprego1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE CARGO/EMPREGO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRegimeJuridico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigoCargoEmprego;
    private javax.swing.JLabel lblCodigoCargoEmprego1;
    private javax.swing.JLabel lblLeiCriacaoCargoEmprego;
    private javax.swing.JLabel lblLeiCriacaoCargoEmprego1;
    private javax.swing.JLabel lblNomeCargoEmprego;
    private javax.swing.JLabel lblRegimeJuridico;
    private javax.swing.JTextField txtCodigoCargoEmprego;
    private javax.swing.JTextField txtDataLeiCriacaoCargoEmprego;
    private javax.swing.JTextField txtNomeCargoEmprego;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
