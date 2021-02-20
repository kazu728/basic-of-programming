package ch09

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT
class Q9_7Spec extends AnyFunSpec with Diagrams {
  describe("Q9_7") {
    it("returns number of blood type A") {
      val list1 = List(PersonT("foo", 1.67f, 60, (10, 10), "A"))
      val list2 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "B")
      )
      val list3 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("foo", 1.67f, 60, (10, 10), "B"),
        PersonT("foo", 1.67f, 60, (10, 10), "A")
      )
      val list4 = List()

      assert(Q9_7.countKetsuekiA(list1) == 1)
      assert(Q9_7.countKetsuekiA(list2) == 1)
      assert(Q9_7.countKetsuekiA(list3) == 2)
      assert(Q9_7.countKetsuekiA(list4) == 0)
    }
  }
}
