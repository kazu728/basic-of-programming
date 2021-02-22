package ch13

import ch12.EkiT
import ch09.Q9_10
import ch10.Q10_11

object Q13_6 {

  def koushin1(p: EkiT, q: EkiT): EkiT = (p, q) match {
    case (
          EkiT(pName, pDistance, pInteranlStation),
          EkiT(qName, qDistance, qInteranlStation)
        ) => {
      val distance = Q10_11.getEkikanKyori(pName, qName, Q9_10.globalEkikanList)
      if (distance == Double.MaxValue) q
      else if (pDistance + distance < qDistance)
        q.copy(
          distance = pDistance + distance,
          interanlStation = qName :: pInteranlStation,
          name = qName
        )
      else
        q
    }
  }
}
