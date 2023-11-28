package br.com.vitor;

import br.com.vitor.model.Aluno;


public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 1);
        Aluno aluno2 = new Aluno("Maria", 2);

        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(7.5);

        aluno2.adicionarNota(9.0);
        aluno2.adicionarNota(8.0);

    }
}
