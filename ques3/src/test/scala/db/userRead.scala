package db

import com.knoldus.database.UserRead
import org.scalatest.flatspec.AnyFlatSpec

class UserReadToSpec extends AnyFlatSpec {
  val user = new UserRead
  "User details " should "be found for valid name" in {
    val res = user.getUserByName("dummy1")
    assert(!res.isEmpty)
  }

  "User details " should " not be found for invalid name" in {
    val res = user.getUserByName("dummy4")
    assert(res.isEmpty)
  }
}