package aprendascala.ex01.operacoes

import aprendascala.ferramentas.Exercicios

class Ex01OperacoesBasicas extends Exercicios {

  """
  As quatro operações básicas (+, -, *, /) são as mesmas
  usadas na matemática.
  O cálculo do resto da divisão é feito usando o caractere %
  """

  exercicio("Somar Dois Numeros") {
    1 MUDE_AQUI 1 deveSer 2
    2 MUDE_AQUI 2 deveSer 4
  }

  exercicio("Subtrair Dois Numeros") {
    1 MUDE_AQUI 1 deveSer 0
    2 MUDE_AQUI 3 deveSer -1
  }

  exercicio("Multiplicar Dois Numeros") {
    1 MUDE_AQUI 1 deveSer 1
    2 MUDE_AQUI 3 deveSer 6
  }

  exercicio("Dividir Dois Numeros") {
    1 MUDE_AQUI 1 deveSer 1
    4 MUDE_AQUI 2 deveSer 2
  }

  exercicio("Resto da Divisao") {
    4 MUDE_AQUI 2 deveSer 0
    8 MUDE_AQUI 7 deveSer 1
  }
}