/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.CadastrarCargoEmpregoDTO;
import javax.swing.JOptionPane;

public class CadastrarCargoEmpregoValidacao extends CadastrarCargoEmpregoDTO
{

    public CadastrarCargoEmpregoValidacao(String nomeCargoEmprego, String regimeJuridico, String numeroLeiCargoEmprego, String dataLeiCargoEmprego)
    {
        this.setDescricaoCargoEmprego(nomeCargoEmprego);
        this.setRegimeJuridicoCargoEmprego(regimeJuridico);
        this.setNumeroLeiCriaCargoEmprego(numeroLeiCargoEmprego);
        this.setDataLeiCriaCargoEmprego(dataLeiCargoEmprego);
        validar();
    }

    public void validar()
    {
        try
        {
            this.setMensagem("ok");
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

}
