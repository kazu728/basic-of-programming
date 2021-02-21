package ch12

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.EkimeiT
class Q12_2Spec extends AnyFunSpec with Diagrams {
  describe("Q12_2") {
    it("retuns eki list") {

      val list1 = List(
        EkimeiT("代々木上原", "よよぎうえはら", "yoyogiuehara", "千代田線"),
        EkimeiT("代々木公園", "よよぎこうえん", "yoyogikouen", "千代田線")
      )

      assert(
        Q12_2.makeEkiList(list1) == List(
          EkiT("代々木上原", Double.MaxValue, List()),
          EkiT("代々木公園", Double.MaxValue, List())
        )
      )
    }
  }
}
