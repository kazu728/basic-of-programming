package ch16

import ch08.EkikanT
import ch12.EkiT
import ch15.Q15_4

object Q16_4 {

  def dijkstraMain(
      ekiList: List[EkiT],
      ekikanList: List[EkikanT]
  ): List[EkiT] = ekiList match {
    case List() => List()
    case x :: xs => {
      val (p, v) = Q15_4.saitanWoBunri(ekiList)
      val e = Q16_3.koushin(p, v, ekikanList)
      p :: dijkstraMain(e, ekikanList)
    }
  }

}
