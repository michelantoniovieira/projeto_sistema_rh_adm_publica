
package DTO;

public class CadastrarCargoEmpregoDTO 
{
    
    private int codigoCargoEmprego;
    private String nomeCargoEmprego;
    private String regimeJuridico;
    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;  
    private String referenciaSalarial;
    private String mensagem;

    public int getCodigoCargoEmprego()
    {
        return codigoCargoEmprego;
    }

    public void setCodigoCargoEmprego(int codigoCargoEmprego)
    {
        this.codigoCargoEmprego = codigoCargoEmprego;
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
    
    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
    
}
