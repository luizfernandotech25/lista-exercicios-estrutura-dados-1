
package br.edu.ifgoiano.exercicio_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Random;

public class Exercicio_04 {

    public static void main(String[] args) {

        Queue<Integer> F1 = new LinkedList<>();
        Queue<Integer> F2 = new LinkedList<>();
        Deque<Integer> pilha = new ArrayDeque<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            F1.offer(random.nextInt(1000) + 1);
        }

        System.out.println("FILA ORIGINAL (F1):");
        System.out.println(F1);

        for (int elemento : F1) {
            pilha.push(elemento);
        }

        while (!pilha.isEmpty()) {
            F2.offer(pilha.pop());
        }

        System.out.println("\nFILA INVERTIDA (F2):");
        System.out.println(F2);

        System.out.println("\nQuantidade de elementos em F1: "
                + F1.size());

        System.out.println("Quantidade de elementos em F2: "
                + F2.size());
    }
}
