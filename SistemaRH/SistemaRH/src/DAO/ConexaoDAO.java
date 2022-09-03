
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO 
{
   
    public Connection conectaBD()
    {
        Connection conn = null;
        
        try
        {
            //"jdbc:mysql://"
            //"jdbc:mysql://localhost"
            //"jdbc:mysql://localhost:3306"
            //"jdbc:mysql://localhost:3306/bdteste"
            //"jdbc:mysql://localhost:3306/bdteste?user=root"
            //"jdbc:mysql://localhost:3306/bdteste?user=root&senha="
            
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
            conn = DriverManager.getConnection(url);
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro conexaoDAO" + erro);
        }
        
        return conn;
    }

    private Connection DriverManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
