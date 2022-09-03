/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class CadastrarUsuarioDAO 
{
    
    Connection conn; 
    PreparedStatement pstm;
    ResultSet rs;
    
    
    public ResultSet verificarAntesDeCadastrar(CadastrarUsuarioDTO objcadastrarusuariodto)
   {
       conn = new ConexaoDAO().conectaBD();
       try
       {
         String sql = "Select * from usuario where nome_usuario = ?";
         
         PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.setString(1, objcadastrarusuariodto.getUsuario());
         
         ResultSet rs = pstm.executeQuery();
         return rs;
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar Usuario" + erro);
           return null;
       }
   }
    
    public void CadastrarUsuarioDAO(CadastrarUsuarioDTO objcadastrarusuariodto)
    {
        String sql = "insert into usuario (nome_usuario, senha_usuario) values (?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastrarusuariodto.getUsuario());
            pstm.setString(2, objcadastrarusuariodto.getSenha());
            
            pstm.execute();
            pstm.close();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "CadastrarUsuarioDAO - Cadastrar" + erro);
        }
    }
    
}
