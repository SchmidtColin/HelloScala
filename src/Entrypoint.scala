/**
  * Created by cw on 15.12.2016.
  */
object Entrypoint {
  val student = new Person("Karl Heinz", 21)
  def main(args: Array[String]): Unit = {
    student.age = 30
    student.name = "Jonny Banana"
    println(student name)
    println(student age)
    println(createName(student name))
    println()
    var testList: Seq[Int] = Seq(1,8,5,2,6,4,9,7,3)
    testList  ++= Seq(9,4,5,2,3,5,8,7)
    println(testList contains 41)
    println(testList size)

    val mathe = new Mathe()
    println(mathe.factorial(4))
    print(mathe.theZero(6, 5))
  }

  def createName(name:String):String = {
    def loop(i: Int, s: String): String =
      if (i < name.length) loop(i + 1, s+name.charAt(i)) else s
    loop(0, "")
  }



}
