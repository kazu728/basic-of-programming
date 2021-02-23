package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q14_15Spec extends AnyFunSpec with Diagrams {
  describe("Q14_15") {
    it("returns amount of number") {
      assert(Q14_15.oneToN(5) == 15)
      assert(Q14_15.oneToN(4) == 10)
    }
  }
}
