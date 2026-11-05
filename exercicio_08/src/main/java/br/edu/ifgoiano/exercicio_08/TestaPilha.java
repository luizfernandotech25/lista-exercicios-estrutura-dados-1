
package br.edu.ifgoiano.exercicio_08;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestaPilha {

    private final Deque<Integer> N;
    private final Deque<Integer> P;

    public TestaPilha() {
        N = new ArrayDeque<>();
        P = new ArrayDeque<>();
    }

    public void processar(int numero) {

        if (numero > 0) {

            P.push(numero);

        } else if (numero < 0) {

            N.push(numero);

        } else {

            System.out.println("\nNúmero zero encontrado!");

            if (!P.isEmpty()) {
                System.out.println("Removido da pilha P: " + P.pop());
            } else {
                System.out.println("Pilha P está vazia.");
            }

            if (!N.isEmpty()) {
                System.out.println("Removido da pilha N: " + N.pop());
            } else {
                System.out.println("Pilha N está vazia.");
            }
        }
    }

    public void exibirResultados() {

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("\nPILHA P (POSITIVOS):");
        System.out.println(P);

        System.out.println("\nPILHA N (NEGATIVOS):");
        System.out.println(N);

        System.out.println("\nQuantidade na pilha P: " + P.size());
        System.out.println("Quantidade na pilha N: " + N.size());
    }
}
