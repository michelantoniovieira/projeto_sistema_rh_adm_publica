/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarFuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastrarFuncionarioDAO 
{
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet verificarAntesDeCadastrar(CadastrarFuncionarioDTO objcadastrarfuncionariodto)
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
    
    public void CadastrarFuncionario(CadastrarFuncionarioDTO objcadastrarCadastrarFuncionarioDTO)
    {
        conn = new ConexaoDAO().conectaBD();
        String sql = "insert into funcionarios (matricula,PronomeTratamento,nome,dataAdmissao,dataNascimento,cargoEmprego,referencia,funcaoGratificada,rg,expedicao,naturalidade,estadoCivil,instrucao,cpf,cnh,tituloEleitor,endereco,numero,bairro,cidade,celUm,celDois,celTres,email) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
            pstm.setString(9, objcadastrarCadastrarFuncionarioDTO.getRg());
            pstm.setString(10, objcadastrarCadastrarFuncionarioDTO.getExp());
            pstm.setString(11, objcadastrarCadastrarFuncionarioDTO.getNaturalidade());
            pstm.setString(12, objcadastrarCadastrarFuncionarioDTO.getEstadoCivil());
            pstm.setString(13, objcadastrarCadastrarFuncionarioDTO.getInstrucao());
            pstm.setString(14, objcadastrarCadastrarFuncionarioDTO.getCpf());
            pstm.setString(15, objcadastrarCadastrarFuncionarioDTO.getCnh());
            pstm.setString(16, objcadastrarCadastrarFuncionarioDTO.getTituloEleitor());
            pstm.setString(17, objcadastrarCadastrarFuncionarioDTO.getEndereco());
            pstm.setString(18, objcadastrarCadastrarFuncionarioDTO.getNumero());
            pstm.setString(19, objcadastrarCadastrarFuncionarioDTO.getBairro());
            pstm.setString(20, objcadastrarCadastrarFuncionarioDTO.getCidade());
            pstm.setString(21, objcadastrarCadastrarFuncionarioDTO.getCelUm());
            pstm.setString(22, objcadastrarCadastrarFuncionarioDTO.getCelDois());
            pstm.setString(23, objcadastrarCadastrarFuncionarioDTO.getCelTres());
            pstm.setString(24, objcadastrarCadastrarFuncionarioDTO.getEmail());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarFuncionarioDAO" + erro);
        }
    }
}
