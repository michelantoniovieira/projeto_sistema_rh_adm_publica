package Modelo;

import DTO.CadastrarFundamentoDTO;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class ControleCadastrarFundamento
{

    public static Integer quantidadeEmpregoCriada = 0;
    public static Integer quantidadeEmpregoCriadaAux = 0;

    public ControleCadastrarFundamento()
    {

    }

    public ControleCadastrarFundamento(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para, JTabbedPane jtp)
    {
        if (eUmaAlteracao)
        {
            alterarLegislacao(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada, de, para);
        }
        else
        {
            cadastrarLegislacao(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada, de, para);
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

    public void cadastrarLegislacao(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para)
    {
        Object[] linha = new Object[6];
        linha[0] = numeroDaLei;
        linha[1] = anoDaLei;
        linha[2] = dataDaLei;
        linha[3] = ementaDaLei;
        linha[4] = atoDaLei;
        linha[5] = qtdVagasDaLei;
        tabela.addRow(linha);

        cadastrarCargoEmpregoNoQuadro(Integer.parseInt(qtdVagasDaLei));
        JOptionPane.showMessageDialog(null, qtdVagasDaLei);
    }

    public void alterarLegislacao(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada, String de, String para)
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

    public void cadastrarCargoEmpregoNoQuadro(int quantidadeEmpregoCriada)
    {
        if (quantidadeEmpregoCriada <= 0)
        {
            this.quantidadeEmpregoCriada = 0;
            this.quantidadeEmpregoCriadaAux = 0;
        }
        else
        {
            this.quantidadeEmpregoCriada = quantidadeEmpregoCriada + quantidadeEmpregoCriadaAux;
            quantidadeEmpregoCriadaAux += quantidadeEmpregoCriada;
        }
    }

    public void excluirCargoEmpregoDoQuadro(DefaultTableModel tabela, int linhaSelecionada, int colunaComAInformacaoASerExcluida)
    {
        if (quantidadeEmpregoCriada <= 0)
        {
            this.quantidadeEmpregoCriada = 0;
            this.quantidadeEmpregoCriadaAux = 0;
        }
        else
        {
            Object quantidadeASerExcluida = tabela.getValueAt(linhaSelecionada, colunaComAInformacaoASerExcluida);
            //primeiro converter para String
            String qtdExcStr = String.valueOf(quantidadeASerExcluida);
            //depois converter para int
            int qtdExcInt = Integer.parseInt(qtdExcStr);
            this.quantidadeEmpregoCriada = quantidadeEmpregoCriada - qtdExcInt;
            quantidadeEmpregoCriadaAux -= qtdExcInt;
        }
    }

    public void alterarCargoEmpregoDoQuadro(DefaultTableModel tabela, int linhaSelecionada, int colunaComAInformacaoASerExcluida, String quantidadeCargoEmpregoASerAlterada)
    {
        quantidadeEmpregoCriada = 0;
        for (int i = 0; i < tabela.getRowCount(); i++)
        {
            quantidadeEmpregoCriada = quantidadeEmpregoCriada + Integer.parseInt(tabela.getValueAt(i, colunaComAInformacaoASerExcluida).toString());
            JOptionPane.showMessageDialog(null, quantidadeEmpregoCriada);
        }
    }
}
