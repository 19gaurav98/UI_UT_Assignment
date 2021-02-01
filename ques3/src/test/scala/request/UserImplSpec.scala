package request

import com.knoldus.database.{CompanyRead, UserRead}
import com.knoldus.models.User
import com.knoldus.request.UserReq
import com.knoldus.validator.{Email_valid, User_valid}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplSpec extends AnyFlatSpec {

  val companyRead = new CompanyRead


  val userRead = new UserRead
  val emailValidat = new Email_valid
  val userValid = new User_valid(userRead, emailValidat, companyRead)
  val userImp = new UserReq(userValid)

  "User details" should "send be found for valid parameter" in {
    val user1: User = User("dummy1", "l", 19, "dummy1@gmail.com", "Pune")
    val res = userImp.createUser(user1)
    println("\n\nRes :  " + res + "\n\n")
    assert(!res.isEmpty)
  }

  "user details" should "send not be found for invalid parameter" in {
    val user1: User = User("dummy1", "l", 19, "dummy1@gmail.com", "Pune3334")
    val res = userImp.createUser(user1)
    println("\n\n" + res + "\n\n")
    assert(res.isEmpty)
  }
}
