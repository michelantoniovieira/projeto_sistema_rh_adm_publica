package DAO;

import java.util.ArrayList;

public class ListarComboBox
{

    private String stringCMB;
    private ArrayList<String> e = new ArrayList<>();

    private ArrayList<Object> popularComboBox = new ArrayList<Object>();

    public void popularCMB(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        for (Object obj : popularComboBox(informarTabela, informarNomeChavePrimaria, informarAtributo))
        {
            //mostrar informações da listaObjeto para o combobox
            if (obj instanceof String)
            {
                // cmbFkCodigoBanca.addItem((String) obj);
               e.add(obj.toString());
                
            }
        }
    }

    //metodo automatico onde eu passo qual é a chave primaria, tabela e atributo que eu quero puxar no combobox
    public ArrayList<Object> popularComboBox(String informarTabela, String informarNomeChavePrimaria, String informarAtributo)
    {
        PopularCmbDAO pcd = new PopularCmbDAO();

        //popular nome das bancas
        return popularComboBox = pcd.pesquisar(informarTabela, informarNomeChavePrimaria, informarAtributo);
    }

    public String getStringCMB()
    {
        return stringCMB;
    }

    public void setStringCMB(String stringCMB)
    {
        this.stringCMB = stringCMB;
    }

    public ArrayList<String> getE()
    {
        return e;
    }

    public void setE(ArrayList<String> e)
    {
        this.e = e;
    }

    public ArrayList<Object> getPopularComboBox()
    {
        return popularComboBox;
    }

    public void setPopularComboBox(ArrayList<Object> popularComboBox)
    {
        this.popularComboBox = popularComboBox;
    }

    
}
