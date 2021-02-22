package ch13

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT
class Q13_1Spec extends AnyFunSpec with Diagrams {
  describe("Q13_1") {
    it("retuns number of args bloodtype") {

      val list1 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "B")
      )
      val list2 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "B"),
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "O")
      )

      assert(Q13_1.countKetsueki(list1, "A") == 1)
      assert(Q13_1.countKetsueki(list1, "O") == 0)
      assert(Q13_1.countKetsueki(list2, "A") == 2)
      assert(Q13_1.countKetsueki(list2, "AB") == 0)
    }
  }
}
