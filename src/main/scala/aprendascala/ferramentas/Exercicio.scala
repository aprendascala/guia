package aprendascala.ferramentas

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

object Exercicios {
  val mensagem = "Voce precisa mudar o MUDE_AQUI para resolver o exercicio"
}

trait Exercicios extends FunSuite with ShouldMatchers {

  val exercicio = test _

  val MUDE_AQUI = Marker()

  implicit def mudeAqui(x : Any) = {
    new {
      def MUDE_AQUI(y : Any) = Exercicios.mensagem
    }
  }

  implicit def esperado(x : Any) = {
    new {
      def deveSer(y : Any) = {
        x should equal(y)
      }
    }
  }

}

case class Marker() {
  override def toString = Exercicios.mensagem
}

