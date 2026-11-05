
# Exercício 10 — Potenciação Recursiva

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano

## Objetivo

Implementar uma função recursiva para calcular a potência de dois números inteiros positivos, utilizando multiplicações sucessivas.

## Implementação

Foi desenvolvida a classe:

- `Exercicio_10`: recebe a base e o expoente, executa o cálculo recursivo e apresenta o resultado.

## Estratégia utilizada

A função `potencia()` utiliza a seguinte definição recursiva:

- Caso base: quando o expoente é zero, retorna 1.
- Caso recursivo: multiplica a base pelo resultado da chamada da função com o expoente reduzido em uma unidade.

## Tecnologias

- Java
- Maven
- Apache NetBeans IDE 31

## Testes

Foram considerados testes com diferentes bases e expoentes, incluindo expoente igual a zero.
