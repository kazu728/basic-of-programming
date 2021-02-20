package ch07

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q7_3Spec extends AnyFunSpec with Diagrams {
  describe("Q7_3") {
    it("returns reversed x point") {
      assert(Q7_3.taishoX(2, 1) == -2)
      assert(Q7_3.taishoX(-3, 1) == 3)
    }
  }
}
