/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.CadastrarConcursoDTO;
import javax.swing.JOptionPane;


public class CadastrarConcursoValidacao extends CadastrarConcursoDTO
{
    public CadastrarConcursoValidacao(int codigoConcurso, int numeroConcurso, int anoConcurso, int situacaoConcurso, int fk_matricula_responsavel_concurso, int fk_codigo_banca)
    {
        this.setCodigo_Concurso(codigoConcurso);
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
        this.setMensagem("ok");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
}
