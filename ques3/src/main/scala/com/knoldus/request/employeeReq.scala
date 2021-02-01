package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.Emp_valid

class employeeReq(employeeValidator: Emp_valid) {

  // Check if employee details exist in the hashmap

  def createEmployee(employee: Employee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee))
      Option(employee.emailId)
    else None
  }
}
