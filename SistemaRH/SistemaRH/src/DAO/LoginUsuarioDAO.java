
package DAO;

import DTO.LoginUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginUsuarioDAO 
{
   Connection conn; 
   
   public ResultSet autenticacaoUsuario(LoginUsuarioDTO objusuariodto)
   {
       conn = new ConexaoDAO().conectaBD();
       try
       {
         String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";
         
         PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.setString(1, objusuariodto.getLoginUsuario());
         pstm.setString(2, objusuariodto.getSenhaUsuario());
         
         ResultSet rs = pstm.executeQuery();
         return rs;
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
           return null;
       }
   }
}
