package validator

import com.knoldus.database.CompanyRead
import com.knoldus.models.Company
import com.knoldus.validator.{Comp_Valid, Email_valid}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorSpec extends AnyFlatSpec {
  val companyRead = new CompanyRead
  val emailValidat = new Email_valid
  val companyValid = new Comp_Valid(companyRead, emailValidat)

  "Company details" should "send be found for valid parameter" in {
    val TcsComp: Company = Company("TCS", "tcs@tcs.com", "Pune")
    val res = companyValid.companyIsValid(TcsComp)
    assert(res == true)
  }

  "Company details" should "send not be found for invalid parameter" in {
    val TcsComp: Company = Company("TCS", "tcs@tcs.infynet", "Pune")
    val res = companyValid.companyIsValid(TcsComp)
    assert(res == false)
  }

}