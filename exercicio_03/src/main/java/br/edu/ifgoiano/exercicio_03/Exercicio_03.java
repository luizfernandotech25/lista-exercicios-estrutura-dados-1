package br.edu.ifgoiano.exercicio_03;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fila<Aviao> fila = new Fila<>();

        int opcao;

        do {
            System.out.println("\n=================================");
            System.out.println("      CONTROLE DE DECOLAGEM");
            System.out.println("=================================");
            System.out.println("1 - Informar aviões na fila");
            System.out.println("2 - Autorizar decolagem");
            System.out.println("3 - Adicionar avião à fila");
            System.out.println("4 - Listar aviões aguardando");
            System.out.println("5 - Mostrar próximo avião");
            System.out.println("0 - Encerrar sistema");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\nQuantidade de aviões aguardando: "
                            + fila.tamanho());
                    break;

                case 2:
                    if (fila.estaVazia()) {
                        System.out.println("\nNão há aviões para decolar.");
                    } else {
                        Aviao aviao = fila.desenfileirar();

                        System.out.println("\nDecolagem autorizada!");
                        System.out.println(aviao);
                    }
                    break;

                case 3:
                    System.out.print("\nNome da aeronave: ");
                    String nome = scanner.nextLine();

                    System.out.print("Identificador: ");
                    int identificador = scanner.nextInt();
                    scanner.nextLine();

                    Aviao novoAviao = new Aviao(nome, identificador);
                    fila.enfileirar(novoAviao);

                    System.out.println("\nAeronave adicionada à fila!");
                    break;

                case 4:
                    System.out.println("\nAERONAVES AGUARDANDO:");
                    fila.listar();
                    break;

                case 5:
                    if (fila.estaVazia()) {
                        System.out.println("\nNão há aeronaves aguardando.");
                    } else {
                        System.out.println("\nPRÓXIMA AERONAVE:");
                        System.out.println(fila.consultarPrimeiro());
                    }
                    break;

                case 0:
                    System.out.println("\nSistema encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
