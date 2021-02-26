package ch16

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q16_2Spec extends AnyFunSpec with Diagrams {
  describe("Q16_2") {
    it("returns reversed list") {
      val list1 = List(1, 2, 3, 4, 5)
      assert(Q16_2.reverse(list1) == List(5, 4, 3, 2, 1))

      val list = List(1, 2, 3, 4, 5)
      def sum(a: Int, b: Int) = a + b

      assert(
        Q16_2.foldLeft(sum, 0, list) == 15
      )
    }
  }
}
