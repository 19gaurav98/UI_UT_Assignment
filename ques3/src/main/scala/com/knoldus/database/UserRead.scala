package com.knoldus.database

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserRead {

  // Get user details with hashmap keys

  val dummy1: User = User("dummy1", "l", 19, "dummy1@gmail.com", "Pune")
  val dummy2: User = User("dummy2", "l", 29, "edummy2@gmail.com", "Mysore")

  val dummies: HashMap[String, User] = HashMap("user1" -> dummy1, "user2" -> dummy2)

  def getUserByName(name: String): Option[User] = dummies.get(name)
}
