package ch13

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch12.EkiT
class Q13_6Spec extends AnyFunSpec with Diagrams {
  describe("Q13_6") {

    val d = EkiT("池袋", Double.MaxValue, List())
    val e = EkiT("新大塚", 1.2, List("新大塚", "茗荷谷"))
    val f = EkiT("茗荷谷", 0, List("茗荷谷"))
    val g = EkiT("後楽園", Double.MaxValue, List())

    it("returns updated station") {
      assert(Q13_6.koushin1(f, d) == d)
      assert(Q13_6.koushin1(f, e) == e)
      assert(Q13_6.koushin1(f, f) == f)
      assert(Q13_6.koushin1(f, g) == EkiT("後楽園", 1.8, List("後楽園", "茗荷谷")))

    }
  }
}