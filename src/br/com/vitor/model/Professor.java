package br.com.vitor.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private List<Disciplinas> disciplinas;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void exibirInformacoes() {
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
    }

    public void adicionarDisciplina(Disciplinas disciplina) {
        disciplinas.add(disciplina);
    }
}

