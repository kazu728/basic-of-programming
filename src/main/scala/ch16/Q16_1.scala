package ch16

object Q16_1 {

  /** 受け取ったリストの各要素で前の値を加算して返す
    *
    * @param list
    * @return
    */
  def sumList(list: List[Int]): List[Int] = {
    // acc: 現在の合計
    def f(list: List[Int], acc: Int): List[Int] = list match {
      case List()  => List()
      case x :: xs => x + acc :: f(xs, x + acc)
    }

    f(list, 0)
  }
}
