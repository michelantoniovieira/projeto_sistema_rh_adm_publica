
package DTO;

public class CadastrarConcursoDTO 
{
    static int codigo_concurso;
    private int numero_concurso;
    private int ano_concurso;
    private String nome_banca_organizadora;
    private String responsavel_banca_organizadora;
    private String telefone_banca_organizadora;
    private String telefone_responsavel_banca_organizadora;
    private String email_banca_organizadora;
    private String mensagem;

    public int getCodigo_concurso()
    {
        return codigo_concurso;
    }

    public void setCodigo_concurso(int codigo_concurso)
    {
        this.codigo_concurso = codigo_concurso;
    }

    public int getNumero_concurso()
    {
        return numero_concurso;
    }

    public void setNumero_concurso(int numero_concurso)
    {
        this.numero_concurso = numero_concurso;
    }

    public int getAno_concurso()
    {
        return ano_concurso;
    }

    public void setAno_concurso(int ano_concurso)
    {
        this.ano_concurso = ano_concurso;
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
