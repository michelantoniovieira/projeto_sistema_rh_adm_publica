/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.PesquisarBancaDTO;

public class PesquisarCargoEmpregoValidacao extends PesquisarBancaDTO
{
    public PesquisarCargoEmpregoValidacao(String modoDePesquisa, String digitadoNoCampoPesquisa)
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
            else if(this.getModoDePesquisa().equals("Código do Cargo/Emprego"))
            {
                this.setComandoSqlParaPesquisa("codigo_cargo_emprego");
            }
            else if(this.getModoDePesquisa().equals("Nome do Cargo/Emprego"))
            {
                this.setComandoSqlParaPesquisa("nome_cargo_emprego");
            }
            else if(this.getModoDePesquisa().equals("Referência Salarial"))
            {
                this.setComandoSqlParaPesquisa("referencia_salarial");
            }
                this.setMensagem("");       
    }
        
        //se escolher NOME passar a mensagem PESQUISA POR NOME
        
        //se escolher RG passar a mensagem PESQUISA POR RG
        
        //se escolher CPF passar a mensagem PESQUISA POR CPF
        
        //se escolher DATA DE NASCIMENTO passar a mensagem PESQUISA POR DATA DE NASCIMENTO
        
         //se escolher CARGO/EMPREGO passar a mensagem PESQUISA POR CARGO/EMPREGO 
}
