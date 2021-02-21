package ch10

object Q10_1 {

  /** 整数リストと要素を受け取り、昇順に並ぶように要素を挿入したリストを返す
    *
    * @param list
    * @param n
    * @return
    */
  def insert(list: List[Int], n: Int): List[Int] = list match {

    case List()  => List(n)
    case x :: xs => if (x < n) x :: insert(xs, n) else n :: list
  }
}
