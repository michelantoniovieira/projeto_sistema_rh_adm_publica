package DTO;

import javax.swing.table.DefaultTableModel;

public class CadastrarCargoEmpregoDTO
{
    private String mensagem;
    private static int codigoCargoEmprego;
    private String descricaoCargoEmprego;
    private String cboCargoEmprego;
    private String regimeJuridicoCargoEmprego;
    private boolean chkAtivoCargoEmprego;

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

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

    public String getCboCargoEmprego()
    {
        return cboCargoEmprego;
    }

    public void setCboCargoEmprego(String cboCargoEmprego)
    {
        this.cboCargoEmprego = cboCargoEmprego;
    }

    public String getRegimeJuridicoCargoEmprego()
    {
        return regimeJuridicoCargoEmprego;
    }

    public void setRegimeJuridicoCargoEmprego(String regimeJuridicoCargoEmprego)
    {
        this.regimeJuridicoCargoEmprego = regimeJuridicoCargoEmprego;
    }

    public boolean isChkAtivoCargoEmprego()
    {
        return chkAtivoCargoEmprego;
    }

    public void setChkAtivoCargoEmprego(boolean chkAtivoCargoEmprego)
    {
        this.chkAtivoCargoEmprego = chkAtivoCargoEmprego;
    }

}
