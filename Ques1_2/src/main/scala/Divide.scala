import scala.util.Try

object Divide extends App{
  def isDivide(x: Int, y: Int) = Try(x/y).getOrElse(0)

}
