package ch10

object Q10_9 {

  def equalLength[A](l1: List[A], l2: List[A]): Boolean = (l1, l2) match {
    case (List(), List())   => true
    case (List(), y :: ys)  => false
    case (x :: xs, List())  => false
    case (x :: xs, y :: ys) => equalLength(xs, ys)
  }
}
