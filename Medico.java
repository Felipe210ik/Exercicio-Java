package model;

public class Medico {
    public String Especialidade;
    private String nome;
    private int idade;
    private String proffisao;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setProfissao(String profissao){
        this.proffisao = proffisao;
    }
    public String getProffisao() {
        return proffisao;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }
    public String getEspecialidade() {
        return Especialidade;
    }

}