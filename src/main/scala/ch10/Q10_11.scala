package ch10

import ch08.EkikanT

object Q10_11 {

  /** 2点の駅の距離感を返す
    *
    * @param station1
    * @param station2
    * @param ekikanList
    * @return
    */
  def getEkikanKyori(
      station1: String,
      station2: String,
      ekikanList: List[EkikanT]
  ): Double = ekikanList match {
    case List() => Double.MaxValue
    case x :: xs =>
      if (
        x.kiten == station1 && x.shuten == station2 || x.kiten == station2 && x.shuten == station1
      ) x.kyori
      else getEkikanKyori(station1, station2, xs)
  }
}
