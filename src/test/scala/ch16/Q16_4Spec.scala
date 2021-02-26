package ch16

import ch12.EkiT
import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
import ch09.Q9_10
class Q16_4Spec extends AnyFunSpec with Diagrams {
  describe("Q16_4") {
    it("returns eki list") {

      val station1 = EkiT("池袋", Double.MaxValue, List())
      val station2 = EkiT("新大塚", 1.2, List("新大塚", "茗荷谷"))
      val station3 = EkiT("茗荷谷", 0, List("茗荷谷"))
      val station4 = EkiT("後楽園", Double.MaxValue, List())

      val list = List(station1, station2, station3, station4)

      assert(Q16_4.dijkstraMain(List(), Q9_10.globalEkikanList) == List())
      assert(
        Q16_4.dijkstraMain(list, Q9_10.globalEkikanList) == List(
          station3,
          station2,
          EkiT("後楽園", 1.8, List("後楽園", "茗荷谷")),
          EkiT(
            "池袋",
            3.0,
            List("池袋", "新大塚", "茗荷谷")
          )
        )
      )
    }
  }
}
