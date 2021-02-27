package ch17

object Q17_8 {

  /** 受け取った木の深さを返す
    *
    * @param tree
    * @return
    */
  def treeDepth(tree: Tree): Int = tree match {
    case Empty() => 0
    case Leaf(n) => 0
    case Node(left, n, right) =>
      Math.max(1 + treeDepth(left), 1 + treeDepth(right))
  }
}
