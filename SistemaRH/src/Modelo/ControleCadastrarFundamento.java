package Modelo;

import DTO.CadastrarFundamentoDTO;
import javax.swing.table.DefaultTableModel;

public class ControleCadastrarFundamento {

    public ControleCadastrarFundamento(String numeroDaLei, String anoDaLei, String dataDaLei, String ementaDaLei, String atoDaLei, String qtdVagasDaLei, DefaultTableModel tabela) {
        CadastrarFundamentoDTO cadastrarFundamentoDTO = new CadastrarFundamentoDTO();
        cadastrarFundamentoDTO.setNumeroDaLei(numeroDaLei);
        cadastrarFundamentoDTO.setAnoDaLei(anoDaLei);
        cadastrarFundamentoDTO.setDataDaLei(dataDaLei);
        cadastrarFundamentoDTO.setEmentaDaLei(ementaDaLei);
        cadastrarFundamentoDTO.setAtoDaLei(atoDaLei);
        cadastrarFundamentoDTO.setQtdVagasDaLei(qtdVagasDaLei);

        Object[] linha = new Object[6];
        linha[0] = cadastrarFundamentoDTO.getNumeroDaLei();
        linha[1] = cadastrarFundamentoDTO.getAnoDaLei();
        linha[2] = cadastrarFundamentoDTO.getDataDaLei();
        linha[3] = cadastrarFundamentoDTO.getEmentaDaLei();
        linha[4] = cadastrarFundamentoDTO.getAtoDaLei();
        linha[5] = cadastrarFundamentoDTO.getQtdVagasDaLei();

        tabela.addRow(linha);
        
    }
}
