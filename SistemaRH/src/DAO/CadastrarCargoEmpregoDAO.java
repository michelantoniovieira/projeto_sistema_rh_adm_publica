/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarBancaDTO;
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

    public ResultSet verificarAntesDeCadastrar(CadastrarBancaDTO cadastrarbancadto)
    {
        conn = new ConexaoDAO().conectaBD();
        try
        {
            String sql = "SELECT * FROM banca WHERE nome_banca_organizadora = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarbancadto.getNome_banca_organizadora());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Concurso" + erro);
            return null;
        }
    }

    public void CadastrarBancaDAO(CadastrarBancaDTO cadastrarbancadto)
    {
        String sql = "INSERT INTO banca (nome_banca_organizadora, telefone_banca_organizadora, responsavel_banca_organizadora,telefone_responsavel_banca_organizadora,email_banca_organizadora) values (?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarbancadto.getNome_banca_organizadora());
            pstm.setString(2, cadastrarbancadto.getTelefone_banca_organizadora());
            pstm.setString(3, cadastrarbancadto.getResponsavel_banca_organizadora());
            pstm.setString(4, cadastrarbancadto.getTelefone_responsavel_banca_organizadora());
            pstm.setString(5, cadastrarbancadto.getEmail_banca_organizadora());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarBancaDAO - Cadastrar" + erro);
        }
    }

    public void update(CadastrarBancaDTO cadastrarbancadto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("UPDATE banca SET nome_banca_organizadora = ?, telefone_banca_organizadora = ?, responsavel_banca_organizadora = ?, telefone_responsavel_banca_organizadora = ?, email_banca_organizadora = ?  WHERE codigo_banca = '" + cadastrarbancadto.getCodigo_Banca() + "'");
                stmt.setString(1, cadastrarbancadto.getNome_banca_organizadora());
                stmt.setString(2, cadastrarbancadto.getTelefone_banca_organizadora());
                stmt.setString(3, cadastrarbancadto.getResponsavel_banca_organizadora());
                stmt.setString(4, cadastrarbancadto.getTelefone_responsavel_banca_organizadora());
                stmt.setString(5, cadastrarbancadto.getEmail_banca_organizadora());
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

    public void delete(CadastrarBancaDTO cadastrarbancadto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("DELETE from banca WHERE nome_banca_organizadora = '" + cadastrarbancadto.getNome_banca_organizadora()+ "'");
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

    public ArrayList<CadastrarBancaDTO> botaoNavegacao()
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        ArrayList<CadastrarBancaDTO> objcadastrarbancadto = new ArrayList<>();

        try
        {
            stmt = conexao.prepareStatement("SELECT * FROM banca");
            rs = stmt.executeQuery();
            while (rs.next())
            {
                CadastrarBancaDTO cbdto = new CadastrarBancaDTO();
                cbdto.setCodigo_Banca(rs.getInt("codigo_banca"));
                cbdto.setNome_banca_organizadora(rs.getString("nome_banca_organizadora"));
                cbdto.setTelefone_banca_organizadora(rs.getString("telefone_banca_organizadora"));
                cbdto.setResponsavel_banca_organizadora(rs.getString("responsavel_banca_organizadora"));
                cbdto.setTelefone_responsavel_banca_organizadora(rs.getString("telefone_responsavel_banca_organizadora"));
                cbdto.setEmail_banca_organizadora(rs.getString("email_banca_organizadora"));
                objcadastrarbancadto.add(cbdto);
            }
        } catch (SQLException erro)
        {
            erro.printStackTrace();
        } finally
        {
            ConexaoDAO.encerrarConexao(conexao, stmt, rs);
        }
        return objcadastrarbancadto;
    }

}
