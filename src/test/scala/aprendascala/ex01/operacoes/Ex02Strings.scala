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
    "banana".MUDE_AQUI(0, 3) deveSer "ban"
    "banana".substring(MUDE_AQUI, 4) deveSer "na"
    "cachorro".substring(2, MUDE_AQUI) deveSer "cho"
    MUDE_AQUI.substring(2, 5) deveSer "gem"
    MUDE_AQUI.substring(MUDE_AQUI, MUDE_AQUI) deveSer "ima"
  }

}