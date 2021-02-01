package com.knoldus.validator

import com.knoldus.database.EmployeeRead
import com.knoldus.models.Employee

class Emp_valid(employeeRead: EmployeeRead, validateEmail: Email_valid) {

  def employeeIsValid(employee: Employee): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(employee.emailId)
    val nameValid = employeeRead.getEmployeeByName(employee.firstName)
    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false
  }
}
