package ch12

import ch08.EkimeiT

object Q12_4 {

  /** 受け取った駅名を照準に並べ替える、重複がある場合は纏める
    *
    * @param ekimei
    * @param list
    * @return
    */
  def insert(ekimei: EkimeiT, list: List[EkimeiT]): List[EkimeiT] = list match {
    case List() => List(ekimei)
    case x :: xs =>
      if (ekimei.kana < x.kana) ekimei :: list
      else if (ekimei.kana == x.kana) ekimei :: xs
      else x :: insert(ekimei, xs)
  }

  /** 昇順に整列する
    *
    * @param list
    * @return
    */
  def seiretsu(list: List[EkimeiT]): List[EkimeiT] = list match {
    case List()  => List()
    case x :: xs => insert(x, seiretsu(xs))
  }

}
