package ch17

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec

class Q17_5Spec extends AnyFunSpec with Diagrams {
  describe("Q17_5") {
    it("returns tree double") {
      val tree = Node(Leaf(3), 5, Node(Leaf(1), 2, Leaf(4)))

      assert(
        Q17_5.treeDouble(tree) == Node(Leaf(6), 10, Node(Leaf(2), 4, Leaf(8)))
      )
    }
  }
}
