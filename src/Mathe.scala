/**
  * Created by cw on 15.12.2016.
  */
class Mathe {

  def factorial (number : Int) : Int = {
    if(number > 0){
      number*factorial(number - 1)
    }else{
      1
    }
  }

  def theZero(p : Int, q: Int) : Seq[Double] = {
    val list = Seq()
    var firstResult = 0.0
    var secondResult = 0.0
    if((Math.pow(p,2)/4)-q >= 0){
     firstResult = (-p/2)+Math.sqrt((Math.pow(p,2)/4)-q)
     secondResult = (-p/2)-Math.sqrt((Math.pow(p,2)/4)-q)
    }else{
        firstResult = -42
        secondResult = -42
    }

    val result  = list ++ Seq(firstResult, secondResult)
    result
  }

  def sumOfOdds(xs: Seq[Int]): Int = xs filter { _%2 != 0 } sum
}
