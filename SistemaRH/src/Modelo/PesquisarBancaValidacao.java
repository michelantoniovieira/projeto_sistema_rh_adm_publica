/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.PesquisarBancaDTO;

public class PesquisarBancaValidacao extends PesquisarBancaDTO
{
    public PesquisarBancaValidacao(String modoDePesquisa, String digitadoNoCampoPesquisa)
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
            else if(this.getModoDePesquisa().equals("Número do Concurso"))
            {
                this.setComandoSqlParaPesquisa("numero_concurso");
            }
            else if(this.getModoDePesquisa().equals("Ano do Concurso"))
            {
                this.setComandoSqlParaPesquisa("ano_concurso");
            }
            else if(this.getModoDePesquisa().equals("Nome da Banca"))
            {
                this.setComandoSqlParaPesquisa("nome_banca_organizadora");
            }
                this.setMensagem("");       
    }
        
        //se escolher NOME passar a mensagem PESQUISA POR NOME
        
        //se escolher RG passar a mensagem PESQUISA POR RG
        
        //se escolher CPF passar a mensagem PESQUISA POR CPF
        
        //se escolher DATA DE NASCIMENTO passar a mensagem PESQUISA POR DATA DE NASCIMENTO
        
         //se escolher CARGO/EMPREGO passar a mensagem PESQUISA POR CARGO/EMPREGO 
}
