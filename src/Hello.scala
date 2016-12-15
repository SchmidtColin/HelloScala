import scala.language.postfixOps

/**
  * Created by cw on 13.12.2016.
  */
object Hello extends App {
  def sumOfOdds(xs: Seq[Int]): Int = xs filter { _%2 != 0 } sum

  val str = {
    def loop(i: Int, s: String): String =
      if (i <= 9) loop(i + 1, s + i) else s
    loop(0, "")
  }

  var testList: Seq[Int] = Seq(1,8,5,2,6,4,9,7,3)

  testList  ++= Seq(9,4,5,2,3,5,8,7)

  println(testList contains 41)

  println(sumOfOdds(testList))

  println(testList size)

  println("hello".reverse)

  println("h"*10)

  println(str)
}

