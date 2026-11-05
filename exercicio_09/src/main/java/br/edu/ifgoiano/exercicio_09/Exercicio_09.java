
package br.edu.ifgoiano.exercicio_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_09 {

    public static int somarLista(List<Integer> lista) {
        return somarRecursivamente(lista, 0);
    }

    private static int somarRecursivamente(List<Integer> lista, int indice) {

        if (indice == lista.size()) {
            return 0;
        }

        return lista.get(indice) + somarRecursivamente(lista, indice + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("\nLISTA: " + numeros);
        System.out.println("SOMA DOS ELEMENTOS: " + somarLista(numeros));

        scanner.close();
    }
}
