/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ServidoresCadastrarFuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ServidoresCadastrarFuncioncarioDAO 
{
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet verificarAntesDeCadastrar(ServidoresCadastrarFuncionarioDTO objcadastrarfuncionariodto)
    {
        conn = new ConexaoDAO().conectaBD();
        try
        {
            String sql = "select * from funcionarios where matricula = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastrarfuncionariodto.getMatricula());
            ResultSet rs = pstm.executeQuery();
            return rs;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Funcionário." + erro);
            return null;
        }
    }
    
    public void CadastrarFuncionario(ServidoresCadastrarFuncionarioDTO objcadastrarCadastrarFuncionarioDTO)
    {
        conn = new ConexaoDAO().conectaBD();
        String sql = "insert into funcionarios (matricula,PronomeTratamento,nome,dataAdmissao,dataNascimento,cargoEmprego,referencia,funcaoGratificada,quemAssinaPortaria,rg,expedicao,naturalidade,estadoCivil,instrucao,cpf,cnh,tituloEleitor,endereco,numero,bairro,cidade,celUm,celDois,celTres,email,regimeJuridico) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastrarCadastrarFuncionarioDTO.getMatricula());
            pstm.setString(2, objcadastrarCadastrarFuncionarioDTO.getPronomeTratamento());
            pstm.setString(3, objcadastrarCadastrarFuncionarioDTO.getNome());
            pstm.setString(4, objcadastrarCadastrarFuncionarioDTO.getDataAdmissao());
            pstm.setString(5, objcadastrarCadastrarFuncionarioDTO.getDataNascimento());
            pstm.setString(6, objcadastrarCadastrarFuncionarioDTO.getCargo());
            pstm.setString(7, objcadastrarCadastrarFuncionarioDTO.getReferencia());
            pstm.setString(8, objcadastrarCadastrarFuncionarioDTO.getFuncaoGratificada());
            pstm.setString(9, objcadastrarCadastrarFuncionarioDTO.getCmbQuemAssinaPortaria());
            pstm.setString(10, objcadastrarCadastrarFuncionarioDTO.getRg());
            pstm.setString(11, objcadastrarCadastrarFuncionarioDTO.getExp());
            pstm.setString(12, objcadastrarCadastrarFuncionarioDTO.getNaturalidade());
            pstm.setString(13, objcadastrarCadastrarFuncionarioDTO.getEstadoCivil());
            pstm.setString(14, objcadastrarCadastrarFuncionarioDTO.getInstrucao());
            pstm.setString(15, objcadastrarCadastrarFuncionarioDTO.getCpf());
            pstm.setString(16, objcadastrarCadastrarFuncionarioDTO.getCnh());
            pstm.setString(17, objcadastrarCadastrarFuncionarioDTO.getTituloEleitor());
            pstm.setString(18, objcadastrarCadastrarFuncionarioDTO.getEndereco());
            pstm.setString(19, objcadastrarCadastrarFuncionarioDTO.getNumero());
            pstm.setString(20, objcadastrarCadastrarFuncionarioDTO.getBairro());
            pstm.setString(21, objcadastrarCadastrarFuncionarioDTO.getCidade());
            pstm.setString(22, objcadastrarCadastrarFuncionarioDTO.getCelUm());
            pstm.setString(23, objcadastrarCadastrarFuncionarioDTO.getCelDois());
            pstm.setString(24, objcadastrarCadastrarFuncionarioDTO.getCelTres());
            pstm.setString(25, objcadastrarCadastrarFuncionarioDTO.getEmail());
            pstm.setString(26, objcadastrarCadastrarFuncionarioDTO.getRegimeJuridico());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarFuncionarioDAO" + erro);
        }
    }
}
