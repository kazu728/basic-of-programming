package ch07

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q7_4Spec extends AnyFunSpec with Diagrams {
  describe("Q7_4") {
    it("returns middle point") {
      assert(Q7_4.chuten((0, 0), (1, 1)) == (0.5, 0.5))
    }
  }
}
