package ch09

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q9_5Spec extends AnyFunSpec with Diagrams {
  describe("Q9_5") {
    it("return even list") {
      assert(Q9_5.even(List(0)) == List(0))
      assert(Q9_5.even(List(1)) == List())
      assert(Q9_5.even(List(1, 2, 3, 4)) == List(2, 4))
    }
  }
}
