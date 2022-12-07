/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarBancaDAO;
import DTO.CadastrarBancaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastrarBancaControle extends CadastrarBancaDTO
{

    public CadastrarBancaControle(String nomeBanca)
    {
        super();
        this.setNome_banca_organizadora(nomeBanca);
    }

    public CadastrarBancaControle(String NomeBancaConcurso, String telBancaConcurso, String responsavelBancaConcurso, String telResponsavelBanca, String emailBancaConcurso)
    {
        this.setNome_banca_organizadora(NomeBancaConcurso);
        this.setTelefone_banca_organizadora(telBancaConcurso);
        this.setResponsavel_banca_organizadora(responsavelBancaConcurso);
        this.setTelefone_responsavel_banca_organizadora(telResponsavelBanca);
        this.setEmail_banca_organizadora(emailBancaConcurso);
    }
    
    public CadastrarBancaControle(int codigoBanca, String NomeBancaConcurso, String telBancaConcurso, String responsavelBancaConcurso, String telResponsavelBanca, String emailBancaConcurso)
    {
        this.setCodigo_Banca(codigoBanca);
        this.setNome_banca_organizadora(NomeBancaConcurso);
        this.setTelefone_banca_organizadora(telBancaConcurso);
        this.setResponsavel_banca_organizadora(responsavelBancaConcurso);
        this.setTelefone_responsavel_banca_organizadora(telResponsavelBanca);
        this.setEmail_banca_organizadora(emailBancaConcurso);

    }

    public void cadastrar()
    {
        CadastrarBancaValidacao validacao = new CadastrarBancaValidacao(this.getNome_banca_organizadora(), this.getTelefone_banca_organizadora(), this.getResponsavel_banca_organizadora(), this.getTelefone_responsavel_banca_organizadora(), this.getEmail_banca_organizadora());
        this.setMensagem(validacao.getMensagem());
        if (validacao.getMensagem().equals("ok"))
        {
            try
            {
                CadastrarBancaDTO objcadastrarbancaDTO = new CadastrarBancaDTO();
                objcadastrarbancaDTO.setNome_banca_organizadora(this.getNome_banca_organizadora());
                objcadastrarbancaDTO.setTelefone_banca_organizadora(this.getTelefone_banca_organizadora());
                objcadastrarbancaDTO.setResponsavel_banca_organizadora(this.getResponsavel_banca_organizadora());
                objcadastrarbancaDTO.setTelefone_responsavel_banca_organizadora(this.getTelefone_responsavel_banca_organizadora());
                objcadastrarbancaDTO.setEmail_banca_organizadora(this.getEmail_banca_organizadora());

                CadastrarBancaDAO objcadastrarbancaDAO = new CadastrarBancaDAO();
                ResultSet rscadastrarconcursodao = objcadastrarbancaDAO.verificarAntesDeCadastrar(objcadastrarbancaDTO);

                if (rscadastrarconcursodao.next())
                {
                    //envia mensagem para o form falando que o funcionario esta no banco de dados
                    this.setMensagem("erro 1");
                } else
                {
                    //enviar mensagem dizendo que posso inserir no banco de dados 
                    this.setMensagem("ok");
                    objcadastrarbancaDAO.CadastrarBancaDAO(objcadastrarbancaDTO);
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
        CadastrarBancaDAO pesquisar = new CadastrarBancaDAO();
        ArrayList<CadastrarBancaDTO> obj = new ArrayList<>();

        obj = pesquisar.botaoNavegacao();

        for (int i = 0; i < obj.size(); i++)
        {
            //estou passo o indice para quando apertar os botões primeiro, anterior, proximo e ultimo conseguir navegar entre as opções
            this.setCodigo_Banca(obj.get(index).getCodigo_Banca());
            this.setNome_banca_organizadora(obj.get(index).getNome_banca_organizadora());
            this.setTelefone_banca_organizadora(obj.get(index).getTelefone_banca_organizadora());
            this.setResponsavel_banca_organizadora(obj.get(index).getResponsavel_banca_organizadora());
            this.setTelefone_responsavel_banca_organizadora(obj.get(index).getTelefone_responsavel_banca_organizadora());
            this.setEmail_banca_organizadora(obj.get(index).getEmail_banca_organizadora());
        }

    }

    public void alterar()
    {
        CadastrarBancaDTO objcadastrarbancaDTO = new CadastrarBancaDTO();
        objcadastrarbancaDTO.setCodigo_Banca(this.getCodigo_Banca());
        objcadastrarbancaDTO.setNome_banca_organizadora(this.getNome_banca_organizadora());
        objcadastrarbancaDTO.setTelefone_banca_organizadora(this.getTelefone_banca_organizadora());
        objcadastrarbancaDTO.setResponsavel_banca_organizadora(this.getResponsavel_banca_organizadora());
        objcadastrarbancaDTO.setTelefone_responsavel_banca_organizadora(this.getTelefone_responsavel_banca_organizadora());
        objcadastrarbancaDTO.setEmail_banca_organizadora(this.getEmail_banca_organizadora());

        CadastrarBancaDAO alterar = new CadastrarBancaDAO();
        alterar.update(objcadastrarbancaDTO);
    }

    public void excluir()
    {
        CadastrarBancaDTO objcadastrarbancaDTO = new CadastrarBancaDTO();
        objcadastrarbancaDTO.setNome_banca_organizadora(this.getNome_banca_organizadora());

        CadastrarBancaDAO excluir = new CadastrarBancaDAO();
        excluir.delete(objcadastrarbancaDTO);
    }

}
