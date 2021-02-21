package ch10

import ch08.EkimeiT

object Q10_10 {

  /** ローマ字名から漢字の駅名を探す
    *
    * @param romaji
    * @param globalEkimeiList
    * @return
    */
  def romajiToKanji(romaji: String, globalEkimeiList: List[EkimeiT]): String =
    globalEkimeiList match {
      case List() => ""
      case x :: xs =>
        if (x.romaji == romaji) x.kanji else romajiToKanji(romaji, xs)
    }
}
