package ch14

object Q14_3 {

  /** 文字列リストを受け取って、結合した文字列を返す
    *
    * @param list
    * @param initialvalue
    * @return
    */
  def concat(list: List[String], initialvalue: String): String =
    list.foldRight("")((a, b) => a + b)
}
