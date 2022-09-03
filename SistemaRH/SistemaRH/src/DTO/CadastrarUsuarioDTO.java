/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author miche
 */
public class CadastrarUsuarioDTO 
{
    private String usuario;
    private String senha;
    private String contraSenha;
    private String mensagem;
    private int id;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getUsuario()
    {
        return this.usuario;
    }
    
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }
    
    public String getSenha()
    {
        return this.senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    public String getContraSenha()
    {
        return contraSenha;
    }
    
    public void setContraSenha(String contraSenha)
    {
        this.contraSenha = contraSenha;
    }
    
    public String getMensagem()
    {
        return mensagem;
    }
    
    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
}
