package br.com.vitor;

import br.com.vitor.model.Aluno;
import br.com.vitor.model.Disciplinas;
import br.com.vitor.model.Professor;


public class Main {
    public static void main(String[] args) {
        Professor professorMatematica = new Professor("Doutor Silva", "Matemática");
        Aluno aluno1 = new Aluno("João", 1);
        Aluno aluno2 = new Aluno("Maria", 2);

        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(7.5);

        aluno2.adicionarNota(9.0);
        aluno2.adicionarNota(8.0);

        Disciplinas matematica = new Disciplinas("Matemática",professorMatematica);
        matematica.adicionarAluno(aluno1);
        matematica.adicionarAluno(aluno2);

        professorMatematica.adicionarDisciplina(matematica);

        matematica.exibirInformacoesProfessor();
        matematica.exibirMediaTurma();
    }
}
