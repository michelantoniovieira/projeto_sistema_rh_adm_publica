package Modelo;

import DAO.CadastrarFundamentoDAO;
import DTO.CadastrarFundamentoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class ControleCadastrarFundamento
{

    public static Integer quantidadeEmpregoCriada = 0;

    public ControleCadastrarFundamento()
    {

    }

    public ControleCadastrarFundamento(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para, JTabbedPane jtp, String codigoCargoEmprego, String codigoAtoLegal)
    {
        if (eUmaAlteracao)
        {
            alterarLegislacao(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada, de, para, codigoCargoEmprego, codigoAtoLegal);
        }
        else
        {
            cadastrarLegislacao(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada, de, para, codigoCargoEmprego, codigoAtoLegal);
        }
    }

    public ControleCadastrarFundamento(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String de, String para, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, JTabbedPane jtp)
    {
        if (eUmaAlteracao)
        {
            alterarReajuste(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, de, para, tabela, eUmaAlteracao, linhaSelecionada);
        }
        else
        {
            cadastrarReajuste(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, de, para, tabela, eUmaAlteracao, linhaSelecionada);
        }

    }

    public void cadastrarLegislacao(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para, String codigoCargoEmprego, String codigoAtoLegal)
    {
        Object[] linha = new Object[6];
        linha[0] = numeroDaLei;
        linha[1] = anoDaLei;
        linha[2] = dataDaLei;
        linha[3] = ementaDaLei;
        linha[4] = atoDaLei;
        linha[5] = qtdVagasDaLei;
        tabela.addRow(linha);

        CadastrarFundamentoDAO dao = new CadastrarFundamentoDAO();
        CadastrarFundamentoDTO dto = new CadastrarFundamentoDTO();
        //passar a informação para dto
        dto.setNumeroDaLei(numeroDaLei);
        System.out.println(anoDaLei);
        dto.setAnoDaLei(anoDaLei);
        dto.setDataDaLei(dataDaLei);
        dto.setEmentaDaLei(ementaDaLei);
        dto.setAtoDaLei(atoDaLei);
        dto.setQtdVagasDaLei(qtdVagasDaLei);
        dto.setReajusteDe("0");
        dto.setReajustePara("0");
        dto.setTipoAto("1");
        dao.cadastrarFundamento(dto);
        
        codigoAtoLegal = dao.pesquisarCodigoFundamento().get(0).getCodigoDoAto();
        System.out.println(codigoAtoLegal);
        //parei aqui quando eu salvo o primeiro registro ele vai, o problema são os proximos registros
        //primeiro passo - vou ter que fazer por bloco. primeiro cadastro o cargo no banco preenecnhendo as informações da parte de cima salvo,
        //dai vai liberar o acesso aos botoes, o usuario cadastra a lei
        //dai cadastrar a remuneraçao e o cadastro vai sendo fechado por partes
        dao.amarrarCargoEmpregoNoFundamento(codigoCargoEmprego, codigoAtoLegal);
    }

    public void alterarLegislacao(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para, String codigoCargoEmprego, String codigoAtoLegal)
    {

        if (linhaSelecionada != -1)
        {
            tabela.setValueAt(numeroDaLei, linhaSelecionada, 0);
            tabela.setValueAt(anoDaLei, linhaSelecionada, 1);
            tabela.setValueAt(dataDaLei, linhaSelecionada, 2);
            tabela.setValueAt(ementaDaLei, linhaSelecionada, 3);
            tabela.setValueAt(atoDaLei, linhaSelecionada, 4);
            tabela.setValueAt(qtdVagasDaLei, linhaSelecionada, 5);
        }
    }

    private void cadastrarReajuste(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String de, String para, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada)
    {
        Object[] linha = new Object[6];
        linha[0] = numeroDaLei;
        linha[1] = anoDaLei;
        linha[2] = dataDaLei;
        linha[3] = ementaDaLei;
        linha[4] = de;
        linha[5] = para;
        tabela.addRow(linha);
    }

    private void alterarReajuste(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String de, String para, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada)
    {
        if (linhaSelecionada != -1)
        {
            tabela.setValueAt(numeroDaLei, linhaSelecionada, 0);
            tabela.setValueAt(anoDaLei, linhaSelecionada, 1);
            tabela.setValueAt(dataDaLei, linhaSelecionada, 2);
            tabela.setValueAt(ementaDaLei, linhaSelecionada, 3);
            tabela.setValueAt(de, linhaSelecionada, 4);
            tabela.setValueAt(para, linhaSelecionada, 5);
        }
    }

    public String getQuantidadeEmpregoCriada()
    {
        return quantidadeEmpregoCriada.toString();
    }

    public void contabilizarTotais(DefaultTableModel tabelaQuadro, DefaultTableModel tabelaFundamento)
    {
        quantidadeEmpregoCriada = 0;
        for (int i = 0; i < tabelaFundamento.getRowCount(); i++)
        {
            quantidadeEmpregoCriada += Integer.parseInt(tabelaFundamento.getValueAt(i, 5).toString());
            JOptionPane.showMessageDialog(null, quantidadeEmpregoCriada);
        }
    }
}
