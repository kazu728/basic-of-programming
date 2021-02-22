package ch13

import ch08.PersonT

object Q13_1 {

  /** 渡された血液型の人数を返す
    *
    * @param persons
    * @param bloodType
    * @return
    */
  def countKetsueki(persons: List[PersonT], bloodType: String): Int =
    persons match {
      case List() => 0
      case x :: xs =>
        if (x.bloodType == bloodType) 1 + countKetsueki(xs, bloodType)
        else countKetsueki(xs, bloodType)
    }
}
