package ch16

import ch08.EkikanT
import ch10.Q10_11
import ch12.EkiT

object Q16_3 {

  def koushin(p: EkiT, v: List[EkiT], ekiList: List[EkikanT]): List[EkiT] =
    v.map(q => {
      (p, q) match {
        case (EkiT(pn, pd, pi), EkiT(qn, qd, qi)) => {
          val distance = Q10_11.getEkikanKyori(pn, qn, ekiList)
          if (distance == Double.MaxValue) q
          else if (pd + distance < qd)
            q.copy(distance = pd + distance, interanlStation = qn :: pi)
          else q
        }
      }
    })
}
