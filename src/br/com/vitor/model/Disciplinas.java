package br.com.vitor.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {

    private String nome;
    private List<Aluno> alunos;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplinas(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirMediaTurma() {
        double somaMedias = 0.0;
        int totalAlunos = alunos.size();

        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }

        double mediaTurma = totalAlunos > 0 ? somaMedias / totalAlunos : 0.0;
        System.out.println("Média da Turma em " + nome + ": " + mediaTurma);
    }
    public void exibirInformacoesProfessor() {
        System.out.println("Disciplina: " + nome);
        professor.exibirInformacoes();
        System.out.println("-------------------------");
    }

}
