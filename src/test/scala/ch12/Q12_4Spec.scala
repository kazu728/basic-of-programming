package ch12

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.EkimeiT
class Q14_4Spec extends AnyFunSpec with Diagrams {
  describe("Q14_4") {
    it("returns filtered list") {

      val list = List(
        EkimeiT("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
        EkimeiT("東池袋", "ひがしいけぶくろ", "higasiikebukuro", "有楽町線"),
        EkimeiT("池袋", "いけぶくろ", "ikebukuro", "有楽町線")
      )

      assert(
        Q12_4.seiretsu(list) == List(
          EkimeiT("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
          EkimeiT("東池袋", "ひがしいけぶくろ", "higasiikebukuro", "有楽町線")
        )
      )
    }
  }
}
