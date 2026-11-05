
package br.edu.ifgoiano.exercicio_05;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Random;

public class Exercicio_05 {

    public static void main(String[] args) {

        Queue<Integer> F = new LinkedList<>();
        Deque<Integer> P = new ArrayDeque<>();

        Random random = new Random();

        // Inicialização da fila com números distintos
        for (int i = 1; i <= 10; i++) {
            F.offer(i);
        }

        // Sorteio e processamento de 1000 números
        for (int i = 0; i < 1000; i++) {

            int numero = random.nextInt(100) + 1;

            if (F.contains(numero)) {
                P.push(numero);
            } else {
                F.offer(numero);
            }
        }

        // Exibição da fila
        System.out.println("CONTEÚDO DA FILA F:");
        System.out.println(F);

        // Exibição da pilha
        System.out.println("\nCONTEÚDO DA PILHA P:");
        System.out.println(P);

        // Informações adicionais
        System.out.println("\nQuantidade de elementos na fila: "
                + F.size());

        System.out.println("Quantidade de elementos na pilha: "
                + P.size());

        System.out.println("Total de números sorteados: 1000");
    }
}
