import org.scalatest.FunSuite

class fiboTest extends FunSuite{
  test("getFibo.getFibonacciNaive") {
    assert(getFibo.getFibonacciNaive(0) === 0)
    assert(getFibo.getFibonacciNaive(1) === 1)
    assert(getFibo.getFibonacciNaive(2) === 1)
    assert(getFibo.getFibonacciNaive(3) === 2)
    assert(getFibo.getFibonacciNaive(4) === 3)
    assert(getFibo.getFibonacciNaive(6) === 8)
    assert(getFibo.getFibonacciNaive(10) === 55)
    assert(getFibo.getFibonacciNaive(12) === 144)
  }

}
