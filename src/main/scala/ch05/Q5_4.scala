package ch05

object Q5_4 {

  /** 与えられた項から判別式の値を返す
    *
    * @param a
    * @param b
    * @param c
    */
  def hanbetsusiki(a: Int, b: Int, c: Int): Int = b * b - 4 * a * c
}