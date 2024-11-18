package service;

import java.util.ArrayList;

public class PessoaService {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Cadastro concedido");
    }

    public ArrayList<Pessoa> listar() {
        return pessoas;


    }
}