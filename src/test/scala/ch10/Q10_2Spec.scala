package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q10_2Spec extends AnyFunSpec with Diagrams {
  describe("Q10_2") {
    it("returns sorted list") {
      assert(Q10_2.insSort(List(5, 1)) == List(1, 5))
      assert(Q10_2.insSort(List(5, 3, 8, 7, 1, 4)) == List(1, 3, 4, 5, 7, 8))
    }
  }
}
