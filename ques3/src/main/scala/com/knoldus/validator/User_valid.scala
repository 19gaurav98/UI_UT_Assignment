package com.knoldus.validator

import com.knoldus.database.{CompanyRead, UserRead}
import com.knoldus.models.User

class User_valid(userReadTo: UserRead, validateEmail: Email_valid, companyReadDto: CompanyRead) {

  def userValidator(user: User): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(user.email)
    val nameValid = userReadTo.getUserByName(user.firstName)

    val companyName = companyReadDto.getCompanyByName(user.companyName)

    if (emailValid == true && !nameValid.isEmpty && !companyName.isEmpty)
      true
    else
      false

  }
}