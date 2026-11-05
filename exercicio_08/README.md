
# Exercício 08 — Separação de Números em Pilhas

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano  
**Linguagem:** Java  
**IDE:** Apache NetBeans 31

## Objetivo

Desenvolver um programa que gere 1.000 números aleatórios entre -100 e 100 e distribua os valores em duas pilhas, conforme seu sinal.

## Implementação

Foram desenvolvidas as classes:

- `Exercicio_08`: responsável pela geração dos números aleatórios e execução do programa.
- `TestaPilha`: responsável pelo gerenciamento das pilhas e processamento dos valores.

## Regras de funcionamento

- Números positivos são inseridos na pilha P.
- Números negativos são inseridos na pilha N.
- Quando o número sorteado é zero, um elemento é removido de cada pilha, quando disponíveis.
- Ao final, são exibidos os elementos e as quantidades restantes.

## Estruturas utilizadas

- `Deque<Integer>`: implementação das pilhas.
- `ArrayDeque`: estrutura utilizada para armazenar os elementos.
- `Random`: geração de números aleatórios.

## Testes

- Geração de 1.000 números.
- Inserção de números positivos e negativos.
- Identificação de valores iguais a zero.
- Remoção de elementos das duas pilhas.
- Verificação de pilhas vazias.
- Exibição dos resultados finais.

## Execução

Executar a classe `Exercicio_08`.

**Resultado:** execução concluída com sucesso (`BUILD SUCCESS`).
