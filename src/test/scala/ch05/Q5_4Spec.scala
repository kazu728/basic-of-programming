package ch05

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q5_4Spec extends AnyFunSpec with Diagrams {

  describe("Q5_4Spec") {
    it("returns 1") { assert(Q5_4.hanbetsusiki(2, 3, 1) == 1) }
  }
}
