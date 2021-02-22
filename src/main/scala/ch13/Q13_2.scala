package ch13

import ch08.PersonT

object Q13_2 {

  /** 渡されたレコードリストから名前のリストを返す
    *
    * @param list
    * @return
    */
  def personNamae(list: List[PersonT]): List[String] = list match {
    case List()  => List()
    case x :: xs => x.name :: personNamae(xs)
  }
}
