package ch13

import ch12.EkiT

object Q13_7 {

  /** 直前に確定した駅と未確定の駅を受け取って更新を行い、未確定の駅を返す
    *
    * @param p
    * @param v
    * @return
    */
  def koushin(p: EkiT, v: List[EkiT]): List[EkiT] =
    v.map(q => Q13_6.koushin1(p, q))
}
