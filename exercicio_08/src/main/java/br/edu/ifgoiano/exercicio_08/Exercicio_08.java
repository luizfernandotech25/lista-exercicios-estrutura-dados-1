
package br.edu.ifgoiano.exercicio_08;

import java.util.Random;

public class Exercicio_08 {

    public static void main(String[] args) {

        TestaPilha pilhas = new TestaPilha();
        Random random = new Random();

        System.out.println("PROCESSAMENTO DE 1.000 NÚMEROS");
        System.out.println("--------------------------------");

        for (int i = 1; i <= 1000; i++) {

            int numero = random.nextInt(201) - 100;

            pilhas.processar(numero);
        }

        pilhas.exibirResultados();

        System.out.println("\nBUILD FINALIZADO.");
    }
}
