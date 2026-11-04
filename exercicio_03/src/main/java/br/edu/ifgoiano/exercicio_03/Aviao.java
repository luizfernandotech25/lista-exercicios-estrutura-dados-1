package br.edu.ifgoiano.exercicio_03;

public class Aviao {

    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Aeronave: " + nome
                + " | Identificador: " + identificador;
    }
}
