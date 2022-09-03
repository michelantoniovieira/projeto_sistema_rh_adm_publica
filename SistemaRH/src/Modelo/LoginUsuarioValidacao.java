
package Modelo;

import DAO.LoginUsuarioDAO;
import DTO.LoginUsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginUsuarioValidacao 
{
    private String mensagem;
    
    public void validar(String login, String senha)
    {
        try
        {
            if(login.equals("") && senha.equals(""))
            {
               this.mensagem = "Erro, insira um login e senha para continuar.";
            }
            //passar login e senha para logindto, se encontrar o login e senha retorna true
            else
            {
                this.mensagem = "Usuario inexistente."; 
            }
            
            if(passarInformacoesParaLoginDTO(login, senha))
            {
             this.mensagem = "Login efetuado com sucesso.";   
            }
        }
        catch(NumberFormatException e)
        {
            System.out.print("Entrou");
        }
    }
    //se encontrar login e senha retorna true
    public boolean passarInformacoesParaLoginDTO(String login, String senha)
    {
        try
        {
            LoginUsuarioDTO objlogindto = new LoginUsuarioDTO();
            objlogindto.setLoginUsuario(login);
            objlogindto.setSenhaUsuario(senha);

            LoginUsuarioDAO objusuariodao = new LoginUsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objlogindto);
        
            if(rsusuariodao.next())
            {
                this.mensagem = "";
                return true;
            }
            else
            {
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Validacao" + erro);
        }
        
        return false;
    }
    
    public String getMensagem()
    {
        return mensagem;
    }
}
