package ch14

import ch10.Gakusei

object Q14_2 {

  def countA(list: List[Gakusei], f: (Gakusei) => Boolean): Int = {
    def length[A](list: List[A]): Int = list match {
      case List()  => 0
      case x :: xs => 1 + length(xs)
    }

    length(Q14_1.filter(list, f))
  }
}
