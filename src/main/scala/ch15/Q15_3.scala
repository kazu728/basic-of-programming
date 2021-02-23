package ch15

object Q15_3 {

  /** 割る数と割られる数を受け取り、割り切れなかった値を返す
    *
    * @param n
    * @param list
    * @return
    */
  def unableToDivide(n: Int, list: List[Int]): List[Int] = list match {
    case List() => List()
    case x :: xs =>
      if (x % n == 0) unableToDivide(n, xs) else x :: unableToDivide(n, xs)
  }

  /** 受け取ったリストの中から素数を抽出して返す
    *
    * @param list
    * @return
    */
  def sieve(list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => x :: sieve(unableToDivide(x, xs))
  }
}
