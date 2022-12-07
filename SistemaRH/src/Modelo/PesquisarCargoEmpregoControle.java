/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.PesquisarPreCadastroDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class PesquisarCargoEmpregoControle extends PesquisarPreCadastroDTO
{    
    public PesquisarCargoEmpregoControle(String modoDePesquisa, String digitadoNoCampoPesquisa)
    {
        this.setModoDePesquisa(modoDePesquisa);
        this.setDigitadoNoCampoPesquisa(digitadoNoCampoPesquisa);
        pesquisar();
    }
    
    public void pesquisar()
    {
        PesquisarCargoEmpregoValidacao validacao = new PesquisarCargoEmpregoValidacao(this.getModoDePesquisa(), this.getDigitadoNoCampoPesquisa());
        this.setMensagem(validacao.getMensagem());
        
        if(this.getMensagem().equals(""))
        {
        this.setComandoSqlParaPesquisa(validacao.getComandoSqlParaPesquisa());
        this.setDigitadoNoCampoPesquisa(validacao.getDigitadoNoCampoPesquisa());
        this.setMensagem("ok");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Controle" + this.getMensagem());
        }     
    }
}
