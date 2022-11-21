/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarPreCadastroDTO;
import DTO.ServidoresPesquisarFuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PesquisarPreCadastroDAO 
{
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarPreCadastroDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;
    
    public PesquisarPreCadastroDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }
    
    public ArrayList<PesquisarPreCadastroDTO> pesquisarFuncionario()
    {
        String sql;
        if(this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM pre_cadastro_funcionario";   
        }
        else
        {
            sql = "SELECT * FROM pre_cadastro_funcionario WHERE "+this.getComandoSqlParaPesquisa()+" LIKE " + "'"+ this.getDigitadoNoCampoPesquisa() +"%'";           
        }

        con = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                  PesquisarPreCadastroDTO objPesquisarPreCadastroDTO = new PesquisarPreCadastroDTO(); 
                  objPesquisarPreCadastroDTO.setCodigoPreCadastro(rs.getString("codigo_pre_cadastro"));
                  objPesquisarPreCadastroDTO.setNomePreCadastro(rs.getString("nome_pre_cadastro"));
                  objPesquisarPreCadastroDTO.setDataConvocacao(rs.getString("data_convocacao"));
                  objPesquisarPreCadastroDTO.setCodigoConcurso(rs.getString("fk_codigo_cargos_do_concurso"));
                  objPesquisarPreCadastroDTO.setCargo(rs.getString("cargo_emprego"));
                  objPesquisarPreCadastroDTO.setRg(rs.getString("rg"));
                  objPesquisarPreCadastroDTO.setExp(rs.getString("expedicao"));
                  objPesquisarPreCadastroDTO.setNaturalidade(rs.getString("naturalidade"));
                  objPesquisarPreCadastroDTO.setRua(rs.getString("rua"));
                  objPesquisarPreCadastroDTO.setNumero(rs.getString("numero"));
                  objPesquisarPreCadastroDTO.setBairro(rs.getString("bairro"));
                  objPesquisarPreCadastroDTO.setCidade(rs.getString("cidade"));
                  objPesquisarPreCadastroDTO.setEstado(rs.getString("estado"));
                  objPesquisarPreCadastroDTO.setCelUm(rs.getString("celUm"));
                  objPesquisarPreCadastroDTO.setCelDois(rs.getString("celDois"));
                  objPesquisarPreCadastroDTO.setCelTres(rs.getString("celTres"));
                  objPesquisarPreCadastroDTO.setEmail(rs.getString("email"));                  
                  lista.add(objPesquisarPreCadastroDTO);
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar Pré Cadastro: " + erro);
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