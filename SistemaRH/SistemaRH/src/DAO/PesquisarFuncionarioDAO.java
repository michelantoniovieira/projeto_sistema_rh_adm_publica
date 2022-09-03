/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarFuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PesquisarFuncionarioDAO 
{
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarFuncionarioDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;
    
    public PesquisarFuncionarioDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }
    
    public ArrayList<PesquisarFuncionarioDTO> pesquisarFuncionario()
    {
        String sql;
        if(this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM FUNCIONARIOS";   
        }
        else
        {
            sql = "SELECT * FROM FUNCIONARIOS WHERE "+this.getComandoSqlParaPesquisa()+" LIKE " + "'"+ this.getDigitadoNoCampoPesquisa() +"%'";           
        }

        con = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                  PesquisarFuncionarioDTO objPesquisarFuncionarioDTO = new PesquisarFuncionarioDTO(); 
                  objPesquisarFuncionarioDTO.setMatricula(rs.getString("matricula"));
                  objPesquisarFuncionarioDTO.setPronomeTratamento(rs.getString("pronomeTratamento"));
                  objPesquisarFuncionarioDTO.setNome(rs.getString("nome"));
                  objPesquisarFuncionarioDTO.setDataAdmissao(rs.getString("dataAdmissao"));
                  objPesquisarFuncionarioDTO.setDataNascimento(rs.getString("dataNascimento"));
                  objPesquisarFuncionarioDTO.setCargo(rs.getString("cargoEmprego"));
                  objPesquisarFuncionarioDTO.setReferencia(rs.getString("referencia"));
                  objPesquisarFuncionarioDTO.setFuncaoGratificada(rs.getString("funcaoGratificada"));
                  objPesquisarFuncionarioDTO.setRg(rs.getString("rg"));
                  objPesquisarFuncionarioDTO.setExp(rs.getString("expedicao"));
                  objPesquisarFuncionarioDTO.setNaturalidade(rs.getString("naturalidade"));
                  objPesquisarFuncionarioDTO.setEstadoCivil(rs.getString("estadoCivil"));
                  objPesquisarFuncionarioDTO.setInstrucao(rs.getString("instrucao"));
                  objPesquisarFuncionarioDTO.setCpf(rs.getString("cpf"));
                  objPesquisarFuncionarioDTO.setCnh(rs.getString("cnh"));
                  objPesquisarFuncionarioDTO.setTituloEleitor(rs.getString("tituloEleitor"));
                  objPesquisarFuncionarioDTO.setEndereco(rs.getString("endereco"));
                  objPesquisarFuncionarioDTO.setNumero(rs.getString("numero"));
                  objPesquisarFuncionarioDTO.setBairro(rs.getString("bairro"));
                  objPesquisarFuncionarioDTO.setCidade(rs.getString("cidade"));
                  objPesquisarFuncionarioDTO.setCelUm(rs.getString("celUm"));
                  objPesquisarFuncionarioDTO.setCelDois(rs.getString("celDois"));
                  objPesquisarFuncionarioDTO.setCelTres(rs.getString("celTres"));
                  objPesquisarFuncionarioDTO.setEmail(rs.getString("email"));
                  
                  lista.add(objPesquisarFuncionarioDTO);
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar Funcionario: " + erro);
        }
        
        return lista;
    }

    public String getComandoSqlParaPesquisa() {
        return ComandoSqlParaPesquisa;
    }

    public void setComandoSqlParaPesquisa(String ComandoSqlParaPesquisa) {
        this.ComandoSqlParaPesquisa = ComandoSqlParaPesquisa;
    }

    public String getDigitadoNoCampoPesquisa() {
        return DigitadoNoCampoPesquisa;
    }

    public void setDigitadoNoCampoPesquisa(String DigitadoNoCampoPesquisa) {
        this.DigitadoNoCampoPesquisa = DigitadoNoCampoPesquisa;
    }
    
    
    
    
}