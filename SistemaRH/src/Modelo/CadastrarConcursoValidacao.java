/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.CadastrarConcursoDTO;
import javax.swing.JOptionPane;


public class CadastrarConcursoValidacao extends CadastrarConcursoDTO
{
    public CadastrarConcursoValidacao(int numeroConcurso, int anoConcurso, String situacaoConcurso, int fk_matricula_responsavel_concurso, int fk_codigo_banca)
    {
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
        this.setSituacao_Concurso(situacaoConcurso);
        this.setFk_Matricula_Responsavel_Concurso(fk_matricula_responsavel_concurso);
        this.setFk_codigo_banca(fk_codigo_banca);
        validar();
    }
    
    public void validar()
    {
        try
        {
        System.out.println(getNumero_Concurso());
        System.out.println(getAno_Concurso());
        System.out.println(getSituacao_Concurso());
        System.out.println(getFk_Matricula_Responsavel_Concurso());
        System.out.println(getFk_codigo_banca());
 
        this.setMensagem("ok");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
}
