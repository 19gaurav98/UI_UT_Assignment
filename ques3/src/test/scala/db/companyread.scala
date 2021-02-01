package db

import com.knoldus.database.CompanyRead
import org.scalatest.flatspec.AnyFlatSpec

class companyread extends AnyFlatSpec {

  val company = new CompanyRead()

  //These are the testcases for those company whose name is valid

  "Details" should "found is of valid company" in {
    val res = company.getCompanyByName("Tcs")
    assert(!res.isEmpty)
  }

  // These are testcases for which the company name is not valid

  "Details " should "found are not valid " in {
    val res = company.getCompanyByName("name")
    assert(res.isEmpty)
  }

}