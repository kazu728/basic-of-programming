package ch10

import ch09.Q9_9
import ch09.Q9_10

object Q10_12 {

  /** 受け取った２つのローマ字の駅名から駅間を返す
    *
    * @param station1
    * @param station2
    * @return
    */
  def kyroiWoHyoji(station1: String, station2: String): String = {
    val (station1Kanji, station2Kanji) =
      (
        Q10_10.romajiToKanji(station1, Q9_9.globalEkimeiList),
        Q10_10.romajiToKanji(station2, Q9_9.globalEkimeiList)
      )
    Q10_11.getEkikanKyori(
      station1Kanji,
      station2Kanji,
      Q9_10.globalEkikanList
    ) match {
      case Double.MaxValue => s"${station1Kanji}駅と${station2Kanji}駅はつながっていません"
      case distance        => s"${station1Kanji}駅から${station2Kanji}駅までは${distance}kmです"
    }
  }
}
