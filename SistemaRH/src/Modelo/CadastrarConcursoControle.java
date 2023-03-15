/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarConcursoDAO;
import DAO.CadastrarFuncionarioDAO;
import DTO.CadastrarConcursoDTO;
import DTO.CadastrarFuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarConcursoControle extends CadastrarConcursoDTO {

    public CadastrarConcursoControle(int numeroConcurso) {
        super();
        this.setNumero_Concurso(numeroConcurso);
    }
    
    public CadastrarConcursoControle(int numeroConcurso, int anoConcurso, int situacaoConcurso, int fkMatriculaResponsavelConcurso, int fkCodigoBanca) {
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
        this.setSituacao_Concurso(situacaoConcurso);
        this.setFk_Matricula_Responsavel_Concurso(fkMatriculaResponsavelConcurso);
        this.setFk_codigo_banca(fkCodigoBanca);
    }

    public CadastrarConcursoControle(int codigoConcurso, int numeroConcurso, int anoConcurso, int situacaoConcurso, int fkMatriculaResponsavelConcurso, int fkCodigoBanca) {
        this.setCodigo_Concurso(codigoConcurso);
        this.setNumero_Concurso(numeroConcurso);
        this.setAno_Concurso(anoConcurso);
        this.setSituacao_Concurso(situacaoConcurso);
        this.setFk_Matricula_Responsavel_Concurso(fkMatriculaResponsavelConcurso);
        this.setFk_codigo_banca(fkCodigoBanca);
    }

    public void cadastrar() {
        CadastrarConcursoValidacao validacao = new CadastrarConcursoValidacao(this.getCodigo_concurso(), this.getNumero_Concurso(), this.getAno_Concurso(), this.getSituacao_Concurso(), this.getFk_Matricula_Responsavel_Concurso(), this.getFk_codigo_banca());
        this.setMensagem(validacao.getMensagem());
        if (validacao.getMensagem().equals("ok")) {
            try {
                CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
                objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
                objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
                objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
                objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
                objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

                
                CadastrarConcursoDAO objcadastrarconcursoDAO = new CadastrarConcursoDAO();
                ResultSet rscadastrarconcursodao = objcadastrarconcursoDAO.verificarAntesDeCadastrar(objcadastrarconcursoDTO);

                if (rscadastrarconcursodao.next()) {
                    //envia mensagem para o form falando que o funcionario esta no banco de dados
                    this.setMensagem("erro 1");
                } else {
                    //enviar mensagem dizendo que posso inserir no banco de dados 
                    this.setMensagem("ok");
                    objcadastrarconcursoDAO.CadastrarConcursoDAO(objcadastrarconcursoDTO);
                }

            } catch (SQLException erro) {

            }
        } else {
            this.setMensagem(validacao.getMensagem());
        }
    }

    public void pesquisar(int index) {
        CadastrarConcursoDAO pesquisar = new CadastrarConcursoDAO();
        ArrayList<CadastrarConcursoDTO> obj = new ArrayList<>();

        obj = pesquisar.botaoNavegacao();

        for (int i = 0; i < obj.size(); i++) {
            //estou passo o indice para quando apertar os botões primeiro, anterior, proximo e ultimo conseguir navegar entre as opções
            this.setCodigo_Concurso(obj.get(index).getCodigo_concurso());
            this.setNumero_Concurso(obj.get(index).getNumero_Concurso());
            this.setAno_Concurso(obj.get(index).getAno_Concurso());
            this.setSituacao_Concurso(obj.get(index).getSituacao_Concurso());
            this.setFk_Matricula_Responsavel_Concurso(obj.get(index).getFk_Matricula_Responsavel_Concurso());
            this.setFk_codigo_banca(obj.get(index).getFk_codigo_banca());
        }

    }

    public void alterar() {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setCodigo_Concurso(this.getCodigo_concurso());
        objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
        objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
        objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
        objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
        objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

        System.out.println(getCodigo_concurso());
        System.out.println(getNumero_Concurso());
        System.out.println(getAno_Concurso());
        System.out.println(getSituacao_Concurso());
        System.out.println(getFk_Matricula_Responsavel_Concurso());
        System.out.println(getFk_codigo_banca());
        
        CadastrarConcursoDAO alterar = new CadastrarConcursoDAO();
        alterar.update(objcadastrarconcursoDTO);
    }

    public void excluir() {
        CadastrarConcursoDTO objcadastrarconcursoDTO = new CadastrarConcursoDTO();
        objcadastrarconcursoDTO.setNumero_Concurso(this.getNumero_Concurso());
        objcadastrarconcursoDTO.setAno_Concurso(this.getAno_Concurso());
        objcadastrarconcursoDTO.setSituacao_Concurso(this.getSituacao_Concurso());
        objcadastrarconcursoDTO.setFk_Matricula_Responsavel_Concurso(this.getFk_Matricula_Responsavel_Concurso());
        objcadastrarconcursoDTO.setFk_codigo_banca(this.getFk_codigo_banca());

        CadastrarConcursoDAO excluir = new CadastrarConcursoDAO();
        excluir.delete(objcadastrarconcursoDTO);
    }

}
