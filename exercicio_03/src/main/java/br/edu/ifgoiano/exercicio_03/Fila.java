package br.edu.ifgoiano.exercicio_03;

import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {

    private final Queue<T> elementos;

    public Fila() {
        elementos = new LinkedList<>();
    }

    public void enfileirar(T elemento) {
        elementos.offer(elemento);
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia!");
        }

        return elementos.poll();
    }

    public T consultarPrimeiro() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia!");
        }

        return elementos.peek();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }

    public void listar() {
        if (estaVazia()) {
            System.out.println("Não há aeronaves aguardando.");
            return;
        }

        int posicao = 1;

        for (T elemento : elementos) {
            System.out.println(posicao + "º - " + elemento);
            posicao++;
        }
    }
}
