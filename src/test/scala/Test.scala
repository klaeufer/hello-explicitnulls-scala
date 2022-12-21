import org.scalatest.wordspec.AnyWordSpec

class Test extends AnyWordSpec:

  "An alpha word even" when {
    "trimmed" should {
      "have length 5" in {
        assert(Main.hello.length == 5)
      }
    }
  }

end Test

