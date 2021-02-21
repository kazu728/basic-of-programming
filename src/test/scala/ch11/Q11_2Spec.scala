package ch11

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q11_2Spec extends AnyFunSpec with Diagrams {
  describe("Q11_2") {
    it("retuns calculated value") {
      assert(Q11_2.calc(1) == 5)
      assert(Q11_2.calc(2) == 9)
    }
  }
}
