package ch04

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q4_6Spec extends AnyFunSpec with Diagrams {

  describe("Q4_6Spec") {
    it("returns tsuru's legs ") {
      assert(Q4_6.tsuruNoAshi(1) == 2)
      assert(Q4_6.tsuruNoAshi(2) == 4)
      assert(Q4_6.tsuruNoAshi(3) == 6)
    }

    it("returns kame's legs ") {
      assert(Q4_6.kameNoAshi(1) == 4)
      assert(Q4_6.kameNoAshi(2) == 8)
      assert(Q4_6.kameNoAshi(3) == 12)
    }
  }
}
