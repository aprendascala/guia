package aprendascala.ferramentas

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

trait Exercicios extends FunSuite with ShouldMatchers {

  val exercicio = test _

  implicit def mudeAqui(x : Any) = {
    new {
      def MUDE_AQUI(y : Any) = "Voce precisa mudar o MUDE_AQUI para resolver o exercicio"
    }
  }

  implicit def esperado(x : Any) = {
    new {
      def deveSer(y : Any) = {
        y should equal(x)
      }
    }
  }

}