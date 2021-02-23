package ch14

object Q14_1 {

  def filter[A](list: List[A], f: (A) => Boolean): List[A] = list match {
    case List()  => List()
    case x :: xs => if (f(x)) x :: filter(xs, f) else filter(xs, f)
  }

  val f = (n: Int) => n % 2 == 0

  def even(list: List[Int]): List[Int] = filter[Int](list, f)
}
