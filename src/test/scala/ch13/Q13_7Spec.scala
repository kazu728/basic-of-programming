package ch13

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch12.EkiT
class Q13_7Spec extends AnyFunSpec with Diagrams {
  describe("Q13_7") {
    val station1 = EkiT("池袋", Double.MaxValue, List())
    val station2 = EkiT("新大塚", 1.2, List("新大塚", "茗荷谷"))
    val station3 = EkiT("茗荷谷", 0, List("茗荷谷"))
    val station4 = EkiT("後楽園", Double.MaxValue, List())

    val list = List(station1, station2, station3, station4)

    it("retuns undecided station") {
      assert(Q13_7.koushin(station2, List()) == List())
      assert(
        Q13_7.koushin(station2, list) == List(
          EkiT(
            "池袋",
            3.0,
            List("池袋", "新大塚", "茗荷谷")
          ),
          station2,
          station3,
          station4
        )
      )
    }
  }
}
