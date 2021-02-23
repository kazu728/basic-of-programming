package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch10.Gakusei
class Q14_2Spec extends AnyFunSpec with Diagrams {
  describe("Q14_2") {

    val f = (gakusei: Gakusei) => gakusei.evaluation == 'A'

    val list1 = List()
    val list2 = List(Gakusei("asai", 70, 'B'))
    val list3 = List(
      Gakusei("asai", 70, 'B'),
      Gakusei("kaneko", 85, 'A')
    )
    val list4 = List(
      Gakusei("yoshida", 80, 'A'),
      Gakusei("asai", 70, 'B'),
      Gakusei("kaneko", 85, 'A')
    )
    it("returns count") {
      assert(Q14_2.countA(list1, f) == 0)
      assert(Q14_2.countA(list2, f) == 0)
      assert(Q14_2.countA(list3, f) == 1)
      assert(Q14_2.countA(list4, f) == 2)
    }
  }
}
