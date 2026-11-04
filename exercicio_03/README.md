
# Exercício 03 — Fila de Decolagem de Aeronaves

**Disciplina:** Estrutura de Dados I  
**Curso:** Tecnologia em Sistemas para Internet  
**Instituição:** IF Goiano

## Objetivo

Desenvolver um programa em Java para simular o controle de decolagem de aeronaves utilizando a estrutura de dados Fila.

## Funcionalidades

- Informar a quantidade de aviões aguardando na fila.
- Autorizar a decolagem do primeiro avião.
- Adicionar uma nova aeronave à fila.
- Listar todas as aeronaves aguardando.
- Consultar as características do próximo avião.

## Implementação

O projeto contém três classes:

- `Aviao.java`: representa uma aeronave, com nome e identificador.
- `Fila.java`: implementa as operações de inserção, remoção, consulta e verificação da fila.
- `Exercicio_03.java`: contém o menu interativo e controla a simulação.

## Estrutura de dados

Foi utilizada a política FIFO (*First In, First Out*), na qual o primeiro elemento inserido é o primeiro a ser removido.

## Tecnologias

- Java
- Maven
- Apache NetBeans 31

## Execução

Executar a classe `Exercicio_03`.

## Testes

- Consulta de fila vazia.
- Inserção de aeronaves.
- Consulta da quantidade de aeronaves.
- Consulta do próximo avião.
- Autorização de decolagem.
- Verificação da ordem FIFO.
