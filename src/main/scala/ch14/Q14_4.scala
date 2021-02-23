package ch14

import ch10.Gakusei

object Q14_4 {

  /** 学生のリストを受け取って、特点の合計を返す
    *
    * @param list
    * @return
    */
  def gakuseiSum(list: List[Gakusei]): Int =
    list.foldRight(0)((a, b) => a.score + b)
}
