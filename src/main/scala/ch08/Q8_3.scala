package ch08

case class PersonT(
    name: String,
    height: Float,
    weight: Int,
    birthday: (Int, Int),
    bloodType: String
)

object Q8_3 {
  val a = PersonT("a", 1.7f, 60, (3, 20), "A")
  val b = PersonT("b", 1.72f, 64, (2, 20), "B")
  val c = PersonT("c", 1.72f, 64, (2, 20), "O")
}
