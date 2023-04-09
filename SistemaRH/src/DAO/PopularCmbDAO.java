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
    //crio um arraylist para receber as informações do banco de dados
    ArrayList<Object> listaObjetos = new ArrayList<>();

    public ArrayList pesquisar(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {

        String sql;
        sql = "SELECT " + informarAtributo + "," + informarNomeChavePrimaria + " FROM " + informarTabela;

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                //passo a chave primaria e o codigo_banca para o atributo listanome
                listaObjetos.add(rs.getInt(informarNomeChavePrimaria));
                listaObjetos.add(rs.getString(informarAtributo));

            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PopularCmbDAO: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }

        return listaObjetos;
    }

    public ArrayList pesquisarInformacaoBancoDeDados(String informarTabela, String informarNomeChavePrimaria, String informarAtributo, String informacaoASerPesquisada)
    {

        String sql;
        sql = "SELECT " + informarNomeChavePrimaria + " FROM " + informarTabela + " WHERE " + informarAtributo + " = " + " '" + informacaoASerPesquisada + "' ";

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                //passo a chave primaria e o codigo_banca para o atributo listanome

                listaObjetos.add(rs.getInt(informarNomeChavePrimaria));
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PopularCmbDAO: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }

        return listaObjetos;
    }

    public void excluirInformacaoBancoDeDados(String informarTabela, int informarAtributo, int informarAtributoII)
    {
        String sql;
        sql = "DELETE FROM " + informarTabela + " WHERE fk_codigo_concurso = ? AND fk_codigo_cargo_emprego = ? ";

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, informarAtributo);
            pstm.setInt(2, informarAtributoII);
            pstm.executeUpdate();

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "EcluirInformacaoTabela: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm);
        }
    }
    
    public void alterarInformacaoBancoDeDados(String informarTabela, int informarAtributo, int informarAtributoII, int informarAtributoIII)
    {
        String sql;
        sql = "UPDATE " + informarTabela + " SET quantidade_vagas = ? WHERE fk_codigo_concurso = ? AND fk_codigo_cargo_emprego = ? ";

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, informarAtributoIII);
            pstm.setInt(2, informarAtributo);
            pstm.setInt(3, informarAtributoII);
            pstm.executeUpdate();

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "AlterarInformacaoTabela: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm);
        }
    }

}
