package ch11

object Q11_1 {

  /** 受け取った整数の0までの２乗の和を返す
    *
    * @param n
    * @return
    */
  def sumOfSquare(n: Int): Int = n match {
    case 0 => 0
    case n => n * n + sumOfSquare(n - 1)
  }
}
