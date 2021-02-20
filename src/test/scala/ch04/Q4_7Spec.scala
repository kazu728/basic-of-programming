package ch04

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q4_7Spec extends AnyFunSpec with Diagrams {
  describe("Q4_7") {
    it("returns legs of multipled number") {
      assert(Q4_7.getNumberOfLegs(1, 2) == 10)
      assert(Q4_7.getNumberOfLegs(2, 1) == 8)
      assert(Q4_7.getNumberOfLegs(3, 3) == 18)
    }
  }
}
