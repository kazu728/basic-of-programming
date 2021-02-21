package ch12

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q12_3Spec extends AnyFunSpec with Diagrams {
  describe("Q12_3") {
    it("returns initialized list") {
      val list1 = List(
        EkiT("代々木上原", Double.MaxValue, List()),
        EkiT("代々木公園", Double.MaxValue, List())
      )
      assert(
        Q12_3.shokika(list1, "代々木上原") == List(
          EkiT("代々木上原", 0, List("代々木上原")),
          EkiT("代々木公園", Double.MaxValue, List())
        )
      )
      assert(
        Q12_3.shokika(list1, "代々木公園") == List(
          EkiT("代々木上原", Double.MaxValue, List()),
          EkiT("代々木公園", 0, List("代々木公園"))
        )
      )
    }
  }
}
