package ch10

case class Gakusei(name: String, score: Int, evaluation: Char)

object Q10_5 {

  /** 学生リストから最大点数の学生を返す
    *
    * @param list
    * @return
    */
  def gakuseiMax(list: List[Gakusei]): Gakusei = list match {
    case List() => Gakusei("", Int.MinValue, 'a')
    case x :: xs => {
      val gakuseiCache = gakuseiMax(xs)
      gakuseiCache match {
        case Gakusei(name, score, evaluation) =>
          if (score < x.score) x else gakuseiCache
      }
    }
  }
}
