package request

import com.knoldus.database._
import com.knoldus.models.Employee
import com.knoldus.request.employeeReq
import com.knoldus.validator.{Email_valid, Emp_valid}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplSpec extends AnyFlatSpec {
  val employeeRead = new EmployeeRead
  val emailValidator = new Email_valid
  val employeeValid = new Emp_valid(employeeRead, emailValidator)
  val employeeImp = new employeeReq(employeeValid)

  "Employee details" should "are of valid parameter" in {
    val details = Employee("George", "Sharma", 56, "g.s@knoldus.com")
    val res = employeeImp.createEmployee(details)
    assert(!res.isEmpty)
  }

  "Company details" should "are not of valid parameter" in {
    val details = Employee("George", "Sharma", 56, "g.s@knoldus.infynet")
    val res = employeeImp.createEmployee(details)
    assert(res.isEmpty)
  }
}