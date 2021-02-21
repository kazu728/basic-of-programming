package ch12

import ch08.EkimeiT

object Q12_2 {

  def makeEkiList(list: List[EkimeiT]): List[EkiT] = list match {
    case List()  => List()
    case x :: xs => EkiT(x.kanji, Double.MaxValue, List()) :: makeEkiList(xs)
  }
}
