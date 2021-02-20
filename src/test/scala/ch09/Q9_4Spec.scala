package ch09

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q9_4Spec extends AnyFunSpec with Diagrams {
  describe("Q9_4") {
    it("returns list length") {
      assert(Q9_4.length(List()) == 0)
      assert(Q9_4.length(List(2)) == 1)
      assert(Q9_4.length(List(1, 2)) == 2)
    }
  }
}
