package ch10

import ch08.PersonT

object Q10_7 {

  def ketuekiShukei(list: List[PersonT]): (Int, Int, Int, Int) = list match {
    case List() => (0, 0, 0, 0)
    case x :: xs => {
      ketuekiShukei(xs) match {
        case (a, b, o, ab) => {
          x.bloodType match {
            case "A"  => (a + 1, b, o, ab)
            case "B"  => (a, b + 1, o, ab)
            case "O"  => (a, b, o + 1, ab)
            case "AB" => (a + 1, b, o, ab + 1)
          }
        }
      }
    }
  }
}
