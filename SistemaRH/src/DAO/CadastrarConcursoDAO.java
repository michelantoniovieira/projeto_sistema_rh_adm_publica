/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarConcursoDTO;
import DTO.CadastrarUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class CadastrarConcursoDAO 
{
    
    Connection conn; 
    PreparedStatement pstm;
    ResultSet rs;
    
    
    public ResultSet verificarAntesDeCadastrar(CadastrarConcursoDTO objcadastrarconcursodto)
   {
       conn = new ConexaoDAO().conectaBD();
       try
       {
         String sql = "SELECT * FROM concurso_publico WHERE numero_concurso = ? AND ano_concurso = ?";
         
         PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.setInt(1, objcadastrarconcursodto.getNumero_concurso());
         pstm.setInt(2, objcadastrarconcursodto.getAno_concurso());
         
         ResultSet rs = pstm.executeQuery();
         return rs;
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar Concurso" + erro);
           return null;
       }
   }
    public void CadastrarConcursoDAO(CadastrarConcursoDTO objcadastrarConcursoDTO)
    {
        String sql = "INSERT INTO concurso_publico (numero_concurso, ano_concurso, nome_banca_organizadora, telefone_banca_organizadora, responsavel_banca_organizadora,telefone_responsavel_banca_organizadora,email_banca_organizadora) values (?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objcadastrarConcursoDTO.getNumero_concurso());
            pstm.setInt(2, objcadastrarConcursoDTO.getAno_concurso());
            pstm.setString(3, objcadastrarConcursoDTO.getNome_banca_organizadora());
            pstm.setString(4, objcadastrarConcursoDTO.getTelefone_banca_organizadora());
            pstm.setString(5, objcadastrarConcursoDTO.getResponsavel_banca_organizadora());
            pstm.setString(6, objcadastrarConcursoDTO.getTelefone_responsavel_banca_organizadora());
            pstm.setString(7, objcadastrarConcursoDTO.getEmail_banca_organizadora());
            
            pstm.execute();
            pstm.close();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "CadastrarConcursoDAO - Cadastrar" + erro);
        }
    }
    
}
