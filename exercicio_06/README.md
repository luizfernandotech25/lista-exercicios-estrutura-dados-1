
# Exercício 06 – Operações com Fila e Pilha

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano  
**Linguagem:** Java  
**IDE:** Apache NetBeans 31

## Objetivo

Desenvolver um programa que utilize simultaneamente as estruturas de dados Fila e Pilha.

O programa deve:

1. Gerar 2.000 números inteiros, sendo 1.000 positivos e 1.000 negativos.
2. Inserir os números em uma fila.
3. Enquanto houver elementos na fila:
   - Se o primeiro elemento for positivo, removê-lo da fila e inseri-lo na pilha.
   - Se for negativo, removê-lo da fila, exibi-lo e retirar um elemento do topo da pilha.

## Implementação

Foi desenvolvida a classe `Exercicio_06`, utilizando:

- `Queue<Integer>`: representa a fila.
- `LinkedList<Integer>`: implementação da fila.
- `Deque<Integer>`: representa a pilha.
- `ArrayDeque<Integer>`: implementação da pilha.
- `ArrayList<Integer>`: armazenamento temporário dos números.
- `Collections.shuffle()`: embaralhamento dos números.
- `Random`: geração dos números aleatórios.

## Estratégia utilizada

O programa gera 1.000 números positivos e 1.000 negativos, com valores entre 1 e 1.000 em módulo.

Os números são embaralhados e inseridos na fila.

Durante o processamento:

- Números positivos são removidos da fila e empilhados.
- Números negativos são removidos da fila e exibidos.
- Quando há elementos disponíveis, um número é retirado do topo da pilha.
- Caso a pilha esteja vazia, o programa informa que não há elemento disponível para remoção.

## Tecnologias

- Java
- Maven
- Apache NetBeans 31

## Execução

Executar a classe `Exercicio_06`.

## Resultado

Ao final, são apresentados:

- Quantidade de elementos restantes na fila.
- Quantidade de elementos restantes na pilha.
- Total de positivos empilhados.
- Total de negativos processados.
- Quantidade de negativos sem elemento correspondente.
- Conteúdo final da pilha.

## Observação

Como os números são embaralhados, pode ocorrer de um número negativo ser processado antes de qualquer número positivo. Nessa situação, a pilha permanece vazia e o programa trata essa condição sem interromper a execução.
