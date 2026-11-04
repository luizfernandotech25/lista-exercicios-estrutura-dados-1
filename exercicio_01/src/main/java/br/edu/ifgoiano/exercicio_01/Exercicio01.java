
package br.edu.ifgoiano.exercicio_01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sequência de caracteres: ");
        String texto = scanner.nextLine();

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        StringBuilder invertido = new StringBuilder();

        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }

        System.out.println("Texto invertido: " + invertido);

        String textoNormalizado = texto
                .replace(" ", "")
                .replace(".", "")
                .toLowerCase();

        Pilha<Character> pilhaPalindromo = new Pilha<>();

        for (int i = 0; i < textoNormalizado.length(); i++) {
            pilhaPalindromo.push(textoNormalizado.charAt(i));
        }

        StringBuilder textoComparacao = new StringBuilder();

        while (!pilhaPalindromo.isEmpty()) {
            textoComparacao.append(pilhaPalindromo.pop());
        }

        if (textoNormalizado.equals(textoComparacao.toString())) {
            System.out.println("A sequência é um palíndromo.");
        } else {
            System.out.println("A sequência não é um palíndromo.");
        }

        scanner.close();
    }
}
