/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarCargoEmpregoDTO;
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
public class CadastrarCargoEmpregoDAO
{

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet verificarAntesDeCadastrar(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        conn = new ConexaoDAO().conectaBD();
        try
        {
            String sql = "SELECT * FROM cargo_emprego WHERE nome_cargo_emprego = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Concurso" + erro);
            return null;
        }
    }

    public void CadastrarCargoEmpregoDAO(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        String sql = "INSERT INTO cargo_emprego (nome_cargo_emprego, regime_juridico, numero_lei_cria_cargo_emprego, data_lei_cria_cargo_emprego, referencia_salarial) values (?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());
            pstm.setString(2, cadastrarcargoempregodto.getRegimeJuridicoCargoEmprego());
            pstm.setString(3, cadastrarcargoempregodto.getNumeroLeiCriaCargoEmprego());
            pstm.setString(4, cadastrarcargoempregodto.getDataLeiCriaCargoEmprego());
            pstm.setString(5, cadastrarcargoempregodto.getReferenciaSalarial());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarCargoEmpregoDAO - Cadastrar" + erro);
        }
    }

    public void update(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("UPDATE cargo_emprego SET nome_cargo_emprego = ?, regime_juridico = ?, numero_lei_cria_cargo_emprego = ?, data_lei_cria_cargo_emprego = ?, referencia_salarial = ?  WHERE codigo_cargo_emprego = '" + cadastrarcargoempregodto.getCodigoCargoEmprego()+ "'");
                stmt.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());
                stmt.setString(2, cadastrarcargoempregodto.getRegimeJuridicoCargoEmprego());
                stmt.setString(3, cadastrarcargoempregodto.getNumeroLeiCriaCargoEmprego());
                stmt.setString(4, cadastrarcargoempregodto.getDataLeiCriaCargoEmprego());
                stmt.setString(5, cadastrarcargoempregodto.getReferenciaSalarial());
                stmt.executeUpdate();
            } catch (SQLException erro)
            {
                erro.printStackTrace();
            } finally
            {
                ConexaoDAO.encerrarConexao(conexao, stmt);
            }
        }
    }

    public void delete(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("DELETE from cargo_emprego WHERE nome_cargo_emprego = '" + cadastrarcargoempregodto.getDescricaoCargoEmprego()+ "'");
                stmt.executeUpdate();
            } catch (SQLException erro)
            {
                erro.printStackTrace();
            } finally
            {
                ConexaoDAO.encerrarConexao(conexao, stmt);
            }
        }
    }

    public ArrayList<CadastrarCargoEmpregoDTO> botaoNavegacao()
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        ArrayList<CadastrarCargoEmpregoDTO> objcadastrarcargoempregodto = new ArrayList<>();

        try
        {
            stmt = conexao.prepareStatement("SELECT * FROM cargo_emprego");
            rs = stmt.executeQuery();
            while (rs.next())
            {
                CadastrarCargoEmpregoDTO cbdto = new CadastrarCargoEmpregoDTO();
                cbdto.setCodigoCargoEmprego(rs.getInt("codigo_cargo_emprego"));
                cbdto.setDescricaoCargoEmprego(rs.getString("nome_cargo_emprego"));
                cbdto.setRegimeJuridicoCargoEmprego(rs.getString("regime_juridico"));
                cbdto.setNumeroLeiCriaCargoEmprego(rs.getString("numero_lei_cria_cargo_emprego"));
                cbdto.setDataLeiCriaCargoEmprego(rs.getString("data_lei_cria_cargo_emprego"));
                cbdto.setReferenciaSalarial(rs.getString("referencia_salarial"));
                objcadastrarcargoempregodto.add(cbdto);
            }
        } catch (SQLException erro)
        {
            erro.printStackTrace();
        } finally
        {
            ConexaoDAO.encerrarConexao(conexao, stmt, rs);
        }
        return objcadastrarcargoempregodto;
    }

}
