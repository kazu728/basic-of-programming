package ch16

object Q16_2 {

  def reverse(list: List[Int]): List[Int] = {

    def f(list: List[Int], acc: List[Int]): List[Int] = list match {
      case List()  => acc
      case x :: xs => f(xs, x :: acc)
    }
    f(list, List())
  }

  def foldLeft(f: (Int, Int) => Int, init: Int, list: List[Int]): Int =
    list match {
      case List()  => init
      case x :: xs => foldLeft(f, f(init, x), xs)
    }
}
