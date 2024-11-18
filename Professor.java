package service;

public class Professor extends Pessoa {
    private String profissao;

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profissao='" + profissao + '\'' +
                '}';
    }
}
