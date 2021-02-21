package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT
class Q10_3Spec extends AnyFunSpec with Diagrams {
  describe("Q10_3") {
    it("returns sorted list") {
      val list = List(
        PersonT("a", 1.7f, 60, (3, 20), "A"),
        PersonT("b", 1.72f, 70, (2, 20), "B"),
        PersonT("c", 1.72f, 64, (2, 20), "O")
      )
      assert(
        Q10_3.personSort(list) == List(
          PersonT("a", 1.7f, 60, (3, 20), "A"),
          PersonT("c", 1.72f, 64, (2, 20), "O"),
          PersonT("b", 1.72f, 70, (2, 20), "B")
        )
      )
    }
  }
}
