/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarCargoEmpregoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisarCargoEmpregoDAO
{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarCargoEmpregoDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;

    public PesquisarCargoEmpregoDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }

    public ArrayList<PesquisarCargoEmpregoDTO> pesquisarCargoEmprego()
    {
        String sql;
        if (this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM cargo_emprego";
        } else
        {
            sql = "SELECT * FROM cargo_emprego WHERE " + this.getComandoSqlParaPesquisa() + " LIKE " + "'" + this.getDigitadoNoCampoPesquisa() + "%'";
        }

        con = new ConexaoDAO().conectaBD();

        try
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                PesquisarCargoEmpregoDTO objPesquisarCargoEmpregoDTO = new PesquisarCargoEmpregoDTO();
                objPesquisarCargoEmpregoDTO.setCodigoCargoEmprego(rs.getInt("codigo_cargo_emprego"));
                objPesquisarCargoEmpregoDTO.setDescricaoCargoEmprego(rs.getString("descricao_cargo_emprego"));
                objPesquisarCargoEmpregoDTO.setRegimeJuridicoCargoEmprego(rs.getString("regime_juridico_cargo_emprego"));
                
                objPesquisarCargoEmpregoDTO.setNumeroLeiCriaCargoEmprego(rs.getString("numero_lei_cria_cargo_emprego"));
                
                objPesquisarCargoEmpregoDTO.setDataLeiCriaCargoEmprego(rs.getString("data_lei_cria_cargo_emprego"));
                objPesquisarCargoEmpregoDTO.setReferenciaSalarialCargoEmprego(rs.getString("referencia_salarial_cargo_emprego"));

                lista.add(objPesquisarCargoEmpregoDTO);
            }
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "PesquisarCargoEmpregoDAO Pesquisar CE: " + erro);
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
