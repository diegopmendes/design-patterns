# Adapter

O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.
Facilita a utilizacao de várias implementacoes que podem mudar durante o desenvolvimento do codigo.

* 1 - O adaptador obtém uma interface, compatível com um dos objetos existentes.
* 2 - Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.
* 3 - Ao receber a chamada, o adaptador passa o pedido para osegundo objeto, mas em um formato e ordem que o segundo
  objeto espera.

https://refactoring.guru/pt-br/design-patterns/adapters