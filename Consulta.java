package model;

import java.time.LocalDate;

public class Consulta {
    private String paciente;
    private Medico medico;
    private double dataConsulta;
    public String nome;
    public String idade;
    private String especialidade;

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setDataConsulta(double dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getDataConsulta() {
        return dataConsulta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getIdade() {
        return idade;
    }

    public void realizarConsulta(Medico medico, Paciente paciente, LocalDate dataConsulta) {
    }
}