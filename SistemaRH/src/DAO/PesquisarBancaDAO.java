/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarBancaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisarBancaDAO
{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarBancaDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;

    public PesquisarBancaDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }

    public ArrayList<PesquisarBancaDTO> pesquisarBanca()
    {
        String sql;
        if (this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM banca";
        } else
        {
            sql = "SELECT * FROM banca WHERE " + this.getComandoSqlParaPesquisa() + " LIKE " + "'" + this.getDigitadoNoCampoPesquisa() + "%'";
        }

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                PesquisarBancaDTO objPesquisarBancaDTO = new PesquisarBancaDTO();
                objPesquisarBancaDTO.setCodigoBanca(rs.getInt("codigo_banca"));
                objPesquisarBancaDTO.setNome_banca_organizadora(rs.getString("nome_banca_organizadora"));
                objPesquisarBancaDTO.setTelefone_banca_organizadora(rs.getString("telefone_banca_organizadora"));
                objPesquisarBancaDTO.setResponsavel_banca_organizadora(rs.getString("responsavel_banca_organizadora"));
                objPesquisarBancaDTO.setTelefone_responsavel_banca_organizadora(rs.getString("telefone_responsavel_banca_organizadora"));
                objPesquisarBancaDTO.setEmail_banca_organizadora(rs.getString("email_banca_organizadora"));

                lista.add(objPesquisarBancaDTO);
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PesquisarBancaDAO Pesquisar Concurso: " + erro);
        } finally
        {
            ConexaoDAO.encerrarConexao(con, pstm, rs);
        }

        return lista;
    }

    public String getComandoSqlParaPesquisa()
    {
        return ComandoSqlParaPesquisa;
    }

    public void setComandoSqlParaPesquisa(String ComandoSqlParaPesquisa)
    {
        this.ComandoSqlParaPesquisa = ComandoSqlParaPesquisa;
    }

    public String getDigitadoNoCampoPesquisa()
    {
        return DigitadoNoCampoPesquisa;
    }

    public void setDigitadoNoCampoPesquisa(String DigitadoNoCampoPesquisa)
    {
        this.DigitadoNoCampoPesquisa = DigitadoNoCampoPesquisa;
    }

}
