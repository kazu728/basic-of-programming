package ch04

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q4_8Spec extends AnyFunSpec with Diagrams {
  describe("Q4_8") {
    it("solves tsurukame") {
      assert(Q4_8.tsurukame(3, 12) == 0)
      assert(Q4_8.tsurukame(3, 10) == 1)
      assert(Q4_8.tsurukame(3, 8) == 2)
    }
  }
}
