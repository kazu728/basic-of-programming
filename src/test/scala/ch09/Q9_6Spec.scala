package ch09

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q9_6Spec extends AnyFunSpec with Diagrams {
  describe("Q9_6") {
    it("returns concatted literal") {
      assert(Q9_6.concat(List()) == "")
      assert(Q9_6.concat(List("a", "b", "c")) == "abc")
      assert(Q9_6.concat(List("春", "夏", "秋", "冬")) == "春夏秋冬")
    }
  }
}
