package ch10

object Q10_2 {

  /** 受け取ったリストを昇順にして返す
    *
    * @param list
    * @return
    */
  def insSort(list: List[Int]): List[Int] = list match {
    case List()  => List()
    case x :: xs => Q10_1.insert(insSort((xs)), x)
  }
}
