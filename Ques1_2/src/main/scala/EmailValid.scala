object EmailValid extends App{
  def isValid(email : String): Boolean = if("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$".r.findFirstIn(email) == None)false else true
}
