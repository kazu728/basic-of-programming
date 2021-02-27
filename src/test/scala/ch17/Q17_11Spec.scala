package ch17

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q17_11Spec extends AnyFunSpec with Diagrams {
  describe("Q17_11") {
    it("retuns distance") {
      assert(Q17_11.assoc("後楽園", List()) == Double.MaxValue)
      assert(Q17_11.assoc("後楽園", List(("新大塚", 1.2), ("後楽園", 1.8))) == 1.8)
      assert(
        Q17_11.assoc("池袋", List(("新大塚", 1.2), ("後楽園", 1.8))) == Double.MaxValue
      )
    }
  }
}
