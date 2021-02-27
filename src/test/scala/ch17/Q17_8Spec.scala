package ch17

import org.scalatest.diagrams.Diagrams
import org.scalatest.funspec.AnyFunSpec
class Q17_8Spec extends AnyFunSpec with Diagrams {
  describe("Q17_8") {
    it("returns tree depth") {
      val empty = Empty()
      val leaf = Leaf(1)
      val tree = Node(Leaf(3), 5, Node(Leaf(1), 2, Leaf(4)))
      val tree2 = Node(Leaf(3), 5, Leaf(2))
      val tree3 = Node(Leaf(3), 5, Node(Node(Empty(), 2, Leaf(1)), 2, Leaf(4)))

      assert(Q17_8.treeDepth(empty) == 0)
      assert(Q17_8.treeDepth(leaf) == 0)
      assert(Q17_8.treeDepth(tree) == 2)
      assert(Q17_8.treeDepth(tree2) == 1)
      assert(Q17_8.treeDepth(tree3) == 3)
    }
  }
}
