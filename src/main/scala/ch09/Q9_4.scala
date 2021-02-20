package ch09

object Q9_4 {

  /** 整数のリストを受け取って、そのリストの長さを返す
    *
    * @param list
    * @return
    */
  def length(list: List[Int]): Int = list match {
    case List()  => 0
    case x :: xs => 1 + length(xs)
  }
}
