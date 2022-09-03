
package Modelo;

import Apresentacao.frmPrincipal;

public class LoginUsuarioControle 
{
    private String login;
    private String senha;
    private String mensagem;
    
    public LoginUsuarioControle(String login, String senha)
    {
        this.login = login;
        this.senha = senha;
        logar();
    }
    
    public void logar()
    {
       LoginUsuarioValidacao validacao = new LoginUsuarioValidacao();
       validacao.validar(login, senha);
       if(validacao.getMensagem().equals(""))
       {
           this.mensagem = "";
       }
       else
       {
           this.mensagem = validacao.getMensagem();
       }
    }
    
    public String getLogin()
    {
        return login;
    }
    
    public void setLogin(String Login)
    {
        this.login = Login;
    }
    
    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    public String getMensagem()
    {
        return mensagem;
    }
    
}
