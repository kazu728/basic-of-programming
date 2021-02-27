package ch17

object Q17_6 {

  /** 木と関数を受け取って、全てのnodeに関数を適用した木を返す
    *
    * @param tree
    * @param f
    * @return
    */
  def treeMap(tree: Tree, f: Int => Int): Tree = tree match {
    case Empty()              => Empty()
    case Leaf(n)              => Leaf(f(n))
    case Node(left, n, right) => Node(treeMap(left, f), f(n), treeMap(right, f))
  }
}
