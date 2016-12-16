import scala.collection.mutable.{ArrayBuffer}

/**
  * Created by cw on 15.12.2016.
  */
class Mathe {
  val FIRST_ZERO = "Erste Nullstelle: "
  val SECOND_ZERO = "Zweite Nullstelle: "
  val NO_ZERO = "Keine realen Nullstellen vorhanden!"

  def factorial (number : Int) : Int = {
    if(number > 0){
      number*factorial(number - 1)
    }else{
      1
    }
  }

  def theZeros(p : Int, q: Int) : Seq[Double] = {
    val result = new ArrayBuffer[Double]()
    if((Math.pow(p,2)/4)-q >= 0){
      result += (-p/2)+Math.sqrt((Math.pow(p,2)/4)-q)
      result += (-p/2)-Math.sqrt((Math.pow(p,2)/4)-q)
    }
    result
  }

  def checkForTheZeros(p: Int, q: Int) : Unit = {
    if(theZeros(p, q).nonEmpty){
      println(FIRST_ZERO + theZeros(p, q).head)
      println(SECOND_ZERO + theZeros(p, q).last)
    }else{
      println(NO_ZERO)
    }
  }

  def sumOfOdds(xs: Seq[Int]): Int = xs filter { _%2 != 0 } sum
}
