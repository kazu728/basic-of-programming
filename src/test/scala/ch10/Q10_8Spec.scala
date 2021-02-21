package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT
class Q10_8Spec extends AnyFunSpec with Diagrams {
  describe("Q10_8") {
    it("returns blood type") {
      val list = List(PersonT("foo", 1.67f, 60, (10, 10), "A"))
      val list2 = List()
      val list3 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "O"),
        PersonT("foo", 1.67f, 60, (10, 10), "O")
      )

      assert(Q10_8.saitaKetsueki(list) == "A")
      assert(Q10_8.saitaKetsueki(list2) == "")
      assert(Q10_8.saitaKetsueki(list3) == "O")
    }
  }
}
