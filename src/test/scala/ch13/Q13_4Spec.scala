package ch13

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Spec extends AnyFunSpec with Diagrams {
  describe("") {
    it("returns composed result") {
      val time2 = (n: Int) => n * 2
      val add3 = (n: Int) => n + 3
      val add5 = (n: Int) => n + 5
      assert(Q13_4.compose(add3, time2, 4) == 14)
      assert(Q13_4.compose(add3, add5, 4) == 12)
    }
  }
}
