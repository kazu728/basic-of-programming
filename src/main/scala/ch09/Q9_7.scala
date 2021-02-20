package ch09

import ch08.PersonT

object Q9_7 {

  /** 
    * 血液型がA型の人数を返す
    *
    * @param list
    * @return
    */
  def countKetsuekiA(list: List[PersonT]): Int = list match {
    case List() => 0
    case x :: xs =>
      if (x.bloodType == "A") 1 + countKetsuekiA(xs) else countKetsuekiA(xs)
  }
}
