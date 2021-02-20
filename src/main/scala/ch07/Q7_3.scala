package ch07

object Q7_3 {

  /**
    * 与えられた点の xの対象点を返す
    * @param point
    * @return
    */
  def taishoX(point: (Int, Int)): Int = point match {
    case (x: Int, y: Int) => -x
  }
}
