package com.knoldus.database

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeRead {

  // Get employee details with hashmap keys

  val employeeAlan = Employee("George", "Sharma", 56, "g.s@knoldus.com")
  val employeeSample = Employee("fName", "lName", 54, "dummy@domain.com")
  val employees: HashMap[String, Employee] = HashMap("Alan" -> employeeAlan, "Sample" -> employeeSample)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
