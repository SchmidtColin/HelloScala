/**
  * Created by cw on 15.12.2016.
  */
class Person(val name: String, val age: Int){

  def sumOfOdds(xs: Seq[Int]): Int = xs filter { _%2 != 0 } sum
  def printName = {println("Name: " + name + " Alter: " + age)}

  val createName = {
    def loop(i: Int, s: String): String =
      if (i < name.length) loop(i + 1, s+name(i)) else s
    loop(0, "")
  }

  val revertName = name.reverse

}