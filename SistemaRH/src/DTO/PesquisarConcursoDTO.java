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

    private int codigoConcurso;
    private int numero_concurso;
    private int ano_concurso;
    private String situacao_concurso;
    private int fk_matricula_responsavel_concurso;
    private int fk_codigo_banca;
    

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

    public String getSituacao_concurso() {
        return situacao_concurso;
    }

    public void setSituacao_concurso(String situacao_concurso) {
        this.situacao_concurso = situacao_concurso;
    }

    public int getFk_matricula_responsavel_concurso() {
        return fk_matricula_responsavel_concurso;
    }

    public void setFk_matricula_responsavel_concurso(int fk_matricula_responsavel_concurso) {
        this.fk_matricula_responsavel_concurso = fk_matricula_responsavel_concurso;
    }

    public int getFk_codigo_banca() {
        return fk_codigo_banca;
    }

    public void setFk_codigo_banca(int fk_codigo_banca) {
        this.fk_codigo_banca = fk_codigo_banca;
    }

    
    
}
