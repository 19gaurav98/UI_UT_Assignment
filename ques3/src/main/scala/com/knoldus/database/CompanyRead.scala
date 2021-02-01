package com.knoldus.database

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyRead {

  // Get company details with hashmap keys

  val tcsCompany: Company = Company("TCS", "tcs@tcs.com", "Pune")
  val InfyCompany: Company = Company("Infy", "infy@gmail.com", "Mysore")

  val companies: HashMap[String, Company] = HashMap("Tcs" -> tcsCompany, "Infy" -> InfyCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}