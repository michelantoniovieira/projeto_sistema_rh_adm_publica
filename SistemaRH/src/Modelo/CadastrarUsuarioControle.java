/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.CadastrarUsuarioDAO;
import DTO.CadastrarUsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class CadastrarUsuarioControle extends CadastrarUsuarioDTO
{
    
    public CadastrarUsuarioControle(String usuario, String senha, String contraSenha)
    {
        this.setUsuario(usuario);
        this.setSenha(senha);
        this.setContraSenha(contraSenha);
        cadastrar();
    }
    
    public void cadastrar()
    {
        CadastrarUsuarioValidacao validacao = new CadastrarUsuarioValidacao();
        validacao.validar(this.getUsuario(), this.getSenha(), this.getContraSenha());
        if(validacao.getMensagem().equals("ok"))
        {         
         try
         {
         CadastrarUsuarioDTO objcadastrarusuariodto = new CadastrarUsuarioDTO();
         objcadastrarusuariodto.setUsuario(this.getUsuario());
         objcadastrarusuariodto.setSenha(this.getSenha());
         objcadastrarusuariodto.setContraSenha(this.getContraSenha());
         
         CadastrarUsuarioDAO objCadastrarUsuarioDAO = new CadastrarUsuarioDAO();
         ResultSet rscadastrarusuariodao = objCadastrarUsuarioDAO.verificarAntesDeCadastrar(objcadastrarusuariodto);
         
         if(rscadastrarusuariodao.next())
            {
                //envia mensagem para o form falando que o usuario esta no banco de dados
                 this.setMensagem("erro 1");
                JOptionPane.showMessageDialog(null, "Esse usuario ESTÁ no banco de dados.");
                
            }
            else
            {
                //enviar mensagem dizendo que posso inserir no banco de dados 
                this.setMensagem("");
                JOptionPane.showMessageDialog(null, "Esse usuario NÃO está no banco de dados.");
                objCadastrarUsuarioDAO.CadastrarUsuarioDAO(objcadastrarusuariodto);
            }
         
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Validacao" + erro);
        }
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }
}
