package ch15

object Q15_1 {

  /** 渡された数より小さい数のリストを生成する
    *
    * @param n
    * @param list
    * @return
    */
  def takeLess(n: Int, list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => if (x <= n) x :: takeLess(n, xs) else takeLess(n, xs)
  }

  /** 渡された数より大きい数のリストを生成する
    *
    * @param n
    * @param list
    * @return
    */
  def takeGreater(n: Int, list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => if (x > n) x :: takeGreater(n, xs) else takeGreater(n, xs)
  }

  /** リストを昇順に並べ替える
    *
    * @param list
    * @return
    */
  def sort(list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => sort(takeLess(x, xs)) ::: x :: sort(takeGreater(x, xs))
  }
}
