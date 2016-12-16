/**
  * Created by cw on 15.12.2016.
  */
class Person(private var nameOfBirth: String, private var curAge: Int){

  def createName(name:String):String = {
    def loop(i: Int, s: String): String =
      if (i < name.length) loop(i + 1, s+name.charAt(i)) else s
    loop(0, "")
  }

  //Getter
  def name: String = nameOfBirth
  def age = curAge
  //Setter
  def name_=(value:String) = nameOfBirth = value
  def age_=(value:Int) = curAge = value
}