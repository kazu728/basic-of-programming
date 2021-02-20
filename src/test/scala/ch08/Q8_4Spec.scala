package ch08

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q8_4Spec extends AnyFunSpec with Diagrams {
  describe("Q8_4") {
    it("returns name with blood type") {
      assert(Q8_4.ketuekiHyoji(PersonT("foo", 1.67f, 60, (10, 10), "A")) == "fooさんの血液型はA型です")
    }
  }
}
