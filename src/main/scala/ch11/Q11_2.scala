package ch11

object Q11_2 {

  def calc(n: Int): Int = n match {
    case 1 => 5
    case n => 2 * calc(n - 1) - 1
  }
}
