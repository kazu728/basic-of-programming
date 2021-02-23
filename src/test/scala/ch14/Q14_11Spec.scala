package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.EkimeiT
import ch12.EkiT
class Q14_11Spec extends AnyFunSpec with Diagrams {
  describe("Q14_11") {
    it("returns eki list") {
      val list1 = List(
        EkimeiT("代々木上原", "よよぎうえはら", "yoyogiuehara", "千代田線"),
        EkimeiT("代々木公園", "よよぎこうえん", "yoyogikouen", "千代田線")
      )

      assert(
        Q14_11.makeEkiList(list1) == List(
          EkiT("代々木上原", Double.MaxValue, List()),
          EkiT("代々木公園", Double.MaxValue, List())
        )
      )

      val list2 = List(
        EkiT("代々木上原", Double.MaxValue, List()),
        EkiT("代々木公園", Double.MaxValue, List())
      )
      assert(
        Q14_11.shokika(list2, "代々木上原") == List(
          EkiT("代々木上原", 0, List("代々木上原")),
          EkiT("代々木公園", Double.MaxValue, List())
        )
      )
      assert(
        Q14_11.shokika(list2, "代々木公園") == List(
          EkiT("代々木上原", Double.MaxValue, List()),
          EkiT("代々木公園", 0, List("代々木公園"))
        )
      )
    }
  }
}
