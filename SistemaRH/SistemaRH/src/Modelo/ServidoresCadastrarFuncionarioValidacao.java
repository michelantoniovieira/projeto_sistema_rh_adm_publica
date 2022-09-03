/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.ServidoresCadastrarFuncionarioDTO;
import javax.swing.JOptionPane;


public class ServidoresCadastrarFuncionarioValidacao extends ServidoresCadastrarFuncionarioDTO
{
    public ServidoresCadastrarFuncionarioValidacao(String matricula, String pronomeTratamento, String nome, String dataAdmissao, String dataNascimento, String cargo, String referencia, String funcaoGratificada, String cmbQuemAssinaPortaria, String rg, String exp, String naturalidade, String estadoCivil, String instrucao, String cpf, String cnh, String tituloEleitor, String endereco, String numero, String bairro, String cidade, String celUm, String celDois, String celTres, String email, String regimeJuridico, boolean cargoEmComissao, String leiAtribuicaoCargoEmprego, String leiReajusteCargoEmprego, String numeroConcurso, String classificacaoConcurso)
    {
        this.setMatricula(matricula);
        this.setPronomeTratamento(pronomeTratamento);
        this.setNome(nome);
        this.setDataAdmissao(dataAdmissao);
        this.setDataNascimento(dataNascimento);
        this.setCargo(cargo);
        this.setReferencia(referencia);
        this.setFuncaoGratificada(funcaoGratificada);
        this.setCmbQuemAssinaPortaria(cmbQuemAssinaPortaria);
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
        this.setRegimeJuridico(regimeJuridico);
        this.setBoolChkCargoEmComissao(cargoEmComissao);
        this.setLeiAtribuicaoCargoEmprego(leiAtribuicaoCargoEmprego);
        this.setLeiReajusteCargoEmprego(leiReajusteCargoEmprego);
        this.setNumeroConcurso(numeroConcurso);
        this.setClassificacaoConcurso(classificacaoConcurso);
        validar();
    }
    
    public void validar()
    {
        try
        {
        System.out.println(getMatricula());
        System.out.println(getPronomeTratamento());
        System.out.println(getNome());
        System.out.println(getDataAdmissao());
        System.out.println(getDataNascimento());
        System.out.println(getCargo());
        System.out.println(getReferencia());
        System.out.println(getFuncaoGratificada());
        System.out.println(getRg());
        System.out.println(getExp());
        System.out.println(getNaturalidade());
        System.out.println(getEstadoCivil());
        System.out.println(getInstrucao());
        System.out.println(getCpf());
        System.out.println(getCnh());
        System.out.println(getTituloEleitor());
        System.out.println(getEndereco());
        System.out.println(getNumero());
        System.out.println(getBairro());
        System.out.println(getCidade());
        System.out.println(getCelUm());
        System.out.println(getCelDois());
        System.out.println(getCelTres());
        System.out.println(getEmail());
        System.out.println(getRegimeJuridico());
        System.out.println(isBoolChkCargoEmComissao());
        System.out.println(getLeiAtribuicaoCargoEmprego());
        System.out.println(getLeiReajusteCargoEmprego());
        System.out.println(getNumero());
        System.out.println(getNumeroConcurso());
        
        this.setMensagem("ok");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
}
