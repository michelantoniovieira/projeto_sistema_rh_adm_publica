
package DAO;

import javax.swing.JOptionPane;

public class ConversorClassificacao 
{
    private String classificacaoConvertida = "";
    
    public String ConverterClassificacao(int classificacaoASerConvertida)
    {        
        String classificacaoPrimeiraParte[] = {" primeira"," segunda"," terceira"," quarta"," quinta"," sexta"," sétima"," oitava"," nona"};
        String classificacaoSegundaParte[] = {"décima","vigésima","trigésima","quadragésima","quinquagésima","sexagésima","septuagésima","octogésima","nonagésima"};
        String classificacaoTerceiraParte[] = {"centésima ", "ducentésima ", "tricentésima ", "quadringentésima ", "quingentésima ", "sexcentésima ", "setingentésima ", "octingentésima ", "nongentésima "};
                                
        //classificacao a ser convertido pelo usuario
        int aux = classificacaoASerConvertida;
        int pulaDeDezEmDez = 0;
        
        String auxString;
        char primeiroCaracterDoAuxEmChar, meioCaracterDoAuxEmChar, ultimoCaracterDoAuxEmChar;
        int primeiroCaracterDoAuxEmInteiro = 0, meioCaracterDoAuxEmInteiro = 0, ultimoCaracterDoAuxEmInteiro = 0;
                 
        if(aux <= 9)
        {            
            //converter o aux para string
            auxString = Integer.toString(aux);

            //pegar o ultimo caracter da string auxString 
            ultimoCaracterDoAuxEmChar = auxString.charAt(auxString.length()-1);
            
            //converter o ultimoCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo primeira, segunda, terceira isso eu vou saber pelo último caracter do aux
            ultimoCaracterDoAuxEmInteiro = Character.getNumericValue(ultimoCaracterDoAuxEmChar);
        }
        
        if(aux >= 10 & aux <= 99)
        {            
            //converter o aux para string
            auxString = Integer.toString(aux);

            //pegar o primeiro caracter da string auxString 
            primeiroCaracterDoAuxEmChar = auxString.charAt(auxString.length()-2);

            //converter o primeiroCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo décima, vigésima, trigésima isso eu vou saber pelo primeiro caracter do aux
            primeiroCaracterDoAuxEmInteiro = Character.getNumericValue(primeiroCaracterDoAuxEmChar);

            //pegar o ultimo caracter da string auxString 
            ultimoCaracterDoAuxEmChar = auxString.charAt(auxString.length()-1);
            
            //converter o ultimoCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo primeira, segunda, terceira isso eu vou saber pelo último caracter do aux
            ultimoCaracterDoAuxEmInteiro = Character.getNumericValue(ultimoCaracterDoAuxEmChar);
        } 
        
        else if(aux >= 100 & aux <= 999)
        {            
            //converter o aux para string
            auxString = Integer.toString(aux);

            //pegar o primeiro caracter da string auxString 
            primeiroCaracterDoAuxEmChar = auxString.charAt(auxString.length()-3);
            //converter o primeiroCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo décima, vigésima, trigésima isso eu vou saber pelo primeiro caracter do aux
            primeiroCaracterDoAuxEmInteiro = Character.getNumericValue(primeiroCaracterDoAuxEmChar);

            //pegar o primeiro caracter da string auxString 
            meioCaracterDoAuxEmChar = auxString.charAt(auxString.length()-2);
            //converter o primeiroCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo décima, vigésima, trigésima isso eu vou saber pelo primeiro caracter do aux
            meioCaracterDoAuxEmInteiro = Character.getNumericValue(meioCaracterDoAuxEmChar);        
                    
            //pegar o ultimo caracter da string auxString 
            ultimoCaracterDoAuxEmChar = auxString.charAt(auxString.length()-1);
            //converter o ultimoCaracterDoAuxEmChar para inteiro para utilizar a referencia '1' como posicao paro o vetor localizar a classificação correta, do tipo primeira, segunda, terceira isso eu vou saber pelo último caracter do aux
            ultimoCaracterDoAuxEmInteiro = Character.getNumericValue(ultimoCaracterDoAuxEmChar);
        } 
        
        for(int h = 0; h <= 1000; h++)
        {            
            pulaDeDezEmDez = pulaDeDezEmDez + 10;
            //entra aqui quando for pular de 10,20,30,40,50,60,70,80,90,100
            if(aux == pulaDeDezEmDez)
           {
               if(aux <= 90)
               {
                this.classificacaoConvertida = classificacaoSegundaParte[primeiroCaracterDoAuxEmInteiro-1];
                break;
               }
           }               

            if(aux >= 1 && aux <= 9)
            {
                this.classificacaoConvertida = classificacaoPrimeiraParte[ultimoCaracterDoAuxEmInteiro-1];
                break; 
            }

            if(aux >= 10 && aux <= 99)
            {
                this.classificacaoConvertida = classificacaoSegundaParte[primeiroCaracterDoAuxEmInteiro-1] + classificacaoPrimeiraParte[ultimoCaracterDoAuxEmInteiro-1];
                break;
            }

            if(aux >= 100 & aux <= 999)
            {
                this.classificacaoConvertida = (meioCaracterDoAuxEmInteiro == 0 & ultimoCaracterDoAuxEmInteiro == 0) ? classificacaoTerceiraParte[primeiroCaracterDoAuxEmInteiro-1] : classificacaoTerceiraParte[primeiroCaracterDoAuxEmInteiro-1] + classificacaoSegundaParte[meioCaracterDoAuxEmInteiro-1] + classificacaoPrimeiraParte[ultimoCaracterDoAuxEmInteiro-1];
                break;  
            }
        }  
        
        return this.classificacaoConvertida;
    }

    public String getMensagem() 
    {
        return classificacaoConvertida;
    }

    public void setMensagem(String mensagem) 
    {
        this.classificacaoConvertida = mensagem;
    }
    
}


    
