package ch05

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import java.time.LocalDateTime

class Q5_2Spec extends AnyFunSpec with Diagrams {

  describe("Q5_2Spec") {
    it("returns am") {
      assert(Q5_2.jikan(LocalDateTime.of(2021, 2, 17, 11, 59)) == "am")

    }

    it("returns pm") {
      assert(Q5_2.jikan(LocalDateTime.of(2021, 2, 17, 12, 0)) == "pm")
    }
  }
}
