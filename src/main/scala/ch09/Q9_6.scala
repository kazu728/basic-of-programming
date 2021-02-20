package ch09

object Q9_6 {

  /** リストの文字列を受け取って、結合した文字列を返す
    *
    * @param list
    * @return
    */
  def concat(list: List[String]): String = list match {
    case List()  => ""
    case x :: xs => x + concat(xs)
  }
}
