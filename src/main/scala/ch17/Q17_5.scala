package ch17

object Q17_5 {

  /** 木を受け取って、木の節の値や葉の値を全て２倍した木を返す
    *
    * @param tree
    * @return
    */
  def treeDouble(tree: Tree): Tree = tree match {
    case Empty() => Empty()
    case Leaf(n) => Leaf(n * 2)
    case Node(left, n, right) =>
      Node(treeDouble(left), n * 2, treeDouble((right)))
  }
}
