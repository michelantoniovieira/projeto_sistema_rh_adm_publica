/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PesquisarConcursoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PesquisarConcursoDAO 
{
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PesquisarConcursoDTO> lista = new ArrayList<>();
    String ComandoSqlParaPesquisa;
    String DigitadoNoCampoPesquisa;
    
    public PesquisarConcursoDAO(String ComandoSqlParaPesquisa, String DigitadoNoCampoPesquisa)
    {
        this.setComandoSqlParaPesquisa(ComandoSqlParaPesquisa);
        this.setDigitadoNoCampoPesquisa(DigitadoNoCampoPesquisa);
    }
    
    public ArrayList<PesquisarConcursoDTO> pesquisarConcurso()
    {
        String sql;
        if(this.getComandoSqlParaPesquisa().equals("tudo") && this.getDigitadoNoCampoPesquisa().equals(""))
        {
            sql = "SELECT * FROM concurso_publico";   
        }
        else
        {
            sql = "SELECT * FROM concurso_publico WHERE "+this.getComandoSqlParaPesquisa()+" LIKE " + "'"+ this.getDigitadoNoCampoPesquisa() +"%'";           
        }

        con = new ConexaoDAO().conectaBD();
        
        try 
        {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                  PesquisarConcursoDTO objPesquisarConcursoDTO = new PesquisarConcursoDTO(); 
                  objPesquisarConcursoDTO.setNumero_concurso(rs.getInt("numero_concurso"));  
                  objPesquisarConcursoDTO.setAno_concurso(rs.getInt("ano_concurso"));
                  objPesquisarConcursoDTO.setNome_banca_organizadora(rs.getString("nome_banca_organizadora"));
                  objPesquisarConcursoDTO.setTelefone_banca_organizadora(rs.getString("telefone_banca_organizadora"));
                  objPesquisarConcursoDTO.setResponsavel_banca_organizadora(rs.getString("responsavel_banca_organizadora"));
                  objPesquisarConcursoDTO.setTelefone_responsavel_banca_organizadora(rs.getString("telefone_responsavel_banca_organizadora"));
                  objPesquisarConcursoDTO.setEmail_banca_organizadora(rs.getString("email_banca_organizadora"));
                  
                  lista.add(objPesquisarConcursoDTO);
            }
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "PesquisarConcursoDAO Pesquisar Concurso: " + erro);
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