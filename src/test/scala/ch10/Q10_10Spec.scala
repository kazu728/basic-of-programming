package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch09.Q9_9
class Q10_10Spec extends AnyFunSpec with Diagrams {
  describe("Q10_10") {
    it("returns kanji ") {
      assert(Q10_10.romajiToKanji("hibiya", Q9_9.globalEkimeiList) == "日比谷")
      assert(
        Q10_10.romajiToKanji("tameikesannou", Q9_9.globalEkimeiList) == "溜池山王"
      )
      assert(
        Q10_10.romajiToKanji("umeda", Q9_9.globalEkimeiList) == ""
      )
    }
  }
}
