/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarCargoEmpregoDAO;
import DTO.CadastrarCargoEmpregoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastrarCargoEmpregoControle extends CadastrarCargoEmpregoDTO
{

    public CadastrarCargoEmpregoControle()
    {

    }

    public CadastrarCargoEmpregoControle(String nomeCargoEmprego)
    {
        super();
        this.setDescricaoCargoEmprego(nomeCargoEmprego);
    }

    public CadastrarCargoEmpregoControle(String nomeCargoEmprego, String regimeJuridico, String numeroLeiCargoEmprego, String dataLeiCargoEmprego, String referenciaSalarial)
    {
        this.setDescricaoCargoEmprego(nomeCargoEmprego);
        this.setRegimeJuridicoCargoEmprego(regimeJuridico);
        this.setNumeroLeiCriaCargoEmprego(numeroLeiCargoEmprego);
        this.setDataLeiCriaCargoEmprego(dataLeiCargoEmprego);
    }

    public CadastrarCargoEmpregoControle(int codigoCargoEmprego, String nomeCargoEmprego, String regimeJuridico, String numeroLeiCargoEmprego, String dataLeiCargoEmprego, String referenciaSalarial)
    {
        this.setCodigoCargoEmprego(codigoCargoEmprego);
        this.setDescricaoCargoEmprego(nomeCargoEmprego);
        this.setRegimeJuridicoCargoEmprego(regimeJuridico);
        this.setNumeroLeiCriaCargoEmprego(numeroLeiCargoEmprego);
        this.setDataLeiCriaCargoEmprego(dataLeiCargoEmprego);
    }

    public void cadastrarCargoEmprego()
    {
        CadastrarCargoEmpregoValidacao validacao = new CadastrarCargoEmpregoValidacao(this.getDescricaoCargoEmprego(), this.getRegimeJuridicoCargoEmprego(), this.getDescricaoCargoEmprego(), this.getDataLeiCriaCargoEmprego());
        this.setMensagem(validacao.getMensagem());
        if (validacao.getMensagem().equals("ok"))
        {
            try
            {
                CadastrarCargoEmpregoDTO objcadastrarcargoempregoDTO = new CadastrarCargoEmpregoDTO();
                objcadastrarcargoempregoDTO.setDescricaoCargoEmprego(this.getDescricaoCargoEmprego());
                objcadastrarcargoempregoDTO.setRegimeJuridicoCargoEmprego(this.getRegimeJuridicoCargoEmprego());
                objcadastrarcargoempregoDTO.setNumeroLeiCriaCargoEmprego(this.getNumeroLeiCriaCargoEmprego());
                objcadastrarcargoempregoDTO.setDataLeiCriaCargoEmprego(this.getDataLeiCriaCargoEmprego());

                CadastrarCargoEmpregoDAO objcadastrarcargoempregoDAO = new CadastrarCargoEmpregoDAO();
                ResultSet rscadastrarcargoempregodao = objcadastrarcargoempregoDAO.verificarAntesDeCadastrar(objcadastrarcargoempregoDTO);

                if (rscadastrarcargoempregodao.next())
                {
                    //envia mensagem para o form falando que o funcionario esta no banco de dados
                    this.setMensagem("erro 1");
                }
                else
                {
                    //enviar mensagem dizendo que posso inserir no banco de dados 
                    this.setMensagem("ok");
                    objcadastrarcargoempregoDAO.CadastrarCargoEmpregoDAO(objcadastrarcargoempregoDTO);
                }

            }
            catch (SQLException erro)
            {

            }
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
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
            this.setNumeroLeiCriaCargoEmprego(obj.get(index).getNumeroLeiCriaCargoEmprego());
            this.setDataLeiCriaCargoEmprego(obj.get(index).getDataLeiCriaCargoEmprego());
        }
    }

    public void alterarCargoEmprego()
    {
        CadastrarCargoEmpregoDTO objcadastrarcargoemprego = new CadastrarCargoEmpregoDTO();
        objcadastrarcargoemprego.setCodigoCargoEmprego(this.getCodigoCargoEmprego());
        objcadastrarcargoemprego.setDescricaoCargoEmprego(this.getDescricaoCargoEmprego());
        objcadastrarcargoemprego.setRegimeJuridicoCargoEmprego(this.getRegimeJuridicoCargoEmprego());
        objcadastrarcargoemprego.setNumeroLeiCriaCargoEmprego(this.getNumeroLeiCriaCargoEmprego());
        objcadastrarcargoemprego.setDataLeiCriaCargoEmprego(this.getDataLeiCriaCargoEmprego());

        CadastrarCargoEmpregoDAO alterar = new CadastrarCargoEmpregoDAO();
        alterar.update(objcadastrarcargoemprego);
    }

    public void excluirCargoEmprego()
    {
        CadastrarCargoEmpregoDTO objcadastrarcargoempregoDTO = new CadastrarCargoEmpregoDTO();
        objcadastrarcargoempregoDTO.setDescricaoCargoEmprego(this.getDescricaoCargoEmprego());

        CadastrarCargoEmpregoDAO excluir = new CadastrarCargoEmpregoDAO();
        excluir.delete(objcadastrarcargoempregoDTO);
    }

    public String cadastrarCargoEmpregoNoQuadro()
    {
        ControleCadastrarFundamento controle = new ControleCadastrarFundamento();
        return controle.getQuantidadeEmpregoCriada();
    }

}
