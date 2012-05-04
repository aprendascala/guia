package aprendascala.ex01.operacoes

import aprendascala.ferramentas.Exercicios

class Ex02Strings extends Exercicios {

  """
  String é uma forma de representar texto dentro de Scala.
  Para juntar duas você usa o método +
  Para cortar um pedaço da string, você usa o método substring
  """

  exercicio("Concatenar Duas Strings") {
    "uma string " + "outra string" deveSer "uma string outra string"
    "dia " + "bonito" deveSer "dia bonito"
    "dia " + "feio" deveSer "dia feio"
  }

  exercicio("Cortando strings") {
    "string".substring(2) deveSer "ring"
    "banana".substring(0, 3) deveSer "ban"
    "banana".substring(2, 4) deveSer "na"
    "cachorro".substring(2, 5) deveSer "cho"
    "vagem".substring(2, 5) deveSer "gem"
    "mima".substring(1, 4) deveSer "ima"
  }

}