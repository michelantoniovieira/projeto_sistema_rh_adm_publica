package DAO;

import DTO.CadastrarCargoEmpregoDTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastrarCargoEmpregoDAO
{

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    String referencia;
    String grau;
    String valorVencimento;

    public CadastrarCargoEmpregoDAO()
    {

    }

    public CadastrarCargoEmpregoDAO(String referencia, String grau, String valorVencimento)
    {
        this.setReferencia(referencia);
        this.setGrau(grau);
        this.setValorVencimento(valorVencimento);
    }

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
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Cargos e Empregos" + erro);
            return null;
        }
    }

    public List<Integer> consultarCodigosDosCargosEmpregosNoBanco()
    {

        List<Integer> codigosCargos = new ArrayList<>();
        conn = new ConexaoDAO().conectaBD();
        try
        {
            String sql = "SELECT * FROM cargo_emprego";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next())
            {
                int codigoCargoEmprego = rs.getInt("codigo_cargo_emprego");
                codigosCargos.add(codigoCargoEmprego);
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Codigo dos Cargos e Empregos" + erro);
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }

        return codigosCargos;
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
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
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
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
        return ultimoRegistro;
    }



    public Integer pesquisarVagasCriadas(String codigoCargoEmprego)
    {
        conn = new ConexaoDAO().conectaBD();
        Integer vagasCriadas = 0;

        try
        {
            String sql = "SELECT vagas_criadas FROM cargo_emprego WHERE codigo_cargo_emprego = '" + codigoCargoEmprego + "'";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            if (rs.next())
            {
                vagasCriadas = rs.getInt("vagas_criadas");
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar vagas criadas: " + erro);
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
        return vagasCriadas;
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
                cargoEmprego.setChkAtivoCargoEmprego(rs.getBoolean("esta_ativo_cargo_emprego"));
                cargoEmprego.setTipoCarreira(rs.getString("tipo_carreira_cargo_emprego"));
                cargoEmprego.setCargaHorariaSemanal(rs.getString("carga_horaria_semanal_cargo_emprego"));
                cargoEmprego.setCargaHorariaMensal(rs.getString("carga_horaria_mensal_cargo_emprego"));
                cargoEmprego.setEscolaridade(rs.getString("escolaridade_cargo_emprego"));
                cargoEmprego.setCodigoVencimento(rs.getString("fk_codigo_vencimento"));
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
        String sql = "INSERT INTO cargo_emprego (descricao_cargo_emprego, cbo_cargo_emprego, regime_juridico_cargo_emprego, esta_ativo_cargo_emprego, tipo_carreira_cargo_emprego, carga_horaria_semanal_cargo_emprego, carga_horaria_mensal_cargo_emprego, escolaridade_cargo_emprego, fk_codigo_vencimento) values (?,?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getDescricaoCargoEmprego());
            pstm.setString(2, cadastrarcargoempregodto.getCboCargoEmprego());
            pstm.setString(3, cadastrarcargoempregodto.getRegimeJuridicoCargoEmprego());
            pstm.setBoolean(4, cadastrarcargoempregodto.getChkAtivoCargoEmprego());
            pstm.setString(5, cadastrarcargoempregodto.getTipoCarreira());
            pstm.setString(6, cadastrarcargoempregodto.getCargaHorariaSemanal());
            pstm.setString(7, cadastrarcargoempregodto.getCargaHorariaMensal());
            pstm.setString(8, cadastrarcargoempregodto.getEscolaridade());
            pstm.setString(9, cadastrarcargoempregodto.getCodigoVencimento());

            pstm.execute();
            pstm.close();
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarCargoEmpregoDAO - Cadastrar" + erro);
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public String pesquisarCodigoVencimento(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        conn = new ConexaoDAO().conectaBD();
        String codigoVencimento = "";

        try
        {
            String sql = "SELECT codigo_vencimento FROM vencimentos "
                    + "WHERE referencia_vencimento = ? "
                    + "AND grau_vencimento = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getReferenciaVencimento());
            pstm.setString(2, cadastrarcargoempregodto.getGrauVencimento());
            rs = pstm.executeQuery();

            while (rs.next())
            {
                codigoVencimento = rs.getString("codigo_vencimento");
            }

            return codigoVencimento;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Codigo Vencimento" + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public String pesquisarCodigoAto(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        conn = new ConexaoDAO().conectaBD();
        String codigoAto = "";

        try
        {
            String sql = "SELECT codigo_ato FROM ato_legal "
                    + "WHERE numero_ato = ? "
                    + "AND ano_ato = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadastrarcargoempregodto.getNumeroAto());
            pstm.setString(2, cadastrarcargoempregodto.getAnoAto());
            rs = pstm.executeQuery();

            while (rs.next())
            {
                codigoAto = rs.getString("codigo_ato");
            }

            return codigoAto;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Codigo Vencimento" + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public void cadastrarAto(String fkCodigoAto)
    {

    }

    public List<CadastrarCargoEmpregoDTO> pesquisarAto(String fkCodigoCargoEmprego)
    {
        System.out.println(fkCodigoCargoEmprego);
        conn = new ConexaoDAO().conectaBD();
        List<CadastrarCargoEmpregoDTO> listaDto = new ArrayList<>();

        try
        {
            String sql = "SELECT ceal.*, al.*, ce.* "
                    + "FROM cargo_emprego_ato_legal ceal "
                    + "JOIN ato_legal al ON al.codigo_ato = ceal.fk_codigo_ato_legal "
                    + "JOIN cargo_emprego ce ON ce.codigo_cargo_emprego = ceal.fk_codigo_cargo_emprego "
                    + "WHERE ceal.fk_codigo_cargo_emprego = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fkCodigoCargoEmprego); // Substitua "fkCodigoCargoEmprego" pelo valor do código do cargo/emprego

            rs = pstm.executeQuery();

            while (rs.next())
            {
                CadastrarCargoEmpregoDTO novoDTO = new CadastrarCargoEmpregoDTO();
                Date data = rs.getDate("data_ato");

                // Formatar a data no formato desejado
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                String dataFormatada = formato.format(data);

                novoDTO.setNumeroAto(rs.getString("numero_ato"));
                novoDTO.setAnoAto(rs.getString("ano_ato"));
                novoDTO.setDataAto(dataFormatada);
                novoDTO.setEmentaAto(rs.getString("ementa_ato"));
                novoDTO.setCategoriaAto(rs.getString("categoria_ato"));
                novoDTO.setQuantidadeAto(rs.getString("quantidade_ato"));
                novoDTO.setReajusteDe(rs.getString("reajuste_de"));
                novoDTO.setReajustePara(rs.getString("reajuste_para"));

                listaDto.add(novoDTO);
            }

            return listaDto;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Codigo Vencimento" + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public void cadastrarVencimento(CadastrarCargoEmpregoDTO cadastrarcargoempregodto)
    {
        String sql = "INSERT INTO cargo_emprego (fk_codigo_vencimento) "
                + "SELECT v.codigo_vencimento "
                + "FROM vencimentos v "
                + "WHERE codigo_cargo_emprego = ?"
                + "AND v.referencia_vencimento = ? "
                + "AND v.grau_vencimento = ?";

        conn = new ConexaoDAO().conectaBD();

        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(0, cadastrarcargoempregodto.getCodigoCargoEmprego());
            pstm.setString(1, cadastrarcargoempregodto.getReferenciaVencimento());
            pstm.setString(2, cadastrarcargoempregodto.getGrauVencimento());
            pstm.execute();
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "CadastrarVencimentoCargoEmpregoDAO - Cadastrar" + erro);
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
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

    public CadastrarCargoEmpregoDAO consultarReferenciaGrauVencimento(String codigoVencimento)
    {
        ArrayList<String> resultado = new ArrayList<>();
        conn = new ConexaoDAO().conectaBD();

        try
        {
            String sql = "SELECT v.referencia_vencimento, v.grau_vencimento, v.valor_vencimento "
                    + "FROM vencimentos v "
                    + "JOIN cargo_emprego c ON c.fk_codigo_vencimento = v.codigo_vencimento "
                    + "WHERE v.codigo_vencimento = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, codigoVencimento);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                referencia = rs.getString("referencia_vencimento");
                grau = rs.getString("grau_vencimento");
                valorVencimento = rs.getString("valor_vencimento");
                return new CadastrarCargoEmpregoDAO(referencia, grau, valorVencimento);

            }

            return new CadastrarCargoEmpregoDAO(referencia, grau, valorVencimento);
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao consultar referência e grau do vencimento: " + erro);
            System.out.println("Erro ao consultar referência e grau do vencimento: " + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public ArrayList<String> pesquisarReferencia()
    {
        conn = new ConexaoDAO().conectaBD();
        ArrayList<String> referencia = new ArrayList<>();

        try
        {
            referencia.clear(); // Limpar o ArrayList antes de adicionar os novos valores
            String sql = "SELECT referencia_vencimento FROM vencimentos";

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                referencia.add(rs.getString("referencia_vencimento"));
            }

            return referencia;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Referencia" + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public ArrayList<String> pesquisarGrau()
    {
        conn = new ConexaoDAO().conectaBD();
        ArrayList<String> grau = new ArrayList<>();

        try
        {
            grau.clear(); // Limpar o ArrayList antes de adicionar os novos valores
            String sql = "SELECT grau_vencimento FROM vencimentos";

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                grau.add(rs.getString("grau_vencimento"));
            }

            return grau;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Grau" + erro);
            return null;
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
    }

    public BigDecimal pesquisarRemuneracao(String tipoCarreira, String referenciaSalarial, String grau)
    {
        switch (tipoCarreira)
        {
            case "Técnico":
                tipoCarreira = "1";
                break;

            case "Aposentado":
                tipoCarreira = "1";
                break;

            case "Professor":
                tipoCarreira = "3";
                break;

            case "Comissão":
                tipoCarreira = "4";
                break;

            case "Eletivo":
                tipoCarreira = "5";
                break;

            default:
                throw new AssertionError();
        }

        conn = new ConexaoDAO().conectaBD();
        BigDecimal remuneracao = new BigDecimal("0");

        try
        {
            String sql = "SELECT valor_vencimento FROM vencimentos WHERE " + tipoCarreira + " = fk_codigo_tabela_salarial AND '" + referenciaSalarial + "' = referencia_vencimento AND '" + grau + "' = grau_vencimento";

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (rs.next())
            {
                remuneracao = rs.getBigDecimal("valor_vencimento");
            }
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar remuneração: " + erro);
            System.out.println("Erro ao pesquisar remuneração: " + erro);
        }
        finally
        {
            ConexaoDAO.encerrarConexao(conn, pstm, rs);
        }
        return remuneracao;
    }

    public String getReferencia()
    {
        return referencia;
    }

    public void setReferencia(String referencia)
    {
        this.referencia = referencia;
    }

    public String getGrau()
    {
        return grau;
    }

    public void setGrau(String grau)
    {
        this.grau = grau;
    }

    public String getValorVencimento()
    {
        return valorVencimento;
    }

    public void setValorVencimento(String valorVencimento)
    {
        this.valorVencimento = valorVencimento;
    }

}
