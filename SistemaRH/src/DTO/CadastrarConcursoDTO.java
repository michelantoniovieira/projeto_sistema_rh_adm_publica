package DTO;

public class CadastrarConcursoDTO {

    private int codigo_concurso;
    private int numero_concurso;
    private int ano_concurso;
    private int situacao_concurso;
    private int fk_matricula_responsavel_concurso;
    private int fk_codigo_banca;
    private String mensagem;

    public int getCodigo_concurso() {
        return codigo_concurso;
    }

    public void setCodigo_Concurso(int codigo_concurso) {
        this.codigo_concurso = codigo_concurso;
    }

    public int getNumero_Concurso() {
        return numero_concurso;
    }

    public void setNumero_Concurso(int numero_concurso) {
        this.numero_concurso = numero_concurso;
    }

    public int getAno_Concurso() {
        return ano_concurso;
    }

    public void setAno_Concurso(int ano_concurso) {
        this.ano_concurso = ano_concurso;
    }

    public int getSituacao_Concurso() {
        return situacao_concurso;
    }

    public void setSituacao_Concurso(int situacao_concurso) {
        this.situacao_concurso = situacao_concurso;
    }

    public int getFk_Matricula_Responsavel_Concurso() {
        return fk_matricula_responsavel_concurso;
    }

    public void setFk_Matricula_Responsavel_Concurso(int fk_matricula_responsavel_concurso) {
        this.fk_matricula_responsavel_concurso = fk_matricula_responsavel_concurso;
    }

    public int getFk_codigo_banca() {
        return fk_codigo_banca;
    }

    public void setFk_codigo_banca(int fk_codigo_banca) {
        this.fk_codigo_banca = fk_codigo_banca;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
