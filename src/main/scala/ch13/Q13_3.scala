package ch13

object Q13_3 {

  def f1[A](a: A): A = a
  def f2[A, B](a: A, b: B): A = a
  def f3[A, B](a: A, b: B): B = b
  def f4[A, B](a: A, f: (A => B)): B = f(a)
  def f5[A, B, C](f: (A => B), f2: (B => C), a: A) = f2(f(a))

}
