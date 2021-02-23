package ch15

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q15_3Spec extends AnyFunSpec with Diagrams {
  describe("Q15_3") {
    it("retuns prime number list") {

      def enumerate(n: Int, m: Int): List[Int] = n match {
        case n if n == m => List(m)
        case n           => n :: enumerate(n + 1, m)
      }

      val list1 = enumerate(2, 9)
      val list2 = enumerate(2, 17)
      
      assert(Q15_3.sieve(list1) == List(2, 3, 5, 7))
      assert(Q15_3.sieve(list2) == List(2, 3, 5, 7, 11, 13, 17))
    }
  }
}
