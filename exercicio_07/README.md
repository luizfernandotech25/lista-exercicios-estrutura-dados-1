
# Exercício 07 – Inversão de Fila Utilizando Pilha

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano  
**Linguagem:** Java  
**IDE:** Apache NetBeans 31

## Objetivo

Desenvolver um método capaz de inverter uma fila contendo 20 números inteiros, utilizando uma pilha como estrutura auxiliar.

## Implementação

Foi desenvolvida a classe `Exercicio_07`, utilizando:

- `Queue<Integer>`: representa a fila.
- `LinkedList<Integer>`: implementação da fila.
- `Deque<Integer>`: representa a pilha auxiliar.
- `ArrayDeque<Integer>`: implementação da pilha.
- `Random`: geração dos números inteiros.

## Estratégia utilizada

O método `inverterFila()` realiza duas operações:

1. Remove os elementos da fila e os insere na pilha.
2. Remove os elementos da pilha e os insere novamente na fila.

Como a pilha utiliza o princípio LIFO (Last In, First Out), a ordem dos elementos é invertida durante a transferência.

## Tecnologias

- Java
- Maven
- Apache NetBeans 31

## Execução

Executar a classe `Exercicio_07`.

## Resultado

O programa apresenta:

- Conteúdo da fila original.
- Conteúdo da fila após a inversão.
- Quantidade total de elementos.

## Observação

A fila mantém os mesmos 20 elementos após a operação, mas em ordem inversa à sequência original.
