package ch17

sealed trait EkikanTree

case class EmptyT() extends EkikanTree
case class EkikanNode(name: String, list: List[(String, Double)]) extends EkikanTree
