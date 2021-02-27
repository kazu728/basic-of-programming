package ch17

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q17_7Spec extends AnyFunSpec with Diagrams {
  describe("Q17_7") {
    it("returns tree length") {
      val tree = Node(Leaf(3), 5, Node(Leaf(1), 2, Leaf(4)))
      val tree2 = Node(Leaf(3), 5, Leaf(2))
      val empty = Empty()
      val leaf = Leaf(1)

      assert(Q17_7.treeLength(tree) == 5)
      assert(Q17_7.treeLength(tree2) == 3)
      assert(Q17_7.treeLength(empty) == 0)
      assert(Q17_7.treeLength(leaf) == 1)
    }
  }
}
