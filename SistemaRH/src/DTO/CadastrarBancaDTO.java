
package DTO;

public class CadastrarBancaDTO 
{
    private int codigo_banca;
    private String nome_banca_organizadora;
    private String responsavel_banca_organizadora;
    private String telefone_banca_organizadora;
    private String telefone_responsavel_banca_organizadora;
    private String email_banca_organizadora;
    private String mensagem;

    public int getCodigo_Banca()
    {
        return codigo_banca;
    }

    public void setCodigo_Banca(int codigo_banca)
    {
        this.codigo_banca = codigo_banca;
    }

    public String getNome_banca_organizadora()
    {
        return nome_banca_organizadora;
    }

    public void setNome_banca_organizadora(String nome_banca_organizadora)
    {
        this.nome_banca_organizadora = nome_banca_organizadora;
    }

    public String getResponsavel_banca_organizadora()
    {
        return responsavel_banca_organizadora;
    }

    public void setResponsavel_banca_organizadora(String responsavel_banca_organizadora)
    {
        this.responsavel_banca_organizadora = responsavel_banca_organizadora;
    }

    public String getTelefone_banca_organizadora()
    {
        return telefone_banca_organizadora;
    }

    public void setTelefone_banca_organizadora(String telefone_banca_organizadora)
    {
        this.telefone_banca_organizadora = telefone_banca_organizadora;
    }

    public String getTelefone_responsavel_banca_organizadora()
    {
        return telefone_responsavel_banca_organizadora;
    }

    public void setTelefone_responsavel_banca_organizadora(String telefone_responsavel_banca_organizadora)
    {
        this.telefone_responsavel_banca_organizadora = telefone_responsavel_banca_organizadora;
    }

    public String getEmail_banca_organizadora()
    {
        return email_banca_organizadora;
    }

    public void setEmail_banca_organizadora(String email_banca_organizadora)
    {
        this.email_banca_organizadora = email_banca_organizadora;
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
