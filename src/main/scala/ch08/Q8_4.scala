package ch08

object Q8_4 {

  def ketuekiHyoji(person: PersonT): String = person match {
    case PersonT(name, height, weight, birthday, bloodType) =>
      s"${name}さんの血液型は${bloodType}型です"
  }
}
