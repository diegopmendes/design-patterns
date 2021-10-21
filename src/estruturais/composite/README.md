# Composite

* O Composite é um padrão de projeto estrutural que permite compor objetos em uma estrutura semelhante a uma árvore e
  trabalhar com eles como se fosse um objeto singular.

Imagine criar um questionário:

* O Componente (ElementoDoQuestionario): é a interface que define métodos comuns às classes dentro da composição e,
  opcionalmente, define uma interface para acessar o objeto “pai” de um componente.

* A Folha (Questao) é um componente que, como o nome indica, não possui filhos (está nas extremidades da árvore).

* O Composto (Bloco) é um componente que, como o nome indica, é composto de outros componentes, que podem ser folhas ou
  outros compostos.

```
Bloco A
—– Q1
—– Q2
—– Q3
Bloco B
—– Bloco B1
———- Q4
———- Q5
—– Bloco B2
———- Q6
—– Q7
```