package ch07

object Q7_2 {

  /**
    * 与えられたpairから名前と成績の文字列を返す
    *
    * @param pair
    * @return
    */
  def seiseki(pair: (String, Int)): String = pair match {
    case (name: String, evaluation: Int) => s"${name}さんの成績は${evaluation}です"
  }
}
