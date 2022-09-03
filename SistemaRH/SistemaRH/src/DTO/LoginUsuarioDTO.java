
package DTO;

public class LoginUsuarioDTO 
{
    private int idUsuario;
    private String loginUsuario;
    private String senhaUsuario;
    
    
    public int getIdUsuario()
    {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario)
    {
        this.idUsuario = idUsuario;
    }
    
    public String getLoginUsuario()
    {
        return this.loginUsuario;
    }
    
    public void setLoginUsuario(String loginUsuario)
    {
        this.loginUsuario = loginUsuario;
    }
    
    public String getSenhaUsuario()
    {
        return this.senhaUsuario;
    }
    
    public void setSenhaUsuario(String senhaUsuario)
    {
        this.senhaUsuario = senhaUsuario;
    }
    
}
