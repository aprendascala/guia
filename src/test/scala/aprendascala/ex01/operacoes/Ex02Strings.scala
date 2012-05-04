package aprendascala.ex01.operacoes

import aprendascala.ferramentas.Exercicios

class Ex02Strings extends Exercicios {

  """
  String é uma forma de representar texto dentro de Scala.
  Para juntar duas você usa o método +
  Para cortar um pedaço da string, você usa o método substring
  """

  exercicio("Concatenar Duas Strings") {
    "uma string " MUDE_AQUI "outra string" deveSer "uma string outra string"
    "dia " MUDE_AQUI "bonito" deveSer "dia bonito"
    "dia " + MUDE_AQUI deveSer "dia feio"
  }

  exercicio("Cortando strings") {
    "string".MUDE_AQUI(2) deveSer "ring"
  }

}