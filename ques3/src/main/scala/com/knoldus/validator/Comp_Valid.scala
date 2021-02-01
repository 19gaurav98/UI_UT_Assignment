package com.knoldus.validator

import com.knoldus.database.CompanyRead
import com.knoldus.models.Company

class Comp_Valid(companyRead: CompanyRead, validateEmail: Email_valid) {

  // Checking if

  def companyIsValid(company: Company): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(company.emailId)

    val nameValid = companyRead.getCompanyByName(company.name)

    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false

  }

}