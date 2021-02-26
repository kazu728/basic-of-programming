package ch16

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q16_1Spec extends AnyFunSpec with Diagrams {
  describe("Q16_1") {
    val list1 = List()
    val list2 = List(3, 2, 1, 4)
    it("returns amount of list") {
      assert(Q16_1.sumList(list1) == List())
      assert(Q16_1.sumList(list2) == List(3, 5, 6, 10))
    }
  }
}
