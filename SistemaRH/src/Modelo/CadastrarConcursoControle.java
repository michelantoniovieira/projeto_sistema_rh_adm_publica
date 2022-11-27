/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarConcursoDAO;
import DAO.CadastrarFuncionarioDAO;
import DTO.CadastrarConcursoDTO;
import DTO.CadastrarFuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastrarConcursoControle extends CadastrarConcursoDTO
{

    public CadastrarConcursoControle(int numeroConcurso)
    {
        super();
        this.setNumero_concurso(numeroConcurso);
    }

    public CadastrarConcursoControle(int numeroConcurso, int anoConcurso, String NomeBancaConcurso, String telBancaConcurso, String responsavelBancaConcurso, String telResponsavelBanca, String emailBancaConcurso)
    {
        this.setNumero_concurso(numeroConcurso);
        this.setAno_concurso(anoConcurso);
        this.setNome_banca_organizadora(NomeBancaConcurso);
        this.setTelefone_banca_organizadora(telBancaConcurso);
        this.setResponsavel_banca_organizadora(responsavelBancaConcurso);
        this.setTelefone_responsavel_banca_organizadora(telResponsavelBanca);
        this.setEmail_banca_organizadora(emailBancaConcurso);

    }

    public void cadastrar()
    {
        CadastrarConcursoValidacao validacao = new CadastrarConcursoValidacao(this.getNumero_concurso(), this.getAno_concurso(), this.getNome_banca_organizadora(), this.getTelefone_banca_organizadora(), this.getResponsavel_banca_organizadora(), this.getTelefone_responsavel_banca_organizadora(), this.getEmail_banca_organizadora());
        this.setMensagem(validacao.getMensagem());
        if (validacao.getMensagem().equals("ok"))
        {
            try
            {
                CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
                objcadastrarconcursoDTO.setNumero_concurso(this.getNumero_concurso());
                objcadastrarconcursoDTO.setAno_concurso(this.getAno_concurso());
                objcadastrarconcursoDTO.setNome_banca_organizadora(this.getNome_banca_organizadora());
                objcadastrarconcursoDTO.setTelefone_banca_organizadora(this.getTelefone_banca_organizadora());
                objcadastrarconcursoDTO.setResponsavel_banca_organizadora(this.getResponsavel_banca_organizadora());
                objcadastrarconcursoDTO.setTelefone_responsavel_banca_organizadora(this.getTelefone_responsavel_banca_organizadora());
                objcadastrarconcursoDTO.setEmail_banca_organizadora(this.getEmail_banca_organizadora());

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

    public void alterar()
    {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setNumero_concurso(this.getNumero_concurso());
        objcadastrarconcursoDTO.setAno_concurso(this.getAno_concurso());
        objcadastrarconcursoDTO.setNome_banca_organizadora(this.getNome_banca_organizadora());
        objcadastrarconcursoDTO.setTelefone_banca_organizadora(this.getTelefone_banca_organizadora());
        objcadastrarconcursoDTO.setResponsavel_banca_organizadora(this.getResponsavel_banca_organizadora());
        objcadastrarconcursoDTO.setTelefone_responsavel_banca_organizadora(this.getTelefone_responsavel_banca_organizadora());
        objcadastrarconcursoDTO.setEmail_banca_organizadora(this.getEmail_banca_organizadora());

        CadastrarConcursoDAO alterar = new CadastrarConcursoDAO();
        alterar.update(objcadastrarconcursoDTO);
    }

    public void excluir()
    {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setNumero_concurso(this.getNumero_concurso());

        CadastrarConcursoDAO excluir = new CadastrarConcursoDAO();
        excluir.delete(objcadastrarconcursoDTO);
    }

}
