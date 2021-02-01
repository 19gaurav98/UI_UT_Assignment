package validator

import com.knoldus.database.EmployeeRead
import com.knoldus.models.Employee
import com.knoldus.request.employeeReq
import com.knoldus.validator.{Email_valid, Emp_valid}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec {

  val employeeRead = new EmployeeRead
  val emailValidat = new Email_valid
  val employeeValid = new Emp_valid(employeeRead, emailValidat)
  val employeeImp = new employeeReq(employeeValid)

  "Employee details" should "send be found for valid Employee" in {
    val employee = Employee("George", "Sharma", 56, "g.s@knoldus.com")
    val res = employeeValid.employeeIsValid(employee)
    assert(res == true)
  }

  "Employee details" should "send be found for invalid Employee" in {
    val employee = Employee("George", "Sharma", 56, "g.s@knoldus.com")
    val res = employeeValid.employeeIsValid(employee)
    assert(res == false)
  }

}