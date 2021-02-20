package ch04

object Q4_7 {

  /** 鶴と亀の数の合計の足の本数を計算する
    *
    * @param tsuru
    * @param kame
    * @return
    */
  def getNumberOfLegs(tsuru: Int, kame: Int): Int =
    Q4_6.tsuruNoAshi(tsuru) + Q4_6.kameNoAshi(kame)
}
