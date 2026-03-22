# Estruturas de Dados I - Implementação de TAD Lista Sequencial

Este projeto consiste na implementação de um **Tipo Abstrato de Dados (TAD) Lista Sequencial** (também conhecido como `ArrayList`) utilizando a linguagem Java. O foco principal é a compreensão da manipulação de índices, lógica de deslocamento (*shift*) e gerenciamento dinâmico de memória.

## 🚀 Sobre o Projeto

A atividade foi desenvolvida como parte da disciplina de Estrutura de Dados I do curso de Tecnologia em Análise e Desenvolvimento de Sistemas (IFTM - Campus Patrocínio). A classe principal, `MyArrayList`, simula o comportamento de uma lista dinâmica, garantindo que os elementos permaneçam organizados sequencialmente na memória.

## 🛠️ Funcionalidades Implementadas

A classe `MyArrayList` oferece um conjunto completo de operações para manipulação da lista:

* **Inserção:**
    * `addFirst(int element)`: Insere um elemento no início da lista.
    * `addLast(int element)`: Insere um elemento ao final da lista.
    * `insertAt(int index, int element)`: Insere um elemento em uma posição específica, realizando o deslocamento para a direita.
* **Remoção:**
    * `removeFirst()`: Remove o primeiro elemento.
    * `removeLast()`: Remove o último elemento.
    * `removeAt(int index)`: Remove o elemento de uma posição específica, realizando o deslocamento para a esquerda (*shift left*) para manter a continuidade.
    * `remove(int element)`: Busca e remove um elemento específico da lista.
* **Busca e Acesso:**
    * `find(int element)`: Retorna o índice da primeira ocorrência de um valor.
    * `get(int index)`: Retorna o valor contido em um índice específico.
    * `set(int index, int element)`: Atualiza o valor em uma posição da lista.
* **Utilitários:**
    * `display()`: Exibe o conteúdo atual da lista de forma formatada.
    * **Redimensionamento Dinâmico:** Através do método privado `ensureCapacity()`, a lista dobra sua capacidade automaticamente quando o limite atual é atingido.

## 💻 Exemplo de Uso

O projeto conta com uma classe `Principal` que demonstra as funcionalidades:

```java
MyArrayList lista = new MyArrayList();

// Inserção e Redimensionamento
lista.addLast(10);
lista.addLast(20);
lista.addFirst(5);
lista.insertAt(2, 15);

lista.display(); // Saída: [ 5, 10, 15, 20 ]

// Remoção
lista.removeFirst();
lista.display(); // Saída: [ 10, 15, 20 ]
