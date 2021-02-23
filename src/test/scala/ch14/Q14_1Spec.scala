package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q14_1Spec extends AnyFunSpec with Diagrams {
  describe("Q14_1") {
    it("returns filetered list") {

      assert(Q14_1.even(List(1, 2, 3, 4)) == List(2, 4))
      assert(Q14_1.even(List(1, 2, 3, 4, 5, 6)) == List(2, 4, 6))
      assert(Q14_1.even(List()) == List())
    }
  }
}
