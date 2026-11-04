
# Exercício 02 — Remoção de Elemento em uma Pilha

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano

## Objetivo

Desenvolver um procedimento para remover um elemento específico de uma pilha, utilizando exclusivamente as operações push e pop.

A estrutura deverá preservar todos os demais elementos e sua ordem original.

## Implementação

Foram desenvolvidas as classes:

- `Pilha<T>`: implementa uma estrutura de pilha genérica.
- `Exercicio_02`: realiza a inserção, remoção e apresentação dos elementos.

## Estratégia utilizada

Foi utilizada uma pilha auxiliar para armazenar temporariamente os elementos que não correspondem à chave procurada.

Após a remoção, os elementos são transferidos novamente para a pilha original, preservando sua ordem.

## Tecnologias

- Java
- Maven
- Apache NetBeans 31

## Execução

Executar a classe `Exercicio_02`.

## Testes

- Remoção de elemento existente.
- Tentativa de remoção de elemento inexistente.
- Remoção de elemento repetido.
- Remoção do único elemento da pilha.
