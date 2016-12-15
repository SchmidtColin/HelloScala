/**
  * Created by cw on 15.12.2016.
  */
class Mathe {

  def fakultaet (number : Int) : Int = {
    if(number > 0){
      number*fakultaet(number - 1)
    }else{
      1
    }
  }

}
