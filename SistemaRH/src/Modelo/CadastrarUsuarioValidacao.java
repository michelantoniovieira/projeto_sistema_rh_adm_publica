/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DTO.CadastrarUsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class CadastrarUsuarioValidacao extends CadastrarUsuarioDTO
{
    public void validar(String usuario, String senha, String contraSenha)
    {
      try
      {
          if(!usuario.equals("") && !senha.equals("") && !contraSenha.equals(""))
          {
              this.setMensagem("erro 0");
          }
          
          if(usuario.equals("") && !senha.equals("") && !contraSenha.equals(""))
          {
              this.setMensagem("erro 1");
          }
          
          if(!usuario.equals("") && senha.equals("") && !contraSenha.equals(""))
          {
              this.setMensagem("erro 2");
          }
          
          if(!usuario.equals("") && !senha.equals("") && contraSenha.equals(""))
          {
              this.setMensagem("erro 3");
          }
          
          if(!usuario.equals("") && senha.equals("") && contraSenha.equals(""))
          {
              this.setMensagem("erro 4");
          }
          
          if(usuario.equals("") && !senha.equals("") && contraSenha.equals(""))
          {
              this.setMensagem("erro 5");
          }
          
          if(usuario.equals("") && senha.equals("") && contraSenha.equals(""))
          {
              this.setMensagem("erro 6");
          }
          
          if(usuario.equals("") && senha.equals("") && !contraSenha.equals(""))
          {
              this.setMensagem("erro 7");
          }
          //usuario preenchido + senha preenchida + contrasenha preenchida + senha = contrasenha
          if(!usuario.equals("") && !senha.equals("") && !contraSenha.equals("") && senha.equals(contraSenha))
          {
              this.setMensagem("ok");
          }
          //usuario preenchido + senha preenchida + senha != contrasenha
          else if(!usuario.equals("") && !senha.equals("") && !contraSenha.equals("") && !senha.equals(contraSenha))
          {
              this.setMensagem("erro 8");
          }
          
      }
      catch(NumberFormatException e)
      {
          
      }
    }
}
