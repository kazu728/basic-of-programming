package ch07

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q7_2Spec extends AnyFunSpec with Diagrams {
  describe("Q7_2") {
    it("returns name and evaluation") {
      assert(Q7_2.seiseki(("テスト", 5)) == "テストさんの成績は5です")
    }
  }
}