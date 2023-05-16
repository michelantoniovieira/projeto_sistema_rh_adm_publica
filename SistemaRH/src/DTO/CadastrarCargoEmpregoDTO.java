package DTO;

import javax.swing.table.DefaultTableModel;

public class CadastrarCargoEmpregoDTO
{

    private String mensagem;

    private int codigoCargoEmprego;
    private String descricaoCargoEmprego;
    private String regimeJuridicoCargoEmprego;
    private String referenciaSalarialCargoEmprego;
    private String numeroLeiCriaCargoEmprego;
    private String dataLeiCriaCargoEmprego;
    private String cboCargoEmprego;
    private String requisitosProvimentoCargoEmprego;
    private String escolariadeExigidaCargoEmprego;
    private String valorSalarioCargoEmprego;
    private DefaultTableModel tbQuadro;

    public int getCodigoCargoEmprego()
    {
        return codigoCargoEmprego;
    }

    public void setCodigoCargoEmprego(int codigoCargoEmprego)
    {
        this.codigoCargoEmprego = codigoCargoEmprego;
    }

    public String getDescricaoCargoEmprego()
    {
        return descricaoCargoEmprego;
    }

    public void setDescricaoCargoEmprego(String descricaoCargoEmprego)
    {
        this.descricaoCargoEmprego = descricaoCargoEmprego;
    }

    public String getRegimeJuridicoCargoEmprego()
    {
        return regimeJuridicoCargoEmprego;
    }

    public void setRegimeJuridicoCargoEmprego(String regimeJuridicoCargoEmprego)
    {
        this.regimeJuridicoCargoEmprego = regimeJuridicoCargoEmprego;
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

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getReferenciaSalarialCargoEmprego()
    {
        return referenciaSalarialCargoEmprego;
    }

    public void setReferenciaSalarialCargoEmprego(String referenciaSalarialCargoEmprego)
    {
        this.referenciaSalarialCargoEmprego = referenciaSalarialCargoEmprego;
    }

    public String getRequisitosProvimentoCargoEmprego()
    {
        return requisitosProvimentoCargoEmprego;
    }

    public void setRequisitosProvimentoCargoEmprego(String requisitosProvimentoCargoEmprego)
    {
        this.requisitosProvimentoCargoEmprego = requisitosProvimentoCargoEmprego;
    }

    public String getEscolariadeExigidaCargoEmprego()
    {
        return escolariadeExigidaCargoEmprego;
    }

    public void setEscolariadeExigidaCargoEmprego(String escolariadeExigidaCargoEmprego)
    {
        this.escolariadeExigidaCargoEmprego = escolariadeExigidaCargoEmprego;
    }

    public String getValorSalarioCargoEmprego()
    {
        return valorSalarioCargoEmprego;
    }

    public void setValorSalarioCargoEmprego(String valorSalarioCargoEmprego)
    {
        this.valorSalarioCargoEmprego = valorSalarioCargoEmprego;
    }

    public String getCboCargoEmprego()
    {
        return cboCargoEmprego;
    }

    public void setCboCargoEmprego(String cboCargoEmprego)
    {
        this.cboCargoEmprego = cboCargoEmprego;
    }

    public DefaultTableModel getTbQuadro()
    {
        return tbQuadro;
    }

    public void setTbQuadro(DefaultTableModel tbQuadro)
    {
        this.tbQuadro = tbQuadro;
    }

}
