package ch11

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q11_1Spec extends AnyFunSpec with Diagrams {
  describe("Q11_1") {
    it("returns sum of square") {
      assert(Q11_1.sumOfSquare(3) == 14)
      assert(Q11_1.sumOfSquare(4) == 30)
    }
  }
}
