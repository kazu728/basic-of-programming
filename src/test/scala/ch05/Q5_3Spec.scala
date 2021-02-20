package ch05

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class Q5_3Spec extends AnyFunSpec with Diagrams {

  describe("Q5_3Spec") {
    it("returns Aries") { assert(Q5_3.seiza(3, 21) == "Aries") }
    it("returns Tauras") { assert(Q5_3.seiza(4, 20) == "Tauras") }
    it("returns Gemini") { assert(Q5_3.seiza(5, 21) == "Gemini") }
    it("returns Cancer") { assert(Q5_3.seiza(6, 22) == "Cancer") }
    it("Leo") { assert(Q5_3.seiza(7, 23) == "Leo") }
  }
}