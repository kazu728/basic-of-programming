package ch17

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q17_6Spec extends AnyFunSpec with Diagrams {
  describe("Q17_6") {
    it("returns mapped tree") {
      val tree = Node(Leaf(3), 5, Node(Leaf(1), 2, Leaf(4)))
      val f = (n: Int) => n * 2
      val f2 = (n: Int) => n * 3

      assert(
        Q17_6.treeMap(tree, f) == Node(Leaf(6), 10, Node(Leaf(2), 4, Leaf(8)))
      )
      assert(
        Q17_6.treeMap(tree, f2) == Node(Leaf(9), 15, Node(Leaf(3), 6, Leaf(12)))
      )
    }
  }
}
