
package Modelo;

import DTO.PortariaDeNomeacaoDTO;
import javax.swing.JOptionPane;

public class PortariaDeNomeacaoControle extends PortariaDeNomeacaoDTO
{

    public PortariaDeNomeacaoControle(String Matricula, String dataAdmissao, String nomeServidor, String cargoEmprego, String numeroDaPortaria) 
    {
        this.setMatricula(Matricula);
        this.setDataAdmissao(dataAdmissao);
        this.setNomeServidor(nomeServidor);
        this.setCargo(cargoEmprego);
        this.setNumeroDaPortaria(numeroDaPortaria);
        gerarPortaria();
    }
    
    public void gerarPortaria()
    {
     PortariaDeNomecaoValidacao validacao = new PortariaDeNomecaoValidacao(this.getMatricula(), this.getDataAdmissao(), this.getNomeServidor(), this.getCargo(), this.getNumeroDaPortaria());
     this.setMensagem(validacao.getMensagem());
    }
   
    
}
