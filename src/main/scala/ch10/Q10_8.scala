package ch10

import ch08.PersonT

object Q10_8 {

  /** 受け取ったレコード型のリストから最も多い血液型の名称を返す
    *
    * @param list
    * @return
    */
  def saitaKetsueki(list: List[PersonT]): String = {
    Q10_7.ketuekiShukei(list) match {
      case (0, 0, 0, 0) => ""
      case (a, b, o, ab) => {
        if (Math.max(Math.max(a, b), Math.max(o, ab)) == a) "A"
        else if (Math.max(Math.max(a, b), Math.max(o, ab)) == b) "B"
        else if (Math.max(Math.max(a, b), Math.max(o, ab)) == o) "O"
        else "AB"
      }
    }
  }
}
