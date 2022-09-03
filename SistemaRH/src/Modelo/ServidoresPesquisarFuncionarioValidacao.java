/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.ServidoresPesquisarFuncionarioDTO;
import javax.swing.JOptionPane;

public class ServidoresPesquisarFuncionarioValidacao extends ServidoresPesquisarFuncionarioDTO
{
    public ServidoresPesquisarFuncionarioValidacao(String modoDePesquisa, String digitadoNoCampoPesquisa)
    {
       this.setModoDePesquisa(modoDePesquisa);
       this.setDigitadoNoCampoPesquisa(digitadoNoCampoPesquisa);
       validar();
    }
    
    public void validar()
    {
       
            if(this.getModoDePesquisa().equals("tudo"))
            {
                this.setComandoSqlParaPesquisa("tudo");
            }
            //se escolher MATRICULA passar a mensagem PESQUISA POR MATRICULA
            if(this.getModoDePesquisa().equals("Matrícula"))
            {
                this.setComandoSqlParaPesquisa("matricula");
            }
            else if(this.getModoDePesquisa().equals("Nome"))
            {
                this.setComandoSqlParaPesquisa("nome");
            }
            else if(this.getModoDePesquisa().equals("RG"))
            {
                this.setComandoSqlParaPesquisa("rg");
            }
            else if(this.getModoDePesquisa().equals("CPF"))
            {
                this.setComandoSqlParaPesquisa("cpf");
            }
            else if(this.getModoDePesquisa().equals("Data de Nascimento"))
            {
                this.setComandoSqlParaPesquisa("dataNascimento");
            }
            else if(this.getModoDePesquisa().equals("Cargo/Emprego"))
            {
                this.setComandoSqlParaPesquisa("cargoEmprego");
            }
                this.setMensagem("");       
    }
        
        //se escolher NOME passar a mensagem PESQUISA POR NOME
        
        //se escolher RG passar a mensagem PESQUISA POR RG
        
        //se escolher CPF passar a mensagem PESQUISA POR CPF
        
        //se escolher DATA DE NASCIMENTO passar a mensagem PESQUISA POR DATA DE NASCIMENTO
        
         //se escolher CARGO/EMPREGO passar a mensagem PESQUISA POR CARGO/EMPREGO 
}
