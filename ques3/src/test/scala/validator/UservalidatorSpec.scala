package validator

import com.knoldus.database.{CompanyRead, UserRead}
import com.knoldus.models.User
import com.knoldus.validator.{Email_valid, User_valid}
import org.scalatest.flatspec.AnyFlatSpec

class UservalidatorSpec extends AnyFlatSpec {

  val companyRead = new CompanyRead

  val userRead = new UserRead
  val emailValidat = new Email_valid
  val userValid = new User_valid(userRead, emailValidat, companyRead)

  "User details" should "send be found for valid parameter" in {
    val dummy1: User = User("dummy1", "l", 19, "dummy1@gmail.com", "Pune")
    val res = userValid.userValidator(dummy1)
    assert(res == true)
  }

  "user details" should "send not be found for invalid parameter" in {
    val dummy2: User = User("dummy1", "l", 19, "dummy1@gmail.com", "Jabalpur")
    val res = userValid.userValidator(dummy2)
    assert(res == false)
  }
}
