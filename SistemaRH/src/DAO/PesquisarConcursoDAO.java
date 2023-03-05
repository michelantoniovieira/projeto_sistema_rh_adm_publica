/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarConcursoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisarConcursoDAO
{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarConcursoDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;

    public PesquisarConcursoDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }

    public ArrayList<PesquisarConcursoDTO> pesquisarConcurso()
    {
        String sql;
        if (this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM concurso_publico";
        } else
        {
            sql = "SELECT * FROM concurso_publico WHERE " + this.getComandoSqlParaPesquisa() + " LIKE " + "'" + this.getDigitadoNoCampoPesquisa() + "%'";
        }

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                PesquisarConcursoDTO objPesquisarConcursoDTO = new PesquisarConcursoDTO();
                objPesquisarConcursoDTO.setCodigoConcurso(rs.getInt("codigo_concurso"));
                objPesquisarConcursoDTO.setNumero_concurso(rs.getInt("numero_concurso"));
                objPesquisarConcursoDTO.setAno_concurso(rs.getInt("ano_concurso"));
                objPesquisarConcursoDTO.setSituacao_concurso(rs.getString("situacao_concurso"));
                objPesquisarConcursoDTO.setFk_matricula_responsavel_concurso(rs.getInt("fk_matricula_responsavel_concurso"));
                objPesquisarConcursoDTO.setFk_codigo_banca(rs.getInt("fk_codigo_banca"));
                lista.add(objPesquisarConcursoDTO);
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PesquisarConcursoDAO Pesquisar Concurso: " + erro);
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
