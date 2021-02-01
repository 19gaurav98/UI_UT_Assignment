package request

import com.knoldus.database.CompanyRead
import com.knoldus.models.Company
import com.knoldus.request.companyreq
import com.knoldus.validator.{Comp_Valid, Email_valid}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplSpec extends AnyFlatSpec {
  val companyRead = new CompanyRead
  val emailValidate = new Email_valid
  val companyValid = new Comp_Valid(companyRead, emailValidate)
  val companyImp = new companyreq(companyValid)

  "Details" should "found are of valid parameter" in {
    val tcsDetail: Company = Company("TCS", "tcs@tcs.com", "Pune")
    val res = companyImp.createCompany(tcsDetail)
    assert(!res.isEmpty)
  }

  "Company details" should "are not of valid parameter" in {
    val tcsDetail: Company = Company("TCS", "tcs@tcs.infet", "Pune")
    val res = companyImp.createCompany(tcsDetail)
    assert(res.isEmpty)
  }

}