package ch12

object Q12_3 {
  def shokika(list: List[EkiT], startStation: String): List[EkiT] = list match {
    case List() => List()
    case x :: xs =>
      if (x.name == startStation)
        x.copy(distance = 0, interanlStation = List(x.name)) :: xs
      else x :: shokika(xs, startStation)
  }
}
