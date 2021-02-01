package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.User_valid

class UserReq(userValidator: User_valid) {

  // Check if user details exist in the hashmap

  def createUser(user: User): Option[String] = {
    println("-----------------" + user + "--------------------")
    if (userValidator.userValidator(user))
      Option(user.email)
    else None
  }
}
