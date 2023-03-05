package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PopularCmbDAO 
{
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<String> lista = new ArrayList<String>();
    
    public ArrayList pesquisar(String informarTabela, String informarAtributo)
    {
        String sql;
        sql = "SELECT " + informarAtributo + " FROM " + informarTabela;
        
        con = new ConexaoDAO().conectaBD();
        
        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                lista.add(rs.getString(informarAtributo));
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PopularCmbDAO: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }
        
        return lista;
    }
}
