package ch14

import ch08.EkimeiT
import ch12.EkiT

object Q14_11 {

  def makeEkiList(list: List[EkimeiT]): List[EkiT] =
    list.map((l) => EkiT(l.kanji, Double.MaxValue, List()))

  def shokika(list: List[EkiT], startStation: String): List[EkiT] =
    list.map(l =>
      if (l.name == startStation)
        l.copy(distance = 0, interanlStation = List(l.name))
      else l
    )
}
