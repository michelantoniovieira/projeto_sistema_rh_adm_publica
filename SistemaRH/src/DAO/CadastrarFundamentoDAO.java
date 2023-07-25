package DAO;

import DTO.CadastrarFundamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastrarFundamentoDAO
{

    public void amarrarCargoEmpregoNoFundamento(String codigoCargoEmprego, String codigoAtoLegal)
    {
        System.out.println("cod cargo" + codigoCargoEmprego);
        String sql = "INSERT INTO cargo_emprego_ato_legal (fk_codigo_cargo_emprego, fk_codigo_ato_legal) "
                + "VALUES (?,?)";
        Connection con = ConexaoDAO.conectaBD();
        try
        {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigoCargoEmprego);
            pst.setString(2, codigoAtoLegal);

            pst.execute();
            pst.close();
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao Amarrar Cargo/Emprego no Fundamento: " + erro);
            System.out.println(erro);
        }
    }

    public void cadastrarFundamento(CadastrarFundamentoDTO dto)
    {
        String dataOriginal = dto.getDataDaLei(); // Data no formato 'DD/MM/AAAA'
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(dataOriginal, formatter);
        String dataFormatadaParaBanco = dataFormatada.toString(); // Data no formato 'AAAA-MM-DD'

        String sql = "INSERT INTO ato_legal (numero_ato, ano_ato, data_ato, ementa_ato, categoria_ato, quantidade_ato, reajuste_de, reajuste_para, fk_codigo_tipo_ato) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        Connection con = ConexaoDAO.conectaBD();
        try
        {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, dto.getNumeroDaLei());
            pst.setString(2, dto.getAnoDaLei());
            pst.setString(3, dataFormatadaParaBanco);
            pst.setString(4, dto.getEmentaDaLei());
            pst.setString(5, dto.getAtoDaLei());
            pst.setString(6, dto.getQtdVagasDaLei());
            pst.setString(7, dto.getReajusteDe());
            pst.setString(8, dto.getReajustePara());
            pst.setString(9, dto.getTipoAto());
            pst.execute();
            pst.close();
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fundamento: " + erro);
            System.out.println(erro);
        }
    }

    public List<CadastrarFundamentoDTO> pesquisarCodigoFundamento()
    {
        String sql = "SELECT * FROM ato_legal ORDER BY codigo_ato DESC";

        Connection con = ConexaoDAO.conectaBD();
        List<CadastrarFundamentoDTO> listaFundamento = new ArrayList<>();
        try
        {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next())
            {

                CadastrarFundamentoDTO dto = new CadastrarFundamentoDTO();

                dto.setCodigoDoAto(rs.getString("codigo_ato"));
                dto.setNumeroDaLei(rs.getString("numero_ato"));
                dto.setAnoDaLei(rs.getString("ano_ato"));
                dto.setDataDaLei(rs.getString("data_ato"));
                dto.setEmentaDaLei(rs.getString("ementa_ato"));
                dto.setAtoDaLei(rs.getString("categoria_ato"));
                dto.setQtdVagasDaLei(rs.getString("quantidade_ato"));
                dto.setReajusteDe(rs.getString("reajuste_de"));
                dto.setReajustePara(rs.getString("reajuste_para"));

                listaFundamento.add(dto);

            }
            //pst.close();
            return listaFundamento;
        }
        catch (SQLException erro)
        {
            return null;
        }
    }

    public List<CadastrarFundamentoDTO> pesquisarFundamento()
    {
        String sql = "SELECT * FROM ato_legal ORDER BY codigo_ato ASC";

        Connection con = ConexaoDAO.conectaBD();
        List<CadastrarFundamentoDTO> listaFundamento = new ArrayList<>();
        try
        {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next())
            {

                CadastrarFundamentoDTO dto = new CadastrarFundamentoDTO();

                dto.setCodigoDoAto(rs.getString("codigo_ato"));
                dto.setNumeroDaLei(rs.getString("numero_ato"));
                dto.setAnoDaLei(rs.getString("ano_ato"));
                dto.setDataDaLei(rs.getString("data_ato"));
                dto.setEmentaDaLei(rs.getString("ementa_ato"));

                listaFundamento.add(dto);

            }
            //pst.close();
            return listaFundamento;
        }
        catch (SQLException erro)
        {
            return null;
        }
    }

    public List<CadastrarFundamentoDTO> pesquisarCodigoFundamentoParaExcluir(CadastrarFundamentoDTO dto)
    {
        String sql = "SELECT * FROM ato_legal WHERE numero_ato = ? AND ano_ato = ?";
        Connection con = ConexaoDAO.conectaBD();
        List<CadastrarFundamentoDTO> lista = new ArrayList<>();
        try
        {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, dto.getNumeroDaLei());
            pstm.setString(2, dto.getAnoDaLei());

            ResultSet rs = pstm.executeQuery();
            while (rs.next())
            {
                CadastrarFundamentoDTO dtoLista = new CadastrarFundamentoDTO();
                dtoLista.setCodigoDoAto(rs.getString("codigo_ato"));
                dtoLista.setNumeroDaLei(rs.getString("numero_ato"));
                dtoLista.setAnoDaLei(rs.getString("ano_ato"));
                dtoLista.setDataDaLei(rs.getString("data_ato"));
                lista.add(dtoLista);
            }

        }
        catch (SQLException e)
        {
            System.out.println("Erro ao pesquisar para excluir." + e);
            return null;
        }

        return lista;
    }

    public void excluirFundamentoDoCargoEmprego(String codigoCargoEmprego, String codigoFundamento)
    {
        String sql = "DELETE FROM cargo_emprego_ato_legal WHERE fk_codigo_cargo_emprego = ? AND fk_codigo_ato_legal = ?";
        Connection conn = ConexaoDAO.conectaBD();

        try
        {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, codigoCargoEmprego);
            pstm.setString(2, codigoFundamento);
            pstm.executeUpdate();

        }
        catch (SQLException e)
        {
            System.out.println("Erro exclusao fundamento" + e);
        }
    }
}
