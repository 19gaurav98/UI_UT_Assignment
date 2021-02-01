package validator

import com.knoldus.validator.Email_valid
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorSpec extends AnyFlatSpec {

  "email id" should "send success for valid email" in {
    val email = (new Email_valid).emailIdIsValid("g.s@knoldus.com")
    assert(email == true)
  }

  "email id" should "send failure for invalid email" in {
    val email = (new Email_valid).emailIdIsValid("g.s@knoldus.infynet")
    assert(email == false)
  }
}