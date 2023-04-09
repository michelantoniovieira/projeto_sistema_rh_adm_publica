package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PopularTabela
{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    //crio um arraylist para receber as informações do banco de dados
    ArrayList<Object> listaObjetosRetornadosDoBancoDeDados = new ArrayList<>();

    public ArrayList pesquisarParaInserirNaTabela(String informarTabela, String chavePrimaria, String codigoConcurso)
    {

        String sql;
        sql = "SELECT nome_cargo_emprego, quantidade_vagas FROM listadecargosempregos, cargo_emprego WHERE " + chavePrimaria + " = " + codigoConcurso + " AND fk_codigo_cargo_emprego = codigo_cargo_emprego";

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next())
            {
                Object[] linha =
                {
                    rs.getString("nome_cargo_emprego"), rs.getString("quantidade_vagas")
                };
                listaObjetosRetornadosDoBancoDeDados.add(linha);
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Popular Tabela: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }

        return listaObjetosRetornadosDoBancoDeDados;
    }
}
