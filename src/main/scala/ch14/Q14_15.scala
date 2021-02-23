package ch14

object Q14_15 {

  def enumerate(n: Int): List[Int] =
    if (n == 0) List() else n :: enumerate(n - 1)

  /** 1からnまでの話を返す
    *
    * @param n
    * @return
    */
  def oneToN(n: Int): Int = enumerate(n).foldRight(0)((a, b) => a + b)
}
