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
import java.math.BigDecimal;
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
    private int ultimoRegistro;

    public CadastrarCargoEmpregoControle()
    {
        cadastrarCargoEmpregoDAO = new CadastrarCargoEmpregoDAO();
    }

    public CadastrarCargoEmpregoControle(frmCadastrarCargoEmprego frm)
    {
        cadastrarCargoEmpregoDAO = new CadastrarCargoEmpregoDAO();
        this.frm = frm;
    }

    public void cadastrarCargoEmprego(frmCadastrarCargoEmprego frm) throws SQLException
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
        dto.setVagasCriadas(frm.getQuadro().getValueAt(0, 0).toString());
        dto.setReferenciaVencimento(frm.getCmbReferenciaSalarial().getSelectedItem().toString());
        dto.setGrauVencimento(frm.getCmbGrau().getSelectedItem().toString());
        dto.setCodigoVencimento(cadastrarCargoEmpregoDAO.pesquisarCodigoVencimento(dto));
        dto.setNumeroAto(frm.getTbFundamentoCriacaoExclusao().getValueAt(0, 0).toString());
        dto.setAnoAto(frm.getTbFundamentoCriacaoExclusao().getValueAt(0, 1).toString());
        dto.setCodigoAto(cadastrarCargoEmpregoDAO.pesquisarCodigoAto(dto));
        
        System.out.println("pepela" + dto.getCodigoAto());
        //continuar daqui
        //a ideia é verificar se a lei ja existe. se existir ele confronta com a informação salva na tabela e coloca o codigo do ato na variavel codigo ato
        //quando o usuario clicar no botao salvar ele ja salva tudo certinho
        //durante a confrontação do codigo do ato se não existir o ato ele cria o ato e salva no banco de dados antes do usuario finalizar o cadastro
        //a ideia é primeiro liberar o ato legal para o usuario criar ou selecionar o ato
        //e depois liberar os campos para incluir o nome do emprego etc.
        
        
        
        
        
        /* preciso mostrar na tabela quadro as informações de vagas criadas, após isto, devo prosseguir com a logica do botão salvar*/
        
        CadastrarCargoEmpregoValidacao val = new CadastrarCargoEmpregoValidacao(dto);

        if (val.getMensagem() != null && val.getMensagem().equals("ok"))
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

    public String pesquisarUltimoRegistro()
    {
        CadastrarCargoEmpregoDAO dao = new CadastrarCargoEmpregoDAO();
        int ultimoRegistroSalvo = dao.pesquisarUltimoRegistro();
        int soma = ultimoRegistroSalvo + 1;
        return String.valueOf(soma);
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
                else
                {
                    frm.indiceConsultaCargoEmprego = 0;
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
    
    public Integer preencherQuadro(String codigoCargoEmprego)
    {
        CadastrarCargoEmpregoDAO controle = new CadastrarCargoEmpregoDAO();
        return controle.pesquisarVagasCriadas(codigoCargoEmprego);
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

    //informações remuneração
    
    public CadastrarCargoEmpregoDAO consultarReferenciaGrauVencimento(String codigoVencimento)
    {
        return cadastrarCargoEmpregoDAO.consultarReferenciaGrauVencimento(codigoVencimento);
    }
    
    public ArrayList<String> pesquisarReferenciaRemuneracao()
    {
        return cadastrarCargoEmpregoDAO.pesquisarReferencia();
    }
    
    public ArrayList<String> pesquisarGrauRemuneracao()
    {
        return cadastrarCargoEmpregoDAO.pesquisarGrau();
    }
    
    public BigDecimal vincularRemuneração(String tipoCarreira, String referenciaSalarial, String grau)
    {
        return cadastrarCargoEmpregoDAO.pesquisarRemuneracao(tipoCarreira, referenciaSalarial, grau);
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

    public int getUltimoRegistro()
    {
        return ultimoRegistro;
    }

    public void setUltimoRegistro(int ultimoRegistro)
    {
        this.ultimoRegistro = ultimoRegistro;
    }

    
    
}
