package ch04

object Q4_8 {

  /** 鶴亀算を解く
    * @param multipledTsurukame
    * @param multipledLegs
    * @return
    */
  def tsurukame(multipledTsurukame: Int, multipledLegs: Int): Int =
    (multipledTsurukame * 4 - multipledLegs) / 2
}
