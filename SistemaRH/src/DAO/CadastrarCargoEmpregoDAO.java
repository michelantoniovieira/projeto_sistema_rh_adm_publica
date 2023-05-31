package DAO;

import DTO.CadastrarCargoEmpregoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
            String sql = "SELECT * FROM cargo_emprego WHERE descricao_cargo_emprego = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());

            ResultSet rs = pstm.executeQuery();
            return rs;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Concurso" + erro);
            return null;
        }
    }

    public Integer pesquisarPrimeiroRegistro()
    {
        conn = new ConexaoDAO().conectaBD();
        Integer ultimoRegistro = 0;

        try
        {
            String sql = "SELECT * FROM cargo_emprego ORDER BY codigo_cargo_emprego ASC LIMIT 1";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            if (rs.next())
            {
                ultimoRegistro = rs.getInt("codigo_Cargo_emprego");
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar ultimo registro CargoEmprego: " + erro);
        }
        return ultimoRegistro;
    }

    public Integer pesquisarUltimoRegistro()
    {
        conn = new ConexaoDAO().conectaBD();
        Integer ultimoRegistro = 0;

        try
        {
            String sql = "SELECT * FROM cargo_emprego ORDER BY codigo_cargo_emprego DESC LIMIT 1";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            if (rs.next())
            {
                ultimoRegistro = rs.getInt("codigo_Cargo_emprego");
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar ultimo registro CargoEmprego: " + erro);
        }
        return ultimoRegistro;
    }

    public List<CadastrarCargoEmpregoDTO> pesquisar(String codigoCargoEmprego)
    {
        conn = new ConexaoDAO().conectaBD();
        List<CadastrarCargoEmpregoDTO> cargosEmpregos = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM cargo_emprego WHERE codigo_cargo_emprego = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, codigoCargoEmprego);
            ResultSet rs = pstm.executeQuery();

            while (rs.next())
            {
                // Extrair os dados do ResultSet e criar um objeto CargoEmprego
                CadastrarCargoEmpregoDTO cargoEmprego = new CadastrarCargoEmpregoDTO();
                cargoEmprego.setCodigoCargoEmprego(rs.getInt("codigo_cargo_emprego"));
                cargoEmprego.setDescricaoCargoEmprego(rs.getString("descricao_cargo_emprego"));
                cargoEmprego.setCboCargoEmprego(rs.getString("cbo_cargo_emprego"));
                cargoEmprego.setRegimeJuridicoCargoEmprego(rs.getString("regime_juridico_cargo_emprego"));

                // Adicionar o objeto CargoEmprego à lista
                cargosEmpregos.add(cargoEmprego);
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar CargoEmprego: " + erro);
        }
        finally
        {
            // Certifique-se de fechar a conexão, o PreparedStatement e o ResultSet
            try
            {
                if (rs != null)
                {
                    rs.close();
                }
                if (pstm != null)
                {
                    pstm.close();
                }
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e);
            }
        }
        return cargosEmpregos;
    }

    public void cadastrar(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        String sql = "INSERT INTO cargo_emprego (descricao_cargo_emprego, cbo_cargo_emprego, regime_juridico_cargo_emprego, esta_ativo_cargo_emprego) values (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());
            pstm.setString(2, cadastrarcargoempregodto.getCboCargoEmprego());
            pstm.setString(3, cadastrarcargoempregodto.getRegimeJuridicoCargoEmprego());
            pstm.setBoolean(4, cadastrarcargoempregodto.isChkAtivoCargoEmprego());

            pstm.execute();
            pstm.close();
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarCargoEmpregoDAO - Cadastrar" + erro);
        }
    }

    public void atualizar(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("UPDATE cargo_emprego SET nome_cargo_emprego = ?, regime_juridico = ?, numero_lei_cria_cargo_emprego = ?, data_lei_cria_cargo_emprego = ?, referencia_salarial = ?  WHERE codigo_cargo_emprego = '" + cadastrarcargoempregodto.getCodigoCargoEmprego() + "'");
                stmt.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());
                stmt.setString(2, cadastrarcargoempregodto.getRegimeJuridicoCargoEmprego());
                stmt.executeUpdate();
            }
            catch (SQLException erro)
            {
                erro.printStackTrace();
            }
            finally
            {
                ConexaoDAO.encerrarConexao(conexao, stmt);
            }
        }
    }

    public void deletar(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try
            {
                stmt = conexao.prepareStatement("DELETE from cargo_emprego WHERE nome_cargo_emprego = '" + cadastrarcargoempregodto.getDescricaoCargoEmprego() + "'");
                stmt.executeUpdate();
            }
            catch (SQLException erro)
            {
                erro.printStackTrace();
            }
            finally
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

                objcadastrarcargoempregodto.add(cbdto);
            }
        }
        catch (SQLException erro)
        {
            erro.printStackTrace();
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conexao, stmt, rs);
        }
        return objcadastrarcargoempregodto;
    }

}
