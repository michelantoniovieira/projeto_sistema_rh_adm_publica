/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarUsuarioDTO;
import DTO.ConfigurarPastaRaizDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class ConfigurarPastaRaizDAO 
{

    Connection conn; 
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet verificarAntesDeCadastrar(ConfigurarPastaRaizDTO objconfigurarpastaraizdto)
   {
       conn = new ConexaoDAO().conectaBD();
       try
       {
         String sql = "Select * from pastaraiz where id = ?";
         
         PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.setInt(1, objconfigurarpastaraizdto.getId());
         
         ResultSet rs = pstm.executeQuery();
         return rs;
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar Caminho" + erro);
           return null;
       }
   }
   
    public void cadastrarCaminho(ConfigurarPastaRaizDTO objconfigurarpastaraizdto)
    {
        String sql = "insert into pastaraiz (id, caminho) values (1, ?)";
        conn = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objconfigurarpastaraizdto.getCaminho());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Caminho registrado com sucesso");
        } 
        
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "ConfigurarPastaRaizDAO - Cadastrar" + erro);
        }
    } 
    
    public void alterarCaminho(ConfigurarPastaRaizDTO objconfigurarpastaraizdto)
    {
        String sql = "update pastaraiz set caminho = ? where id = 1";
        
        conn = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objconfigurarpastaraizdto.getCaminho());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Caminho atualizado com sucesso");
        } 
        
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "ConfigurarPastaRaizDAO - Atualizar" + erro);
        }
    }
}
