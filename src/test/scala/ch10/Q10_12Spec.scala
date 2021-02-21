package ch10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Q10_12Spec extends AnyFunSpec with Diagrams {
  describe("Q10_12") {
    it("returns distance string") {
      assert(
        Q10_12.kyroiWoHyoji(
          "uenohirokoji",
          "suehirocho"
        ) == "上野広小路駅から末広町駅までは0.6kmです"
      )
      assert(
        Q10_12.kyroiWoHyoji("uenohirokoji", "ebisu") == "上野広小路駅と恵比寿駅はつながっていません"
      )
    }
  }
}
