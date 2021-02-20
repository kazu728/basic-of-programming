package ch09

object Q9_5 {

  /** 整数のリストを受け取り、そのリストから偶数の要素を含むリストを返す
    *
    * @param list
    * @return
    */
  def even(list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => if (x % 2 == 0) x :: even(xs) else even(xs)
  }
}
