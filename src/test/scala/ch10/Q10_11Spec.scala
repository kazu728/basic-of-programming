package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch09.Q9_10
class Spec extends AnyFunSpec with Diagrams {
  describe("") {
    it("returns distance") {
      assert(Q10_11.getEkikanKyori("根津", "千駄木", Q9_10.globalEkikanList) == 1.0)
      assert(Q10_11.getEkikanKyori("恵比寿", "広尾", Q9_10.globalEkikanList) == 1.5)
      assert(Q10_11.getEkikanKyori("広尾", "恵比寿", Q9_10.globalEkikanList) == 1.5)
      assert(
        Q10_11.getEkikanKyori(
          "恵比寿",
          "梅田",
          Q9_10.globalEkikanList
        ) == Double.MaxValue
      )
    }
  }
}
