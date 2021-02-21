package ch10

import ch08.PersonT

object Q10_3 {

  def insert(list: List[PersonT], person: PersonT): List[PersonT] = list match {
    case List() => List(person)
    case x :: xs =>
      if (x.weight < person.weight) x :: insert(xs, person) else person :: list
  }

  def personSort(list: List[PersonT]): List[PersonT] = list match {
    case List()  => List()
    case x :: xs => insert(personSort(xs), x)
  }
}
