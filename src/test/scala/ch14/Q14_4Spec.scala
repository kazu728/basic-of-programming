package ch14

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import ch10.Gakusei
class Q14_4Spec extends AnyFunSpec with Diagrams {
  describe("Q14_4") {
    it("returs amount of score") {
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

      assert(Q14_4.gakuseiSum(list1) == 0)
      assert(Q14_4.gakuseiSum(list2) == 70)
      assert(Q14_4.gakuseiSum(list3) == 155)
      assert(Q14_4.gakuseiSum(list4) == 235)
    }
  }
}
