package ch17

sealed trait Tree

case class Empty() extends Tree
case class Leaf(n: Int) extends Tree
case class Node(left: Tree, n: Int, right: Tree) extends Tree
