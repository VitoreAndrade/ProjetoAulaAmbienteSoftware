package br.com.vitor.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int id;
    private List<Double> notas;

    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}
