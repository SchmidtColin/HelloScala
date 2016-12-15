/**
  * Created by cw on 15.12.2016.
  */
object Entrypoint {

  def main(args: Array[String]): Unit = {
    val student = new Person("Karl Heinz", 21)
    student.printName
    println(student.createName)
    println(student.revertName)
    println()
    var testList: Seq[Int] = Seq(1,8,5,2,6,4,9,7,3)
    testList  ++= Seq(9,4,5,2,3,5,8,7)
    println(testList contains 41)
    println(testList size)
  }

}
