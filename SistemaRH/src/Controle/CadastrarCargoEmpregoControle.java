/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Apresentacao.frmCadastrarCargoEmprego;
import DAO.CadastrarCargoEmpregoDAO;
import DTO.CadastrarCargoEmpregoDTO;
import Modelo.ControleCadastrarFundamento;
import Util.CadastrarCargoEmpregoValidacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarCargoEmpregoControle extends CadastrarCargoEmpregoDTO
{

    private frmCadastrarCargoEmprego frm;
    private CadastrarCargoEmpregoDAO cadastrarCargoEmpregoDAO;

    public CadastrarCargoEmpregoControle()
    {

    }

    public CadastrarCargoEmpregoControle(frmCadastrarCargoEmprego frm)
    {
        cadastrarCargoEmpregoDAO = new CadastrarCargoEmpregoDAO();
        this.frm = frm;
    }

    public void cadastrarCargoEmprego()
    {
        //cria o dto
        CadastrarCargoEmpregoDTO dto = new CadastrarCargoEmpregoDTO();
        //preencho o dto com os dados do formulario
        dto.setDescricaoCargoEmprego(frm.getDescricaoCargoEmprego());
        dto.setCboCargoEmprego(frm.getCboCargoEmprego());
        dto.setRegimeJuridicoCargoEmprego(frm.getRegimeJuridico());
        dto.setChkAtivoCargoEmprego(frm.getChkAtivo().isSelected());

        CadastrarCargoEmpregoValidacao val = new CadastrarCargoEmpregoValidacao(dto);
        if (val.validar(dto).equals("ok"))
        {
            //mando para o dao
            cadastrarCargoEmpregoDAO.CadastrarCargoEmpregoDAO(dto);
        }
    }

    public void pesquisarCargoEmprego(int index)
    {
        CadastrarCargoEmpregoDAO pesquisar = new CadastrarCargoEmpregoDAO();
        ArrayList<CadastrarCargoEmpregoDTO> obj = new ArrayList<>();

        obj = pesquisar.botaoNavegacao();

        for (int i = 0; i < obj.size(); i++)
        {
            //estou passo o indice para quando apertar os botões primeiro, anterior, proximo e ultimo conseguir navegar entre as opções
            this.setCodigoCargoEmprego(obj.get(index).getCodigoCargoEmprego());
            this.setDescricaoCargoEmprego(obj.get(index).getDescricaoCargoEmprego());
            this.setRegimeJuridicoCargoEmprego(obj.get(index).getRegimeJuridicoCargoEmprego());
        }
    }

    //informações do quadro
    public String cadastrarCargoEmpregoNoQuadro(DefaultTableModel tabelaQuadro, DefaultTableModel tabelaFundamento)
    {
        ControleCadastrarFundamento controle = new ControleCadastrarFundamento();
        controle.contabilizarTotais(tabelaQuadro, tabelaFundamento);
        return controle.getQuantidadeEmpregoCriada();
    }

    public String excluirCargoEmpregoDoQuadro(DefaultTableModel tabela, int linhaSelecionada, int colunaComAInformacaoASerExcluida)
    {
        ControleCadastrarFundamento controle = new ControleCadastrarFundamento();
        return controle.getQuantidadeEmpregoCriada();
    }

    public String alterarCargoEmpregoDoQuadro(DefaultTableModel tabelaQuadro, DefaultTableModel tabelaFundamento, int linhaSelecionada, int colunaComAInformacaoASerAlterada, String quantidadeCargoEmpregoASerAlterada)
    {
        ControleCadastrarFundamento controle = new ControleCadastrarFundamento();
        controle.contabilizarTotais(tabelaQuadro, tabelaFundamento);
        return controle.getQuantidadeEmpregoCriada();
    }

}
