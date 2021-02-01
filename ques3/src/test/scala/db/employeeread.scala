package db

import com.knoldus.database.EmployeeRead
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeReadtoSpec extends AnyFlatSpec {

  val employee = new EmployeeRead

  "Details " should "found are not valid" in {
    val res = employee.getEmployeeByName("name")
    assert(res.isEmpty)
  }
}