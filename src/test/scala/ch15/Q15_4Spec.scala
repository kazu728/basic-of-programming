package ch15

import ch12.EkiT
import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q15_4Spec extends AnyFunSpec with Diagrams {
  describe("Q15_4") {
    val station1 = EkiT("池袋", Double.MaxValue, List())
    val station2 = EkiT("新大塚", 1.2, List("新大塚", "茗荷谷"))
    val station3 = EkiT("茗荷谷", 0, List("茗荷谷"))
    val station4 = EkiT("後楽園", Double.MaxValue, List())

    val list = List(station1, station2, station3, station4)
    it("retuns minimum distance") {
      assert(
        Q15_4
          .saitanWoBunri(list) == (station3, List(station1, station2, station4))
      )
    }
  }
}
