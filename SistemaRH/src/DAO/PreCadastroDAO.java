/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PreCadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PreCadastroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet verificarAntesDeCadastrar(PreCadastroDTO objprecadastrodto) {
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "SELECT * FROM pre_cadastro_funcionario WHERE codigo_pre_cadastro = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprecadastrodto.getCodigoPreCadastro());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Funcionário." + erro);
            return null;
        }
    }

    public void CadastrarFuncionario(PreCadastroDTO objprecadastroDTO) {
        conn = new ConexaoDAO().conectaBD();
        String sql = "INSERT INTO codigo_pre_cadastro (codigo_pre_cadastro,nome_pre_cadastro,data_convocacao,cargo_emprego,rg,expedicao,naturalidade,rua,numero,bairro,cidade,estado,celUm,celDois,celTres,email) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprecadastroDTO.getCodigoPreCadastro());
            pstm.setString(2, objprecadastroDTO.getNomePreCadastro());
            pstm.setString(3, objprecadastroDTO.getDataConvocacao());
            pstm.setString(4, objprecadastroDTO.getCodigoConcurso());
            pstm.setString(5, objprecadastroDTO.getCargo());
            pstm.setString(6, objprecadastroDTO.getRg());
            pstm.setString(7, objprecadastroDTO.getExp());
            pstm.setString(8, objprecadastroDTO.getNaturalidade());
            pstm.setString(9, objprecadastroDTO.getRua());
            pstm.setString(10, objprecadastroDTO.getNumero());
            pstm.setString(11, objprecadastroDTO.getBairro());
            pstm.setString(12, objprecadastroDTO.getCidade());
            pstm.setString(13, objprecadastroDTO.getEstado());
            pstm.setString(14, objprecadastroDTO.getCelUm());
            pstm.setString(15, objprecadastroDTO.getCelDois());
            pstm.setString(16, objprecadastroDTO.getCelTres());
            pstm.setString(17, objprecadastroDTO.getEmail());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PreCadastroDAO" + erro);
        }
    }
}
