import org.scalatest.FunSuite
class EmailValidTest extends FunSuite{

  test("EmailValid.isValid") {
    assert(EmailValid.isValid("gaurav19@gmail.net"))

  }
}




