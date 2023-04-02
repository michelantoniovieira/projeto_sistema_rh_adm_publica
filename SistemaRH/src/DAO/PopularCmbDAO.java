package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PopularCmbDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    //crio um arraylist para receber as informações do banco de dados
    ArrayList<Object> listaObjetos = new ArrayList<Object>();

    public ArrayList pesquisar(String informarTabela, String informarNomeChavePrimaria, String informarAtributo) {

        String sql;
        sql = "SELECT " + informarAtributo + "," + informarNomeChavePrimaria + " FROM " + informarTabela;

        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                //passo a chave primaria e o codigo_banca para o atributo listanome
                listaObjetos.add(rs.getInt(informarNomeChavePrimaria));
                listaObjetos.add(rs.getString(informarAtributo));

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PopularCmbDAO: " + erro);
        } finally {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }

        return listaObjetos;
    }
}
