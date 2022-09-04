/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Apresentacao.frmConfigurarPastaRaiz;
import DTO.ConfigurarPastaRaizDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miche
 */
public class LocalizarPastaRaiz 
{

    public String LocalizarPastaRaiz() 
    {

            ConfigurarPastaRaizDTO objconfigurarpastaraizdto = new ConfigurarPastaRaizDTO();

            objconfigurarpastaraizdto.setId(1);

            ConfigurarPastaRaizDAO objCadastrarPastaRaizDAO = new ConfigurarPastaRaizDAO();
            
            ResultSet rscadastrapastaraizdao = objCadastrarPastaRaizDAO.verificarAntesDeCadastrar(objconfigurarpastaraizdto);

            try 
            {
                if (rscadastrapastaraizdao.next()) 
                {
                    //retorna o caminho por string
                    return rscadastrapastaraizdao.getString("caminho");
                } else 
                {
                       
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmConfigurarPastaRaiz.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            return "C:/";
    }
}
