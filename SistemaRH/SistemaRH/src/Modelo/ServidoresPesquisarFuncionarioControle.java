/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.ServidoresPesquisarFuncionarioDAO;
import DTO.ServidoresPesquisarFuncionarioDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class ServidoresPesquisarFuncionarioControle extends ServidoresPesquisarFuncionarioDTO
{    
    public ServidoresPesquisarFuncionarioControle(String modoDePesquisa, String digitadoNoCampoPesquisa)
    {
        this.setModoDePesquisa(modoDePesquisa);
        this.setDigitadoNoCampoPesquisa(digitadoNoCampoPesquisa);
        pesquisar();
    }
    
    public void pesquisar()
    {
        ServidoresPesquisarFuncionarioValidacao validacao = new ServidoresPesquisarFuncionarioValidacao(this.getModoDePesquisa(), this.getDigitadoNoCampoPesquisa());
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
