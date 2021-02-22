package ch13

object Q13_4 {
  def compose[A, B, C](f: (A => B), f2: (B => C), a: A): C = f2(f(a))
}