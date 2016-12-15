/**
  * Created by cw on 15.12.2016.
  */
class Person(private var nameOfBirth: String, private var curAge: Int){

  //Getter
  def age = curAge
  //Setter
  def age_=(value:Int) = curAge = value

  def name: String = nameOfBirth
  def name_=(value:String) = nameOfBirth = value


}