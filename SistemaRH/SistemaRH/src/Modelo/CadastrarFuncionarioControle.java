/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarFuncionarioDAO;
import DTO.CadastrarFuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastrarFuncionarioControle extends CadastrarFuncionarioDTO
{
    
    public CadastrarFuncionarioControle(String matricula, String pronomeTratamento, String nome, String dataAdmissao, String dataNascimento, String cargo, String referencia, String funcaoGratificada, String rg, String exp, String naturalidade, String estadoCivil, String instrucao, String cpf, String cnh, String tituloEleitor, String endereco, String numero, String bairro, String cidade, String celUm, String celDois, String celTres, String email)
    {
        this.setMatricula(matricula);
        this.setPronomeTratamento(pronomeTratamento);
        this.setNome(nome);
        this.setDataAdmissao(dataAdmissao);
        this.setDataNascimento(dataNascimento);
        this.setCargo(cargo);
        this.setReferencia(referencia);
        this.setFuncaoGratificada(funcaoGratificada);
        this.setRg(rg);
        this.setExp(exp);
        this.setNaturalidade(naturalidade);
        this.setEstadoCivil(estadoCivil);
        this.setInstrucao(instrucao);
        this.setCpf(cpf);
        this.setCnh(cnh);
        this.setTituloEleitor(tituloEleitor);
        this.setEndereco(endereco);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setCelUm(celUm);
        this.setCelDois(celDois);
        this.setCelTres(celTres);
        this.setEmail(email); 
        cadastrar();
    }
    
    public void cadastrar()
    {
        CadastrarFuncionarioValidacao validacao = new CadastrarFuncionarioValidacao(this.getMatricula(), this.getPronomeTratamento(), this.getNome(), this.getDataAdmissao(), this.getDataNascimento(), this.getCargo(), this.getReferencia(), this.getFuncaoGratificada(), this.getRg(), this.getExp(), this.getNaturalidade(), this.getEstadoCivil(), this.getInstrucao(), this.getCpf(), this.getCnh(), this.getTituloEleitor(), this.getEndereco(), this.getNumero(), this.getBairro(), this.getCidade(), this.getCelUm(), this.getCelDois(), this.getCelTres(), this.getEmail());
        this.setMensagem(validacao.getMensagem());
        if(validacao.getMensagem().equals("ok"))
        {
            try
            {
                CadastrarFuncionarioDTO objCadastrarFuncionarioDTO = new CadastrarFuncionarioDTO();
                objCadastrarFuncionarioDTO.setMatricula(this.getMatricula());
                objCadastrarFuncionarioDTO.setPronomeTratamento(this.getPronomeTratamento());
                objCadastrarFuncionarioDTO.setNome(this.getNome());
                objCadastrarFuncionarioDTO.setDataAdmissao(this.getDataAdmissao());
                objCadastrarFuncionarioDTO.setDataNascimento(this.getDataNascimento());
                objCadastrarFuncionarioDTO.setCargo(this.getCargo());
                objCadastrarFuncionarioDTO.setReferencia(this.getReferencia());
                objCadastrarFuncionarioDTO.setFuncaoGratificada(this.getFuncaoGratificada());
                objCadastrarFuncionarioDTO.setRg(this.getRg());
                objCadastrarFuncionarioDTO.setExp(this.getExp());
                objCadastrarFuncionarioDTO.setNaturalidade(this.getNaturalidade());
                objCadastrarFuncionarioDTO.setEstadoCivil(this.getEstadoCivil());
                objCadastrarFuncionarioDTO.setInstrucao(this.getInstrucao());
                objCadastrarFuncionarioDTO.setCpf(this.getCpf());
                objCadastrarFuncionarioDTO.setCnh(this.getCnh());
                objCadastrarFuncionarioDTO.setTituloEleitor(this.getTituloEleitor());
                objCadastrarFuncionarioDTO.setEndereco(this.getEndereco());
                objCadastrarFuncionarioDTO.setNumero(this.getNumero());
                objCadastrarFuncionarioDTO.setBairro(this.getBairro());
                objCadastrarFuncionarioDTO.setCidade(this.getCidade());
                objCadastrarFuncionarioDTO.setCelUm(this.getCelUm());
                objCadastrarFuncionarioDTO.setCelDois(this.getCelDois());
                objCadastrarFuncionarioDTO.setCelTres(this.getCelTres());
                objCadastrarFuncionarioDTO.setEmail(this.getEmail());
                
                CadastrarFuncionarioDAO obtCadastrarFuncionarioDAO = new CadastrarFuncionarioDAO();
                ResultSet rscadastrarfuncionariodao = obtCadastrarFuncionarioDAO.verificarAntesDeCadastrar(objCadastrarFuncionarioDTO);
                
                if(rscadastrarfuncionariodao.next())
                {
                 //envia mensagem para o form falando que o funcionario esta no banco de dados
                 this.setMensagem("erro 1");
                }
                else
                {
                //enviar mensagem dizendo que posso inserir no banco de dados 
                this.setMensagem("ok");
                obtCadastrarFuncionarioDAO.CadastrarFuncionario(objCadastrarFuncionarioDTO);
                }
                
            }
            catch(SQLException erro)
            {
                
            }
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }

}
