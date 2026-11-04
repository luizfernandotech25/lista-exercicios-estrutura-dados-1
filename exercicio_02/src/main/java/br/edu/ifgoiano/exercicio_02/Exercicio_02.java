
package br.edu.ifgoiano.exercicio_02;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<>();

        System.out.print("Quantos elementos deseja inserir na pilha? ");
        int quantidade = scanner.nextInt();

        // Inserção dos elementos na pilha
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();

            pilha.push(elemento);
        }

        System.out.print("\nDigite a chave que deseja remover: ");
        int chave = scanner.nextInt();

        // Pilha auxiliar
        Pilha<Integer> auxiliar = new Pilha<>();

        boolean removido = false;

        // Procura e remove a primeira ocorrência a partir do topo
        while (!pilha.isEmpty()) {

            int elemento = pilha.pop();

            if (elemento == chave && !removido) {
                removido = true;
            } else {
                auxiliar.push(elemento);
            }
        }

        // Restaura a pilha original
        while (!auxiliar.isEmpty()) {
            pilha.push(auxiliar.pop());
        }

        // Exibe o resultado
        if (removido) {
            System.out.println("\nElemento removido com sucesso!");
        } else {
            System.out.println("\nElemento não encontrado na pilha.");
        }

        System.out.println("\nElementos restantes (do topo para a base):");

        // Exibe os elementos sem alterar a pilha
        while (!pilha.isEmpty()) {
            int elemento = pilha.pop();

            System.out.println(elemento);
            auxiliar.push(elemento);
        }

        // Restaura novamente a pilha
        while (!auxiliar.isEmpty()) {
            pilha.push(auxiliar.pop());
        }

        scanner.close();
    }
}
