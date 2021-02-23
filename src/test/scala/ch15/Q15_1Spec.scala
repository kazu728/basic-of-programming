package ch15

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q15_1Spec extends AnyFunSpec with Diagrams {
  describe("Q15_1") {
    it("returns sorted list") {
      val list1 = List()
      val list2 = List(1)
      val list3 = List(1, 2)
      val list4 = List(2, 1)
      val list5 = List(5, 4, 9, 8, 2, 3)
      val list6 = List(1, 1)
      assert(Q15_1.sort(list1) == List())
      assert(Q15_1.sort(list2) == List(1))
      assert(Q15_1.sort(list3) == List(1, 2))
      assert(Q15_1.sort(list4) == List(1, 2))
      assert(Q15_1.sort(list5) == List(2, 3, 4, 5, 8, 9))
      assert(Q15_1.sort(list6) == List(1, 1))
    }
  }
}
