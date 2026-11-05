
package br.edu.ifgoiano.exercicio_06;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exercicio_06 {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Deque<Integer> pilha = new ArrayDeque<>();

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int positivo = random.nextInt(1000) + 1;
            int negativo = -(random.nextInt(1000) + 1);

            numeros.add(positivo);
            numeros.add(negativo);
        }

        Collections.shuffle(numeros);

        fila.addAll(numeros);

        System.out.println("FILA INICIAL:");
        System.out.println(fila);
        System.out.println("\nPROCESSAMENTO DA FILA:");
        System.out.println("----------------------------------------");

        int positivosEmpilhados = 0;
        int negativosProcessados = 0;
        int negativosSemPar = 0;

        while (!fila.isEmpty()) {

            int numero = fila.poll();

            if (numero > 0) {

                pilha.push(numero);
                positivosEmpilhados++;

            } else {

                System.out.println("Número negativo encontrado: " + numero);

                if (!pilha.isEmpty()) {

                    int removido = pilha.pop();

                    System.out.println(
                        "Elemento removido da pilha: " + removido
                    );

                    negativosProcessados++;

                } else {

                    System.out.println(
                        "Pilha vazia! Não há elemento para remover."
                    );

                    negativosSemPar++;
                }
            }
        }

        System.out.println("\n========== RESULTADO FINAL ==========");
        System.out.println("Elementos restantes na fila: " + fila.size());
        System.out.println("Elementos restantes na pilha: " + pilha.size());
        System.out.println("Positivos empilhados: " + positivosEmpilhados);
        System.out.println("Negativos processados: " + negativosProcessados);
        System.out.println("Negativos sem elemento correspondente: "
                + negativosSemPar);

        System.out.println("\nPILHA FINAL:");
        System.out.println(pilha);

        System.out.println("\nBUILD FINALIZADO.");
    }
}
