package ch04

object Q4_6 extends App {

  /** 鶴の数を受け取って足の数を返す
    *
    * @param tsuru
    * @return
    */
  def tsuruNoAshi(tsuru: Int): Int = tsuru * 2

  /** 亀の数を受け取って足を返す
    *
    * @param kame
    */
  def kameNoAshi(kame: Int): Int = kame * 4
}
