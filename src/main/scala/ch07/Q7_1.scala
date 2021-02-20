package ch07

object Q7_1 {
  
  /**
    * 与えられた教科の合計と平均返す
    *
    * @param nationalLanguage
    * @param math
    * @param english
    * @param society
    * @param science
    * @return
    */
  def goukeiToHeikin(
      nationalLanguage: Int,
      math: Int,
      english: Int,
      society: Int,
      science: Int
  ): (Int, Int) = {
    val total = nationalLanguage + math + english + society + science
    (total, total / 5)
  }
}
