package ch07

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q7_1Spec extends AnyFunSpec with Diagrams {

  describe("Q7_1Spec") {
    it("returns total and average ") {
      assert(Q7_1.goukeiToHeikin(50, 50, 50, 50, 50) == (250, 50))
    }

  }
}
