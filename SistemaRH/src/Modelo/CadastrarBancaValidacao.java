/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.CadastrarConcursoDTO;
import javax.swing.JOptionPane;


public class CadastrarBancaValidacao extends CadastrarConcursoDTO
{
    public CadastrarBancaValidacao(String NomeBancaConcurso, String telBancaConcurso, String responsavelBancaConcurso, String telResponsavelBanca, String emailBancaConcurso)
    {
        this.setNome_banca_organizadora(NomeBancaConcurso);
        this.setTelefone_banca_organizadora(telBancaConcurso);
        this.setResponsavel_banca_organizadora(responsavelBancaConcurso);
        this.setTelefone_responsavel_banca_organizadora(telResponsavelBanca);
        this.setEmail_banca_organizadora(emailBancaConcurso);
        validar();
    }
    
    public void validar()
    {
        try
        {
        System.out.println(getNumero_concurso());
        System.out.println(getAno_concurso());
        System.out.println(getNome_banca_organizadora());
        System.out.println(getTelefone_banca_organizadora());
        System.out.println(getResponsavel_banca_organizadora());
        System.out.println(getEmail_banca_organizadora());
 
        this.setMensagem("ok");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
}
