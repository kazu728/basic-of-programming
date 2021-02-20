package ch07

object Q7_4 {

  /** 与えられた2点の中点を返す
    * @param p1
    * @param p2
    * @return
    */
  def chuten(p1: (Int, Int), p2: (Int, Int)): (Float, Float) = p1 match {
    case (p1x: Int, p1y: Int) =>
      p2 match {
        case (p2x: Int, p2y: Int) =>
          ((p1x.toFloat + p2x.toFloat) / 2, (p1y.toFloat + p2y.toFloat) / 2)
      }
    case _ => sys.error("")
  }
}
