package ch05

object Q5_3 {

  /** 時間を受け取って星座を返す
    */
  def seiza(month: Int, date: Int): String = month match {
    case 3 if date > 20  => "Aries"
    case 4 if date >= 20 => "Tauras"
    case 5 if date >= 21 => "Gemini"
    case 6 if date >= 22 => "Cancer"
    case 7 if date >= 23 => "Leo"
  }
}
