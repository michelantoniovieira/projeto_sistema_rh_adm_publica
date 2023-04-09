/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarConcursoDAO;
import DAO.CadastrarFuncionarioDAO;
import DAO.ListarComboBox;
import DAO.PopularCmbDAO;
import DAO.PopularTabela;
import DTO.CadastrarBancaDTO;
import DTO.CadastrarConcursoDTO;
import DTO.CadastrarFuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarConcursoControle extends CadastrarConcursoDTO
{

    public CadastrarConcursoControle()
    {

    }

    public CadastrarConcursoControle(int codigoConcurso)
    {
        this.setCodigo_Concurso(codigoConcurso);
    }

    public CadastrarConcursoControle(int numeroConcurso, int anoConcurso)
    {
        super();
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
    }

    public CadastrarConcursoControle(int numeroConcurso, int anoConcurso, int situacaoConcurso, int fkMatriculaResponsavelConcurso, int fkCodigoBanca)
    {
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
        this.setSituacao_Concurso(situacaoConcurso);
        this.setFk_Matricula_Responsavel_Concurso(fkMatriculaResponsavelConcurso);
        this.setFk_codigo_banca(fkCodigoBanca);
    }

    public CadastrarConcursoControle(int codigoConcurso, int numeroConcurso, int anoConcurso, int situacaoConcurso, int fkMatriculaResponsavelConcurso, int fkCodigoBanca)
    {
        this.setCodigo_Concurso(codigoConcurso);
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
        this.setSituacao_Concurso(situacaoConcurso);
        this.setFk_Matricula_Responsavel_Concurso(fkMatriculaResponsavelConcurso);
        this.setFk_codigo_banca(fkCodigoBanca);
    }

    public CadastrarConcursoControle(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        ListarComboBox listarCMB = new ListarComboBox();
        listarCMB.popularCMB(informarTabela, informarNomeChavePrimaria, informarAtributo);
        this.setInformarAtributoString(listarCMB.getInformarAtributoString());
        this.setInformarNomeChavePrimariaInt(listarCMB.getInformarNomeChavePrimariaInt());
    }

    public CadastrarConcursoControle(int codigoConcurso, String cargoEmpregoSelecionado, String quantidadeCargoEmpregoSelecionado, String inclusaoExclusao)
    {
        this.setCodigo_Concurso(codigoConcurso);
        this.setCargoEmpregoSelecionado(cargoEmpregoSelecionado);
        this.setQuantidade_vagas(quantidadeCargoEmpregoSelecionado);
        cadastrarNaTabela(codigoConcurso, cargoEmpregoSelecionado, quantidadeCargoEmpregoSelecionado, inclusaoExclusao);
    }
    
    public CadastrarConcursoControle(int codigoConcurso, String cargoEmpregoSelecionado, String quantidadeCargoEmpregoSelecionado)
    {
        this.setCodigo_Concurso(codigoConcurso);
        this.setCargoEmpregoSelecionado(cargoEmpregoSelecionado);
        this.setQuantidade_vagas(quantidadeCargoEmpregoSelecionado);
    }

    public void cadastrarNaTabela(int codigoConcurso, String cargoEmpregoSelecionado, String quantidadeCargoEmpregoSelecionado, String inclusaoExclusao)
    {
        this.setCodigo_Concurso(codigoConcurso);
        this.setCargoEmpregoSelecionado(cargoEmpregoSelecionado);
        this.setQuantidade_vagas(quantidadeCargoEmpregoSelecionado);
        //incluir novo cargo
        if (inclusaoExclusao.equals("inclusao"))
        {
            ListarComboBox pesquisarCodigoCargoEmprego = new ListarComboBox();
            pesquisarCodigoCargoEmprego.pesquisarInformacaoNoBancoDeDados("cargo_emprego", "codigo_cargo_emprego", "nome_cargo_emprego", getCargoEmpregoSelecionado());

            //comando para tirar os conchetes em volta do numero para cadastrar no banco de dados
            String str = pesquisarCodigoCargoEmprego.getRetornoInformacaoBancoDeDados().toString();
            str = str.replace("[", "").replace("]", "");
            this.setCodigoCargoEmpregoSelecionado(Integer.parseInt(str));

            CadastrarConcursoDAO cadastrarInformacaoNoBancoDeDados = new CadastrarConcursoDAO();
            CadastrarConcursoDTO cadastrarCargosEEmpregos = new CadastrarConcursoDTO();

            cadastrarCargosEEmpregos.setCodigo_Concurso(this.getCodigo_concurso());
            cadastrarCargosEEmpregos.setCodigoCargoEmpregoSelecionado(this.getCodigoCargoEmpregoSelecionado());
            cadastrarCargosEEmpregos.setQuantidade_vagas(this.getQuantidade_vagas());
            cadastrarInformacaoNoBancoDeDados.CadastrarCargosEmpregosConcursoDAO(cadastrarCargosEEmpregos);
        } //excluir novo cargo
        else if (inclusaoExclusao.equals("exclusao"))
        {
            ListarComboBox pesquisarCodigoCargoEmprego = new ListarComboBox();
            pesquisarCodigoCargoEmprego.pesquisarInformacaoNoBancoDeDados("cargo_emprego", "codigo_cargo_emprego", "nome_cargo_emprego", getCargoEmpregoSelecionado());

            //comando para tirar os conchetes em volta do numero para cadastrar no banco de dados
            String str = pesquisarCodigoCargoEmprego.getRetornoInformacaoBancoDeDados().toString();
            str = str.replace("[", "").replace("]", "");
            this.setCodigoCargoEmpregoSelecionado(Integer.parseInt(str));

            PopularCmbDAO excluirCargoEmpregoSelecionado = new PopularCmbDAO();
            excluirCargoEmpregoSelecionado.excluirInformacaoBancoDeDados("listadecargosempregos", this.getCodigo_concurso(), this.getCodigoCargoEmpregoSelecionado());
        } //alterar cargo
        else if (inclusaoExclusao.equals("alteracao"))
        {
            ListarComboBox pesquisarCodigoCargoEmprego = new ListarComboBox();
            pesquisarCodigoCargoEmprego.pesquisarInformacaoNoBancoDeDados("cargo_emprego", "codigo_cargo_emprego", "nome_cargo_emprego", getCargoEmpregoSelecionado());

            //comando para tirar os conchetes em volta do numero para cadastrar no banco de dados
            String str = pesquisarCodigoCargoEmprego.getRetornoInformacaoBancoDeDados().toString();
            str = str.replace("[", "").replace("]", "");
            this.setCodigoCargoEmpregoSelecionado(Integer.parseInt(str));

            PopularCmbDAO alterarCargoEmpregoSelecionado = new PopularCmbDAO();
            alterarCargoEmpregoSelecionado.alterarInformacaoBancoDeDados("listadecargosempregos", this.getCodigo_concurso(), this.getCodigoCargoEmpregoSelecionado(), Integer.parseInt(this.getQuantidade_vagas()));
        }
    }

    public void cadastrar()
    {
        CadastrarConcursoValidacao validacao = new CadastrarConcursoValidacao(this.getCodigo_concurso(), this.getNumero_Concurso(), this.getAno_Concurso(), this.getSituacao_Concurso(), this.getFk_Matricula_Responsavel_Concurso(), this.getFk_codigo_banca());
        this.setMensagem(validacao.getMensagem());
        if (validacao.getMensagem().equals("ok"))
        {
            try
            {
                CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
                objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
                objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
                objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
                objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
                objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

                CadastrarConcursoDAO objcadastrarconcursoDAO = new CadastrarConcursoDAO();
                ResultSet rscadastrarconcursodao = objcadastrarconcursoDAO.verificarAntesDeCadastrar(objcadastrarconcursoDTO);

                if (rscadastrarconcursodao.next())
                {
                    //envia mensagem para o form falando que o funcionario esta no banco de dados
                    this.setMensagem("erro 1");
                } else
                {
                    //enviar mensagem dizendo que posso inserir no banco de dados 
                    this.setMensagem("ok");
                    objcadastrarconcursoDAO.CadastrarConcursoDAO(objcadastrarconcursoDTO);
                }

            } catch (SQLException erro)
            {

            }
        } else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }

    public void pesquisar(int index)
    {
        CadastrarConcursoDAO pesquisar = new CadastrarConcursoDAO();
        ArrayList<CadastrarConcursoDTO> obj = new ArrayList<>();

        obj = pesquisar.botaoNavegacao();

        for (int i = 0; i < obj.size(); i++)
        {
            //estou passo o indice para quando apertar os botões primeiro, anterior, proximo e ultimo conseguir navegar entre as opções
            this.setCodigo_Concurso(obj.get(index).getCodigo_concurso());
            this.setNumero_Concurso(obj.get(index).getNumero_Concurso());
            this.setAno_Concurso(obj.get(index).getAno_Concurso());
            this.setSituacao_Concurso(obj.get(index).getSituacao_Concurso());
            this.setFk_Matricula_Responsavel_Concurso(obj.get(index).getFk_Matricula_Responsavel_Concurso());
            this.setFk_codigo_banca(obj.get(index).getFk_codigo_banca());
        }

    }

    public void alterar()
    {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setCodigo_Concurso(this.getCodigo_concurso());
        objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
        objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
        objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
        objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
        objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

        CadastrarConcursoDAO alterar = new CadastrarConcursoDAO();
        alterar.update(objcadastrarconcursoDTO);
    }

    public void excluir()
    {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
        objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
        objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
        objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
        objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

        CadastrarConcursoDAO excluir = new CadastrarConcursoDAO();
        excluir.delete(objcadastrarconcursoDTO);
    }

    public void atualizar(String codigoConcurso)
    {
        PopularTabela pt = new PopularTabela();
        this.setListaObjetosRetornadosDoBancoDeDados(pt.pesquisarParaInserirNaTabela("listadecargosempregos", "fk_codigo_concurso", codigoConcurso));
    }

}
