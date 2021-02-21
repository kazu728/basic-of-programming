package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT
class Q10_7Spec extends AnyFunSpec with Diagrams {
  describe("Q10_7") {
    it("returns aggregation of blood type") {
      val list = List(PersonT("foo", 1.67f, 60, (10, 10), "A"))
      val list2 = List()
      val list3 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "O")
      )

      assert(Q10_7.ketuekiShukei(list) == (1, 0, 0, 0))
      assert(Q10_7.ketuekiShukei(list2) == (0, 0, 0, 0))
      assert(Q10_7.ketuekiShukei(list3) == (2, 0, 1, 0))
    }
  }
}
