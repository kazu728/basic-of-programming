package ch15

object Q15_2 {

  /** 渡された２つの数の最大公約数を求める
    *
    * @param m
    * @param n
    * @return
    */
  def gcd(m: Int, n: Int): Int = n match {
    case n if n == 0 => m
    case n           => gcd(n, m % n)
  }
}
