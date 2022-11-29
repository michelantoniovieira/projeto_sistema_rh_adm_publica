/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author miche
 */
public class PesquisarConcursoDTO
{

    private String modoDePesquisa;
    private String digitadoNoCampoPesquisa;
    private String mensagem;
    private String comandoSqlParaPesquisa;

    private int numero_concurso;
    private int ano_concurso;
    private int codigoConcurso;
    private String nome_banca_organizadora;
    private String responsavel_banca_organizadora;
    private String telefone_banca_organizadora;
    private String telefone_responsavel_banca_organizadora;
    private String email_banca_organizadora;

    public int getCodigoConcurso()
    {
        return codigoConcurso;
    }

    public void setCodigoConcurso(int codigoConcurso)
    {
        this.codigoConcurso = codigoConcurso;
    }  
    
    public String getModoDePesquisa()
    {
        return modoDePesquisa;
    }

    public void setModoDePesquisa(String modoDePesquisa)
    {
        this.modoDePesquisa = modoDePesquisa;
    }

    public String getDigitadoNoCampoPesquisa()
    {
        return digitadoNoCampoPesquisa;
    }

    public void setDigitadoNoCampoPesquisa(String digitadoNoCampoPesquisa)
    {
        this.digitadoNoCampoPesquisa = digitadoNoCampoPesquisa;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getComandoSqlParaPesquisa()
    {
        return comandoSqlParaPesquisa;
    }

    public void setComandoSqlParaPesquisa(String comandoSqlParaPesquisa)
    {
        this.comandoSqlParaPesquisa = comandoSqlParaPesquisa;
    }

    public int getNumero_concurso()
    {
        return numero_concurso;
    }

    public void setNumero_concurso(int numero_concurso)
    {
        this.numero_concurso = numero_concurso;
    }

    public int getAno_concurso()
    {
        return ano_concurso;
    }

    public void setAno_concurso(int ano_concurso)
    {
        this.ano_concurso = ano_concurso;
    }

    public String getNome_banca_organizadora()
    {
        return nome_banca_organizadora;
    }

    public void setNome_banca_organizadora(String nome_banca_organizadora)
    {
        this.nome_banca_organizadora = nome_banca_organizadora;
    }

    public String getResponsavel_banca_organizadora()
    {
        return responsavel_banca_organizadora;
    }

    public void setResponsavel_banca_organizadora(String responsavel_banca_organizadora)
    {
        this.responsavel_banca_organizadora = responsavel_banca_organizadora;
    }

    public String getTelefone_banca_organizadora()
    {
        return telefone_banca_organizadora;
    }

    public void setTelefone_banca_organizadora(String telefone_banca_organizadora)
    {
        this.telefone_banca_organizadora = telefone_banca_organizadora;
    }

    public String getTelefone_responsavel_banca_organizadora()
    {
        return telefone_responsavel_banca_organizadora;
    }

    public void setTelefone_responsavel_banca_organizadora(String telefone_responsavel_banca_organizadora)
    {
        this.telefone_responsavel_banca_organizadora = telefone_responsavel_banca_organizadora;
    }

    public String getEmail_banca_organizadora()
    {
        return email_banca_organizadora;
    }

    public void setEmail_banca_organizadora(String email_banca_organizadora)
    {
        this.email_banca_organizadora = email_banca_organizadora;
    }

    
}
