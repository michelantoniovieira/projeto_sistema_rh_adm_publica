
package Modelo;

import DTO.PortariaDeNomeacaoDTO;
import javax.swing.JOptionPane;

public class PortariaDeNomecaoValidacao extends PortariaDeNomeacaoDTO
{

    public PortariaDeNomecaoValidacao(String Matricula, String dataAdmissao, String nomeServidor, String cargoEmprego, String numeroDaPortaria) 
    {
        this.setMatricula(Matricula);
        this.setDataAdmissao(dataAdmissao);
        this.setNomeServidor(nomeServidor);
        this.setCargo(cargoEmprego);
        this.setNumeroDaPortaria(numeroDaPortaria);
        validar();
    }
    
    public void validar()
    {
        try
        {
           if(!this.getMatricula().equals("") && !this.getDataAdmissao().equals("") && !this.getNomeServidor().equals("")  && !this.getCargo().equals("") && !this.getNumeroDaPortaria().equals("")) 
           {
               this.setMensagem("ok");
           }
           else
           {
               this.setMensagem("");
           }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
}
