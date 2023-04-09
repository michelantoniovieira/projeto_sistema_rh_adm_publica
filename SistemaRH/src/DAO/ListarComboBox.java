package DAO;

import java.util.ArrayList;

public class ListarComboBox
{

    private String stringCMB;
    private ArrayList<String> informarAtributoString = new ArrayList<>();
    private ArrayList<Integer> informarNomeChavePrimariaInt = new ArrayList<>();

    private ArrayList<Object> retornoInformacaoBancoDeDados = new ArrayList<>();

    public void popularCMB(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        for (Object obj : popularComboBox(informarTabela, informarNomeChavePrimaria, informarAtributo))
        {
            //mostrar informações da listaObjeto para o combobox
            if (obj instanceof String)
            {
                // cmbFkCodigoBanca.addItem((String) obj);
                informarAtributoString.add(obj.toString());
            }
            if (obj instanceof Integer)
            {
                informarNomeChavePrimariaInt.add((Integer) obj);
            }
        }
    }

    //metodo automatico onde eu passo qual é a chave primaria, tabela e atributo que eu quero puxar no combobox
    public ArrayList<Object> popularComboBox(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        PopularCmbDAO pcd = new PopularCmbDAO();

        //popular nome das bancas
        return retornoInformacaoBancoDeDados = pcd.pesquisar(informarTabela, informarNomeChavePrimaria, informarAtributo);
    }
    
    public ArrayList<Object> pesquisarInformacaoNoBancoDeDados(String informarTabela, String informarNomeChavePrimaria, String informarAtributo, String informacaoASerPesquisada)
    {
        PopularCmbDAO pcd = new PopularCmbDAO();
        return retornoInformacaoBancoDeDados = pcd.pesquisarInformacaoBancoDeDados(informarTabela, informarNomeChavePrimaria, informarAtributo, informacaoASerPesquisada);
    }

    public String getStringCMB()
    {
        return stringCMB;
    }

    public void setStringCMB(String stringCMB)
    {
        this.stringCMB = stringCMB;
    }

    public ArrayList<String> getInformarAtributoString()
    {
        return informarAtributoString;
    }

    public void setInformarAtributoString(ArrayList<String> informarAtributoString)
    {
        this.informarAtributoString = informarAtributoString;
    }

    public ArrayList<Integer> getInformarNomeChavePrimariaInt()
    {
        return informarNomeChavePrimariaInt;
    }

    public void setInformarNomeChavePrimariaInt(ArrayList<Integer> informarNomeChavePrimariaInt)
    {
        this.informarNomeChavePrimariaInt = informarNomeChavePrimariaInt;
    }
    
    

    public ArrayList<Object> getRetornoInformacaoBancoDeDados()
    {
        return retornoInformacaoBancoDeDados;
    }

    public void setRetornoInformacaoBancoDeDados(ArrayList<Object> retornoInformacaoBancoDeDados)
    {
        this.retornoInformacaoBancoDeDados = retornoInformacaoBancoDeDados;
    }

}
