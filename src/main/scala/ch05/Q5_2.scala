package ch05

import java.time.LocalDateTime

object Q5_2 {

  def jikan(timestamp: LocalDateTime): String =
    if (timestamp.getHour < 12) "am" else "pm"
}
