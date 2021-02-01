import org.scalatest.FunSuite

class DivideTest extends FunSuite{
  test("Divide.isDivide") {
    assert(Divide.isDivide(3,0)!=0)
  }

}
