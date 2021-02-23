package ch15

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q15_2Spec extends AnyFunSpec with Diagrams {
  describe("Q15_2") {
    it("retunrs greatest common divisor") {
      assert(
        Q15_2.gcd(24, 12) == 12
      )
      assert(
        Q15_2.gcd(12, 8) == 4
      )
      assert(
        Q15_2.gcd(10, 3) == 1
      )
    }
  }
}
