package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q10_9Spec extends AnyFunSpec with Diagrams {
  describe("Q10_9") {
    it("returns true") {
      assert(Q10_9.equalLength(List(), List()) == true)
      assert(Q10_9.equalLength(List(2, 6), List(1, 9)) == true)
    }

    it("returns false"){
      assert(Q10_9.equalLength(List(), List(1)) == false)
      assert(Q10_9.equalLength(List(2, 6), List(1, 9, 9)) == false)
    }
  }
}
