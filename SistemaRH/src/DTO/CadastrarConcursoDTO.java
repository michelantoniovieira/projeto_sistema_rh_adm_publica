package DTO;

import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;

public class CadastrarConcursoDTO {

    private int codigo_concurso;
    private int numero_concurso;
    private int ano_concurso;
    private int situacao_concurso;
    private int fk_matricula_responsavel_concurso;
    private int fk_codigo_banca;
    private String cargoEmpregoSelecionado;
    private int codigoCargoEmpregoSelecionado;
    private String quantidade_vagas;
    private String mensagem;
    private ArrayList<String> informarAtributoString;
    private ArrayList<Integer> informarNomeChavePrimariaInt;
    private ArrayList<Object> listaObjetosRetornadosDoBancoDeDados;

    public int getCodigo_concurso() {
        return codigo_concurso;
    }

    public void setCodigo_Concurso(int codigo_concurso) {
        this.codigo_concurso = codigo_concurso;
    }

    public int getNumero_Concurso() {
        return numero_concurso;
    }

    public void setNumero_Concurso(int numero_concurso) {
        this.numero_concurso = numero_concurso;
    }

    public int getAno_Concurso() {
        return ano_concurso;
    }

    public void setAno_Concurso(int ano_concurso) {
        this.ano_concurso = ano_concurso;
    }

    public int getSituacao_Concurso() {
        return situacao_concurso;
    }

    public void setSituacao_Concurso(int situacao_concurso) {
        this.situacao_concurso = situacao_concurso;
    }

    public int getFk_Matricula_Responsavel_Concurso() {
        return fk_matricula_responsavel_concurso;
    }

    public void setFk_Matricula_Responsavel_Concurso(int fk_matricula_responsavel_concurso) {
        this.fk_matricula_responsavel_concurso = fk_matricula_responsavel_concurso;
    }

    public int getFk_codigo_banca() {
        return fk_codigo_banca;
    }

    public void setFk_codigo_banca(int fk_codigo_banca) {
        this.fk_codigo_banca = fk_codigo_banca;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setInformarAtributoString(ArrayList<String> informarAtributoString)
    {
        this.informarAtributoString = informarAtributoString;
    }
    
    public ArrayList<String> getInformarAtributoString()
    {
        return informarAtributoString;
    }

    public ArrayList<Integer> getInformarNomeChavePrimariaInt()
    {
        return informarNomeChavePrimariaInt;
    }

    public void setInformarNomeChavePrimariaInt(ArrayList<Integer> informarNomeChavePrimariaInt)
    {
        this.informarNomeChavePrimariaInt = informarNomeChavePrimariaInt;
    }    

    public String getCargoEmpregoSelecionado()
    {
        return cargoEmpregoSelecionado;
    }

    public void setCargoEmpregoSelecionado(String cargoEmpregoSelecionado)
    {
        this.cargoEmpregoSelecionado = cargoEmpregoSelecionado;
    }

    public int getCodigoCargoEmpregoSelecionado()
    {
        return codigoCargoEmpregoSelecionado;
    }

    public void setCodigoCargoEmpregoSelecionado(int codigoCargoEmpregoSelecionado)
    {
        this.codigoCargoEmpregoSelecionado = codigoCargoEmpregoSelecionado;
    }   
    
    public String getQuantidade_vagas()
    {
        return quantidade_vagas;
    }

    public void setQuantidade_vagas(String quantidade_vagas)
    {
        this.quantidade_vagas = quantidade_vagas;
    }

    public ArrayList<Object> getListaObjetosRetornadosDoBancoDeDados()
    {
        return listaObjetosRetornadosDoBancoDeDados;
    }

    public void setListaObjetosRetornadosDoBancoDeDados(ArrayList<Object> listaObjetosRetornadosDoBancoDeDados)
    {
        this.listaObjetosRetornadosDoBancoDeDados = listaObjetosRetornadosDoBancoDeDados;
    }
    
    
}