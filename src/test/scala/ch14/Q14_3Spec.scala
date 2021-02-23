package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q14_3Spec extends AnyFunSpec with Diagrams {
  describe("Q14_3") {
    it("returns concat value") {

      assert(Q14_3.concat(List(), "") == "")
      assert(Q14_3.concat(List("a", "b", "c"), "") == "abc")
      assert(Q14_3.concat(List("春", "夏", "秋", "冬"), "") == "春夏秋冬")
    }
  }
}
