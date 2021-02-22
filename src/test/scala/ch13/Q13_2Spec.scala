package ch13

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch08.PersonT

class Q13_2Spec extends AnyFunSpec with Diagrams {
  describe("Q13_2") {
    it("retuens name list") {
      val list1 = List(
        PersonT("foo", 1.67f, 60, (10, 10), "A"),
        PersonT("bar", 1.67f, 60, (10, 10), "B")
      )
      val list2 = List(
        PersonT("あ", 1.67f, 60, (10, 10), "A"),
        PersonT("い", 1.67f, 60, (10, 10), "B"),
        PersonT("う", 1.67f, 60, (10, 10), "A"),
        PersonT("え", 1.67f, 60, (10, 10), "O")
      )
      assert(Q13_2.personNamae(list1) == List("foo", "bar"))
      assert(Q13_2.personNamae(list2) == List("あ", "い", "う", "え"))
    }
  }
}
