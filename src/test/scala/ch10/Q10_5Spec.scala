package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q10_5Spec extends AnyFunSpec with Diagrams {
  describe("Q10_5") {
    it("returns max score student") {
      val list = List(Gakusei("foo", 60, 'B'), Gakusei("bar", 90, 'A'))
      val list2 = List(Gakusei("foo", 60, 'B'))

      assert(Q10_5.gakuseiMax(list) == Gakusei("bar", 90, 'A'))
      assert(Q10_5.gakuseiMax(list2) == Gakusei("foo", 60, 'B'))
    }
  }
}
