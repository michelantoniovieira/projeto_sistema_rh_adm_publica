package Modelo;

import DTO.CadastrarFundamentoDTO;
import javax.swing.table.DefaultTableModel;

public class ControleCadastrarFundamento
{

    public ControleCadastrarFundamento(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada)
    {
        if (eUmaAlteracao)
        {
            alterar(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada);
        }
        else
        {
            cadastrar(numeroDaLei, anoDaLei, dataDaLei, ementaDaLei, atoDaLei, qtdVagasDaLei, tabela, eUmaAlteracao, linhaSelecionada);
        }
    }

    public void cadastrar(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada)
    {
        Object[] linha = new Object[6];
        linha[0] = numeroDaLei;
        linha[1] = anoDaLei;
        linha[2] = dataDaLei;
        linha[3] = ementaDaLei;
        linha[4] = atoDaLei;
        linha[5] = qtdVagasDaLei;
        tabela.addRow(linha);
    }

    public void alterar(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela, boolean eUmaAlteracao, int linhaSelecionada)
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

}
