
package br.edu.ifgoiano.exercicio_10;

import java.util.Scanner;

public class Exercicio_10 {

    public static long potencia(long base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("POTENCIACAO RECURSIVA");
        System.out.println("--------------------");

        System.out.print("Digite a base (a): ");
        long base = scanner.nextLong();

        System.out.print("Digite o expoente (b): ");
        int expoente = scanner.nextInt();

        if (base <= 0 || expoente < 0) {
            System.out.println("Informe uma base positiva e um expoente nao negativo.");
        } else {
            long resultado = potencia(base, expoente);

            System.out.println("\nResultado:");
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        }

        scanner.close();
    }
}
