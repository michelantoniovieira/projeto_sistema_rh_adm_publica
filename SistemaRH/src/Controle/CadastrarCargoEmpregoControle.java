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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarCargoEmpregoControle extends CadastrarCargoEmpregoDTO
{

    private frmCadastrarCargoEmprego frm;
    private CadastrarCargoEmpregoDAO cadastrarCargoEmpregoDAO;
    private List<CadastrarCargoEmpregoDTO> objPuxadoDaPesquisaDeCargoEmprego;
    private List<Integer> codigoCargosEmpregos;

    public CadastrarCargoEmpregoControle()
    {
        cadastrarCargoEmpregoDAO = new CadastrarCargoEmpregoDAO();
    }

    public CadastrarCargoEmpregoControle(frmCadastrarCargoEmprego frm)
    {
        cadastrarCargoEmpregoDAO = new CadastrarCargoEmpregoDAO();
        this.frm = frm;
    }

    public void cadastrarCargoEmprego() throws SQLException
    {
        //cria o dto
        CadastrarCargoEmpregoDTO dto = new CadastrarCargoEmpregoDTO();
        //preencho o dto com os dados do formulario
        dto.setDescricaoCargoEmprego(frm.getDescricaoCargoEmprego());
        dto.setCboCargoEmprego(frm.getCboCargoEmprego());
        dto.setRegimeJuridicoCargoEmprego(frm.getRegimeJuridico());
        dto.setChkAtivoCargoEmprego(frm.getChkAtivoCargoEmprego());
        dto.setTipoCarreira(frm.getCarreira());
        dto.setCargaHorariaSemanal(frm.getCargaHorariaSemanal());
        dto.setCargaHorariaMensal(frm.getCargaHorariaMensal());
        dto.setEscolaridade(frm.getEscolaridade());

        CadastrarCargoEmpregoValidacao val = new CadastrarCargoEmpregoValidacao(dto);
        if (val.getMensagem().equals("ok"))
        {

            ResultSet rs = cadastrarCargoEmpregoDAO.verificarAntesDeCadastrar(dto);
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Cadastro ja realizado.");
            }
            else
            {
                //mando para o dao
                cadastrarCargoEmpregoDAO.cadastrar(dto);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            }
        }
    }

    // pesquisar cargo pelo codigo inserido
    public void pesquisarCargoEmprego(String codigoCargoEmprego)
    {
        List<CadastrarCargoEmpregoDTO> cargosEmpregos = cadastrarCargoEmpregoDAO.pesquisar(codigoCargoEmprego);

        if (!cargosEmpregos.isEmpty())
        {
            this.objPuxadoDaPesquisaDeCargoEmprego = cargosEmpregos;
        }
        else
        {
            this.objPuxadoDaPesquisaDeCargoEmprego = cargosEmpregos;
            JOptionPane.showMessageDialog(null, "Cargo não encontrado.");
        }
    }

    //pesquisar pela janela contendo todos os cargos e empregos
    public void pesquisarCargoEmpregoLista(int index)
    {
        CadastrarCargoEmpregoDAO pesquisar = new CadastrarCargoEmpregoDAO();
        ArrayList<CadastrarCargoEmpregoDTO> obj = new ArrayList<>();

        obj = pesquisar.botaoNavegacao();

        for (int i = 0; i < obj.size(); i++)
        {
            //passo o indice para quando apertar os botões primeiro, anterior, proximo e ultimo conseguir navegar entre as opções
            this.setCodigoCargoEmprego(obj.get(index).getCodigoCargoEmprego());
            this.setDescricaoCargoEmprego(obj.get(index).getDescricaoCargoEmprego());
            this.setRegimeJuridicoCargoEmprego(obj.get(index).getRegimeJuridicoCargoEmprego());
        }
    }

    public String navegarEntreRegistros(String acao)
    {
        codigoCargosEmpregos = cadastrarCargoEmpregoDAO.consultarCodigosDosCargosEmpregosNoBanco();
        int primeiroItemDaLista = codigoCargosEmpregos.get(0);
        int ultimoItemDaLista = codigoCargosEmpregos.size() - 1;
        String tudoCerto = "";
        switch (acao)
        {
            case "primeiro":

                frm.indiceConsultaCargoEmprego = 0;
                pesquisarCargoEmprego(String.valueOf(codigoCargosEmpregos.get(frm.indiceConsultaCargoEmprego)));
                tudoCerto = "ok";
                break;

            case "anterior":
                if (frm.indiceConsultaCargoEmprego >= primeiroItemDaLista)
                {
                    frm.indiceConsultaCargoEmprego = frm.indiceConsultaCargoEmprego - 1;
                    pesquisarCargoEmprego(String.valueOf(codigoCargosEmpregos.get(frm.indiceConsultaCargoEmprego)));
                    tudoCerto = "ok";
                }
                else if (frm.indiceConsultaCargoEmprego == 0)
                {
                    pesquisarCargoEmprego(String.valueOf(codigoCargosEmpregos.get(frm.indiceConsultaCargoEmprego)));
                    tudoCerto = "ok";
                }
                break;

            case "proximo":
                if (frm.indiceConsultaCargoEmprego < ultimoItemDaLista)
                {
                    frm.indiceConsultaCargoEmprego = frm.indiceConsultaCargoEmprego + 1;
                    pesquisarCargoEmprego(String.valueOf(codigoCargosEmpregos.get(frm.indiceConsultaCargoEmprego)));
                    tudoCerto = "ok";
                }
                break;

            case "ultimo":
                frm.indiceConsultaCargoEmprego = ultimoItemDaLista;
                pesquisarCargoEmprego(String.valueOf(codigoCargosEmpregos.get(ultimoItemDaLista)));
                tudoCerto = "ok";
                break;

            default:
                throw new AssertionError();
        }
        return tudoCerto;
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

    //informações legislação
    public String pesquisarRemuneracao()
    {
        return null;
    }

    public List<CadastrarCargoEmpregoDTO> getObjPuxadoDaPesquisaDeCargoEmprego()
    {
        return objPuxadoDaPesquisaDeCargoEmprego;
    }

    public void setObjPuxadoDaPesquisaDeCargoEmprego(List<CadastrarCargoEmpregoDTO> objPuxadoDaPesquisaDeCargoEmprego)
    {
        this.objPuxadoDaPesquisaDeCargoEmprego = objPuxadoDaPesquisaDeCargoEmprego;
    }

    public List<Integer> getCodigoCargosEmpregos()
    {
        return codigoCargosEmpregos;
    }

    public void setCodigoCargosEmpregos(List<Integer> codigoCargosEmpregos)
    {
        this.codigoCargosEmpregos = codigoCargosEmpregos;
    }
    
    

}
