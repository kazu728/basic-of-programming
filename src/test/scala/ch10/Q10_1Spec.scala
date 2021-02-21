package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q10_1Spec extends AnyFunSpec with Diagrams {
  describe("Q10_1") {
    it("returns inserted list") {
      assert(Q10_1.insert(List(1, 3, 4, 7, 8), 5) == List(1, 3, 4, 5, 7, 8))
      assert(Q10_1.insert(List(1), 5) == List(1, 5))
      assert(Q10_1.insert(List(2), 1) == List(1, 2))
      assert(Q10_1.insert(List(), 5) == List(5))
    }
  }
}
