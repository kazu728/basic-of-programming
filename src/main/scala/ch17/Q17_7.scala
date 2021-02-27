package ch17

object Q17_7 {

  /** 受け取った木のnodeと葉の合計を返す
    *
    * @param tree
    * @return
    */
  def treeLength(tree: Tree): Int = tree match {
    case Empty()              => 0
    case Leaf(n)              => 1
    case Node(left, n, right) => treeLength(left) + 1 + treeLength(right)
  }

}
