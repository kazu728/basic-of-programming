package ch15

import ch12.EkiT

object Q15_4 {

  /** 受け取った駅を最短距離最小の駅と最短距離最小の駅以外からなるリストに分離する
    *
    * @param list
    * @return
    */
  def saitanWoBunri(list: List[EkiT]): (EkiT, List[EkiT]) = list match {
    case List() => (EkiT("", Double.MaxValue, List()), List())
    case x :: xs => {
      val (p, v) = saitanWoBunri(xs)
      (x, p) match {
        case (EkiT(fn, fs, ft), EkiT(sn, ss, st)) => {
          if (sn == "") (x, v)
          else if (fs < ss) (x, p :: v)
          else (p, x :: v)
        }
      }
    }
  }
}
