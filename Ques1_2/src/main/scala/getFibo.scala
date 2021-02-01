object getFibo extends App{
  def getFibonacciNaive(index: Int): Int = {
    if (index <= 0) {
      0
    } else if (index == 1) {
      1
    } else {
      getFibonacciNaive(index - 1) + getFibonacciNaive(index - 2)
    }
  }


}
