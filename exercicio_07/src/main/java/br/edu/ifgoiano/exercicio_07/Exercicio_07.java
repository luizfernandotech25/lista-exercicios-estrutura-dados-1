
package br.edu.ifgoiano.exercicio_07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exercicio_07 {

    public static void inverterFila(Queue<Integer> fila) {

        Deque<Integer> pilha = new ArrayDeque<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            fila.offer(random.nextInt(100) + 1);
        }

        System.out.println("FILA ORIGINAL:");
        System.out.println(fila);

        inverterFila(fila);

        System.out.println("\nFILA INVERTIDA:");
        System.out.println(fila);

        System.out.println("\nQuantidade de elementos: " + fila.size());
    }
}
