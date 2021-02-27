package ch17

object Q17_11 {

  def assoc(
      stationName: String,
      nameWithDistance: List[(String, Double)]
  ): Double = nameWithDistance match {
    case List() => Double.MaxValue
    case (name, distance) :: xs =>
      if (name == stationName) distance else assoc(stationName, xs)
  }
}
