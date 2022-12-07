/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author miche
 */
public class PesquisarCargoEmpregoDTO
{

    private String modoDePesquisa;
    private String digitadoNoCampoPesquisa;
    private String mensagem;
    private String comandoSqlParaPesquisa;

    private int codigoCargoEmprego;
    private String nomeCargoEmprego;
    private String regimeJuridico;
    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;
    private String referenciaSalarial;

    public int getCodigoCargoEmprego()
    {
        return codigoCargoEmprego;
    }

    public void setCodigoCargoEmprego(int codigoCargoEmprego)
    {
        this.codigoCargoEmprego = codigoCargoEmprego;
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

    public String getNomeCargoEmprego()
    {
        return nomeCargoEmprego;
    }

    public void setNomeCargoEmprego(String nomeCargoEmprego)
    {
        this.nomeCargoEmprego = nomeCargoEmprego;
    }

    public String getRegimeJuridico()
    {
        return regimeJuridico;
    }

    public void setRegimeJuridico(String regimeJuridico)
    {
        this.regimeJuridico = regimeJuridico;
    }

    public String getNumeroLeiCriaCargoEmprego()
    {
        return numeroLeiCriaCargoEmprego;
    }

    public void setNumeroLeiCriaCargoEmprego(String numeroLeiCriaCargoEmprego)
    {
        this.numeroLeiCriaCargoEmprego = numeroLeiCriaCargoEmprego;
    }

    public String getDataLeiCriaCargoEmprego()
    {
        return dataLeiCriaCargoEmprego;
    }

    public void setDataLeiCriaCargoEmprego(String dataLeiCriaCargoEmprego)
    {
        this.dataLeiCriaCargoEmprego = dataLeiCriaCargoEmprego;
    }

    public String getReferenciaSalarial()
    {
        return referenciaSalarial;
    }

    public void setReferenciaSalarial(String referenciaSalarial)
    {
        this.referenciaSalarial = referenciaSalarial;
    }
    
    
}
